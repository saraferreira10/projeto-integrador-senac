package view;

import data.CaixaDAO;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.aplicacao.Entrada;
import model.aplicacao.Saida;
import data.EntradaDAO;
import data.SaidaDAO;
import model.aplicacao.LoginService;
import model.aplicacao.Permissoes;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.aplicacao.Caixa;

public class TelaFinanceiro extends javax.swing.JFrame {

    public TelaFinanceiro() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Financeiro");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aplicarMargem();
        desabilitarFuncoes();
        try {
            atualizarEntradas(EntradaDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
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
        btnPesquisaDescricao = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        cbxSituacao = new javax.swing.JComboBox<>();
        btnPesquisaSituacao = new javax.swing.JButton();
        btnPesquisaData = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnListarTodos = new javax.swing.JButton();
        tbEntradas = new javax.swing.JToggleButton();
        tbSaida = new javax.swing.JToggleButton();
        btnNovaEntrada = new javax.swing.JButton();
        btnNovaSaida = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnReceber = new javax.swing.JButton();
        btnAcompanhamentoDeCaixa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1440));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Financeiro");

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
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Situação:");

        btnPesquisaDescricao.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaDescricao.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPesquisaDescricao.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaDescricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnPesquisaDescricao.setBorder(null);
        btnPesquisaDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDescricaoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Data:");

        txtDescricao.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtDescricaoInputMethodTextChanged(evt);
            }
        });

        cbxSituacao.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        cbxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDENTE", "RECEBIDA" }));

        btnPesquisaSituacao.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaSituacao.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPesquisaSituacao.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaSituacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnPesquisaSituacao.setBorder(null);
        btnPesquisaSituacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaSituacaoActionPerformed(evt);
            }
        });

        btnPesquisaData.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaData.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPesquisaData.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnPesquisaData.setBorder(null);
        btnPesquisaData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDataActionPerformed(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                        .addComponent(txtDescricao))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSituacao, 0, 418, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxSituacao, txtDescricao});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(5, 5, 5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPesquisaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPesquisaSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(24, Short.MAX_VALUE))))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisaDescricao, cbxSituacao, txtDescricao});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisaData, txtData});

        jScrollPane1.setViewportView(tabela);

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

        tbEntradas.setBackground(new java.awt.Color(47, 136, 255));
        tbEntradas.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        tbEntradas.setForeground(new java.awt.Color(255, 255, 255));
        tbEntradas.setSelected(true);
        tbEntradas.setText("Entradas");
        tbEntradas.setBorder(null);
        tbEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEntradasActionPerformed(evt);
            }
        });

        tbSaida.setBackground(new java.awt.Color(47, 136, 255));
        tbSaida.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        tbSaida.setForeground(new java.awt.Color(255, 255, 255));
        tbSaida.setText("Saídas");
        tbSaida.setBorder(null);
        tbSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSaidaActionPerformed(evt);
            }
        });

        btnNovaEntrada.setBackground(new java.awt.Color(217, 217, 217));
        btnNovaEntrada.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnNovaEntrada.setForeground(new java.awt.Color(0, 0, 0));
        btnNovaEntrada.setText("Nova Entrada");
        btnNovaEntrada.setBorder(null);
        btnNovaEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaEntradaActionPerformed(evt);
            }
        });

        btnNovaSaida.setBackground(new java.awt.Color(217, 217, 217));
        btnNovaSaida.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnNovaSaida.setForeground(new java.awt.Color(0, 0, 0));
        btnNovaSaida.setText("Nova Saída");
        btnNovaSaida.setBorder(null);
        btnNovaSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaSaidaActionPerformed(evt);
            }
        });

        btnPagar.setBackground(new java.awt.Color(217, 217, 217));
        btnPagar.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 0, 0));
        btnPagar.setText("Pagar");
        btnPagar.setBorder(null);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setEnabled(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnReceber.setBackground(new java.awt.Color(217, 217, 217));
        btnReceber.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnReceber.setForeground(new java.awt.Color(0, 0, 0));
        btnReceber.setText("Receber");
        btnReceber.setBorder(null);
        btnReceber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceberActionPerformed(evt);
            }
        });

        btnAcompanhamentoDeCaixa.setBackground(new java.awt.Color(47, 136, 255));
        btnAcompanhamentoDeCaixa.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnAcompanhamentoDeCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btnAcompanhamentoDeCaixa.setText("Acompanhamento de Caixa");
        btnAcompanhamentoDeCaixa.setBorder(null);
        btnAcompanhamentoDeCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcompanhamentoDeCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcompanhamentoDeCaixaActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAcompanhamentoDeCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1321, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 1227, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(222, 222, 222))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNovaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcompanhamentoDeCaixa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAcompanhamentoDeCaixa, tbSaida});

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
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        try {
            if (tbEntradas.isSelected()) {
                atualizarEntradas(EntradaDAO.listar());
            } else {
                atualizarSaidas(SaidaDAO.listar());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarTodosActionPerformed

    private void tbEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEntradasActionPerformed
        if (tbEntradas.isSelected()) {
            try {
                cbxSituacao.removeAllItems();
                cbxSituacao.addItem("PENDENTE");
                cbxSituacao.addItem("RECEBIDA");
                tbSaida.setSelected(false);
                btnPagar.setEnabled(false);
                btnReceber.setEnabled(true);
                atualizarEntradas(EntradaDAO.listar());

                desabilitarFuncoes();
            } catch (SQLException ex) {
                Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                cbxSituacao.removeAllItems();
                cbxSituacao.addItem("A PAGAR");
                cbxSituacao.addItem("PAGA");
                tbSaida.setSelected(true);
                btnPagar.setEnabled(true);
                btnReceber.setEnabled(false);
                atualizarSaidas(SaidaDAO.listar());

                desabilitarFuncoes();
            } catch (SQLException ex) {
                Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbEntradasActionPerformed

    private void tbSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSaidaActionPerformed
        if (tbSaida.isSelected()) {
            try {
                cbxSituacao.removeAllItems();
                cbxSituacao.addItem("A PAGAR");
                cbxSituacao.addItem("PAGA");
                tbEntradas.setSelected(false);
                btnPagar.setEnabled(true);
                btnReceber.setEnabled(false);
                atualizarSaidas(SaidaDAO.listar());

                desabilitarFuncoes();
            } catch (SQLException ex) {
                Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                cbxSituacao.removeAllItems();
                cbxSituacao.addItem("PENDENTE");
                cbxSituacao.addItem("RECEBIDA");
                tbEntradas.setSelected(true);
                btnPagar.setEnabled(false);
                btnReceber.setEnabled(true);
                atualizarEntradas(EntradaDAO.listar());

                desabilitarFuncoes();
            } catch (SQLException ex) {
                Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbSaidaActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        try {
            if (CaixaDAO.retornarCaixa().isAberto()) {
                int linha = tabela.getSelectedRow();

                if (linha >= 0) {

                    try {
                        Saida saida = SaidaDAO.retornarSaida(Integer.parseInt((String) tabela.getValueAt(linha, 0)));

                        if (!saida.isPaga()) {
                            if (saida.getValor() <= CaixaDAO.retornarCaixa().getSaldo()) {
                                int resp = JOptionPane.showConfirmDialog(null, "Você deseja pagar este valor?", "Confirmação", JOptionPane.YES_NO_OPTION);

                                if (resp == 0) {
                                    saida.pagar();
                                    SaidaDAO.alterar(saida);
                                    atualizarSaidas(SaidaDAO.listar());
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Este valor é superior ao valor do saldo!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Este valor já foi pago!");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma linha!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O Caixa está fechado!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceberActionPerformed
        try {
            if (CaixaDAO.retornarCaixa().isAberto()) {
                int linha = tabela.getSelectedRow();

                if (linha >= 0) {

                    Entrada entrada = EntradaDAO.retornarEntrada(Integer.parseInt((String) tabela.getValueAt(linha, 0)));

                    if (!entrada.isRecebida()) {
                        int resp = JOptionPane.showConfirmDialog(null, "Você deseja receber este valor?", "Confirmação", JOptionPane.YES_NO_OPTION);

                        if (resp == JOptionPane.YES_OPTION) {
                            entrada.receber();
                            EntradaDAO.alterar(entrada);
                            atualizarEntradas(EntradaDAO.listar());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Este valor já foi recebido!");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma linha!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O Caixa está fechado!");
            }
        } catch (NullPointerException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReceberActionPerformed

    private void btnNovaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaEntradaActionPerformed
        try {
            if (CaixaDAO.retornarCaixa().isAberto()) {
                dispose();
                TelaNovaEntrada tela = new TelaNovaEntrada();
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "O Caixa está fechado!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnNovaEntradaActionPerformed

    private void btnNovaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaSaidaActionPerformed
        try {
            if (CaixaDAO.retornarCaixa().isAberto()) {
                dispose();
                TelaNovaSaida tela = new TelaNovaSaida();
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "O Caixa está fechado!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovaSaidaActionPerformed

    private void txtDescricaoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtDescricaoInputMethodTextChanged
    }//GEN-LAST:event_txtDescricaoInputMethodTextChanged

    private void btnPesquisaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDataActionPerformed
        try {
            if (tbEntradas.isSelected()) {
                atualizarEntradas(EntradaDAO.pesquisarPorDataVencimento(LocalDate.parse(txtData.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            } else {
                atualizarSaidas(SaidaDAO.pesquisarPorDataVencimento(txtData.getText()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class.getName()).log(Level.SEVERE, null, ex);
        } catch(DateTimeParseException ex){
            JOptionPane.showMessageDialog(null, "Data inválida!");
        }

    }//GEN-LAST:event_btnPesquisaDataActionPerformed

    private void btnPesquisaSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaSituacaoActionPerformed
        boolean controle = cbxSituacao.getSelectedItem().toString().equalsIgnoreCase("PAGA") || cbxSituacao.getSelectedItem().toString().equalsIgnoreCase("RECEBIDA");

        try {
            if (tbEntradas.isSelected()) {
                atualizarEntradas(EntradaDAO.pesquisarPorSituacao(controle));
            } else {
                atualizarSaidas(SaidaDAO.pesquisarPorSituacao(controle));

            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisaSituacaoActionPerformed

    private void btnPesquisaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDescricaoActionPerformed
        try {
            if (!txtDescricao.getText().trim().isEmpty()) {
                if (tbEntradas.isSelected()) {
                    atualizarEntradas(EntradaDAO.pesquisarPorDescricao(txtDescricao.getText()));
                } else {
                    atualizarSaidas(SaidaDAO.pesquisarPorDescricao(txtDescricao.getText()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha o campo descrição!");

            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaFinanceiro.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisaDescricaoActionPerformed

    private void btnAcompanhamentoDeCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcompanhamentoDeCaixaActionPerformed
        dispose();
        TelaAcompanhamentoDeCaixa tela = new TelaAcompanhamentoDeCaixa();
        tela.setVisible(true);
    }//GEN-LAST:event_btnAcompanhamentoDeCaixaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcompanhamentoDeCaixa;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnNovaEntrada;
    private javax.swing.JButton btnNovaSaida;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPesquisaData;
    private javax.swing.JButton btnPesquisaDescricao;
    private javax.swing.JButton btnPesquisaSituacao;
    private javax.swing.JButton btnReceber;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JToggleButton tbEntradas;
    private javax.swing.JToggleButton tbSaida;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables

    private void atualizarEntradas(List<Entrada> entradas) {
        String[] colunas = {"ID", "Descrição", "Data", "Valor", "Situação"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Entrada entrada : entradas) {

            String linha = entrada.getId() + "," + entrada.getDescricao() + "," + entrada.getDataVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," + entrada.getValor() + "," + (entrada.isRecebida() ? "RECEBIDA" : "PENDENTE");

            modelo.addRow(linha.split(","));
        }

        tabela.setModel(modelo);
    }

    private void atualizarSaidas(List<Saida> saidas) {
        String[] colunas = {"ID", "Descrição", "Data", "Valor", "Situação"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Saida saida : saidas) {

            String linha = saida.getId() + "," + saida.getDescricao() + "," + saida.getDataVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," + saida.getValor() + "," + (saida.isPaga() ? "PAGA" : "A PAGAR");

            modelo.addRow(linha.split(","));
        }

        tabela.setModel(modelo);
    }

    private void aplicarMargem() {
        txtDescricao.setBorder(BorderFactory.createCompoundBorder(txtDescricao.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtData.setBorder(BorderFactory.createCompoundBorder(txtData.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    }

    private void desabilitarFuncoes() {
        Permissoes permissoes = LoginService.retornarUsuarioLogado().getPerfil().getPermissoes();

        if (!permissoes.isPodeCadastrarEntrada()) {
            btnNovaEntrada.setEnabled(false);
        }

        if (!permissoes.isPodeCadastrarSaida()) {
            btnNovaSaida.setEnabled(false);
        }

        if (!permissoes.isPodeManipularCaixa()) {
            btnReceber.setEnabled(false);
            btnPagar.setEnabled(false);
        }

    }

}
