package model.aplicacao;

import Utils.Utilidades;
import data.VendaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vendedor extends Funcionario {

    public Vendedor(int comissao, String nomeFuncionario, double salarioFixo, Cargo cargo) {
        super(nomeFuncionario, salarioFixo, cargo);
        super.comissao = comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    @Override
    public double retornarSalario() {
        double salario = 0.0;
        
        try {
            salario = super.getSalarioFixo() + VendaDAO.retornarTotalMesVendedor(Utilidades.retornarMes(), Utilidades.retornarAno(), this) * comissao / 100;
        } catch (SQLException ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return salario;
    }

}
