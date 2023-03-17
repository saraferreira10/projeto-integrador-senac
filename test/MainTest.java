
import java.util.Calendar;
import java.util.Date;
import model.servicos.CaixaService;
import model.entidades.Cliente;
import model.entidades.Contrato;
import model.entidades.Entrada;
import model.entidades.Estoque;
import model.entidades.Fornecedor;
import model.entidades.ItemVenda;
import model.entidades.Produto;
import model.entidades.Saida;
import model.entidades.Venda;
import model.entidades.Vendedor;

public class MainTest {
    public static void main(String[] args) {
        
        CaixaService caixa = CaixaService.getInstance();
        caixa.abrirCaixa();
        Entrada e1 = new Entrada(3000, new Date(), "Vendas");
        
        
        caixa.adicionarEntrada(e1);
        caixa.adicionarSaida(new Saida(200, new Date(), "Pagamento Luz"));
        
        Vendedor vendedor = new Vendedor(5, "Jose", 1200);
        
        Calendar cal = Calendar.getInstance();
        
        cal.set(2018, Calendar.JANUARY, 12);
        Date d1 = cal.getTime();
        
        cal.set(2024, Calendar.JANUARY, 12);
        Date d2 = cal.getTime();
        
        Fornecedor f1 = new Fornecedor("Arroz LTDA", "333", new Contrato(d1, d2));
        Produto p = new Produto(1, "Arroz Camil", 3.0, 2.0, f1, 200);
        
        Venda v1 = new Venda(new Cliente("PADRAO"), vendedor, new Date());
        v1.adicionarItem(new ItemVenda(p, 20));
        v1.efetuarVenda();
        
        System.out.println(vendedor.retornarSalario());
        
        caixa.fecharCaixa();
        Estoque.getInstance().imprimirEstoque();
        
        vendedor.imprimirVendas();
    }
}
