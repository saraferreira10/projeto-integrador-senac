package data;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Saida;

public class SaidaDAO {

    private static PreparedStatement ps;

    public static List<Saida> listar() throws SQLException {
        String sql = "SELECT * FROM saida";
        List<Saida> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Saida saida = new Saida(rs.getInt("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                saida.setPaga(rs.getBoolean("paga"));
                saida.setId(rs.getInt("id"));
                lista.add(saida);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarSaida(Saida saida) throws SQLException {
        String sql = "INSERT INTO saida (valor, data_vencimento, descricao) VALUES (?, ?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDouble(1, saida.getValor());
            ps.setDate(2, Date.valueOf(saida.getDataVencimento()));
            ps.setString(3, saida.getDescricao());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void alterar(Saida s) throws SQLException {
        String sql = "UPDATE saida SET valor = ?, data_vencimento = ?, descricao = ?, paga = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDouble(1, s.getValor());
            ps.setDate(2, Date.valueOf(s.getDataVencimento()));
            ps.setString(3, s.getDescricao());
            ps.setBoolean(4, s.isPaga());
            ps.setInt(5, s.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Saida retornarSaida(int id) throws SQLException {
        String sql = "SELECT * FROM saida WHERE id = ?";
        Saida saida = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                saida = new Saida(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                saida.setId(rs.getInt("id"));
                saida.setPaga(rs.getBoolean("paga"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return saida;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Saida> pesquisarPorDescricao(String descricao) throws SQLException {
        String sql = "SELECT * FROM saida WHERE descricao LIKE ?";
        List<Saida> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + descricao + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Saida saida = new Saida(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                saida.setId(rs.getInt("id"));
                saida.setPaga(rs.getBoolean("paga"));

                lista.add(saida);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Saida> pesquisarPorSituacao(boolean paga) throws SQLException {
        String sql = "SELECT * FROM saida WHERE paga = ?";
        List<Saida> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setBoolean(1, paga);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Saida saida = new Saida(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                saida.setId(rs.getInt("id"));
                saida.setPaga(rs.getBoolean("paga"));

                lista.add(saida);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Saida> pesquisarPorDataVencimento(String data) throws SQLException {
        String sql = "SELECT * FROM saida WHERE data_vencimento = ?";
        List<Saida> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDate(1, Date.valueOf(data));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Saida saida = new Saida(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                saida.setId(rs.getInt("id"));
                saida.setPaga(rs.getBoolean("paga"));
                lista.add(saida);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Saida> pesquisarPorDataRecebimento(String data) throws SQLException {
        String sql = "SELECT * FROM saida WHERE data_recebimento = ?";
        List<Saida> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDate(1, Date.valueOf(data));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Saida saida = new Saida(rs.getDouble("valor"), rs.getDate("data_vencimento").toLocalDate(), rs.getString("descricao"));
                saida.setId(rs.getInt("id"));
                saida.setPaga(rs.getBoolean("paga"));

                lista.add(saida);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
}
