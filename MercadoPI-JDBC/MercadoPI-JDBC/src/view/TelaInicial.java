package view;

import Utils.Criptografia;
import Utils.Utilidades;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.aplicacao.Cargo;
import model.aplicacao.Vendedor;
import model.aplicacao.LoginService;
import model.aplicacao.Usuario;
import data.CargoDAO;
import data.UsuarioDAO;
import data.VendaDAO;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        setTitle("Tela Inicial");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        desabilitarFuncoes();
        gerarAtalhos();
        gerarMensagemBoasVindas();
        retornarValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBg = new javax.swing.JPanel();
        lblBoasVindas = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblVendasHoje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblVendasMes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblReaisMes = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblOperacoes = new javax.swing.JLabel();
        btnVendas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnMeusDados = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemSair = new javax.swing.JMenu();
        menuMeusDados = new javax.swing.JMenu();
        menuItemSenha = new javax.swing.JMenuItem();
        menuItemAlterarUsuario = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuItemCargo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelBg.setBackground(new java.awt.Color(255, 255, 255));
        panelBg.setPreferredSize(new java.awt.Dimension(1440, 1024));

        lblBoasVindas.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        lblBoasVindas.setForeground(new java.awt.Color(0, 0, 0));
        lblBoasVindas.setText("Olá, user!");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-voltar.png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 136, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblVendasHoje.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        lblVendasHoje.setForeground(new java.awt.Color(255, 255, 255));
        lblVendasHoje.setText("0");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vendas realizadas hoje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVendasHoje)
                    .addComponent(jLabel3))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblVendasHoje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(47, 136, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lblVendasMes.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        lblVendasMes.setForeground(new java.awt.Color(255, 255, 255));
        lblVendasMes.setText("0");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vendas realizadas no mês");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVendasMes)
                    .addComponent(jLabel5))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblVendasMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(47, 136, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        lblReaisMes.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        lblReaisMes.setForeground(new java.awt.Color(255, 255, 255));
        lblReaisMes.setText("0");

        jLabel7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("R$ vendidos no mês");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReaisMes)
                    .addComponent(jLabel7))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblReaisMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        lblOperacoes.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        lblOperacoes.setForeground(new java.awt.Color(0, 0, 0));
        lblOperacoes.setText("Suas Operações:");

        btnVendas.setBackground(new java.awt.Color(113, 191, 191));
        btnVendas.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnVendas.setText("Vendas");
        btnVendas.setBorder(null);
        btnVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(113, 191, 191));
        btnClientes.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnFinanceiro.setBackground(new java.awt.Color(113, 191, 191));
        btnFinanceiro.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btnFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        btnFinanceiro.setText("Financeiro");
        btnFinanceiro.setBorder(null);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        btnEstoque.setBackground(new java.awt.Color(113, 191, 191));
        btnEstoque.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btnEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnEstoque.setText("Estoque");
        btnEstoque.setBorder(null);
        btnEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnMeusDados.setBackground(new java.awt.Color(113, 191, 191));
        btnMeusDados.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btnMeusDados.setForeground(new java.awt.Color(255, 255, 255));
        btnMeusDados.setText("Meus Dados");
        btnMeusDados.setBorder(null);
        btnMeusDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMeusDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeusDadosActionPerformed(evt);
            }
        });

        btnFuncionarios.setBackground(new java.awt.Color(113, 191, 191));
        btnFuncionarios.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        btnFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btnFuncionarios.setText("Funcionários");
        btnFuncionarios.setBorder(null);
        btnFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnVoltar)
                .addContainerGap(1485, Short.MAX_VALUE))
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 32, Short.MAX_VALUE)
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMeusDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOperacoes)
                            .addComponent(lblBoasVindas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(261, 261, 261))
        );

        panelBgLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3, jPanel4});

        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblBoasVindas)
                        .addGap(18, 18, 18)
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBgLayout.createSequentialGroup()
                                .addComponent(lblOperacoes)
                                .addGap(18, 18, 18)
                                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMeusDados, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(493, 493, 493))
        );

        panelBgLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel2, jPanel3, jPanel4});

        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N

        menuItemSair.setForeground(new java.awt.Color(0, 0, 0));
        menuItemSair.setText("Sair");
        menuItemSair.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        menuItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemSairMouseClicked(evt);
            }
        });
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuItemSair);

        menuMeusDados.setText("Alterar meus dados de usuário");

        menuItemSenha.setText("Alterar senha");
        menuItemSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSenhaActionPerformed(evt);
            }
        });
        menuMeusDados.add(menuItemSenha);

        menuItemAlterarUsuario.setText("Alterar nome de usuário");
        menuItemAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAlterarUsuarioActionPerformed(evt);
            }
        });
        menuMeusDados.add(menuItemAlterarUsuario);

        jMenuBar1.add(menuMeusDados);

        menuCadastro.setText("Cadastro");

        menuItemCargo.setText("Cadastro de Cargos");
        menuItemCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCargoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCargo);

        jMenuBar1.add(menuCadastro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 1590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemSairMouseClicked
        String[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null, "Você deseja sair?", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (resposta == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuItemSairMouseClicked

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSenhaActionPerformed
        try {
            String senhaAntiga = JOptionPane.showInputDialog("Informe a senha atual:");

            if (LoginService.retornarUsuarioLogado().getSenha().equals(Criptografia.criptografar(senhaAntiga))) {
                String novaSenha = JOptionPane.showInputDialog("Digite a nova senha:");

                if (!novaSenha.trim().isEmpty()) {
                    String confirmacao = JOptionPane.showInputDialog("Confirme a nova senha:");
                    if (confirmacao.equals(novaSenha)) {
                        UsuarioDAO.alterarSenha(LoginService.retornarUsuarioLogado(), novaSenha);
                        JOptionPane.showMessageDialog(null, "Senha alterada! Você deverá logar novamente no sistema.");
                        LoginService.retornarUsuarioLogado().encerrarSessao();
                        dispose();
                        TelaDeLogin tela = new TelaDeLogin();
                        tela.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha o campo corretamente: valores nulos não podem ser aceitos!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR NO BANCO DE DADOS!");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente: valores nulos não podem ser aceitos!");
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemSenhaActionPerformed

    private void menuItemAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAlterarUsuarioActionPerformed
        try {
            String senha = JOptionPane.showInputDialog("Informe sua senha:");

            if (LoginService.retornarUsuarioLogado().getSenha().equals(Criptografia.criptografar(senha))) {
                String novoUsername = JOptionPane.showInputDialog("Digite o novo nome de usuário:");

                if (novoUsername.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Você deve preencher o campo requerido!");
                } else if (UsuarioDAO.usuarioExiste(novoUsername)) {
                    JOptionPane.showMessageDialog(null, "Nome de usuário já em uso!");
                } else {
                    String confirmacao = JOptionPane.showInputDialog("Confirme o novo nome de usuário:");

                    if (confirmacao.equals(novoUsername)) {
                        UsuarioDAO.alterarUsername(LoginService.retornarUsuarioLogado(), novoUsername);
                        JOptionPane.showMessageDialog(null, "Nome de usuário alterado ! Você deverá logar novamente no sistema.");
                        LoginService.retornarUsuarioLogado().encerrarSessao();
                        dispose();
                        TelaDeLogin tela = new TelaDeLogin();
                        tela.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nome incorreto!");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreto!");
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente: valores nulos não podem ser aceitos!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO RECUPERAR REGISTROS NO BANCO DE DADOS!");
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO RECUPERAR REGISTROS NO BANCO DE DADOS!");
        }
    }//GEN-LAST:event_menuItemAlterarUsuarioActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        dispose();
        TelaVendas tela = new TelaVendas();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        dispose();
        TelaClientes tela = new TelaClientes();
        tela.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        dispose();
        TelaFinanceiro tela = new TelaFinanceiro();
        tela.setVisible(true);
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        dispose();
        TelaEstoque tela = new TelaEstoque();
        tela.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnMeusDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeusDadosActionPerformed
        Usuario user = LoginService.retornarUsuarioLogado();
        String nome = user.getFuncionario().getNome();
        String perfil = user.getPerfil().getNomePerfil();

        String mensagem = "Nome: " + nome + "\nPerfil do Usuário: " + perfil;

        String cargo = user.getFuncionario().getCargo().getCargo();
        double salarioFixo = user.getFuncionario().getSalarioFixo();
        mensagem = mensagem + "\nCargo: " + cargo + "\nSalário Fixo: " + String.format("%.2f", salarioFixo);

        if (user.getPerfil().getPermissoes().isPodeVender()) {
            int comissao = user.getFuncionario().getComissao();
            Vendedor v = (Vendedor) user.getFuncionario();
            JOptionPane.showMessageDialog(null, mensagem + "\nComissão: " + comissao + "%" + "\nPrevisão Salarial: " + String.format("%.2f", v.retornarSalario()));
        } else {
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_btnMeusDadosActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        dispose();
        TelaFuncionarios tela = new TelaFuncionarios();
        tela.setVisible(true);
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Você deseja encerrar sessão?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {
            LoginService.retornarUsuarioLogado().encerrarSessao();
            dispose();
            TelaDeLogin tela = new TelaDeLogin();
            tela.setVisible(true);
            tela.setExtendedState(MAXIMIZED_BOTH);
            tela.setTitle("Sistema");
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void menuItemCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCargoActionPerformed
        String cargo = JOptionPane.showInputDialog("Informe o nome do cargo:");

        try {
            if (cargo.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o campo corretamente!");
            } else if (CargoDAO.retornarCargoPorNome(cargo) != null) {
                JOptionPane.showMessageDialog(null, "Cargo já existente!");
            } else {
                CargoDAO.adicionarCargo(new Cargo(cargo));
                JOptionPane.showMessageDialog(null, "Cargo adicionado!");
            }
        } catch (NullPointerException ex) {

        } catch (SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemCargoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnMeusDados;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBoasVindas;
    private javax.swing.JLabel lblOperacoes;
    private javax.swing.JLabel lblReaisMes;
    private javax.swing.JLabel lblVendasHoje;
    private javax.swing.JLabel lblVendasMes;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemAlterarUsuario;
    private javax.swing.JMenuItem menuItemCargo;
    private javax.swing.JMenu menuItemSair;
    private javax.swing.JMenuItem menuItemSenha;
    private javax.swing.JMenu menuMeusDados;
    private javax.swing.JPanel panelBg;
    // End of variables declaration//GEN-END:variables

    private void gerarMensagemBoasVindas() {
        lblBoasVindas.setText("Olá, " + retornarNome() + "!");
    }

    private String retornarNome() {
        String[] nome = LoginService.retornarUsuarioLogado().getFuncionario().getNome().split(" ");
        return nome[0];
    }

    private void retornarValores() {
        Usuario usuario = LoginService.retornarUsuarioLogado();

        if (usuario.getFuncionario() instanceof Vendedor vendedor) {
            try {
                String txtDia = "" + VendaDAO.retornarQuantidadeVendasPorDiaVendedor(Utilidades.retornarDia(), Utilidades.retornarMes(), Utilidades.retornarAno(), LoginService.retornarUsuarioLogado().getFuncionario());
                String txtMes = "" + VendaDAO.retornarQuantidadeVendasPorMesVendedor(Utilidades.retornarMes(), Utilidades.retornarAno(), LoginService.retornarUsuarioLogado().getFuncionario());
                String txtReaisMes = "" + VendaDAO.retornarTotalMesVendedor(Utilidades.retornarMes(), Utilidades.retornarAno(), LoginService.retornarUsuarioLogado().getFuncionario());
                
                lblVendasHoje.setText(txtDia);
                lblVendasMes.setText(txtMes);
                lblReaisMes.setText(txtReaisMes);
            } catch (SQLException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                String txtDia = "" + VendaDAO.retornarQuantidadeVendasPorDia(Utilidades.retornarDia(), Utilidades.retornarMes(), Utilidades.retornarAno());
                String txtMes = "" + VendaDAO.retornarQuantidadeVendasPorMes(Utilidades.retornarMes(), Utilidades.retornarAno());
                String txtReaisMes = "" + VendaDAO.retornarTotalVendasPorMes(Utilidades.retornarMes(), Utilidades.retornarAno());

                lblVendasHoje.setText(txtDia);
                lblVendasMes.setText(txtMes);
                lblReaisMes.setText(txtReaisMes);
            } catch (SQLException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void desabilitarFuncoes() {

        Usuario user = LoginService.retornarUsuarioLogado();

        if (!user.getPerfil().getPermissoes().isAcessoPanelVendas()) {
            btnClientes.setEnabled(false);
        }

        if (!user.getPerfil().getPermissoes().isAcessoPanelEstoque()) {
            btnEstoque.setEnabled(false);
        }

        if (!user.getPerfil().getPermissoes().isAcessoPanelFinanceiro()) {
            btnFinanceiro.setEnabled(false);
        }

        if (!user.getPerfil().getPermissoes().isAcessoPanelFuncionarios()) {
            btnFuncionarios.setEnabled(false);
        }

        if (!user.getPerfil().getPermissoes().isAcessoPanelVendas()) {
            btnVendas.setEnabled(false);
        }

        if (!user.getPerfil().getPermissoes().isPodeCadastrarCargo()) {
            menuItemCargo.setEnabled(false);
        }

    }

    private void gerarAtalhos() {
        menuMeusDados.setMnemonic(KeyEvent.VK_M);
        menuItemSenha.setMnemonic(KeyEvent.VK_N);
        menuItemAlterarUsuario.setMnemonic(KeyEvent.VK_A);
        menuItemSair.setMnemonic(KeyEvent.VK_S);
        menuCadastro.setMnemonic(KeyEvent.VK_D);
        menuItemCargo.setMnemonic(KeyEvent.VK_G);
    }

}
