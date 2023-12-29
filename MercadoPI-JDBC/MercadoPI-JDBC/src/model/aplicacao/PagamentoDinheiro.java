package model.aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import data.EntradaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PagamentoDinheiro extends Pagamento {

    private double valorRecebido;
    private LocalDateTime data;

    public PagamentoDinheiro(Venda venda, double valorTotal, double valorRecebido, LocalDateTime data) {
        super(venda, valorTotal);
        this.valorRecebido = valorRecebido;
        this.data = data;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public LocalDateTime getData() {
        return data;
    }

    public boolean temTroco() {
        return valorRecebido > super.getValorTotal();
    }

    public double calcularValorTroco() {
        return temTroco() ? valorRecebido - super.getValorTotal() : 0.0;
    }

    @Override
    public void efetuarPagamento() {
        Entrada entrada = new Entrada(valorRecebido - calcularValorTroco(), data.toLocalDate(), "venda" + data.format(DateTimeFormatter.ofPattern("-dd-MM-yyyy-HH:mm:ss")));

        try {
            entrada.receber();
            EntradaDAO.adicionarEntrada(entrada);
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoDinheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Formato do pagamento: dinheiro, valor: " + super.getValorTotal() + ", troco: " + calcularValorTroco();
    }

}
