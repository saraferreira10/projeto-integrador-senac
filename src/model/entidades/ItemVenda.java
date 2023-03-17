
package model.entidades;

public class ItemVenda {
    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
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
    
    
}
