
package model.entidades;

import java.util.Date;

public class Saida {
    private double valor;
    private Date data;
    private String descricao;

    public Saida(double valor, Date data, String descricao) {
        if(valor > 0) {
            this.valor = valor;
            this.data = data;
            this.descricao = descricao;
        }
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
