
package model.entidades;

import java.util.Date;
import model.servicos.CaixaService;

public class Produto {
    private int codProduto;
    private String nomeProduto;
    private double valorDeVenda;
    private double valorDeCompra;
    private Fornecedor fornecedor;
    private int quantidade;
    
    public Produto(int codProduto, String nomeProduto, double valorDeVenda, double valorDeCompra, Fornecedor fornecedor, int quantidade) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.valorDeVenda = valorDeVenda;
        this.valorDeCompra = valorDeCompra;
        this.fornecedor = fornecedor;
        Estoque.getInstance().addProduto(this, quantidade);
    }
    
    //CONSTRUTOR QUE RECEBE UM PERCENTUAL DE LUCRO DESEJADO NA VENDA DO PRODUTO CONSIDERANDO A QUANTIDADE.
    public Produto(int codProduto, String nomeProduto, double valorDeCompra, Fornecedor fornecedor, int perLucro, int quantidade) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.valorDeCompra = valorDeCompra;
        this.fornecedor = fornecedor;
        
        this.valorDeVenda = calcularPrecoRevenda(valorDeCompra, perLucro); 
        Estoque.getInstance().addProduto(this, quantidade);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void adicionarProduto(int quantidade){
        Saida s = new Saida(valorDeCompra * quantidade, new Date(), "COMPRA --> Produto = " + nomeProduto + ", Quantidade = " + quantidade);
        CaixaService.getInstance().adicionarSaida(s);
        this.quantidade += quantidade;
    }
    
    public void consumirProduto(int quantidade) {
        this.quantidade -= quantidade;
        Estoque.getInstance().consumirProduto(this, quantidade);
    }
    
    public boolean temProduto(int quantidade) {
        return this.quantidade >= quantidade;
    }
    
    private double calcularPrecoRevenda(double valorDeCompra, int perLucro){
        return valorDeCompra + (perLucro * valorDeCompra / 100);
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + nomeProduto + ", valor de venda: " + valorDeVenda + ", valor de compra: " + valorDeCompra + ", quantidade: " + quantidade;
    }

}
