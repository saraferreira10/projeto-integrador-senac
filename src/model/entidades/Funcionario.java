
package model.entidades;

public abstract class Funcionario {
    
    private String nomeFuncionario;
    private double salarioFixo;
    private Usuario usuario;
    private boolean ativo;

    public Funcionario(String nomeFuncionario, double salarioFixo) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFixo = salarioFixo;
        this.ativo = true;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    public boolean adicionarUsuario(Usuario usuario){
        if(usuario == null){
            this.usuario = usuario;
            return true;
        } else{
            return false;
        }
    }
    
    public void desabilitarFuncionario() {
        if(isAtivo()) {
            ativo = false;
        }    
    }

    public abstract double retornarSalario();
    
}
