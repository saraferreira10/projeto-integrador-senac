package model.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import data.EntradaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PagamentoCartaoAPrazo extends PagamentoCartao {

    private int numParcelas;
    private LocalDate data;

    public PagamentoCartaoAPrazo(Venda venda, double valorTotal, int numParcelas) {
        super(venda, valorTotal);
        this.numParcelas = numParcelas;
        data = LocalDate.now();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double calcularValorParcelas() {
        return super.getValorTotal() / numParcelas;
    }

    private String gerarNome(int numParcela, LocalDate dataParcela) {
        return "venda-" + dataParcela.toString() + "-parcela-" + numParcela;
    }

    private void gerarParcelas() throws SQLException {
        LocalDate dataControle = data;
        for (int i = 1; i <= numParcelas; i++) {
            dataControle = dataControle.plusDays(30);
            EntradaDAO.adicionarEntrada(new Entrada(calcularValorParcelas(), dataControle, gerarNome(i, dataControle)));
        }
    }

    @Override
    public String toString() {
        return "Formato do pagamento: cartão (A Vista) \nValor: " + super.getValorTotal() + "\nNúmero de parcelas: " + numParcelas + "\nValor da parcela: " + calcularValorParcelas() + "\nData: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public void efetuarPagamento() {
        try {
            gerarParcelas();
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoCartaoAPrazo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
