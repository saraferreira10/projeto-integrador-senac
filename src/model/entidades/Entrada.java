
package model.entidades;

import java.util.Date;

public class Entrada {
    private double valor;
    private Date data;
    private String descricao;

    public Entrada(double valor, Date data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

}
