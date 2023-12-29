package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Funcionario;
import model.aplicacao.Venda;
import model.aplicacao.Vendedor;

public class VendaDAO {

    private static PreparedStatement ps;

    public static List<Venda> listar() throws SQLException {
        String sql = "SELECT * FROM venda";
        List<Venda> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda(rs.getTimestamp("data_venda").toLocalDateTime(), (Vendedor) FuncionarioDAO.retornarFuncionario(rs.getInt("funcionario_id")), ClienteDAO.retornarClientePorId(rs.getInt("cliente_id")));
                venda.setId(rs.getInt("id"));
                venda.setValorTotal(rs.getDouble("valor"));
                venda.setItens(ItemVendaDAO.retornarPorVenda(venda));
                venda.setDescricao(rs.getString("descricao"));
                lista.add(venda);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarVenda(Venda venda) throws SQLException {
        String sql = "INSERT INTO venda (data_venda, descricao, valor, funcionario_id, cliente_id) VALUES (?, ?, ?, ?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setTimestamp(1, Timestamp.valueOf(venda.getDataVenda()));
            ps.setString(2, venda.getDescricao());
            ps.setDouble(3, venda.calcularTotal());
            ps.setInt(4, venda.getVendedor().getId());
            ps.setInt(5, venda.getCliente().getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Venda retornarVenda(int id) throws SQLException {
        String sql = "SELECT * FROM venda WHERE id = ?";
        Venda venda = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                venda = new Venda(rs.getTimestamp("data_venda").toLocalDateTime(), (Vendedor) FuncionarioDAO.retornarFuncionario(rs.getInt("funcionario_id")), ClienteDAO.retornarClientePorId(rs.getInt("cliente_id")));
                venda.setId(rs.getInt("id"));
                venda.setDescricao(rs.getString("descricao"));
                venda.setItens(ItemVendaDAO.retornarPorVenda(venda));
                venda.setValorTotal(rs.getDouble("valor"));
            }

            return venda;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Venda retornarVendaPorDescricao(String descricao) throws SQLException {
        String sql = "SELECT * FROM venda WHERE descricao = ?";
        Venda venda = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, descricao);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                venda = new Venda(rs.getTimestamp("data_venda").toLocalDateTime(), (Vendedor) FuncionarioDAO.retornarFuncionario(rs.getInt("funcionario_id")), ClienteDAO.retornarClientePorId(rs.getInt("cliente_id")));
                venda.setId(rs.getInt("id"));
                venda.setDescricao(rs.getString("descricao"));
            }

            return venda;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Venda> retornarVendasPorMes(int mes, int ano) throws SQLException {
        List<Venda> lista = new ArrayList<>();

        for (Venda v : listar()) {
            if (v.getDataVenda().getMonthValue() == mes && v.getDataVenda().getYear() == ano) {
                lista.add(v);
            }
        }

        return lista;
    }

    public static double retornarTotalVendasPorMes(int mes, int ano) throws SQLException {
        double total = 0.0;

        for (Venda v : listar()) {
            if (v.getDataVenda().getMonthValue() == mes && v.getDataVenda().getYear() == ano) {
                total = total + v.getValorTotal();
            }
        }

        return total;
    }

    public static int retornarQuantidadeVendasPorMes(int mes, int ano) throws SQLException {
        int quantidade = 0;

        for (Venda v : listar()) {
            if (v.getDataVenda().getMonthValue() == mes && v.getDataVenda().getYear() == ano) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static int retornarQuantidadeVendasPorDia(int dia, int mes, int ano) throws SQLException {
        int quantidade = 0;

        for (Venda v : listar()) {
            if (v.getDataVenda().getDayOfMonth() == dia && v.getDataVenda().getMonthValue() == mes && v.getDataVenda().getYear() == ano) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static int retornarQuantidadeVendasPorMesVendedor(int mes, int ano, Funcionario vendedor) throws SQLException {
        int quantidade = 0;

        for (Venda v : listar()) {
            if (v.getDataVenda().getMonthValue() == mes && v.getDataVenda().getYear() == ano && v.getVendedor().getId() == vendedor.getId()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static int retornarQuantidadeVendasPorDiaVendedor(int dia, int mes, int ano, Funcionario vendedor) throws SQLException {
        int quantidade = 0;

        for (Venda v : listar()) {
            if (v.getDataVenda().getDayOfMonth() == dia && v.getDataVenda().getMonthValue() == mes && v.getDataVenda().getYear() == ano && v.getVendedor().getId() == vendedor.getId()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static double retornarTotalMesVendedor(int mes, int ano, Funcionario vendedor) throws SQLException {
        double total = 0.0;

        for (Venda v : listar()) {
            if (v.getDataVenda().getMonthValue() == mes && v.getDataVenda().getYear() == ano && v.getVendedor().getId() == vendedor.getId()) {
                total = total + v.getValorTotal();
            }
        }

        return total;
    }

    public static List<Venda> retornarVendasPorDia(int dia, int mes, int ano) throws SQLException {
        List<Venda> lista = new ArrayList<>();

        for (Venda v : listar()) {
            if (v.getDataVenda().getDayOfMonth() == dia && v.getDataVenda().getMonthValue() == mes && v.getDataVenda().getYear() == ano) {
                lista.add(v);
            }
        }

        return lista;
    }

    public static List<Venda> retornarVendasPorCliente(String cliente) throws SQLException {
        List<Venda> lista = new ArrayList<>();

        for (Venda v : listar()) {
            if (v.getCliente().getNomeCliente().toUpperCase().contains(cliente.toUpperCase())) {
                lista.add(v);
            }
        }

        return lista;
    }

    public static List<Venda> retornarVendasPorVendedor(String vendedor) throws SQLException {
        List<Venda> lista = new ArrayList<>();

        for (Venda v : listar()) {
            if (v.getVendedor().getNome().toUpperCase().contains(vendedor.toUpperCase())) {
                lista.add(v);
            }
        }

        return lista;
    }

}
