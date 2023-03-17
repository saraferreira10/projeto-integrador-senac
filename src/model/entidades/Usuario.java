package model.entidades;

import model.servicos.LoginService;

public class Usuario {
    private String username;
    private String senha;
    private boolean online = false;
    private boolean ativo;

    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
        this.ativo = true;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isOnline() {
        return online;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    public boolean logar(String username, String senha) {
        if(LoginService.validarLogin(username, senha, this)){
            online = true;
        } 
        
        return isOnline();
    }
    
    private void mostrarMensagem(boolean logou){
        if(logou){
            System.out.println("Usuário " + username + " logou no sistema.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
    
    public void encerrarSessao() {
        if(online){
            online = false;
            System.out.println("Usuário " + username + " encerrou sessão.");
        }
    }
    
    public void desabilitarUsuario() {
        if(isAtivo()) {
            ativo = false;
        }    
    }
    
}
