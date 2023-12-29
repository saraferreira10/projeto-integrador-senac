package Utils;

import java.time.LocalDate;
import java.util.List;
import model.aplicacao.ItemVenda;

public class Utilidades {

    private static final LocalDate dataAtual = LocalDate.now();

    public static int retornarMes() {
        return dataAtual.getMonthValue();
    }

    public static int retornarDia() {
        return dataAtual.getDayOfMonth();
    }

    public static int retornarAno() {
        return dataAtual.getYear();
    }

    public static void imprimirLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

    public static String retornarStringLista(List<ItemVenda> itens) {
        StringBuilder sb = new StringBuilder();
        
        for (ItemVenda item : itens) {
            sb.append(item.getProduto() + ", quantidade: " + item.getQuantidade() + "\n");
        }
        
        return sb.toString();
    }

}
