
package model.entidades;

public class Gerente extends Funcionario {

    public Gerente(String nomeFuncionario, double salarioFixo) {
        super(nomeFuncionario, salarioFixo);
    }

    @Override
    public double retornarSalario() {
        return super.getSalarioFixo();
    }
    
}
