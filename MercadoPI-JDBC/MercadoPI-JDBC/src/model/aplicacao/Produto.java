package model.aplicacao;

public class Produto {

    private int id;
    private String nomeProduto;
    private double valorDeVenda;
    private double valorDeCompra;
    private Fornecedor fornecedor;
    private int quantidade = 0;

    public Produto(String nomeProduto, double valorDeVenda, double valorDeCompra, Fornecedor fornecedor) {
        this.nomeProduto = nomeProduto;
        this.valorDeVenda = valorDeVenda;
        this.valorDeCompra = valorDeCompra;
        this.fornecedor = fornecedor;
    }

    //CONSTRUTOR QUE RECEBE UM PERCENTUAL DE LUCRO DESEJADO NA VENDA DO PRODUTO CONSIDERANDO A QUANTIDADE.
    public Produto(String nomeProduto, double valorDeCompra, Fornecedor fornecedor, int perLucro) {
        this.nomeProduto = nomeProduto;
        this.valorDeCompra = valorDeCompra;
        this.fornecedor = fornecedor;
        this.valorDeVenda = calcularPrecoRevenda(valorDeCompra, perLucro);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    public void adicionarProduto(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }

    public void consumirProduto(int quantidade) {
        this.quantidade = this.quantidade - quantidade;
    }

    public boolean temProduto(int quantidade) {
        return this.quantidade >= quantidade;
    }

    private double calcularPrecoRevenda(double valorDeCompra, int perLucro) {
        return valorDeCompra + (perLucro * valorDeCompra / 100);
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + nomeProduto + ", valor de venda: " + valorDeVenda + ", valor de compra: " + valorDeCompra + ", quantidade: " + quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Produto) {
            Produto prod = (Produto) obj;
            return prod.getNomeProduto().equalsIgnoreCase(this.getNomeProduto());
        } else {
            return false;
        }
    }

}
