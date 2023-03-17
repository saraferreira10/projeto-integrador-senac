
package model.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nomeCliente;
    private List<Venda> comprasFeitas;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        comprasFeitas = new ArrayList<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Venda> getComprasFeitas() {
        return comprasFeitas;
    }
    
    public void comprar(Venda v){
        comprasFeitas.add(v);
    }
    
}
