package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Perfil;

public class PerfilDAO {

    private static PreparedStatement ps;

    public static List<Perfil> listar() throws SQLException {
        String sql = "SELECT * FROM perfil";
        List<Perfil> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Perfil perfil = new Perfil(rs.getString("nome_perfil"), PermissoesDAO.retornarPorId(rs.getInt("permissoes_id")));
                perfil.setId(rs.getInt("id"));
                lista.add(perfil);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarPerfil(Perfil perfil) throws SQLException {
        String sql = "INSERT INTO perfil (nome_perfil, permissoes_id) VALUES(?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, perfil.getNomePerfil());
            ps.setInt(2, perfil.getPermissoes().getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Perfil retornarPerfil(int id) throws SQLException {
        String sql = "SELECT * FROM perfil WHERE id = ?";
        Perfil perfil = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                perfil = new Perfil(rs.getString("nome_perfil"), PermissoesDAO.retornarPorId(rs.getInt("permissoes_id")));
                perfil.setId(rs.getInt("id"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return perfil;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Perfil retornarPerfilPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM perfil WHERE nome_perfil = ?";
        Perfil perfil = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                perfil = new Perfil(rs.getString("nome_perfil"), PermissoesDAO.retornarPorId(rs.getInt("permissoes_id")));
                perfil.setId(rs.getInt("id"));
            }

            return perfil;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

}
