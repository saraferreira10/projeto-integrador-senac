package view;

import data.UsuarioDAO;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.aplicacao.LoginService;

public class TelaDeLogin extends javax.swing.JFrame {

    char c;

    public TelaDeLogin() {
        initComponents();
        setTitle("Login");
        setExtendedState(MAXIMIZED_BOTH);
        aplicarMargem();
        gerarAtalhos();
        c = txtfSenha.getEchoChar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBemVindo = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        cbxVisualizarSenha = new javax.swing.JCheckBox();
        txtfUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtfSenha = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 780));

        lblBemVindo.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(0, 0, 0));
        lblBemVindo.setText("Bem vindo!");

        btnEntrar.setBackground(new java.awt.Color(47, 136, 255));
        btnEntrar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        cbxVisualizarSenha.setBackground(new java.awt.Color(255, 255, 255));
        cbxVisualizarSenha.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        cbxVisualizarSenha.setForeground(new java.awt.Color(0, 0, 0));
        cbxVisualizarSenha.setText("Visualizar senha");
        cbxVisualizarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxVisualizarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVisualizarSenhaActionPerformed(evt);
            }
        });

        txtfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtfUsuario.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        txtfUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 136, 255), 2));

        lblUsuario.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Usuário:");

        lblSenha.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("Senha:");

        txtfSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtfSenha.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        txtfSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 136, 255), 2));
        txtfSenha.setPreferredSize(new java.awt.Dimension(80, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxVisualizarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblBemVindo))
                    .addComponent(lblUsuario)
                    .addComponent(lblSenha)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtfSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                        .addComponent(txtfUsuario, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(cbxVisualizarSenha)
                .addGap(23, 23, 23)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N

        menuSair.setForeground(new java.awt.Color(0, 0, 0));
        menuSair.setText("Sair");
        menuSair.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                menuSairAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (validarCampos()) {
            try {

                if (LoginService.validarLogin(txtfUsuario.getText(), txtfSenha.getText())) {
                    dispose();
                    TelaInicial tela = new TelaInicial();
                    tela.setTitle("Tela Inicial");
                    tela.setVisible(true);
                } else if (UsuarioDAO.validarUsuario(txtfUsuario.getText(), txtfSenha.getText()) != null) {
                    JOptionPane.showMessageDialog(null, "Usuário inativo!");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos: preencha os campos corretamente!");
                }
            } catch (Exception ex) {
                Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void cbxVisualizarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVisualizarSenhaActionPerformed
        if (cbxVisualizarSenha.isSelected()) {
            txtfSenha.setEchoChar((char) 0);
        } else {
            txtfSenha.setEchoChar(c);
        }
    }//GEN-LAST:event_cbxVisualizarSenhaActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed

    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSairAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_menuSairAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSairAncestorAdded

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        String[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null, "Você deseja sair?", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (resposta == 0) {
            System.exit(0);
        }    }//GEN-LAST:event_menuSairMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JCheckBox cbxVisualizarSenha;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuSair;
    private javax.swing.JPasswordField txtfSenha;
    private javax.swing.JTextField txtfUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {

        String regex = "[ ]{1,}";

        if (txtfUsuario.getText().matches(regex) || txtfSenha.getText().matches(regex) || txtfUsuario.getText().isEmpty() || txtfSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return false;
        } else {
            return true;
        }
    }

    private void aplicarMargem() {
        txtfUsuario.setBorder(BorderFactory.createCompoundBorder(txtfUsuario.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtfSenha.setBorder(BorderFactory.createCompoundBorder(txtfSenha.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    }

    private void gerarAtalhos() {
        btnEntrar.setMnemonic(KeyEvent.VK_N);
        menuSair.setMnemonic(KeyEvent.VK_S);
        cbxVisualizarSenha.setMnemonic(KeyEvent.VK_V);
    }

}
