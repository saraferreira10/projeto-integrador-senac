package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.aplicacao.Cliente;
import model.aplicacao.LoginService;
import model.aplicacao.Permissoes;
import data.ClienteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaClientes extends javax.swing.JFrame {

    private Cliente clienteAlterado;

    public TelaClientes() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Tela de Clientes");
        aplicarMargem();
        desabilitarFuncoes();
        try {
            atualizarTabela(ClienteDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEstoque = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelPesquisa = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCodigo1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnSalvarAlteracoes = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        panelTabela = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        panelPesquisa1 = new javax.swing.JPanel();
        lblCodigo2 = new javax.swing.JLabel();
        lblCodigo3 = new javax.swing.JLabel();
        txtPesquisaNome = new javax.swing.JFormattedTextField();
        btnPesquisaCodigo = new javax.swing.JButton();
        btnPesquisaNome = new javax.swing.JButton();
        spnId = new javax.swing.JSpinner();
        btnListarTodos = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));

        lblEstoque.setBackground(new java.awt.Color(0, 0, 0));
        lblEstoque.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        lblEstoque.setForeground(new java.awt.Color(0, 0, 0));
        lblEstoque.setText("Clientes");

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        panelPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        panelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Inter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("Nome:");

        lblCodigo1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo1.setText("Telefone:");

        btnCadastrar.setBackground(new java.awt.Color(70, 190, 40));
        btnCadastrar.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSalvarAlteracoes.setBackground(new java.awt.Color(245, 232, 60));
        btnSalvarAlteracoes.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnSalvarAlteracoes.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAlteracoes.setText("Salvar Alterações");
        btnSalvarAlteracoes.setBorder(null);
        btnSalvarAlteracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarAlteracoes.setEnabled(false);
        btnSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracoesActionPerformed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelPesquisaLayout = new javax.swing.GroupLayout(panelPesquisa);
        panelPesquisa.setLayout(panelPesquisaLayout);
        panelPesquisaLayout.setHorizontalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesquisaLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(64, 64, 64))
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addComponent(lblCodigo1)
                        .addGap(42, 42, 42)))
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarAlteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPesquisaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrar, btnSalvarAlteracoes});

        panelPesquisaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtNome, txtTelefone});

        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAlteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo1)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPesquisaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrar, btnSalvarAlteracoes, txtNome, txtTelefone});

        panelTabela.setBackground(new java.awt.Color(255, 255, 255));
        panelTabela.setForeground(new java.awt.Color(255, 255, 255));
        panelTabela.setViewportView(tblClientes);

        btnAlterar.setBackground(new java.awt.Color(245, 232, 60));
        btnAlterar.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(null);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        panelPesquisa1.setBackground(new java.awt.Color(255, 255, 255));
        panelPesquisa1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Inter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo2.setText("Código:");

        lblCodigo3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblCodigo3.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo3.setText("Nome:");

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

        btnPesquisaNome.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaNome.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnPesquisaNome.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaNome.setText("Pesquisar");
        btnPesquisaNome.setBorder(null);
        btnPesquisaNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeActionPerformed(evt);
            }
        });

        spnId.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout panelPesquisa1Layout = new javax.swing.GroupLayout(panelPesquisa1);
        panelPesquisa1.setLayout(panelPesquisa1Layout);
        panelPesquisa1Layout.setHorizontalGroup(
            panelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisa1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo2)
                    .addComponent(lblCodigo3))
                .addGap(64, 64, 64)
                .addGroup(panelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPesquisa1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPesquisaCodigo, btnPesquisaNome});

        panelPesquisa1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spnId, txtPesquisaNome});

        panelPesquisa1Layout.setVerticalGroup(
            panelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigo2)
                        .addComponent(spnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPesquisa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo3)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPesquisa1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisaCodigo, btnPesquisaNome, spnId, txtPesquisaNome});

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

        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(null);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(277, 277, 277)
                .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(546, 546, 546))
            .addComponent(panelPesquisa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 1274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );

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
                .addContainerGap(239, Short.MAX_VALUE))
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

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tblClientes.getSelectedRow();

        if (linha >= 0) {
            try {
                btnLimpar.setEnabled(false);
                clienteAlterado = ClienteDAO.retornarClientePorId(Integer.parseInt((String) tblClientes.getValueAt(linha, 0)));
                txtNome.setText(clienteAlterado.getNomeCliente());
                txtTelefone.setText(clienteAlterado.getTelefone());
                btnCadastrar.setEnabled(false);
                btnPesquisaNome.setEnabled(false);
                btnPesquisaCodigo.setEnabled(false);
                btnSalvarAlteracoes.setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
        if (!txtPesquisaNome.getText().trim().isEmpty()) {
            try {
                List<Cliente> lista = ClienteDAO.pesquisarPorNome(txtPesquisaNome.getText());

                if (!lista.isEmpty()) {
                    atualizarTabela(lista);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum registro encontrado!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa!");
        }
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        try {
            atualizarTabela(ClienteDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarTodosActionPerformed

    private void btnPesquisaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCodigoActionPerformed
        try {
            if (ClienteDAO.retornarClientePorId(Integer.parseInt(spnId.getValue().toString())) != null) {
                List<Cliente> lista = new ArrayList<>();
                lista.add(ClienteDAO.retornarClientePorId(Integer.parseInt(spnId.getValue().toString())));
                atualizarTabela(lista);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPesquisaCodigoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtNome.getText().trim().isEmpty() || txtTelefone.getText().trim().equals("()-")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos de cadastro!");
        } else {
            String nome = txtNome.getText();
            String telefone = txtTelefone.getText();

            String[] options = {"Sim", "Não"};
            int resp = JOptionPane.showOptionDialog(null, "Nome: " + nome + "\nTelefone: " + telefone + "\n\nConfirme os dados para o cadastro.", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (resp == 0) {
                try {
                    ClienteDAO.adicionarCliente(new Cliente(nome, telefone));
                    txtNome.setText("");
                    txtTelefone.setText("");
                    atualizarTabela(ClienteDAO.listar());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR CLIENTE!");
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesActionPerformed
        if (txtNome.getText().trim().isEmpty() || txtTelefone.getText().equals("(  )     -    ")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos de atualização!");
        } else {
            String nome = txtNome.getText();
            String telefone = txtTelefone.getText();

            String[] options = {"Sim", "Não"};
            int resp = JOptionPane.showOptionDialog(null, "Nome: " + nome + "\nTelefone: " + telefone + "\n\nConfirme os dados para atualização.", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (resp == 0) {
                try {
                    clienteAlterado.setNomeCliente(nome);
                    clienteAlterado.setTelefone(telefone);

                    ClienteDAO.alterarNome(clienteAlterado);
                    ClienteDAO.alterarTelefone(clienteAlterado);

                    txtNome.setText("");
                    txtTelefone.setText("");

                    try {
                        atualizarTabela(ClienteDAO.listar());
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    btnCadastrar.setEnabled(true);
                    btnSalvarAlteracoes.setEnabled(false);
                    btnLimpar.setEnabled(true);
                    btnPesquisaNome.setEnabled(true);
                    btnPesquisaCodigo.setEnabled(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR DADOS!");
                }
            }
        }
    }//GEN-LAST:event_btnSalvarAlteracoesActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        spnId.setValue(1);
        txtPesquisaNome.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnPesquisaCodigo;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnSalvarAlteracoes;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo3;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JPanel panelPesquisa1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane panelTabela;
    private javax.swing.JSpinner spnId;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPesquisaNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela(List<Cliente> lista) {
        String[] colunas = {"Código", "Nome", "Telefone"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Cliente cliente : lista) {
            String linha = cliente.getId() + "," + cliente.getNomeCliente() + "," + cliente.getTelefone();
            modelo.addRow(linha.split(","));
        }

        tblClientes.setModel(modelo);
    }

    private void aplicarMargem() {
        txtNome.setBorder(BorderFactory.createCompoundBorder(txtNome.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtTelefone.setBorder(BorderFactory.createCompoundBorder(txtTelefone.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtPesquisaNome.setBorder(BorderFactory.createCompoundBorder(txtPesquisaNome.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    }

    private void desabilitarFuncoes() {
        Permissoes permissoes = LoginService.retornarUsuarioLogado().getPerfil().getPermissoes();

        if (!permissoes.isPodeManipularCliente()) {
            btnAlterar.setEnabled(false);
            btnCadastrar.setEnabled(false);
            btnSalvarAlteracoes.setEnabled(false);
            txtNome.setEnabled(false);
            txtTelefone.setEnabled(false);
        }

    }
}
