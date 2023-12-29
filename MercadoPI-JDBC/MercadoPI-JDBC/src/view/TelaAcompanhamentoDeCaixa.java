package view;

import data.CaixaDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.aplicacao.LoginService;
import model.aplicacao.Permissoes;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.aplicacao.Caixa;

public class TelaAcompanhamentoDeCaixa extends javax.swing.JFrame {
    
    public TelaAcompanhamentoDeCaixa() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Acompanhamento de Caixa");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        try {
            atualizarTabela(CaixaDAO.listar());
            atualizarDados();
            
            if (CaixaDAO.retornarCaixa().isAberto()) {
                btnAbrirCaixa.setEnabled(false);
            } else {
                btnFecharCaixa.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaAcompanhamentoDeCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
        desabilitarFuncoes();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblSaldoAtual = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblSaldoAnterior = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblEntradasDeHoje = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAbrirCaixa = new javax.swing.JButton();
        btnFecharCaixa = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblSaidasDeHoje = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1440));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Acompanhamento de Caixa");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-voltar.png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabela);

        jPanel3.setBackground(new java.awt.Color(47, 136, 255));
        jPanel3.setFont(new java.awt.Font("Inter", 0, 11)); // NOI18N

        lblSaldoAtual.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        lblSaldoAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoAtual.setText("R$ 0.0");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Saldo Atual");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblSaldoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(27, 27, 27))
        );

        jPanel4.setBackground(new java.awt.Color(47, 136, 255));
        jPanel4.setFont(new java.awt.Font("Inter", 0, 11)); // NOI18N

        lblSaldoAnterior.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        lblSaldoAnterior.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoAnterior.setText("R$ 0.0");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Saldo Anterior");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblSaldoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblSaldoAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(27, 27, 27))
        );

        jPanel5.setBackground(new java.awt.Color(47, 136, 255));
        jPanel5.setFont(new java.awt.Font("Inter", 0, 11)); // NOI18N

        lblEntradasDeHoje.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        lblEntradasDeHoje.setForeground(new java.awt.Color(255, 255, 255));
        lblEntradasDeHoje.setText("R$ 0.0");

        jLabel7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Entradas de Hoje");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblEntradasDeHoje, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblEntradasDeHoje, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(27, 27, 27))
        );

        btnAbrirCaixa.setBackground(new java.awt.Color(70, 190, 40));
        btnAbrirCaixa.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnAbrirCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirCaixa.setText("ABRIR CAIXA");
        btnAbrirCaixa.setBorder(null);
        btnAbrirCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCaixaActionPerformed(evt);
            }
        });

        btnFecharCaixa.setBackground(new java.awt.Color(255, 30, 30));
        btnFecharCaixa.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnFecharCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btnFecharCaixa.setText("FECHAR CAIXA");
        btnFecharCaixa.setBorder(null);
        btnFecharCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixaActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(47, 136, 255));
        jPanel6.setFont(new java.awt.Font("Inter", 0, 11)); // NOI18N

        lblSaidasDeHoje.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        lblSaidasDeHoje.setForeground(new java.awt.Color(255, 255, 255));
        lblSaidasDeHoje.setText("R$ 0.0");

        jLabel8.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Saídas de Hoje");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblSaidasDeHoje, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblSaidasDeHoje, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1321, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(222, 222, 222))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAbrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel3, jPanel4, jPanel5});

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
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAbrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        TelaFinanceiro tela = new TelaFinanceiro();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCaixaActionPerformed
        String[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null, "Você deseja abrir o caixa?", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if (resposta == 0) {
            try {
                Caixa caixa = new Caixa(CaixaDAO.retornarCaixa().getSaldo());
                CaixaDAO.cadastrar(caixa);
                atualizarTabela(CaixaDAO.listar());
            } catch (SQLException ex) {
                Logger.getLogger(TelaAcompanhamentoDeCaixa.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            btnAbrirCaixa.setEnabled(false);
            btnFecharCaixa.setEnabled(true);
            try {
                atualizarDados();
            } catch (SQLException ex) {
                Logger.getLogger(TelaAcompanhamentoDeCaixa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAbrirCaixaActionPerformed

    private void btnFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixaActionPerformed
        String[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null, "Você deseja fechar o caixa?", "Mensagem de Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if (resposta == 0) {
            try {
                btnAbrirCaixa.setEnabled(true);
                btnFecharCaixa.setEnabled(false);
                Caixa caixa = CaixaDAO.retornarCaixa();
                caixa.setAberto(false);
                CaixaDAO.alterar(caixa);
                atualizarDados();
                atualizarTabela(CaixaDAO.listar());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnFecharCaixaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirCaixa;
    private javax.swing.JButton btnFecharCaixa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntradasDeHoje;
    private javax.swing.JLabel lblSaidasDeHoje;
    private javax.swing.JLabel lblSaldoAnterior;
    private javax.swing.JLabel lblSaldoAtual;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void atualizarDados() throws SQLException {
        if (CaixaDAO.retornarCaixa().isAberto()) {
            lblSaldoAnterior.setText("R$ " + CaixaDAO.retornarCaixa().getSaldoAnterior());
            lblSaldoAtual.setText("R$ " + CaixaDAO.retornarCaixa().getSaldo());
            lblEntradasDeHoje.setText("R$ " + (CaixaDAO.retornarCaixa().getEntradas()));
            lblSaidasDeHoje.setText("R$ " + (CaixaDAO.retornarCaixa().getSaidas()));
        } else {
            lblSaldoAnterior.setText("R$ " + CaixaDAO.retornarCaixa().getSaldo());
            lblSaldoAtual.setText("R$ " + CaixaDAO.retornarCaixa().getSaldo());
            lblEntradasDeHoje.setText("R$ 0.0");
            lblSaidasDeHoje.setText("R$ 0.0");
        }
    }
    
    private void desabilitarFuncoes() {
        Permissoes permissoes = LoginService.retornarUsuarioLogado().getPerfil().getPermissoes();
        
        if (!permissoes.isPodeManipularCaixa()) {
            btnAbrirCaixa.setEnabled(false);
            btnFecharCaixa.setEnabled(false);
        }
        
    }
    
    private void atualizarTabela(List<Caixa> lista) {
        String[] colunas = {"ID", "Aberto","Saldo Anterior", "Entradas", "Saidas", "Saldo Atual"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Caixa caixa : lista) {
            String linha = caixa.getId() + "," + (caixa.isAberto() ? "SIM" : "NÃO") + "," + caixa.getSaldoAnterior() + "," + caixa.getEntradas() + "," + caixa.getSaidas() + "," + caixa.getSaldo();

            modelo.addRow(linha.split(","));
        }
        
        tabela.setModel(modelo);
    }
}
