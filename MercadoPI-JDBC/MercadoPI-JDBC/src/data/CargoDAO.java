package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Cargo;

public class CargoDAO {

    private static PreparedStatement ps;

    public static List<Cargo> listar() throws SQLException {
        String sql = "SELECT * FROM cargo";
        List<Cargo> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cargo cargo = new Cargo(rs.getString("nome_cargo"));
                cargo.setId(rs.getInt("id"));
                lista.add(cargo);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarCargo(Cargo c) throws SQLException {
        String sql = "INSERT INTO cargo (nome_cargo) VALUES(?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, c.getCargo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Cargo retornarCargo(int id) throws SQLException {
        String sql = "SELECT * FROM cargo WHERE id = ?";
        Cargo cargo = null;
        
        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cargo = new Cargo(rs.getString("nome_cargo"));
                cargo.setId(rs.getInt("id"));
            }
            
            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return cargo;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Cargo retornarCargoPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM cargo WHERE nome_cargo = ?";
        Cargo cargo = null;
        
        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cargo = new Cargo(rs.getString("nome_cargo"));
                cargo.setId(rs.getInt("id"));
            }
            
            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return cargo;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
        
    }
    
    public static List<Cargo> pesquisarPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM cargo WHERE nome_cargo LIKE ?";
        List<Cargo> lista = new ArrayList<>();
        
        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Cargo cargo = new Cargo(rs.getString("nome_cargo"));
                cargo.setId(rs.getInt("id"));
                
                lista.add(cargo);
            }
            
            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
        
    }

}
