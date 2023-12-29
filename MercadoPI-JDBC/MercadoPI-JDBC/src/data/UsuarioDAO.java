package data;

import Utils.Criptografia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.aplicacao.Usuario;

public class UsuarioDAO {

    private static PreparedStatement ps;

    public static List<Usuario> listar() throws SQLException {
        String sql = "SELECT * FROM usuario";
        List<Usuario> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getString("username"), rs.getString("senha"),
                        PerfilDAO.retornarPerfil(rs.getInt("perfil_id")), FuncionarioDAO.retornarFuncionario(rs.getInt("funcionario_id")));
                usuario.setAtivo(rs.getBoolean("ativo"));

                lista.add(usuario);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (username, senha, perfil_id, funcionario_id) VALUES ( ?, ?, ?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, Criptografia.criptografar(usuario.getSenha()));
            ps.setInt(3, usuario.getPerfil().getId());
            ps.setInt(4, usuario.getFuncionario().getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.desconectar();
        }
    }

    public static void alterarSenha(Usuario usuario, String senha) throws SQLException {
        String sql = "UPDATE usuario SET senha = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, Criptografia.criptografar(senha));
            ps.setInt(2, usuario.getId());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.desconectar();
        }
    }

    public static void alterarUsername(Usuario usuario, String username) throws SQLException {
        String sql = "UPDATE usuario SET username = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ps.setInt(2, usuario.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.desconectar();
        }
    }

    public static Usuario retornarUsuario(int id) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        Usuario usuario = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario(rs.getString("username"), rs.getString("senha"),
                        PerfilDAO.retornarPerfil(rs.getInt("perfil_id")), FuncionarioDAO.retornarFuncionario(rs.getInt("funcionario_id")));
                usuario.setId(rs.getInt("id"));
                usuario.setAtivo(rs.getBoolean("ativo"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return usuario;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Usuario> pesquisarUsuariosPorNome(String nome) throws SQLException {
        List<Usuario> lista = new ArrayList<>();

        for (Usuario usuarioAtual : listar()) {
            if (usuarioAtual.getFuncionario().getNome().toUpperCase().contains(nome.toUpperCase())) {
                lista.add(usuarioAtual);
            }
        }

        return lista;
    }

    public static List<Usuario> retornarUsuariosPorSituacao(boolean ativo) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE ativo = ?";
        List<Usuario> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setBoolean(1, ativo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getString("username"), rs.getString("senha"),
                        PerfilDAO.retornarPerfil(rs.getInt("perfil_id")), FuncionarioDAO.retornarFuncionario(rs.getInt("funcionario_id")));
                usuario.setAtivo(rs.getBoolean("ativo"));

                lista.add(usuario);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Usuario retornarPorFuncionario(int id) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE funcionario_id = ?";
        Usuario usuario = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario(rs.getString("username"), rs.getString("senha"),
                        PerfilDAO.retornarPerfil(rs.getInt("perfil_id")), FuncionarioDAO.retornarFuncionario(rs.getInt("funcionario_id")));
                usuario.setAtivo(rs.getBoolean("ativo"));
                usuario.setId(rs.getInt("id"));
            }

            return usuario;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static boolean usuarioExiste(String username) throws SQLException {
        for (Usuario usuarioAtual : listar()) {
            if (username.equals(usuarioAtual.getUsername())) {
                return true;
            }
        }

        return false;
    }

    public static Usuario validarUsuario(String username, String senha) throws SQLException, Exception {
        String sql = "SELECT * FROM usuario WHERE username = ? AND senha = ?";
        Usuario user = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, Criptografia.criptografar(senha));

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new Usuario(rs.getString("username"), rs.getString("senha"),
                        PerfilDAO.retornarPerfil(rs.getInt("perfil_id")), FuncionarioDAO.retornarFuncionario(rs.getInt("funcionario_id")));
                user.setAtivo(rs.getBoolean("ativo"));
                user.setId(rs.getInt("id"));
            }

            return user;
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
    
    public static void alterarSituacao(boolean ativo, Usuario user) throws SQLException  {
        String sql = "UPDATE usuario SET ativo = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setBoolean(1, ativo);
            ps.setInt(2, user.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

}
