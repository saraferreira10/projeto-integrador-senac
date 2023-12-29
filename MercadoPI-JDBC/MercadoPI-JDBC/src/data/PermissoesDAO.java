package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Permissoes;

public class PermissoesDAO {

    private static PreparedStatement ps;

    public static List<Permissoes> listar() throws SQLException {
        String sql = "SELECT * FROM permissoes";
        List<Permissoes> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Permissoes p = new Permissoes(rs.getBoolean("pode_vender"), rs.getBoolean("pode_manipular_produto"),
                        rs.getBoolean("pode_manipular_cliente"), rs.getBoolean("pode_manipular_funcionario"),
                        rs.getBoolean("pode_cadastrar_perfil"), rs.getBoolean("pode_cadastrar_cargo"),
                        rs.getBoolean("pode_cadastrar_entrada"), rs.getBoolean("pode_cadastrar_saida"),
                        rs.getBoolean("pode_manipular_caixa"), rs.getBoolean("acesso_panel_clientes"),
                        rs.getBoolean("acesso_panel_financeiro"), rs.getBoolean("acesso_panel_vendas"),
                        rs.getBoolean("acesso_panel_estoque"), rs.getBoolean("acesso_panel_funcionarios"));
                p.setId(rs.getInt("id"));
                lista.add(p);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarPermissoes(Permissoes p) throws SQLException {
        String sql = "INSERT INTO permissoes (pode_vender, pode_manipular_produto, pode_manipular_cliente, pode_manipular_funcionario, "
                + "pode_cadastrar_perfil, pode_cadastrar_cargo, pode_cadastrar_entrada, pode_cadastrar_saida, "
                + "pode_manipular_caixa, acesso_panel_clientes, acesso_panel_financeiro, acesso_panel_vendas, acesso_panel_estoque, "
                + "acesso_panel_funcionarios) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setBoolean(1, p.isPodeVender());
            ps.setBoolean(2, p.isPodeManipularProduto());
            ps.setBoolean(3, p.isPodeManipularCliente());
            ps.setBoolean(4, p.isPodeManipularFuncionario());
            ps.setBoolean(5, p.isPodeCadastrarPerfil());
            ps.setBoolean(6, p.isPodeCadastrarCargo());
            ps.setBoolean(7, p.isPodeCadastrarEntrada());
            ps.setBoolean(8, p.isPodeCadastrarSaida());
            ps.setBoolean(9, p.isPodeManipularCaixa());
            ps.setBoolean(10, p.isAcessoPanelClientes());
            ps.setBoolean(11, p.isAcessoPanelFinanceiro());
            ps.setBoolean(12, p.isAcessoPanelVendas());
            ps.setBoolean(13, p.isAcessoPanelEstoque());
            ps.setBoolean(14, p.isAcessoPanelFuncionarios());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Permissoes retornarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM permissoes WHERE id = ?";
        Permissoes p = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = new Permissoes(rs.getBoolean("pode_vender"), rs.getBoolean("pode_manipular_produto"),
                        rs.getBoolean("pode_manipular_cliente"), rs.getBoolean("pode_manipular_funcionario"),
                        rs.getBoolean("pode_cadastrar_perfil"), rs.getBoolean("pode_cadastrar_cargo"),
                        rs.getBoolean("pode_cadastrar_entrada"), rs.getBoolean("pode_cadastrar_saida"),
                        rs.getBoolean("pode_manipular_caixa"), rs.getBoolean("acesso_panel_clientes"),
                        rs.getBoolean("acesso_panel_financeiro"), rs.getBoolean("acesso_panel_vendas"),
                        rs.getBoolean("acesso_panel_estoque"), rs.getBoolean("acesso_panel_funcionarios"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return p;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

}
