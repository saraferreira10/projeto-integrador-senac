
package model.utils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Utilitarios {
    
    private static SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat formatacaoDataEHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static Calendar cal = Calendar.getInstance();
    private static DecimalFormat formatacaoNumero = new DecimalFormat("0.##");
    
    public static void imprimirLista(List<?> lista){
        for(Object obj : lista){
            System.out.println(obj);
        }
    }
    
    public static Date retornarData(String dataTxt) throws ParseException {
        return formatacaoData.parse(dataTxt);
    }
    
    public static String formatarData(Date data) {
        return formatacaoData.format(data);
    }
    
    public static String formatarDataEHora(Date data) {
        return formatacaoDataEHora.format(data);
    }
    
    public static Date retornarDataDeHoje () {
        return new Date();
    }
    
    public static int retornarMes(){
        cal.setTime(retornarDataDeHoje());
        return cal.get(Calendar.MONTH);
    }
    
    public static int retornarAno(){
        cal.setTime(retornarDataDeHoje());
        return cal.get(Calendar.YEAR);
    }
    
    public static String formatarNumero(double num) {
        return formatacaoNumero.format(num);
    }
    
}