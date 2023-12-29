package model.aplicacao;

import data.CaixaDAO;
import java.sql.SQLException;
import java.time.LocalDate;

public class Saida {

    private int id;
    private double valor;
    private LocalDate data;
    private String descricao;
    private LocalDate dataVencimento;
    private boolean paga = false;

    public Saida(double valor, LocalDate dataVencimento, String descricao) {
        if (valor > 0) {
            this.valor = valor;
            this.dataVencimento = dataVencimento;
            this.descricao = descricao;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public void pagar() throws SQLException {
        paga = true;
        Caixa caixa = CaixaDAO.retornarCaixa();
        caixa.decrementarSaldo(valor);
        CaixaDAO.alterar(caixa);
    }

}
