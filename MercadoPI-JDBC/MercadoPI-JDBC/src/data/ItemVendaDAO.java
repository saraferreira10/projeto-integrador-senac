package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.ItemVenda;
import model.aplicacao.Venda;

public class ItemVendaDAO {

    private static PreparedStatement ps;

    public static List<ItemVenda> listar() throws SQLException {
        String sql = "SELECT * FROM item_produto";
        List<ItemVenda> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ItemVenda item = new ItemVenda(VendaDAO.retornarVenda(rs.getInt("venda_id")), ProdutoDAO.retornarProdutoPorId(rs.getInt("produto_id")), rs.getInt("quantidade"));
                item.setId(rs.getInt("id"));
                item.subTotal();
                lista.add(item);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarItemVenda(ItemVenda item) throws SQLException {
        String sql = "INSERT INTO item_produto (venda_id, produto_id, quantidade) VALUES (?, ?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, item.getVenda().getId());
            ps.setInt(2, item.getProduto().getId());
            ps.setInt(3, item.getQuantidade());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<ItemVenda> retornarPorVenda(Venda venda) throws SQLException {
        String sql = "SELECT * FROM item_produto WHERE venda_id = ?";
        List<ItemVenda> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, venda.getId());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ItemVenda item = new ItemVenda(venda, ProdutoDAO.retornarProdutoPorId(rs.getInt("produto_id")), rs.getInt("quantidade"));
                item.setId(rs.getInt("id"));
                item.subTotal();
                lista.add(item);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
}
