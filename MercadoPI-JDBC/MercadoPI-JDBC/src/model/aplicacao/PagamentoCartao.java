
package model.aplicacao;

public abstract class PagamentoCartao extends Pagamento {
    
    public PagamentoCartao() {
        super();
    }
    
    public PagamentoCartao(Venda venda, double valorTotal) {
        super(venda, valorTotal);
    }
    
}
