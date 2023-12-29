package view;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.aplicacao.Cliente;
import model.aplicacao.ItemVenda;
import model.aplicacao.LoginService;
import model.aplicacao.Produto;
import model.aplicacao.Venda;
import model.aplicacao.Vendedor;
import data.ClienteDAO;
import data.ProdutoDAO;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaNovaVenda extends javax.swing.JFrame {

    private Venda venda;

    public TelaNovaVenda() {
        initComponents();
        setTitle("Nova Venda");
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        try {
            venda = new Venda();

            for (Cliente cliente : data.ClienteDAO.listar()) {
                cbxCliente.addItem(cliente.getNomeCliente());
            }

            for (Produto produto : data.ProdutoDAO.listar()) {
                cbxProduto.addItem(produto.getNomeProduto());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaNovaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAdicionarItem = new javax.swing.JButton();
        spnQuantidade = new javax.swing.JSpinner();
        cbxCliente = new javax.swing.JComboBox<>();
        cbxProduto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        btnFinalizarVenda = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        btnExcluirProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1440));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nova Venda");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Produto:");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Quantidade");

        btnAdicionarItem.setBackground(new java.awt.Color(47, 136, 255));
        btnAdicionarItem.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnAdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarItem.setText("Adicionar Item");
        btnAdicionarItem.setBorder(null);
        btnAdicionarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemActionPerformed(evt);
            }
        });

        spnQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(spnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxCliente, cbxProduto, spnQuantidade});

        jScrollPane1.setViewportView(tblItens);

        btnFinalizarVenda.setBackground(new java.awt.Color(70, 190, 40));
        btnFinalizarVenda.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnFinalizarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-comprar.png"))); // NOI18N
        btnFinalizarVenda.setText("Finalizar Venda");
        btnFinalizarVenda.setBorder(null);
        btnFinalizarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        btnCancelarVenda.setBackground(new java.awt.Color(255, 30, 30));
        btnCancelarVenda.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnCancelarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-cancelar-venda (1).png"))); // NOI18N
        btnCancelarVenda.setText("Cancelar Venda\n");
        btnCancelarVenda.setBorder(null);
        btnCancelarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblValor.setForeground(new java.awt.Color(0, 0, 0));
        lblValor.setText("Valor: 0.0");

        btnExcluirProduto.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirProduto.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnExcluirProduto.setForeground(new java.awt.Color(255, 30, 30));
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img-deletar-produto.png"))); // NOI18N
        btnExcluirProduto.setText("Excluir Produto");
        btnExcluirProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 30, 30), 3));
        btnExcluirProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(222, 222, 222))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelarVenda, btnExcluirProduto, btnFinalizarVenda});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(716, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelarVenda, btnExcluirProduto, btnFinalizarVenda});

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

    private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarItemActionPerformed
        try {
            Produto produto = ProdutoDAO.retornarProdutoPorNome(cbxProduto.getSelectedItem().toString());
            int quantidade = (Integer) spnQuantidade.getValue();

            boolean itemExiste = false;

            ItemVenda novoItem = new ItemVenda(venda, produto, quantidade);

            if (venda.getItens().contains(novoItem)) {
                itemExiste = true;

                for (ItemVenda itemAtual : venda.getItens()) {
                    if (itemAtual.equals(novoItem)) {
                        itemAtual.setQuantidade(itemAtual.getQuantidade() + novoItem.getQuantidade());
                    }
                }

            }

            if (!itemExiste) {
                venda.adicionarItem(novoItem);
            }

            atualizarTabela();

            lblValor.setText("Valor: " + String.format("%.2f", calcularValor()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaNovaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarItemActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        int linha = tblItens.getSelectedRow();

        if (linha >= 0) {

            int resp = JOptionPane.showConfirmDialog(null, "Você deseja excluir este produto?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resp == 0) {
                excluirItem((String) tblItens.getValueAt(linha, 0));
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }

    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Você deseja cancelar esta venda?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == 0) {
            cancelarVenda();
            dispose();
            TelaVendas tela = new TelaVendas();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        if (!venda.getItens().isEmpty()) {

            boolean efetuar = true;

            for (ItemVenda itemAtual : venda.getItens()) {
                if (itemAtual.getQuantidade() > itemAtual.getProduto().getQuantidade()) {
                    JOptionPane.showMessageDialog(null, "PRODUTO: " + itemAtual.getProduto().getNomeProduto() + "\nQuantidade em estoque: " + itemAtual.getProduto().getQuantidade());
                    efetuar = false;
                    return;
                }
            }

            if (efetuar) {
                int resp = JOptionPane.showConfirmDialog(null, "Você deseja finalizar a venda?", "Confirmação", JOptionPane.YES_NO_OPTION);

                if (resp == 0) {
                    try {
                        venda.setCliente((Cliente) ClienteDAO.retornarClientePorNome(cbxCliente.getSelectedItem().toString()));
                        venda.setVendedor((Vendedor) LoginService.retornarUsuarioLogado().getFuncionario());
                        venda.setDataVenda(LocalDateTime.now());
                        venda.calcularTotal();
                        dispose();
                        
                        TelaPagamento tela = new TelaPagamento(venda);
                        tela.setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaNovaVenda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não é possível cadastrar uma venda sem itens");
        }
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JSpinner spnQuantidade;
    private javax.swing.JTable tblItens;
    // End of variables declaration//GEN-END:variables

    private double calcularValor() {
        double valorTotal = 0.0;

        for (ItemVenda item : venda.getItens()) {
            valorTotal += item.subTotal();
        }

        return valorTotal;
    }

    private void atualizarTabela() {
        String[] colunas = {"Produto", "Quantidade", "Valor Unitário", "Subtotal"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        for (ItemVenda item : venda.getItens()) {
            String linha = item.getProduto().getNomeProduto() + "," + item.getQuantidade() + "," + item.getProduto().getValorDeVenda() + "," + item.subTotal();
            modelo.addRow(linha.split(","));
        }

        tblItens.setModel(modelo);
    }

    private void excluirItem(String nomeItem) {
        List<ItemVenda> lista = venda.getItens();
        ItemVenda itemExcluido = null;

        for (ItemVenda itemAtual : lista) {
            if (itemAtual.getProduto().getNomeProduto().equals(nomeItem)) {
                itemExcluido = itemAtual;
            }

            if (itemExcluido != null) {
                venda.removerItem(itemAtual);
                itemAtual.getProduto().adicionarProduto(itemAtual.getQuantidade());
                atualizarTabela();
                lblValor.setText("Valor: " + String.format("%.2f", calcularValor()));
                return;
            }
        }
    }

    private void cancelarVenda() {
        for (ItemVenda item : venda.getItens()) {
            int quantidade = item.getQuantidade();
            item.getProduto().adicionarProduto(quantidade);
        }
    }

}
