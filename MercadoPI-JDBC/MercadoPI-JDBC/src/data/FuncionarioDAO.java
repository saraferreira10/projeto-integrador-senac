package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Cargo;
import model.aplicacao.Funcionario;
import model.aplicacao.Vendedor;

public class FuncionarioDAO {

    private static PreparedStatement ps;

    public static List<Funcionario> listar() throws SQLException {
        String sql = "SELECT * FROM funcionario";
        List<Funcionario> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = rs.getInt("comissao") > 0 ? new Vendedor(rs.getInt("comissao"),
                        rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")))
                        : new Funcionario(rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")));

                funcionario.setId(rs.getInt("id"));

                lista.add(funcionario);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (nome, salario_fixo, comissao, cargo_id) VALUES (?, ?, ?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setDouble(2, funcionario.getSalarioFixo());
            ps.setInt(3, funcionario.getComissao());
            ps.setInt(4, funcionario.getCargo().getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Funcionario retornarFuncionario(int id) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        Funcionario funcionario = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                funcionario = rs.getInt("comissao") > 0 ? new Vendedor(rs.getInt("comissao"),
                        rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")))
                        : new Funcionario(rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")));
                funcionario.setId(rs.getInt("id"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return funcionario;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
    
    public static Funcionario retornarFuncionarioPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE nome = ?";
        Funcionario funcionario = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                funcionario = rs.getInt("comissao") > 0 ? new Vendedor(rs.getInt("comissao"),
                        rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")))
                        : new Funcionario(rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")));
                funcionario.setId(rs.getInt("id"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return funcionario;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Funcionario> buscarFuncionarioPorCargo(List<Cargo> cargos) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE cargo_id = ?";
        List<Funcionario> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);

            for (Cargo cargo : cargos) {
                ps.setInt(1, cargo.getId());

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Funcionario funcionario = rs.getInt("comissao") > 0 ? new Vendedor(rs.getInt("comissao"),
                            rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")))
                            : new Funcionario(rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")));
                    funcionario.setId(rs.getInt("id"));

                    lista.add(funcionario);
                }
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Funcionario> pesquisarFuncionariosPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE nome LIKE ?";
        List<Funcionario> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = rs.getInt("comissao") > 0 ? new Vendedor(rs.getInt("comissao"),
                        rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")))
                        : new Funcionario(rs.getString("nome"), rs.getDouble("salario_fixo"), CargoDAO.retornarCargo(rs.getInt("cargo_id")));
                funcionario.setId(rs.getInt("id"));

                lista.add(funcionario);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    
    public static void alterar(Funcionario funcionario) throws SQLException {
        String sql = "UPDATE funcionario SET nome = ?, salario_fixo = ?, comissao = ?, cargo_id = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setDouble(2, funcionario.getSalarioFixo());
            ps.setInt(3, funcionario.getComissao());
            ps.setInt(4, funcionario.getCargo().getId());
            ps.setInt(5, funcionario.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }
}
