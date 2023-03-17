
package model.entidades;

public class Fornecedor {
    private String nomeFornecedor;
    //private Endereco endereco;
    private String telefone;
    private Contrato contrato;

    public Fornecedor(String nomeFornecedor, String telefone, Contrato contrato) {
        this.nomeFornecedor = nomeFornecedor;
        this.telefone = telefone;
        this.contrato = contrato;
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

    public Contrato getContrato() {
        return contrato;
    }

    @Override
    public String toString() {
        return "Fornecedor=" + nomeFornecedor + ", telefone: " + telefone;
    }
    
    
}
