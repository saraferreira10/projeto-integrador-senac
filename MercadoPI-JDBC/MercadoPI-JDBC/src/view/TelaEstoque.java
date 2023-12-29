package view;

import data.CaixaDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.aplicacao.LoginService;
import model.aplicacao.Permissoes;
import model.aplicacao.Produto;
import model.aplicacao.Saida;
import data.ProdutoDAO;
import data.SaidaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaEstoque extends javax.swing.JFrame {

    public TelaEstoque() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Tela de Estoque");
        aplicarMargem();
        desabilitarFuncoes();
        try {
            atualizarTabela(ProdutoDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEstoque = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelPesquisa = new javax.swing.JPanel();
        btnPesquisaProduto = new javax.swing.JButton();
        btnPesquisarFornecedor = new javax.swing.JButton();
        btnPesquisaCodigo = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        spnCodigo = new javax.swing.JSpinner();
        panelTabela = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnNovoProduto = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnAdicionarEstoque = new javax.swing.JButton();
        btnRetirarEstoque = new javax.swing.JButton();
        btnListarTodos = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));

        lblEstoque.setBackground(new java.awt.Color(0, 0, 0));
        lblEstoque.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        lblEstoque.setForeground(new java.awt.Color(0, 0, 0));
        lblEstoque.setText("Estoque");

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        panelPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        panelPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPesquisaProduto.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaProduto.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnPesquisaProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaProduto.setText("Pesquisar");
        btnPesquisaProduto.setBorder(null);
        btnPesquisaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaProdutoActionPerformed(evt);
            }
        });

        btnPesquisarFornecedor.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisarFornecedor.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnPesquisarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarFornecedor.setText("Pesquisar");
        btnPesquisarFornecedor.setBorder(null);
        btnPesquisarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFornecedorActionPerformed(evt);
            }
        });

        btnPesquisaCodigo.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaCodigo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnPesquisaCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaCodigo.setText("Pesquisar");
        btnPesquisaCodigo.setBorder(null);
        btnPesquisaCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaCodigoActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("Código:");

        lblFornecedor.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        lblFornecedor.setText("Fornecedor:");

        lblProduto.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(0, 0, 0));
        lblProduto.setText("Produto:");

        spnCodigo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout panelPesquisaLayout = new javax.swing.GroupLayout(panelPesquisa);
        panelPesquisa.setLayout(panelPesquisaLayout);
        panelPesquisaLayout.setHorizontalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblProduto)
                        .addComponent(lblFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPesquisaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spnCodigo, txtFornecedor, txtProduto});

        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(spnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFornecedor)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProduto))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelPesquisaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisaCodigo, btnPesquisaProduto, btnPesquisarFornecedor, spnCodigo, txtFornecedor, txtProduto});

        panelTabela.setBackground(new java.awt.Color(255, 255, 255));
        panelTabela.setForeground(new java.awt.Color(255, 255, 255));
        panelTabela.setViewportView(tblProdutos);

        btnNovoProduto.setBackground(new java.awt.Color(70, 190, 40));
        btnNovoProduto.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnNovoProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-adicionar (3).png"))); // NOI18N
        btnNovoProduto.setText("Novo Produto");
        btnNovoProduto.setBorder(null);
        btnNovoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNovoProduto.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(245, 232, 60));
        btnAlterar.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar Produto");
        btnAlterar.setBorder(null);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAdicionarEstoque.setBackground(new java.awt.Color(245, 232, 60));
        btnAdicionarEstoque.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnAdicionarEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-adicionar (3).png"))); // NOI18N
        btnAdicionarEstoque.setText("Adicionar no estoque");
        btnAdicionarEstoque.setBorder(null);
        btnAdicionarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEstoqueActionPerformed(evt);
            }
        });

        btnRetirarEstoque.setBackground(new java.awt.Color(255, 30, 30));
        btnRetirarEstoque.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnRetirarEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-deletar.png"))); // NOI18N
        btnRetirarEstoque.setText("Retirar do estoque");
        btnRetirarEstoque.setBorder(null);
        btnRetirarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarEstoqueActionPerformed(evt);
            }
        });

        btnListarTodos.setBackground(new java.awt.Color(51, 51, 51));
        btnListarTodos.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnListarTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnListarTodos.setText("LISTAR TODOS");
        btnListarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRetirarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 1274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdicionarEstoque, btnAlterar, btnNovoProduto, btnRetirarEstoque});

        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdicionarEstoque, btnAlterar, btnNovoProduto, btnRetirarEstoque});

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-voltar.png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstoque)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEstoque)
                        .addGap(32, 32, 32)))
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        dispose();
        TelaCadastroProduto tela = new TelaCadastroProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tblProdutos.getSelectedRow();

        if (linha >= 0) {
            try {
                dispose();
                TelaAlterarProduto tela = new TelaAlterarProduto(ProdutoDAO.retornarProdutoPorId(Integer.parseInt((String) tblProdutos.getValueAt(linha, 0))));
                tela.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAdicionarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEstoqueActionPerformed
        try {
            if (CaixaDAO.retornarCaixa().isAberto()) {
                int linha = tblProdutos.getSelectedRow();

                if (linha >= 0) {
                    String qtde = JOptionPane.showInputDialog("Quantos itens você deseja adicionar?");

                    int numQtde = Integer.valueOf(qtde);

                    if (numQtde < 0) {
                        JOptionPane.showMessageDialog(null, "Informe um valor maior que zero!");
                    } else {
                        int resp = JOptionPane.showConfirmDialog(null, "Você deseja adicionar " + numQtde + " itens no estoque?", "Mensagem de Confirmação", JOptionPane.YES_NO_OPTION);

                        if (resp == 0) {
                            Produto produto = ProdutoDAO.retornarProdutoPorId(Integer.parseInt((String) tblProdutos.getValueAt(linha, 0)));
                            produto.adicionarProduto(numQtde);
                            ProdutoDAO.alterar(produto);
                            SaidaDAO.adicionarSaida(new Saida(produto.getValorDeCompra() * produto.getQuantidade(), LocalDate.now(), "compra-produto-" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "-" + produto.getNomeProduto().replace(" ", "-").toLowerCase()));
                            atualizarTabela(ProdutoDAO.listar());
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma linha!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O Caixa está fechado!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe apenas valores numéricos!");
        }
    }//GEN-LAST:event_btnAdicionarEstoqueActionPerformed

    private void btnRetirarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarEstoqueActionPerformed
        try {
            if (CaixaDAO.retornarCaixa().isAberto()) {
                int linha = tblProdutos.getSelectedRow();

                Produto produto = ProdutoDAO.retornarProdutoPorId((Integer.parseInt((String) tblProdutos.getValueAt(linha, 0))));

                if (linha >= 0) {
                    String qtde = JOptionPane.showInputDialog("Quantos itens você deseja retirar do estoque?");

                    try {
                        int numQtde = Integer.valueOf(qtde);

                        if (numQtde < 0) {
                            JOptionPane.showMessageDialog(null, "Informe um valor maior que zero!");
                        } else if (numQtde > produto.getQuantidade()) {
                            JOptionPane.showMessageDialog(null, "Não é possível retirar " + numQtde + " itens do estoque, pois o total armazenado atualmente é " + produto.getQuantidade() + "!");
                        } else {
                            int resp = JOptionPane.showConfirmDialog(null, "Você deseja excluir " + numQtde + " itens no estoque?", "Mensagem de Confirmação", JOptionPane.YES_NO_OPTION);

                            if (resp == 0) {
                                produto.consumirProduto(numQtde);
                                ProdutoDAO.alterar(produto);
                                atualizarTabela(ProdutoDAO.listar());
                            }
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Informe apenas valores numéricos!");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma linha!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O Caixa está fechado!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRetirarEstoqueActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaProdutoActionPerformed

        if (!txtProduto.getText().trim().isEmpty()) {
            try {
                atualizarTabela(ProdutoDAO.pesquisarPorNome(txtProduto.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome para realizar a pesquisa!");
        }

    }//GEN-LAST:event_btnPesquisaProdutoActionPerformed

    private void btnPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFornecedorActionPerformed
        if (!txtFornecedor.getText().trim().isEmpty()) {
            try {
                atualizarTabela(ProdutoDAO.retornarProdutosPorFornecedor(txtFornecedor.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo fornecedor para realizar a pesquisa!");
        }
    }//GEN-LAST:event_btnPesquisarFornecedorActionPerformed

    private void btnPesquisaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCodigoActionPerformed
        try {
            List<Produto> lista = new ArrayList<>();

            if (ProdutoDAO.retornarProdutoPorId(Integer.parseInt(spnCodigo.getValue().toString())) != null) {
                lista.add(ProdutoDAO.retornarProdutoPorId(Integer.parseInt(spnCodigo.getValue().toString())));
            }

            atualizarTabela(lista);
        } catch (SQLException ex) {
            Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPesquisaCodigoActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        try {
            atualizarTabela(ProdutoDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarTodosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEstoque;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnPesquisaCodigo;
    private javax.swing.JButton btnPesquisaProduto;
    private javax.swing.JButton btnPesquisarFornecedor;
    private javax.swing.JButton btnRetirarEstoque;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane panelTabela;
    private javax.swing.JSpinner spnCodigo;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela(List<Produto> lista) {
        String[] colunas = {"Código", "Produto", "Valor de venda", "Valor de compra", "Fornecedor", "Quantidade"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Produto produto : lista) {
            String linha = produto.getId() + "," + produto.getNomeProduto() + "," + produto.getValorDeVenda() + "," + produto.getValorDeCompra() + "," + produto.getFornecedor().getNomeFornecedor() + "," + produto.getQuantidade();
            modelo.addRow(linha.split(","));
        }
        tblProdutos.setModel(modelo);
    }

    private void aplicarMargem() {
        txtFornecedor.setBorder(BorderFactory.createCompoundBorder(txtFornecedor.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtProduto.setBorder(BorderFactory.createCompoundBorder(txtProduto.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    }

    private void desabilitarFuncoes() {
        Permissoes permissoes = LoginService.retornarUsuarioLogado().getPerfil().getPermissoes();

        if (!permissoes.isPodeManipularProduto()) {
            btnAdicionarEstoque.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnRetirarEstoque.setEnabled(false);
            btnNovoProduto.setEnabled(false);
        }

    }

}
