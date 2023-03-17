
package model.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.servicos.CaixaService;
import model.utils.Utilitarios;

public class Venda {
    
    private List<ItemVenda> itens;
    private Date dataVenda;
    private Vendedor vendedor;
    private Cliente cliente;
    private boolean efetuada;
    private double valorTotal;
    
    CaixaService caixa = CaixaService.getInstance();

    public Venda(Cliente cliente, Vendedor vendedor, Date dataVenda) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        itens = new ArrayList<>();
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public boolean isEfetuada() {
        return efetuada;
    }

    public double getValorTotal() {
        return retornarTotal();
    }

    public void adicionarItem(ItemVenda item){
        itens.add(item);
    }
    
    public void efetuarVenda(){
        
        if(caixa.isAberto()){
            cliente.comprar(this);
            vendedor.vender(this);
            caixa.adicionarEntrada(new Entrada(retornarTotal(), dataVenda, "Venda"));
            efetuada = true;
        }
    }
    
    public double retornarTotal(){
        double valorTotal = 0;
        for (ItemVenda item : itens) {
            valorTotal += item.subTotal();
        }
        return valorTotal;
    }
    
    public void aplicarDesconto(int percentual) {
        valorTotal = valorTotal + (percentual * valorTotal / 100);
    }

    @Override
    public String toString() {
        
        return "Venda" + ", data=" + Utilitarios.formatarDataEHora(dataVenda) + ", vendedor=" + vendedor.getNomeFuncionario() + ", cliente=" + cliente.getNomeCliente() + ", efetuada=" + efetuada + ", valor=" + valorTotal;
    }
    
    
    
    public void imprimirRecibo(){
        if(efetuada){
            System.out.println("Cliente: " + cliente.getNomeCliente() + ", Vendedor: " + vendedor.getNomeFuncionario());
            System.out.println();
            
            int num = 1;
            for(ItemVenda item : itens){
                System.out.println(num + " - " + item);
                num++;
            }
            
            System.out.println("Total --> " + this.retornarTotal());
        } else{
            System.out.println("Venda ainda não finalizada!");
        }
    }
    
}
