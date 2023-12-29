package view;

import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.aplicacao.LoginService;
import model.aplicacao.Permissoes;
import model.aplicacao.Usuario;
import model.aplicacao.Vendedor;
import data.CargoDAO;
import data.FuncionarioDAO;
import data.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.aplicacao.Funcionario;

public class TelaFuncionarios extends javax.swing.JFrame {

    public TelaFuncionarios() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Tela de Funcionários");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aplicarMargem();
        desabilitarFuncoes();
        try {
            atualizarTabela(FuncionarioDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPesquisaNome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbxSituacao = new javax.swing.JComboBox<>();
        txtCargo = new javax.swing.JTextField();
        btnSituacao = new javax.swing.JButton();
        btnPesquisaCargo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        btnNovoFuncionario = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDesabilitar = new javax.swing.JButton();
        btnHabilitar = new javax.swing.JButton();
        btnListarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1440));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Funcionários");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-voltar.png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Inter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Situação:");

        btnPesquisaNome.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaNome.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPesquisaNome.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnPesquisaNome.setBorder(null);
        btnPesquisaNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cargo:");

        cbxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));

        btnSituacao.setBackground(new java.awt.Color(47, 136, 255));
        btnSituacao.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnSituacao.setForeground(new java.awt.Color(255, 255, 255));
        btnSituacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnSituacao.setBorder(null);
        btnSituacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSituacaoActionPerformed(evt);
            }
        });

        btnPesquisaCargo.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaCargo.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPesquisaCargo.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnPesquisaCargo.setBorder(null);
        btnPesquisaCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25)
                        .addComponent(txtNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSituacao, 0, 418, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxSituacao, txtCargo, txtNome});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPesquisaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisaNome, cbxSituacao, txtCargo, txtNome});

        jScrollPane1.setViewportView(tblFuncionarios);

        btnNovoFuncionario.setBackground(new java.awt.Color(70, 190, 40));
        btnNovoFuncionario.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnNovoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-adicionar (3).png"))); // NOI18N
        btnNovoFuncionario.setText("Novo Funcionario");
        btnNovoFuncionario.setBorder(null);
        btnNovoFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(245, 232, 60));
        btnAlterar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
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

        btnDesabilitar.setBackground(new java.awt.Color(255, 30, 30));
        btnDesabilitar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnDesabilitar.setForeground(new java.awt.Color(255, 255, 255));
        btnDesabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-deletar.png"))); // NOI18N
        btnDesabilitar.setText("Desabilitar Usuário");
        btnDesabilitar.setBorder(null);
        btnDesabilitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesabilitarActionPerformed(evt);
            }
        });

        btnHabilitar.setBackground(new java.awt.Color(102, 255, 102));
        btnHabilitar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnHabilitar.setForeground(new java.awt.Color(255, 255, 255));
        btnHabilitar.setText("Habilitar Usuário");
        btnHabilitar.setBorder(null);
        btnHabilitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnDesabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnListarTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(160, 160, 160))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnDesabilitar, btnHabilitar, btnNovoFuncionario});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDesabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesabilitarActionPerformed
        int linha = tblFuncionarios.getSelectedRow();

        if (linha >= 0) {
            try {
                Usuario usuario = UsuarioDAO.retornarPorFuncionario(Integer.parseInt((String) tblFuncionarios.getValueAt(linha, 0)));

                if (usuario.isAtivo()) {
                    if (!usuario.getPerfil().getNomePerfil().equalsIgnoreCase("ADMINISTRADOR")) {
                        int resp = JOptionPane.showConfirmDialog(null, "Você deseja desabilitar este usuário? Não será mais possível realizar operações com ele.", "Confirmação", JOptionPane.YES_NO_OPTION);

                        if (resp == 0) {
                            UsuarioDAO.alterarSituacao(false, usuario);
                            atualizarTabela(FuncionarioDAO.listar());

                            if (usuario.equals(LoginService.retornarUsuarioLogado())) {
                                JOptionPane.showMessageDialog(null, "Seu usuário foi desabilitado: encerrando sessão!");
                                LoginService.retornarUsuarioLogado().encerrarSessao();
                                dispose();
                                TelaDeLogin tela = new TelaDeLogin();
                                tela.setVisible(true);
                                tela.setExtendedState(MAXIMIZED_BOTH);
                                tela.setTitle("Sistema");
                            }

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário Administrador não pode ser desabilitado!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuário já está desabilitado!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnDesabilitarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
        dispose();
        TelaCadastroFuncionario tela = new TelaCadastroFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tblFuncionarios.getSelectedRow();
        if (linha >= 0) {
            try {

                Funcionario usuario = FuncionarioDAO.retornarFuncionario(Integer.parseInt(tblFuncionarios.getValueAt(linha, 0).toString()));

                if (UsuarioDAO.retornarPorFuncionario(usuario.getId()).isAtivo()) {
                    dispose();
                    TelaAlterarFuncionario tela = new TelaAlterarFuncionario(usuario);
                    tela.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuário está desabilitado, não é mais possível atualizar seus dados!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisaCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCargoActionPerformed
        if (!txtCargo.getText().trim().isEmpty()) {
            try {
                atualizarTabela(FuncionarioDAO.buscarFuncionarioPorCargo(CargoDAO.pesquisarPorNome(txtCargo.getText())));
            } catch (SQLException ex) {
                Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa!");
        }
    }//GEN-LAST:event_btnPesquisaCargoActionPerformed

    private void btnSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSituacaoActionPerformed
        try {
            List<Usuario> usuarios = UsuarioDAO.retornarUsuariosPorSituacao(cbxSituacao.getSelectedItem().toString().equalsIgnoreCase("ATIVO"));
            List<Funcionario> funcionarios = new ArrayList<>();

            for (Usuario user : usuarios) {
                funcionarios.add(user.getFuncionario());
            }

            atualizarTabela(funcionarios);
        } catch (SQLException ex) {
            Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSituacaoActionPerformed

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
        if (!txtNome.getText().trim().isEmpty()) {
            try {
                atualizarTabela(FuncionarioDAO.pesquisarFuncionariosPorNome(txtNome.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa!");
        }
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarActionPerformed
        int linha = tblFuncionarios.getSelectedRow();

        if (linha >= 0) {
            try {
                Funcionario funcionario = FuncionarioDAO.retornarFuncionario(Integer.parseInt(tblFuncionarios.getValueAt(linha, 0).toString()));

                Usuario user = UsuarioDAO.retornarPorFuncionario(funcionario.getId());

                if (!user.isAtivo()) {
                    int resp = JOptionPane.showConfirmDialog(null, "Deseja habilitar este usuário?", "Mensagem de Confirmação", JOptionPane.YES_NO_OPTION);

                    if (resp == 0) {
                        try {
                            UsuarioDAO.alterarSituacao(true, user);
                            atualizarTabela(FuncionarioDAO.listar());
                        } catch (SQLException ex) {
                            Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuário já está habilitado!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnHabilitarActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        try {
            atualizarTabela(FuncionarioDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDesabilitar;
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnPesquisaCargo;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnSituacao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela(List<Funcionario> lista) throws SQLException {
        String[] colunas = {"Código", "Nome", "Situação", "Salário Fixo", "Cargo", "Comissão"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Funcionario f : lista) {
            Usuario user = UsuarioDAO.retornarPorFuncionario(f.getId());
            String linha = f.getId() + "," + f.getNome() + "," + (user.isAtivo() ? "ATIVO" : "INATIVO")
                    + "," + f.getSalarioFixo() + "," + f.getCargo().getCargo() + ","
                    + (f instanceof Vendedor v ? v.getComissao() : "0");

            modelo.addRow(linha.split(","));
        }

        tblFuncionarios.setModel(modelo);
    }

    private void aplicarMargem() {
        txtNome.setBorder(BorderFactory.createCompoundBorder(txtNome.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtCargo.setBorder(BorderFactory.createCompoundBorder(txtCargo.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    }

    private void desabilitarFuncoes() {
        Permissoes permissoes = LoginService.retornarUsuarioLogado().getPerfil().getPermissoes();

        if (!permissoes.isPodeManipularFuncionario()) {
            btnAlterar.setEnabled(false);
            btnDesabilitar.setEnabled(false);
            btnDesabilitar.setEnabled(false);
            btnNovoFuncionario.setEnabled(false);
        }
    }
}
