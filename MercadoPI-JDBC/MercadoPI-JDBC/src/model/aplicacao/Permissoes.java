package model.aplicacao;

public class Permissoes {

    private int id;
    private boolean podeVender;
    private boolean podeManipularProduto;
    private boolean podeManipularCliente;
    private boolean podeManipularFuncionario;
    private boolean podeCadastrarPerfil;
    private boolean podeCadastrarCargo;
    private boolean podeCadastrarEntrada;
    private boolean podeCadastrarSaida;
    private boolean podeManipularCaixa;
    private boolean acessoPanelClientes;
    private boolean acessoPanelFinanceiro;
    private boolean acessoPanelVendas;
    private boolean acessoPanelEstoque;
    private boolean acessoPanelFuncionarios;

    public Permissoes(boolean podeVender, boolean podeManipularProduto, boolean podeManipularCliente, boolean podeManipularFuncionario, boolean podeCadastrarPerfil, boolean podeCadastrarCargo, boolean podeCadastrarEntrada, boolean podeCadastrarSaida, boolean podeManipularCaixa, boolean acessoPanelClientes, boolean acessoPanelFinanceiro, boolean acessoPanelVendas, boolean acessoPanelEstoque, boolean acessoPanelFuncionarios) {
        this.podeVender = podeVender;
        this.podeManipularProduto = podeManipularProduto;
        this.podeManipularCliente = podeManipularCliente;
        this.podeManipularFuncionario = podeManipularFuncionario;
        this.podeCadastrarPerfil = podeCadastrarPerfil;
        this.podeCadastrarCargo = podeCadastrarCargo;
        this.podeCadastrarEntrada = podeCadastrarEntrada;
        this.podeCadastrarSaida = podeCadastrarSaida;
        this.podeManipularCaixa = podeManipularCaixa;
        this.acessoPanelClientes = acessoPanelClientes;
        this.acessoPanelFinanceiro = acessoPanelFinanceiro;
        this.acessoPanelVendas = acessoPanelVendas;
        this.acessoPanelEstoque = acessoPanelEstoque;
        this.acessoPanelFuncionarios = acessoPanelFuncionarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPodeVender() {
        return podeVender;
    }

    public void setPodeVender(boolean podeVender) {
        this.podeVender = podeVender;
    }

    public boolean isPodeManipularProduto() {
        return podeManipularProduto;
    }

    public void setPodeManipularProduto(boolean podeManipularProduto) {
        this.podeManipularProduto = podeManipularProduto;
    }

    public boolean isPodeManipularCliente() {
        return podeManipularCliente;
    }

    public void setPodeManipularCliente(boolean podeManipularCliente) {
        this.podeManipularCliente = podeManipularCliente;
    }

    public boolean isPodeManipularFuncionario() {
        return podeManipularFuncionario;
    }

    public void setPodeManipularFuncionario(boolean podeManipularFuncionario) {
        this.podeManipularFuncionario = podeManipularFuncionario;
    }

    public boolean isPodeCadastrarPerfil() {
        return podeCadastrarPerfil;
    }

    public void setPodeCadastrarPerfil(boolean podeCadastrarPerfil) {
        this.podeCadastrarPerfil = podeCadastrarPerfil;
    }

    public boolean isPodeCadastrarCargo() {
        return podeCadastrarCargo;
    }

    public void setPodeCadastrarCargo(boolean podeCadastrarCargo) {
        this.podeCadastrarCargo = podeCadastrarCargo;
    }

    public boolean isPodeCadastrarEntrada() {
        return podeCadastrarEntrada;
    }

    public void setPodeCadastrarEntrada(boolean podeCadastrarEntrada) {
        this.podeCadastrarEntrada = podeCadastrarEntrada;
    }

    public boolean isPodeCadastrarSaida() {
        return podeCadastrarSaida;
    }

    public void setPodeCadastrarSaida(boolean podeCadastrarSaida) {
        this.podeCadastrarSaida = podeCadastrarSaida;
    }

    public boolean isPodeManipularCaixa() {
        return podeManipularCaixa;
    }

    public void setPodeManipularCaixa(boolean podeManipularCaixa) {
        this.podeManipularCaixa = podeManipularCaixa;
    }

    public boolean isAcessoPanelClientes() {
        return acessoPanelClientes;
    }

    public void setAcessoPanelClientes(boolean acessoPanelClientes) {
        this.acessoPanelClientes = acessoPanelClientes;
    }

    public boolean isAcessoPanelFinanceiro() {
        return acessoPanelFinanceiro;
    }

    public void setAcessoPanelFinanceiro(boolean acessoPanelFinanceiro) {
        this.acessoPanelFinanceiro = acessoPanelFinanceiro;
    }

    public boolean isAcessoPanelVendas() {
        return acessoPanelVendas;
    }

    public void setAcessoPanelVendas(boolean acessoPanelVendas) {
        this.acessoPanelVendas = acessoPanelVendas;
    }

    public boolean isAcessoPanelEstoque() {
        return acessoPanelEstoque;
    }

    public void setAcessoPanelEstoque(boolean acessoPanelEstoque) {
        this.acessoPanelEstoque = acessoPanelEstoque;
    }

    public boolean isAcessoPanelFuncionarios() {
        return acessoPanelFuncionarios;
    }

    public void setAcessoPanelFuncionarios(boolean acessoPanelFuncionarios) {
        this.acessoPanelFuncionarios = acessoPanelFuncionarios;
    }

}
