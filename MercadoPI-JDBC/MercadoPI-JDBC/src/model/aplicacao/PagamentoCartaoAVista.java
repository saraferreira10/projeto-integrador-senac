package model.aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import data.EntradaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PagamentoCartaoAVista extends PagamentoCartao {

    public PagamentoCartaoAVista(Venda venda, double valorTotal) {
        super(venda, valorTotal);
    }

    @Override
    public void efetuarPagamento(){
        try {
            Entrada entrada = new Entrada(super.getValorTotal(), LocalDate.now(), "venda" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("-dd-MM-yyyy-HH:mm:ss")));
            entrada.receber();
            EntradaDAO.adicionarEntrada(entrada);
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoCartaoAVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Formato do pagamento: cartão (A Vista) \nValor: " + super.getValorTotal();
    }

}
