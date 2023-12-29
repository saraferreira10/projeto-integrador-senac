package view;

import data.CaixaDAO;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.aplicacao.LoginService;
import model.aplicacao.Venda;
import data.VendaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaVendas extends javax.swing.JFrame {

    public TelaVendas() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Tela de Vendas");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        aplicarMargem();
        try {
            atualizarTabela(VendaDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtCliente = new javax.swing.JTextField();
        btnPesquisaID = new javax.swing.JButton();
        btnPesquisaCliente = new javax.swing.JButton();
        btnPesquisaData = new javax.swing.JButton();
        btnPesquisaVendedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        btnNovaVenda = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btnListarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1440));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Vendas");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-voltar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cliente:");

        jLabel4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data:");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vendedor:");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        btnPesquisaID.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaID.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPesquisaID.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnPesquisaID.setBorder(null);
        btnPesquisaID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaIDActionPerformed(evt);
            }
        });

        btnPesquisaCliente.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaCliente.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPesquisaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnPesquisaCliente.setBorder(null);
        btnPesquisaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
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

        btnPesquisaVendedor.setBackground(new java.awt.Color(47, 136, 255));
        btnPesquisaVendedor.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnPesquisaVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisaVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-pesquisar.png"))); // NOI18N
        btnPesquisaVendedor.setBorder(null);
        btnPesquisaVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtId, txtVendedor});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnPesquisaData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCliente)
                                .addComponent(jLabel3))
                            .addComponent(btnPesquisaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPesquisaID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisaCliente, txtCliente});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisaData, txtData});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisaVendedor, txtVendedor});

        jScrollPane1.setViewportView(tblVendas);

        btnNovaVenda.setBackground(new java.awt.Color(70, 190, 40));
        btnNovaVenda.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnNovaVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-comprar.png"))); // NOI18N
        btnNovaVenda.setText("Nova Venda");
        btnNovaVenda.setBorder(null);
        btnNovaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaVenda.setEnabled(false);
        btnNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaVendaActionPerformed(evt);
            }
        });

        btnDetalhes.setBackground(new java.awt.Color(245, 232, 60));
        btnDetalhes.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnDetalhes.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-detalhes.png"))); // NOI18N
        btnDetalhes.setText("Detalhes da Venda");
        btnDetalhes.setBorder(null);
        btnDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
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
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(737, Short.MAX_VALUE))
        );

        if(LoginService.retornarUsuarioLogado().getPerfil().getPermissoes().isPodeVender()){
            btnNovaVenda.setEnabled(true);
        }

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPesquisaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaIDActionPerformed
        if (!txtId.getText().trim().isEmpty()) {
            try {
                List<Venda> lista = new ArrayList<>();
                lista.add(VendaDAO.retornarVenda(Integer.parseInt(txtId.getText())));
                atualizarTabela(lista);
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa (ID)!");
        }
    }//GEN-LAST:event_btnPesquisaIDActionPerformed

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        if (!txtCliente.getText().trim().isEmpty()) {
            try {
                atualizarTabela(VendaDAO.retornarVendasPorCliente(txtCliente.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa (CLIENTE)!");
        }
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnPesquisaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDataActionPerformed
        if (!txtData.getText().trim().isEmpty()) {
            try {
                String[] data = txtData.getText().split("/");
                atualizarTabela(VendaDAO.retornarVendasPorDia(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])));
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa (DATA)!");
        }
    }//GEN-LAST:event_btnPesquisaDataActionPerformed

    private void btnPesquisaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaVendedorActionPerformed
        if (!txtVendedor.getText().trim().isEmpty()) {
            try {
                atualizarTabela(VendaDAO.retornarVendasPorVendedor(txtVendedor.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo de pesquisa (VENDEDOR)!");
        }
    }//GEN-LAST:event_btnPesquisaVendedorActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        try {
            atualizarTabela(VendaDAO.listar());
        } catch (SQLException ex) {
            Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarTodosActionPerformed

    private void btnNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaVendaActionPerformed
        try {
            if (CaixaDAO.retornarCaixa().isAberto()) {
                dispose();
                TelaNovaVenda tela = new TelaNovaVenda();
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "O Caixa está fechado!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovaVendaActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        int linha = tblVendas.getSelectedRow();

        if (linha >= 0) {

            try {
                Venda venda = (Venda) VendaDAO.retornarVenda(Integer.parseInt((String) tblVendas.getValueAt(linha, 0)));
                
                TelaDetalhesVenda tela = new TelaDetalhesVenda(venda);
                tela.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnNovaVenda;
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JButton btnPesquisaData;
    private javax.swing.JButton btnPesquisaID;
    private javax.swing.JButton btnPesquisaVendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela(List<Venda> lista) {
        String[] colunas = {"ID", "Vendedor", "Cliente", "Data", "Valor Total", "Número de Itens"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (Venda venda : lista) {
            String linha = venda.getId()+ "-" + venda.getVendedor().getNome() + "-" + venda.getCliente().getNomeCliente()
                    + "-" + venda.getDataVenda().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "-"
                    + venda.getValorTotal() + "-" + venda.retornarQuantidadeItens();

            modelo.addRow(linha.split("-"));
        }

        tblVendas.setModel(modelo);
    }

    private void aplicarMargem() {
        txtId.setBorder(BorderFactory.createCompoundBorder(txtId.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtCliente.setBorder(BorderFactory.createCompoundBorder(txtCliente.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtVendedor.setBorder(BorderFactory.createCompoundBorder(txtVendedor.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        txtData.setBorder(BorderFactory.createCompoundBorder(txtData.getBorder(), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    }

}
