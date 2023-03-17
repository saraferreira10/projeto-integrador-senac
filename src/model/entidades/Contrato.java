
package model.entidades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Contrato {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY",new Locale("pt", "BR"));
    public static final Calendar cal = Calendar.getInstance();
    
    private Date dataInicio;
    private Date dataFim;
    private boolean validadeContrato = true;

    public Contrato(Date dataInicio, Date dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public boolean isValidadeContrato() {
        return validadeContrato;
    }
    
    public String retornarDatas(){
        return "Data início: " + sdf.format(dataInicio) + ", Data fim: " + sdf.format(dataFim);
    }
    
    //CALCULA DURACAO TOTAL DO CONTRATO.
    public void calcularDuracaoTotal() {
        LocalDate inicio = dataInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fim = dataFim.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Period duracao = Period.between(inicio, fim);
        
        System.out.println("DURAÇÃO TOTAL - Anos: " + duracao.getYears() + ", Meses: " + duracao.getMonths() + ", Dias: " + duracao.getDays());
    }
    
    //CALCULA QUANTO TEMPO FALTA PARA O CONTRATO VENCER.
    public void calcularVencimento() {
        if(isValidadeContrato()) {
            LocalDate inicio = dataInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate now = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Period duracao = Period.between(inicio, now);

            System.out.println("FALTAM - Anos: " + duracao.getYears() + ", Meses: " + duracao.getMonths() + ", Dias: " + duracao.getDays());
        }
    }
    
    public boolean renovarContrato(Date novoPrazo) {
        if(novoPrazo.after(dataFim)) {
            dataFim = novoPrazo;
            validadeContrato = true;
            return true;
        } else {
            return false;
        }
    }
    
    public void rescindirContrato() {
        dataFim = new Date();
        validadeContrato = false;
    }
    
    @Override
    public String toString() {
        return "Contrato{" + retornarDatas() + ", validadeContrato=" + validadeContrato;
    }
    
}
