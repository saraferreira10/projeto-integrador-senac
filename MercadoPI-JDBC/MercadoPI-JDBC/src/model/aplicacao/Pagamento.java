package model.aplicacao;

public abstract class Pagamento {

    private int id;
    private double valorTotal;
    private Venda venda;

    public Pagamento() {
    }

    public Pagamento(Venda venda, double valorTotal) {
        this.valorTotal = valorTotal;
        this.venda = venda;
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

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    

    public abstract void efetuarPagamento();

}
