
package model.servicos;

import java.util.ArrayList;
import java.util.List;
import model.entidades.Entrada;
import model.entidades.Saida;
import model.utils.Utilitarios;

public class CaixaService {
    private double saldo = 0.0;
    private boolean aberto = false;
    private List<Saida> saidas;
    private List<Entrada> entradas;
    
    private static CaixaService caixa;
    
    private CaixaService() {
        saidas = new ArrayList<>();
        entradas = new ArrayList<>();
    }
    
    public static CaixaService getInstance(){
        if(caixa == null) {
            caixa = new CaixaService();
        }    
        return caixa;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public boolean isAberto() {
        return aberto;
    }
    
    public void abrirCaixa(){
        aberto = true;
        System.out.println("CAIXA ABERTO --> " + saldo);
    }
    
    public void fecharCaixa(){
        aberto = false;
        atualizarSaldo();
        imprimirRelatorio();
        System.out.println("CAIXA FECHADO --> " + saldo);
    }
    
    public void adicionarEntrada(Entrada e){
        if(isAberto()) {
            entradas.add(e);
        } else {
            System.out.println("Caixa fechado!");
        }
        
    }
    
    public void adicionarSaida(Saida s){
        if(isAberto()){
            saidas.add(s);
        } else {
            System.out.println("Caixa fechado!");
        }
    }
    
    public void atualizarSaldo() {
        for(Entrada e : entradas){
            saldo = saldo + e.getValor();
        }
        
        for(Saida s : saidas){
            saldo = saldo - s.getValor();
        }
    }
    
    private void imprimirRelatorio() {
        for(Entrada e : entradas){
            System.out.println("ENTRADA --> " + e.getValor() + " - " + e.getDescricao() + " - Data ---> " + Utilitarios.formatarDataEHora(e.getData()));
        }
        
        for(Saida s : saidas){
            System.out.println("SAÍDA --> " + s.getValor() + " - " + s.getDescricao() + " - Data ---> " + Utilitarios.formatarDataEHora(s.getData()));
        }
    }
    
}
