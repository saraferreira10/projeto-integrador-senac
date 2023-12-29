package model.aplicacao;

public class Usuario {

    private int id;
    private String username;
    private String senha;
    private Perfil perfil;
    private boolean online = false;
    private boolean ativo;
    private Funcionario funcionario;

    public Usuario(String username, String senha, Perfil perfil, Funcionario funcionario) {
        this.username = username;
        this.senha = senha;
        this.perfil = perfil;
        ativo = true;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public boolean logar() {
        if (!isOnline()) {
            online = true;
        }

        return isOnline();
    }

    private void mostrarMensagem(boolean logou) {
        if (logou) {
            System.out.println("Usuário " + username + " logou no sistema.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public void encerrarSessao() {
        if (online) {
            online = false;
            System.out.println("Usuário " + username + " encerrou sessão.");
        }
    }

    public void desabilitarUsuario() {
        if (isAtivo()) {
            ativo = false;
        }
    }

    public void habilitarUsuario() {
        if (!isAtivo()) {
            ativo = true;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario user) {
            return user.getUsername().equals(username);
        }

        return false;
    }

}
