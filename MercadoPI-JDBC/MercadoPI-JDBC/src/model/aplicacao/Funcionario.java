package model.aplicacao;

public class Funcionario {

    private int id;
    private String nome;
    private double salarioFixo;
    private Cargo cargo;
    protected int comissao = 0;
    private Usuario usuario;

    public Funcionario(String nome, double salarioFixo, Cargo cargo) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getComissao() {
        return comissao;
    }

    public double retornarSalario() {
        return salarioFixo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
