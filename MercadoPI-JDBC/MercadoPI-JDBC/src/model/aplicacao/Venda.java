package model.aplicacao;

import Utils.Utilidades;
import data.CaixaDAO;
import data.ItemVendaDAO;
import data.ProdutoDAO;
import data.VendaDAO;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<ItemVenda> itens;
    private int id;
    private String descricao;
    private LocalDateTime dataVenda;
    private Vendedor vendedor;
    private Cliente cliente;
    private double valorTotal;

    public Venda() {
        itens = new ArrayList<>();
    }

    public Venda(LocalDateTime dataVenda, Vendedor vendedor, Cliente cliente) {
        this.dataVenda = dataVenda;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.descricao = "venda-" + dataVenda.format(DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss")) + "-" + vendedor.getNome() + "-" + cliente.getNomeCliente();
        itens = new ArrayList<>();

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
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

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public void removerItem(ItemVenda item) {
        itens.remove(item);
    }

    public void confirmarVenda(Pagamento pagamento, Venda venda) throws SQLException {
        if (CaixaDAO.retornarCaixa().isAberto()) {

            if (pagamento != null && calcularTotal() > 0) {
                calcularTotal();
                
                descricao = "venda-" + venda.getDataVenda().format(DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss")) + "-" + vendedor.getNome() + "-" + cliente.getNomeCliente();
                VendaDAO.adicionarVenda(this);
                venda = VendaDAO.retornarVendaPorDescricao(descricao);

                for (ItemVenda item : itens) {
                    item.setVenda(venda);
                    item.getProduto().consumirProduto(item.getQuantidade());
                    ItemVendaDAO.adicionarItemVenda(item);
                    ProdutoDAO.alterar(item.getProduto());
                }

                pagamento.efetuarPagamento();
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.subTotal();
        }
        this.valorTotal = total;
        return valorTotal;
    }

    public int retornarQuantidadeItens() {
        int quantidade = 0;

        for (ItemVenda item : itens) {
            quantidade += item.getQuantidade();
        }

        return quantidade;
    }

    public void aplicarDesconto(int percentual) {
        if (!cliente.getNomeCliente().equals("PADRÃO")) {
            valorTotal = calcularTotal() + (percentual * valorTotal / 100);
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNomeCliente() + ", Vendedor: " + vendedor.getNome()
                + "\n"
                + Utilidades.retornarStringLista(itens)
                + "\nTotal --> " + calcularTotal();
    }

}
