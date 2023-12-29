package view;

import java.time.LocalDateTime;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.aplicacao.Pagamento;
import model.aplicacao.PagamentoCartaoAPrazo;
import model.aplicacao.PagamentoCartaoAVista;
import model.aplicacao.PagamentoDinheiro;
import model.aplicacao.Venda;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPagamento extends javax.swing.JFrame {

    private Venda venda = null;

    public TelaPagamento(Venda venda) {
        initComponents();
        setTitle("Pagamento");
        setLocation(290, 70);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.venda = venda;
        lblValor.setText("Valor: R$ " + String.format("%.2f", venda.getValorTotal()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbDinheiro = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        spnValorRecebido = new javax.swing.JSpinner();
        cbxTroco = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        rbCartao = new javax.swing.JRadioButton();
        rbVistaCartao = new javax.swing.JRadioButton();
        rbPrazoCartao = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        spnParcelasCartao = new javax.swing.JSpinner();
        btnFinalizar = new javax.swing.JButton();
        btnCartao = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Formas de Pagamento");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        rbDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        rbDinheiro.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        rbDinheiro.setForeground(new java.awt.Color(0, 0, 0));
        rbDinheiro.setSelected(true);
        rbDinheiro.setText("Dinheiro");
        rbDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDinheiroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor recebido:");

        spnValorRecebido.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spnValorRecebido.setEnabled(false);

        cbxTroco.setBackground(new java.awt.Color(255, 255, 255));
        cbxTroco.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        cbxTroco.setForeground(new java.awt.Color(0, 0, 0));
        cbxTroco.setText("Troco");
        cbxTroco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTrocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTroco)
                    .addComponent(rbDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(spnValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(rbDinheiro)
                .addGap(18, 18, 18)
                .addComponent(cbxTroco)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        rbCartao.setBackground(new java.awt.Color(255, 255, 255));
        rbCartao.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        rbCartao.setForeground(new java.awt.Color(0, 0, 0));
        rbCartao.setText("Cartão");
        rbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCartaoActionPerformed(evt);
            }
        });

        rbVistaCartao.setBackground(new java.awt.Color(255, 255, 255));
        rbVistaCartao.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        rbVistaCartao.setForeground(new java.awt.Color(0, 0, 0));
        rbVistaCartao.setText("À vista");
        rbVistaCartao.setEnabled(false);
        rbVistaCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVistaCartaoActionPerformed(evt);
            }
        });

        rbPrazoCartao.setBackground(new java.awt.Color(255, 255, 255));
        rbPrazoCartao.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        rbPrazoCartao.setForeground(new java.awt.Color(0, 0, 0));
        rbPrazoCartao.setText("À prazo");
        rbPrazoCartao.setEnabled(false);
        rbPrazoCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrazoCartaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Parcelas:");

        spnParcelasCartao.setModel(new javax.swing.SpinnerNumberModel(3, 3, 12, 1));
        spnParcelasCartao.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbVistaCartao)
                        .addGap(18, 18, 18)
                        .addComponent(rbPrazoCartao))
                    .addComponent(rbCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnParcelasCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(rbCartao)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbVistaCartao)
                    .addComponent(rbPrazoCartao))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnParcelasCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        btnFinalizar.setBackground(new java.awt.Color(70, 190, 40));
        btnFinalizar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setBorder(null);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCartao.setBackground(new java.awt.Color(255, 30, 30));
        btnCartao.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnCartao.setForeground(new java.awt.Color(255, 255, 255));
        btnCartao.setText("Cancelar");
        btnCartao.setBorder(null);
        btnCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblValor.setForeground(new java.awt.Color(0, 0, 0));
        lblValor.setText("Valor: R$ 0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jLabel1)
                            .addGap(74, 74, 74))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblValor))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblValor)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Você deseja cancelar esta venda?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {
            dispose();
            TelaVendas tela = new TelaVendas();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnCartaoActionPerformed

    private void rbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCartaoActionPerformed
        if (rbCartao.isSelected()) {
            rbDinheiro.setSelected(false);
            spnValorRecebido.setEnabled(false);
            cbxTroco.setEnabled(false);

            rbVistaCartao.setSelected(true);
            rbPrazoCartao.setEnabled(true);
            rbVistaCartao.setEnabled(true);
        } else {
            rbCartao.setSelected(false);
            spnParcelasCartao.setEnabled(false);
            rbPrazoCartao.setEnabled(false);
            rbVistaCartao.setEnabled(false);

            cbxTroco.setEnabled(true);
            rbDinheiro.setSelected(true);
        }
    }//GEN-LAST:event_rbCartaoActionPerformed

    private void rbDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDinheiroActionPerformed
        if (rbDinheiro.isSelected()) {
            rbCartao.setSelected(false);
            spnParcelasCartao.setEnabled(false);
            rbPrazoCartao.setEnabled(false);
            rbVistaCartao.setEnabled(false);

            cbxTroco.setEnabled(true);
        } else {
            rbCartao.setSelected(true);
            spnValorRecebido.setEnabled(false);
            cbxTroco.setEnabled(false);

            rbVistaCartao.setSelected(true);
            rbPrazoCartao.setEnabled(true);
            rbVistaCartao.setEnabled(true);
        }
    }//GEN-LAST:event_rbDinheiroActionPerformed

    private void rbVistaCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVistaCartaoActionPerformed
        if (rbVistaCartao.isSelected()) {
            rbPrazoCartao.setSelected(false);
            spnParcelasCartao.setEnabled(false);
        } else {
            rbVistaCartao.setSelected(false);
            spnParcelasCartao.setEnabled(true);
        }
    }//GEN-LAST:event_rbVistaCartaoActionPerformed

    private void rbPrazoCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrazoCartaoActionPerformed
        if (rbPrazoCartao.isSelected()) {
            rbVistaCartao.setSelected(false);
            spnParcelasCartao.setEnabled(true);
        } else {
            rbPrazoCartao.setSelected(false);
            spnParcelasCartao.setEnabled(false);

        }
    }//GEN-LAST:event_rbPrazoCartaoActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Você deseja finalizar esta venda?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {

            Pagamento pagamento;

            if (rbDinheiro.isSelected() && !cbxTroco.isSelected()) {
                pagamento = new PagamentoDinheiro(venda, venda.calcularTotal(), venda.calcularTotal(), LocalDateTime.now());
            } else if (rbDinheiro.isSelected() && cbxTroco.isSelected()) {
                if ((double) spnValorRecebido.getValue() < venda.calcularTotal()) {
                    JOptionPane.showConfirmDialog(null, "O valor recebido é menor que o valor da venda!");
                    return;
                } else {
                    pagamento = new PagamentoDinheiro(venda, venda.calcularTotal(), (double) spnValorRecebido.getValue(), LocalDateTime.now());
                }
            } else if (rbCartao.isSelected() && rbVistaCartao.isSelected()) {
                pagamento = new PagamentoCartaoAVista(venda, venda.calcularTotal());
            } else {
                pagamento = new PagamentoCartaoAPrazo(venda, venda.calcularTotal(), (int) spnParcelasCartao.getValue());
            }

            if (pagamento != null) {
                try {
                    venda.confirmarVenda(pagamento, venda);
                    JOptionPane.showMessageDialog(null, pagamento.toString());
                    dispose();
                    TelaVendas tela = new TelaVendas();
                    tela.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaPagamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void cbxTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTrocoActionPerformed
        if (cbxTroco.isSelected()) {
            spnValorRecebido.setEnabled(true);
        } else {
            spnValorRecebido.setEnabled(false);
        }
    }//GEN-LAST:event_cbxTrocoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartao;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JCheckBox cbxTroco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rbCartao;
    private javax.swing.JRadioButton rbDinheiro;
    private javax.swing.JRadioButton rbPrazoCartao;
    private javax.swing.JRadioButton rbVistaCartao;
    private javax.swing.JSpinner spnParcelasCartao;
    private javax.swing.JSpinner spnValorRecebido;
    // End of variables declaration//GEN-END:variables
}
