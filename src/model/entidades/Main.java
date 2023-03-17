
package model.entidades;

import java.text.ParseException;
import java.util.Date;
import model.servicos.CaixaService;
import model.utils.Utilitarios;

public class Main {
    public static void main(String[] args) throws ParseException{
        Estoque estoque = Estoque.getInstance();
        
        Fornecedor fornecedor = new Fornecedor("AAA", "111", new Contrato(new Date(), new Date()));
        CaixaService caixa = CaixaService.getInstance();
        caixa.abrirCaixa();
        Produto p1 = new Produto(1, "Leite", 7.0, fornecedor, 100, 200);
        Produto p2 = new Produto(2, "Margarina", 7.0, fornecedor, 50, 200);
        Produto p3 = new Produto(3, "Amaciante", 7.0, fornecedor, 10, 200);
       
        Estoque e2 = Estoque.getInstance();
        e2.imprimirEstoque();
        
        Vendedor vendedor = new Vendedor(5, "Carlos", 1500);
        Venda venda = new Venda(new Cliente("Maria"), vendedor, new Date());
        venda.adicionarItem(new ItemVenda(p1, 50));
        venda.adicionarItem(new ItemVenda(p2, 100));
        
        venda.efetuarVenda();
        venda.imprimirRecibo();
        System.out.println("Salario do vendedor " + vendedor.getNomeFuncionario() + ": " + vendedor.retornarSalario());
        
        System.out.println(Utilitarios.formatarDataEHora(venda.getDataVenda()));
        
        String date = "02/05/2022";
        
        Date dataVenda2 = Utilitarios.retornarData(date);
        
        Venda v2 = new Venda(new Cliente("Jose"), vendedor, dataVenda2);
        v2.adicionarItem(new ItemVenda(p1, 50));
        v2.efetuarVenda();
        v2.imprimirRecibo();
        
        System.out.println("TOTAL DE VENDAS NO DIA DE HOJE (VALOR) --> " + vendedor.retornarTotalVendasPorDia(new Date()));
        System.out.println("TOTAL DE VENDAS NO MES DE MARÇO (VALOR) --> " + vendedor.retornarTotalVendasPorMes(3, 2022));
        System.out.println("TOTAL DE VENDAS NO MES DE MAIO (VALOR) --> " + vendedor.retornarTotalVendasPorMes(5, 2022));
        System.out.println("TOTAL DE VENDAS NO ANO DE 2023 (VALOR) --> " + vendedor.retornarTotalVendasDoAno(2023));
        
    }
}
