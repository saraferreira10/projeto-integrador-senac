package model.aplicacao;

import data.CaixaDAO;
import java.sql.SQLException;
import java.time.LocalDate;

public class Entrada {

    private int id;
    private double valor;
    private LocalDate dataVencimento;
    private String descricao;
    private boolean recebida;

    public Entrada(double valor, LocalDate dataVencimento, String descricao) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.descricao = descricao;
        recebida = false;
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

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRecebida() {
        return recebida;
    }

    public void setRecebida(boolean recebida) {
        this.recebida = recebida;
    }

    public void receber() throws SQLException {
        recebida = true;
        Caixa caixa = CaixaDAO.retornarCaixa();
        caixa.incrementarSaldo(valor);
        CaixaDAO.alterar(caixa);
    }

}
