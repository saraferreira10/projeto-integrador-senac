package model.aplicacao;

public class Perfil {

    private int id;
    private String nomePerfil;
    private Permissoes permissoes;

    public Perfil(String nomePerfil, Permissoes permissoes) {
        this.nomePerfil = nomePerfil;
        this.permissoes = permissoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public Permissoes getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Permissoes permissoes) {
        this.permissoes = permissoes;
    }

}
