package model.aplicacao;

import java.time.format.DateTimeFormatter;
import data.EntradaDAO;
import data.SaidaDAO;
import java.sql.SQLException;

public class Caixa {

    private int id;
    private boolean aberto = true;
    private double saldo = 0.0;
    private double entradas = 0.0;
    private double saidas = 0.0;
    private double saldoAnterior;

    public Caixa(boolean aberto, double saldo, double entradas, double saidas, double saldoAnterior) {
        this.aberto = aberto;
        this.saldo = saldo;
        this.entradas = entradas;
        this.saidas = saidas;
        this.saldoAnterior = saldoAnterior;
    }

    public Caixa(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
        saldo = saldoAnterior;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public double getSaldo() {
        return saldoAnterior + entradas - saidas;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getEntradas() {
        return entradas;
    }

    public void setEntradas(double entradas) {
        this.entradas = entradas;
    }

    public double getSaidas() {
        return saidas;
    }

    public void setSaidas(double saidas) {
        this.saidas = saidas;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public void incrementarSaldo(double valor) {
        saldo += valor;
        entradas += valor;
    }

    public void decrementarSaldo(double valor) {
        saldo -= valor;
        saidas += valor;
    }

    public void imprimirRelatorio() throws SQLException {
        for (Entrada e : EntradaDAO.listar()) {
            System.out.println("ENTRADA --> " + e.getValor() + " - " + e.getDescricao() + " - Data ---> " + e.getDataVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }

        for (Saida s : SaidaDAO.listar()) {
            System.out.println("SAÍDA --> " + s.getValor() + " - " + s.getDescricao() + " - Data ---> " + s.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
    }

}
