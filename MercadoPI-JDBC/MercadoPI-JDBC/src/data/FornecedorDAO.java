package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Fornecedor;

public class FornecedorDAO {

    private static PreparedStatement ps;

    public static List<Fornecedor> listar() throws SQLException {
        String sql = "SELECT * FROM fornecedor";
        List<Fornecedor> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor(rs.getString("nome_fornecedor"), rs.getString("telefone"));
                fornecedor.setId(rs.getInt("id"));
                lista.add(fornecedor);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "INSERT INTO fornecedor (nome_fornecedor, telefone) VALUES(?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, fornecedor.getNomeFornecedor());
            ps.setString(2, fornecedor.getTelefone());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Fornecedor retornarFornecedorPorId(int id) throws SQLException {
        String sql = "SELECT * FROM fornecedor WHERE id = ?";
        Fornecedor fornecedor = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                fornecedor = new Fornecedor(rs.getString("nome_fornecedor"), rs.getString("telefone"));
                fornecedor.setId(rs.getInt("id"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return fornecedor;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Fornecedor retornarFornecedorPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM fornecedor WHERE nome_fornecedor = ?";
        Fornecedor fornecedor = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                fornecedor = new Fornecedor(rs.getString("nome_fornecedor"), rs.getString("telefone"));
                fornecedor.setId(rs.getInt("id"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return fornecedor;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
    
    public static List<Fornecedor> pesquisarPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM fornecedor WHERE nome_fornecedor LIKE ?";
        List<Fornecedor> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor(rs.getString("nome_fornecedor"), rs.getString("telefone"));
                fornecedor.setId(rs.getInt("id"));
                lista.add(fornecedor);
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

}
