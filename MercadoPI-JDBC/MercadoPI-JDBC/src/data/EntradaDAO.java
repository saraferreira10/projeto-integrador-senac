package data;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Entrada;

public class EntradaDAO {

    private static PreparedStatement ps;

    public static List<Entrada> listar() throws SQLException {
        String sql = "SELECT * FROM entrada";
        List<Entrada> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Entrada entrada = new Entrada(rs.getInt("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                entrada.setRecebida(rs.getBoolean("recebida"));
                entrada.setId(rs.getInt("id"));

                lista.add(entrada);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarEntrada(Entrada e) throws SQLException {
        String sql = "INSERT INTO entrada (valor, data_vencimento, descricao, recebida) VALUES (?, ?, ?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDouble(1, e.getValor());
            ps.setDate(2, Date.valueOf(e.getDataVencimento()));
            ps.setString(3, e.getDescricao());
            ps.setBoolean(4, e.isRecebida());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void alterar(Entrada e) throws SQLException {
        String sql = "UPDATE entrada SET valor = ?, data_vencimento = ?, descricao = ?, recebida = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDouble(1, e.getValor());
            ps.setDate(2, Date.valueOf(e.getDataVencimento()));
            ps.setString(3, e.getDescricao());
            ps.setBoolean(4, e.isRecebida());
            ps.setInt(5, e.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Entrada retornarEntrada(int id) throws SQLException {
        String sql = "SELECT * FROM entrada WHERE id = ?";
        Entrada entrada = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                entrada = new Entrada(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                entrada.setId(rs.getInt("id"));
                entrada.setRecebida(rs.getBoolean("recebida"));

            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return entrada;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Entrada> pesquisarPorDescricao(String descricao) throws SQLException {
        String sql = "SELECT * FROM entrada WHERE descricao LIKE ?";
        List<Entrada> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + descricao + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Entrada entrada = new Entrada(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                entrada.setId(rs.getInt("id"));
                entrada.setRecebida(rs.getBoolean("recebida"));

                lista.add(entrada);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Entrada> pesquisarPorSituacao(boolean recebida) throws SQLException {
        String sql = "SELECT * FROM entrada WHERE recebida = ?";
        List<Entrada> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setBoolean(1, recebida);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Entrada entrada = new Entrada(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                entrada.setId(rs.getInt("id"));
                entrada.setRecebida(rs.getBoolean("recebida"));

                lista.add(entrada);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Entrada> pesquisarPorDataVencimento(LocalDate data) throws SQLException {
        String sql = "SELECT * FROM entrada WHERE data_vencimento = ?";
        List<Entrada> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDate(1, Date.valueOf(data));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Entrada entrada = new Entrada(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                entrada.setId(rs.getInt("id"));
                entrada.setRecebida(rs.getBoolean("recebida"));

                lista.add(entrada);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

}
