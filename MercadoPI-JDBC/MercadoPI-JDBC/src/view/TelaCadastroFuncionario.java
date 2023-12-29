package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.aplicacao.Cargo;
import model.aplicacao.Funcionario;
import model.aplicacao.Perfil;
import model.aplicacao.Usuario;
import model.aplicacao.Vendedor;
import data.CargoDAO;
import data.FuncionarioDAO;
import data.PerfilDAO;
import data.UsuarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCadastroFuncionario extends javax.swing.JFrame {

    public TelaCadastroFuncionario() {
        initComponents();
        setResizable(false);

        try {
            for (Perfil perfil : PerfilDAO.listar()) {
                cbxPerfil.addItem(perfil.getNomePerfil());
            }

            for (Cargo cargo : data.CargoDAO.listar()) {
                cbxCargo.addItem(cargo.getCargo());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

        setTitle("Cadastrar Funcionários");
        setResizable(false);
        setLocation(380, 100);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spnSalario = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        spnComissao = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        cbxPerfil = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlNovoCargo = new javax.swing.JPanel();
        lblFornecedorCadastro = new javax.swing.JLabel();
        txtCargoCadastro = new javax.swing.JTextField();
        chbCargo = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Novo Funcionário");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Salário Fixo:");

        jLabel6.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Usuário:");

        jLabel7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Senha:");

        jLabel8.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Comissão:");

        jLabel9.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cargo:");

        cbxCargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCargoItemStateChanged(evt);
            }
        });
        cbxCargo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbxCargoPropertyChange(evt);
            }
        });

        spnComissao.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jLabel10.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Perfil:");

        cbxPerfil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxPerfilItemStateChanged(evt);
            }
        });
        cbxPerfil.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbxPerfilPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(spnSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(txtSenha)
                            .addComponent(cbxPerfil, 0, 268, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCargo, 0, 179, Short.MAX_VALUE)
                            .addComponent(spnComissao)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(txtNome)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(spnSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(spnComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxCargo, cbxPerfil, spnComissao, spnSalario, txtNome, txtSenha, txtUsuario});

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

        btnCancelar.setBackground(new java.awt.Color(255, 30, 30));
        btnCancelar.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlNovoCargo.setBackground(new java.awt.Color(255, 255, 255));
        pnlNovoCargo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Cargo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Inter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlNovoCargo.setEnabled(false);

        lblFornecedorCadastro.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblFornecedorCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblFornecedorCadastro.setText("Cargo:");

        txtCargoCadastro.setEnabled(false);

        javax.swing.GroupLayout pnlNovoCargoLayout = new javax.swing.GroupLayout(pnlNovoCargo);
        pnlNovoCargo.setLayout(pnlNovoCargoLayout);
        pnlNovoCargoLayout.setHorizontalGroup(
            pnlNovoCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFornecedorCadastro)
                .addGap(32, 32, 32)
                .addComponent(txtCargoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pnlNovoCargoLayout.setVerticalGroup(
            pnlNovoCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNovoCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedorCadastro)
                    .addComponent(txtCargoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        chbCargo.setBackground(new java.awt.Color(255, 255, 255));
        chbCargo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        chbCargo.setForeground(new java.awt.Color(0, 0, 0));
        chbCargo.setText("Cadastrar novo Cargo");
        chbCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbCargo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNovoCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNovoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chbCargo)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txtNome.getText().trim().isEmpty() && !txtUsuario.getText().trim().isEmpty() && !txtSenha.getText().trim().isEmpty()) {
            
            try {
                if (chbCargo.isSelected() && txtCargoCadastro.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha os campos de cadastro de cargo!");
                } else if (CargoDAO.retornarCargoPorNome(txtCargoCadastro.getText()) != null) {
                    JOptionPane.showMessageDialog(null, "Já existe um cargo cadastrado com este nome!");
                } else if (UsuarioDAO.usuarioExiste(txtUsuario.getText())) {
                    JOptionPane.showMessageDialog(null, "Informe outro nome de usuário!");
                } else {

                    String[] options = {"Sim", "Não"};
                    int resposta = JOptionPane.showOptionDialog(null, "Você deseja cadastrar este funcionário?", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    if (resposta == 0) {
                        Funcionario funcionario;

                        funcionario = spnComissao.isEnabled() ? new Vendedor(Integer.parseInt(spnComissao.getValue().toString()), txtNome.getText(), Integer.parseInt(spnSalario.getValue().toString()), CargoDAO.retornarCargoPorNome(cbxCargo.getSelectedItem().toString()))
                                : new Funcionario(txtNome.getText(), Integer.parseInt(spnSalario.getValue().toString()), CargoDAO.retornarCargoPorNome(cbxCargo.getSelectedItem().toString()));

                        if (chbCargo.isSelected()) {
                            Cargo cargo = new Cargo(txtCargoCadastro.getText());
                            CargoDAO.adicionarCargo(cargo);
                            funcionario.setCargo(CargoDAO.retornarCargoPorNome(txtCargoCadastro.getText()));
                        }

                        FuncionarioDAO.adicionarFuncionario(funcionario);

                        Usuario user = new Usuario(txtUsuario.getText(), txtSenha.getText(), PerfilDAO.retornarPerfilPorNome(cbxPerfil.getSelectedItem().toString()), FuncionarioDAO.retornarFuncionarioPorNome(funcionario.getNome()));
                        UsuarioDAO.adicionarUsuario(user);

                        dispose();
                        TelaFuncionarios tela = new TelaFuncionarios();
                        tela.setVisible(true);
                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        String[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null, "Você deseja cancelar?", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (resposta == 0) {
            dispose();
            TelaFuncionarios tela = new TelaFuncionarios();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void chbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbCargoActionPerformed
        if (chbCargo.isSelected()) {
            pnlNovoCargo.setEnabled(true);
            cbxCargo.setEnabled(false);
            txtCargoCadastro.setEnabled(true);
        } else {
            pnlNovoCargo.setEnabled(false);
            cbxCargo.setEnabled(true);
            txtCargoCadastro.setEnabled(false);
        }

    }//GEN-LAST:event_chbCargoActionPerformed

    private void cbxCargoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbxCargoPropertyChange

    }//GEN-LAST:event_cbxCargoPropertyChange

    private void cbxCargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCargoItemStateChanged
    }//GEN-LAST:event_cbxCargoItemStateChanged

    private void cbxPerfilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxPerfilItemStateChanged
        atualizarCampoComissao();
    }//GEN-LAST:event_cbxPerfilItemStateChanged

    private void cbxPerfilPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbxPerfilPropertyChange
    }//GEN-LAST:event_cbxPerfilPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JCheckBox chbCargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFornecedorCadastro;
    private javax.swing.JPanel pnlNovoCargo;
    private javax.swing.JSpinner spnComissao;
    private javax.swing.JSpinner spnSalario;
    private javax.swing.JTextField txtCargoCadastro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void atualizarCampoComissao() {
        String perfil = (String) cbxPerfil.getSelectedItem();

        if (perfil.equalsIgnoreCase("VENDEDOR")) {
            spnComissao.setEnabled(true);
        } else {
            spnComissao.setEnabled(false);
            spnComissao.setValue(0);
        }

    }

    private void adicionarFuncionario() {
        try {
            Funcionario funcionario = null;
            Cargo cargo = null;

            if (chbCargo.isSelected()) {
                cargo = new Cargo(txtCargoCadastro.getText());
                CargoDAO.adicionarCargo(cargo);
            } else {
                cargo = CargoDAO.retornarCargoPorNome(cbxCargo.getSelectedItem().toString());
            }

            switch (cbxPerfil.getSelectedItem().toString()) {
                case "VENDAS":
                    funcionario = new Vendedor((int) spnComissao.getValue(), txtNome.getText(), Double.parseDouble(spnSalario.getValue().toString()), cargo);
                    break;
                default:
                    funcionario = new Funcionario(txtNome.getText(), Double.parseDouble(spnSalario.getValue().toString()), cargo);
                    break;
            }

            Usuario usuario = new Usuario(txtUsuario.getText(), txtSenha.getText(), PerfilDAO.retornarPerfilPorNome(cbxPerfil.getSelectedItem().toString()), funcionario);
            UsuarioDAO.adicionarUsuario(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
