package model.aplicacao;

public class Fornecedor {

    private int id;
    private String nomeFornecedor;
    private String telefone;

    public Fornecedor(String nomeFornecedor, String telefone) {
        this.nomeFornecedor = nomeFornecedor;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Fornecedor=" + nomeFornecedor + ", telefone: " + telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fornecedor) {
            Fornecedor f = (Fornecedor) obj;
            return f.getNomeFornecedor().equalsIgnoreCase(nomeFornecedor);
        } else {
            return false;
        }
    }

}
