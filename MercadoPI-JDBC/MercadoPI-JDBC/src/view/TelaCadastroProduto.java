package view;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.aplicacao.Fornecedor;
import model.aplicacao.Produto;
import data.FornecedorDAO;
import data.ProdutoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCadastroProduto extends javax.swing.JFrame {

    public TelaCadastroProduto() {
        initComponents();
        setTitle("Cadastro de Produto");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        try {
            adicionarItensFornecedores(FornecedorDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        alterarPanelFornecedor();
        setResizable(false);
        setLocation(400, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spnVenda = new javax.swing.JSpinner();
        spnCompra = new javax.swing.JSpinner();
        cbxFornecedor = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnlFornecedor = new javax.swing.JPanel();
        lblFornecedorCadastro = new javax.swing.JLabel();
        txtFornecedorCadastro = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        cbkFornecedor = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar Produto");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Produto:");

        txtProduto.setBackground(new java.awt.Color(255, 255, 255));
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fornecedor:");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Valor Unitário (Venda):");

        jLabel6.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Valor Unitário (Compra):");

        spnVenda.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 0.1d));
        spnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnVendaMouseClicked(evt);
            }
        });
        spnVenda.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                spnVendaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        spnCompra.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 0.1d));
        spnCompra.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCompraStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProduto)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(spnCompra))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbxFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSalvar.setBackground(new java.awt.Color(70, 190, 40));
        btnSalvar.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 30, 30));
        jButton3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        pnlFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Inter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        lblFornecedorCadastro.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblFornecedorCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblFornecedorCadastro.setText("Fornecedor:");

        lblTelefone.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefone.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlFornecedorLayout = new javax.swing.GroupLayout(pnlFornecedor);
        pnlFornecedor.setLayout(pnlFornecedorLayout);
        pnlFornecedorLayout.setHorizontalGroup(
            pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFornecedorCadastro)
                    .addComponent(lblTelefone))
                .addGap(32, 32, 32)
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFornecedorCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(txtTelefone))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pnlFornecedorLayout.setVerticalGroup(
            pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedorCadastro)
                    .addComponent(txtFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        cbkFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        cbkFornecedor.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        cbkFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        cbkFornecedor.setText("Adicionar novo fornecedor");
        cbkFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbkFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnlFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbkFornecedor))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cbkFornecedor)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (!camposVazios()) {

            String[] options = {"Sim", "Não"};
            int resposta = JOptionPane.showOptionDialog(null, "Você deseja cadastrar este produto?", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            try {

                Produto p = ProdutoDAO.retornarProdutoPorNome(txtProduto.getText());

                if (p != null) {
                    JOptionPane.showMessageDialog(null, "Já existe um produto cadastado com este nome!");
                } else {
                    if (resposta == 0) {

                        if (!pnlFornecedor.isEnabled()) {
                            p = new Produto(txtProduto.getText(), (double) spnVenda.getValue(), (double) spnCompra.getValue(), FornecedorDAO.retornarFornecedorPorNome((String) cbxFornecedor.getSelectedItem()));
                            ProdutoDAO.adicionarProduto(p);
                            JOptionPane.showMessageDialog(null, "Produto cadastrado!");
                        } else {
                            Fornecedor f1 = new Fornecedor(txtFornecedorCadastro.getText(), txtTelefone.getText());
                            if (FornecedorDAO.retornarFornecedorPorNome(f1.getNomeFornecedor()) != null) {
                                JOptionPane.showMessageDialog(null, "Fornecedor já existente!");
                                return;
                            } else {
                                FornecedorDAO.adicionarFornecedor(f1);
                                p = new Produto(txtProduto.getText(), (double) spnVenda.getValue(), (double) spnCompra.getValue(), FornecedorDAO.retornarFornecedorPorNome(txtFornecedorCadastro.getText()));
                                ProdutoDAO.adicionarProduto(p);
                                JOptionPane.showMessageDialog(null, "Produto cadastrado!");

                            }

                        }

                        dispose();
                        TelaEstoque tela = new TelaEstoque();
                        tela.setVisible(true);

                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null, "Você deseja cancelar?", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (resposta == 0) {
            dispose();
            TelaEstoque tela = new TelaEstoque();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbkFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkFornecedorActionPerformed
        alterarPanelFornecedor();
    }//GEN-LAST:event_cbkFornecedorActionPerformed

    private void spnVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnVendaMouseClicked
    }//GEN-LAST:event_spnVendaMouseClicked

    private void spnVendaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_spnVendaCaretPositionChanged
    }//GEN-LAST:event_spnVendaCaretPositionChanged

    private void spnCompraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCompraStateChanged
    }//GEN-LAST:event_spnCompraStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbkFornecedor;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFornecedorCadastro;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlFornecedor;
    private javax.swing.JSpinner spnCompra;
    private javax.swing.JSpinner spnVenda;
    private javax.swing.JTextField txtFornecedorCadastro;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void alterarPanelFornecedor() {
        if (cbkFornecedor.isSelected()) {
            pnlFornecedor.setEnabled(true);
            txtFornecedorCadastro.setEnabled(true);
            txtTelefone.setEnabled(true);
            lblFornecedorCadastro.setEnabled(true);
            lblTelefone.setEnabled(true);
            cbxFornecedor.setEnabled(false);
        } else {
            pnlFornecedor.setEnabled(false);
            txtFornecedorCadastro.setEnabled(false);
            txtTelefone.setEnabled(false);
            lblFornecedorCadastro.setEnabled(false);
            lblTelefone.setEnabled(false);
            cbxFornecedor.setEnabled(true);
        }
    }

    private void adicionarItensFornecedores(List<Fornecedor> lista) {
        for (Fornecedor f : lista) {
            cbxFornecedor.addItem(f.getNomeFornecedor());
        }
    }

    private boolean camposVazios() {
        if (pnlFornecedor.isEnabled()) {
            return txtProduto.getText().trim().isEmpty() || txtFornecedorCadastro.getText().trim().isEmpty() || txtTelefone.getText().trim().isEmpty();
        } else {
            return txtProduto.getText().isEmpty();
        }
    }
}
