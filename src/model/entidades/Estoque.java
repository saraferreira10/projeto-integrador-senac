
package model.entidades;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    
    private static Estoque instance;
    private List<Produto> produtosNoEstoque = new ArrayList<>();

    private Estoque(){
        produtosNoEstoque = new ArrayList<>();
    }
    
    public static Estoque getInstance(){
        if (instance == null){
            instance = new Estoque();
        }
        
        return instance;
    }
    
    public boolean addProduto(Produto p, int qtde){
        if(p.getFornecedor().getContrato().isValidadeContrato()) {
            if(!produtosNoEstoque.contains(p)) {
                produtosNoEstoque.add(p);
            }

            p.adicionarProduto(qtde);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean consumirProduto(Produto p, int qtde){
        if(produtosNoEstoque.contains(p) && p.temProduto(qtde)) {
            p.consumirProduto(qtde);
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimirEstoque(){
        for (int i = 0; i < produtosNoEstoque.size(); i++){
            System.out.println(produtosNoEstoque.get(i).toString());
        }
    }
    
}
