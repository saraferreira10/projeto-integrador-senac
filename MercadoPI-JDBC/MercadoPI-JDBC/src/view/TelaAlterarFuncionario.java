package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.aplicacao.Cargo;
import model.aplicacao.Funcionario;
import model.aplicacao.LoginService;
import model.aplicacao.Vendedor;
import data.CargoDAO;
import data.FuncionarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaAlterarFuncionario extends javax.swing.JFrame {

    private Funcionario funcionario;

    public TelaAlterarFuncionario(Funcionario funcionario) {
        initComponents();
        this.funcionario = funcionario;
        setTitle("Alterar Funcionários");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        try {
            preencherCargos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAlterarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        preencherCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spnComissao = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        spnSalario = new javax.swing.JSpinner();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlCargo = new javax.swing.JPanel();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        cbxNovoCargo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Alterar Funcionário");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Salário:");

        jLabel6.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Comissão:");

        spnComissao.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnComissao.setEnabled(false);
        if(LoginService.retornarUsuarioLogado().getFuncionario() instanceof Vendedor v){
            spnComissao.setValue(v.getComissao());
            spnComissao.setEnabled(true);
        }

        jLabel7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cargo:");

        spnSalario.setModel(new javax.swing.SpinnerNumberModel(1.0d, null, null, 1.0d));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spnSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(cbxCargo, 0, 203, Short.MAX_VALUE))
                            .addComponent(txtNome)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(spnSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxCargo, spnComissao, spnSalario, txtNome});

        btnSalvar.setBackground(new java.awt.Color(70, 190, 40));
        btnSalvar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 30, 30));
        btnCancelar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlCargo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCargo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Cargo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Inter", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlCargo.setEnabled(false);

        lblCargo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(0, 0, 0));
        lblCargo.setText("Cargo:");

        txtCargo.setEnabled(false);

        javax.swing.GroupLayout pnlCargoLayout = new javax.swing.GroupLayout(pnlCargo);
        pnlCargo.setLayout(pnlCargoLayout);
        pnlCargoLayout.setHorizontalGroup(
            pnlCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCargoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblCargo)
                .addGap(32, 32, 32)
                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        pnlCargoLayout.setVerticalGroup(
            pnlCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCargoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        cbxNovoCargo.setBackground(new java.awt.Color(255, 255, 255));
        cbxNovoCargo.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        cbxNovoCargo.setForeground(new java.awt.Color(0, 0, 0));
        cbxNovoCargo.setText("Cadastrar novo cargo");
        cbxNovoCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxNovoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNovoCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNovoCargo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(pnlCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel1)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(pnlCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(cbxNovoCargo)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxNovoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNovoCargoActionPerformed
        if (cbxNovoCargo.isSelected()) {
            cbxCargo.setEnabled(false);
            txtCargo.setEnabled(true);
            pnlCargo.setEnabled(true);
        } else {
            cbxCargo.setEnabled(true);
            txtCargo.setEnabled(false);
            pnlCargo.setEnabled(false);
        }
    }//GEN-LAST:event_cbxNovoCargoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cbxNovoCargo.isSelected() && txtCargo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else if (txtNome.getText().trim().isEmpty() || spnSalario.getValue().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {

            int resp = JOptionPane.showConfirmDialog(null, "Você deseja alterar estes dados?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resp == 0) {
                try {
                    funcionario.setNome(txtNome.getText());
                    funcionario.setSalarioFixo(Double.parseDouble(spnSalario.getValue().toString()));

                    if (funcionario instanceof Vendedor v) {
                        v.setComissao((int) spnComissao.getValue());
                    }

                    if (cbxNovoCargo.isSelected() && CargoDAO.retornarCargoPorNome(txtCargo.getText()) != null) {
                        JOptionPane.showMessageDialog(null, "Já existe um cargo cadastrado com este nome!");

                    } else if (cbxNovoCargo.isSelected()) {
                        Cargo cargo = new Cargo(txtCargo.getText());
                        CargoDAO.adicionarCargo(cargo);
                        funcionario.setCargo(CargoDAO.retornarCargoPorNome(txtCargo.getText()));

                        FuncionarioDAO.alterar(funcionario);

                        dispose();
                        TelaFuncionarios tela = new TelaFuncionarios();
                        tela.setVisible(true);
                    } else {
                        funcionario.setCargo(CargoDAO.retornarCargoPorNome(cbxCargo.getSelectedItem().toString()));

                        FuncionarioDAO.alterar(funcionario);

                        dispose();
                        TelaFuncionarios tela = new TelaFuncionarios();
                        tela.setVisible(true);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(TelaAlterarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Você deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {
            dispose();
            TelaFuncionarios tela = new TelaFuncionarios();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JCheckBox cbxNovoCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JPanel pnlCargo;
    private javax.swing.JSpinner spnComissao;
    private javax.swing.JSpinner spnSalario;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void preencherCampos() {
        txtNome.setText(funcionario.getNome());
        spnSalario.setValue(funcionario.getSalarioFixo());
        cbxCargo.setSelectedItem(funcionario.getCargo().getCargo());

        if (funcionario instanceof Vendedor v) {
            spnComissao.setValue(v.getComissao());
            spnComissao.setEnabled(true);
        } else {
            spnComissao.setEnabled(false);
        }

    }

    private void preencherCargos() throws SQLException {
        for (Cargo cargo : CargoDAO.listar()) {
            cbxCargo.addItem(cargo.getCargo());
        }
    }
}
