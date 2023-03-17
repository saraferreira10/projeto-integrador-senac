
package model.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.utils.Utilitarios;

public class Vendedor extends Funcionario{
    private int comissao;
    private List<Venda> vendasRealizadas;

    public Vendedor(int comissao, String nomeFuncionario, double salarioFixo) {
        super(nomeFuncionario, salarioFixo);
        this.comissao = comissao;
        vendasRealizadas = new ArrayList<>();
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }
    
    public void vender(Venda v){
        vendasRealizadas.add(v);
    }
    
    public double retornarTotalVendasDoAno(int ano) {
        Calendar cal = Calendar.getInstance();       
        
        double soma = 0;
        for (Venda v : vendasRealizadas){
            Date dataVenda = v.getDataVenda();
            cal.setTime(dataVenda);
            
            if(ano == cal.get(Calendar.YEAR)) {
                soma += v.getValorTotal();
            }
            
        }
        return soma;
    }
    
    public double retornarTotalVendasPorMes(int mes, int ano) {
        Calendar cal = Calendar.getInstance();                
        double soma = 0;
        for (Venda v : vendasRealizadas){
            Date dataVenda = v.getDataVenda();
            cal.setTime(dataVenda);
            if(mes-1 == cal.get(Calendar.MONTH) && ano == cal.get(Calendar.YEAR)) {
                soma += v.retornarTotal();
            }
        }
        return soma;
    }
    
    public double retornarTotalVendasPorDia(Date dia) {
        Calendar cal = Calendar.getInstance();         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        double soma = 0;
        for (Venda v : vendasRealizadas){
            Date dataVenda = v.getDataVenda();
            cal.setTime(dataVenda);
            
            if(sdf.format(dia).equals(sdf.format(cal.getTime()))) {
                soma += v.retornarTotal();
            }
        }
        return soma;
    }
    
    public double retornarTotalVendas(){
        double soma = 0;
        for (Venda v : vendasRealizadas){
            soma += v.retornarTotal();
        }
        return soma;
    }
    
    public void imprimirVendas(){
        Utilitarios.imprimirLista(vendasRealizadas);
    }
    
    @Override
    public double retornarSalario(){
        return super.getSalarioFixo() + retornarTotalVendasPorMes(Utilitarios.retornarMes(), Utilitarios.retornarAno())* comissao / 100;
    }
    
}
