
package model.entidades;

import model.utils.Utilitarios;

public class Pagamento {
    public static enum TipoPagamento{
        A_VISTA,
        A_PRAZO
    }
    
    public static enum FormatoPagamento{
        CARTAO,
        DINHEIRO
    }
    
    private Venda venda;
    private TipoPagamento tipo;
    private FormatoPagamento formato;
    private int parcelas;
    
    public double calcularValorParcela() {
        if(parcelas != 0){
            return venda.getValorTotal() / parcelas;
        } else{
            return 0;
        }
    }

    @Override
    public String toString() {
        String mensagemTxt = "Formato do pagamento: " + formato.toString() + ", Tipo do pagamento: " + tipo.toString();
        
        if(tipo.equals(TipoPagamento.A_PRAZO)){
            String parcelasTxt = "Número de parcelas: " + parcelas + ", Valor das parcelas: " + calcularValorParcela();
            mensagemTxt += parcelasTxt;
        }
        
        return mensagemTxt;
    }
    
}

