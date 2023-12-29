package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Caixa;

public class CaixaDAO {

    private static PreparedStatement ps;

    public static List<Caixa> listar() throws SQLException {
        String sql = "SELECT * FROM caixa";
        List<Caixa> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                double saldo = rs.getDouble("saldo_anterior") + rs.getDouble("entradas") - rs.getDouble("saidas");
                Caixa caixa = new Caixa(rs.getBoolean("aberto"), saldo, rs.getDouble("entradas"), rs.getDouble("saidas"), rs.getDouble("saldo_anterior"));
                caixa.setId(rs.getInt("id"));
                lista.add(caixa);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
    
    public static Caixa retornarCaixa() throws SQLException {
        String sql = "SELECT * FROM caixa WHERE id = (SELECT MAX(id) FROM caixa)";
        Caixa caixa = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double saldo = rs.getDouble("saldo_anterior") + rs.getDouble("entradas") - rs.getDouble("saidas");
                caixa = new Caixa(rs.getBoolean("aberto"), saldo, rs.getDouble("entradas"), rs.getDouble("saidas"), rs.getDouble("saldo_anterior"));
                caixa.setId(rs.getInt("id"));
            }

            return caixa;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void cadastrar(Caixa caixa) throws SQLException {
        String sql = "INSERT INTO caixa (saldo_anterior, entradas, saidas, aberto) VALUES (?,?,?,?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDouble(1, caixa.getSaldoAnterior());
            ps.setDouble(2, caixa.getEntradas());
            ps.setDouble(3, caixa.getSaidas());
            ps.setBoolean(4, caixa.isAberto());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void alterar(Caixa caixa) throws SQLException {
        String sql = "UPDATE caixa SET saldo_anterior = ?, entradas = ?, saidas = ?, aberto = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setDouble(1, caixa.getSaldoAnterior());
            ps.setDouble(2, caixa.getEntradas());
            ps.setDouble(3, caixa.getSaidas());
            ps.setBoolean(4, caixa.isAberto());
            ps.setInt(5, caixa.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

}
