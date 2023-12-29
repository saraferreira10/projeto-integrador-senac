package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Cliente;

public class ClienteDAO {

    private static PreparedStatement ps;

    public static List<Cliente> listar() throws SQLException {
        String sql = "SELECT * FROM cliente";
        List<Cliente> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("telefone"));
                cliente.setId(rs.getInt("id"));
                lista.add(cliente);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome, telefone) VALUES(?, ?)";
        System.out.print(cliente.getNomeCliente());

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getTelefone());
            ps.executeUpdate();

        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
    
    public static void alterarNome(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nome = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, cliente.getNomeCliente());
            ps.setInt(2, cliente.getId());
            ps.executeUpdate();

        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
    
    public static void alterarTelefone(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET telefone = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, cliente.getTelefone());
            ps.setInt(2, cliente.getId());
            ps.executeUpdate();

        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Cliente retornarClientePorId(int id) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE id = ?";
        Cliente cliente = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente(rs.getString("nome"), rs.getString("telefone"));
                cliente.setId(rs.getInt("id"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return cliente;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Cliente> pesquisarPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
        List<Cliente> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("telefone"));
                cliente.setId(rs.getInt("id"));
                lista.add(cliente);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Cliente retornarClientePorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE nome = ?";
        Cliente cliente = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente(rs.getString("nome"), rs.getString("telefone"));
                cliente.setId(rs.getInt("id"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return cliente;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

}
