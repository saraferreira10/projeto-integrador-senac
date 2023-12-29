package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.aplicacao.Fornecedor;
import model.aplicacao.Produto;

public class ProdutoDAO {

    private static PreparedStatement ps;

    public static List<Produto> listar() throws SQLException {
        String sql = "SELECT * FROM produto";
        List<Produto> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto(rs.getString("nome"), rs.getDouble("valor_venda"), rs.getDouble("valor_compra"), FornecedorDAO.retornarFornecedorPorId(rs.getInt("fornecedor_id")));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setId(rs.getInt("id"));
                lista.add(produto);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void adicionarProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO produto (nome, valor_venda, valor_compra, quantidade, fornecedor_id) VALUES(?, ?, ?, ?, ?)";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, produto.getNomeProduto());
            ps.setDouble(2, produto.getValorDeVenda());
            ps.setDouble(3, produto.getValorDeCompra());
            ps.setInt(4, produto.getQuantidade());
            ps.setInt(5, produto.getFornecedor().getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Produto retornarProdutoPorId(int id) throws SQLException {
        String sql = "SELECT * FROM produto WHERE id = ?";
        Produto produto = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                produto = new Produto(rs.getString("nome"), rs.getDouble("valor_venda"), rs.getDouble("valor_compra"),
                        FornecedorDAO.retornarFornecedorPorId(rs.getInt("fornecedor_id")));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return produto;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Produto> retornarProdutosPorFornecedor(String fornecedor) throws SQLException {
        String sql = "SELECT * FROM produto WHERE fornecedor_id = ?";
        List<Produto> lista = new ArrayList<>();

        try {
            List<Fornecedor> fornecedores = new ArrayList<>();
            fornecedores = FornecedorDAO.pesquisarPorNome(fornecedor);
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);

            for (Fornecedor f : fornecedores) {
                ps.setInt(1, f.getId());

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Produto produto = new Produto(rs.getString("nome"), rs.getDouble("valor_venda"), rs.getDouble("valor_compra"),
                            FornecedorDAO.retornarFornecedorPorId(f.getId()));
                    produto.setId(rs.getInt("id"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    lista.add(produto);
                }
            }

            //PS. PODE LANÇAR NULLPOINTEREXCEPTION
            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static List<Produto> pesquisarPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM produto WHERE nome LIKE ?";
        List<Produto> lista = new ArrayList<>();

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto(rs.getString("nome"), rs.getDouble("valor_venda"), rs.getDouble("valor_compra"),
                        FornecedorDAO.retornarFornecedorPorId(rs.getInt("fornecedor_id")));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                lista.add(produto);
            }

            return lista;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static Produto retornarProdutoPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM produto WHERE nome = ?";
        Produto produto = null;

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                produto = new Produto(rs.getString("nome"), rs.getDouble("valor_venda"), rs.getDouble("valor_compra"),
                        FornecedorDAO.retornarFornecedorPorId(rs.getInt("fornecedor_id")));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
            }

            return produto;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

    public static void alterar(Produto produto) throws SQLException {
        String sql = "UPDATE produto SET nome = ?, valor_venda = ?, valor_compra = ?, fornecedor_id = ?, quantidade = ? WHERE id = ?";

        try {
            Conexao.conectar();
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, produto.getNomeProduto());
            ps.setDouble(2, produto.getValorDeVenda());
            ps.setDouble(3, produto.getValorDeCompra());
            ps.setInt(4, produto.getFornecedor().getId());
            ps.setInt(5, produto.getQuantidade());
            ps.setInt(6, produto.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            Conexao.desconectar();
        }
    }

}
