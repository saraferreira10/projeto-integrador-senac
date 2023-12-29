package model.aplicacao;

public class ItemVenda {

    private int id;
    private Venda venda;
    private Produto produto;
    private int quantidade;

    public ItemVenda(Venda venda, Produto produto, int quantidade) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double subTotal() {
        return produto.getValorDeVenda() * quantidade;
    }

    @Override
    public String toString() {
        return "produto: " + produto.getNomeProduto() + ", quantidade: " + quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ItemVenda item) {
            if (item.getProduto().getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())) {
                return true;
            }
        }

        return false;
    }

}
