/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ComprasTto;
import bean.FornecedoresTto;
import dao.Compras_DAO;
import dao.Fornecedores_DAO;
import java.util.List;
import tools.Util;

/**
 *
 * @author u10475493109
 */
public class JDlgCompras extends javax.swing.JDialog {

    private boolean incluindo;
    JDlgComprasProdutos jDlgComprasProdutos;
    Compras_DAO compras_DAO;
    ComprasTto comprasTto;
    ComprasControle comprasControle;
    Fornecedores_DAO fornecedores_DAO;

    /**
     * Creates new form JDlgPedidos
     */
    public JDlgCompras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Tela de pedidos");
        setLocationRelativeTo(null);

        fornecedores_DAO = new Fornecedores_DAO();
        
        /*
        List lista = fornecedores_DAO.listAll();
        for (int i = 0; i < lista.size(); i++) {
            FornecedoresTto fornecedoresTto = (FornecedoresTto) lista.get(i);
            jCboFornecedor_tto.addItem(fornecedoresTto);
        }

        */
        
        jDlgComprasProdutos = new JDlgComprasProdutos(null, true);

        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.habilitar(false, jTxtNumPedido_tto, jFmtData_tto, jCboFornecedor_tto, jCboFuncionario_tto,
                jTxtTotal_tto, jBtnIncluirLateral, jBtnAlterarLateral, jBtnExcluirLateral,
                jBtnConfirmar, jBtnCancelar);

    }

    /*
    public ComprasTto viewBean() {
        ComprasTto comprasTto = new ComprasTto();

        comprasTto.setIdcomprasTto(Util.strInt(jTxtNumPedido_tto.getText()));
        //comprasTto.setFornecedoresTto(jCboFornecedor_tto.getSelectedIndex());
        //comprasTto.setFuncionariosTto(jCboFuncionario_tto.getSelectedIndex());
        comprasTto.setDataTto(Util.strDate(jFmtData_tto.getText()));
        comprasTto.setTotalTto(Util.strDouble(jTxtTotal_tto.getText()));

        return comprasTto;
    }

    public void beanView(ComprasTto comprasTto) {

        jTxtNumPedido_tto.setText(Util.intStr(comprasTto.getIdcomprasTto()));
        //jCboFornecedor_tto.setSelectedIndex(comprasTto.getFornecedoresTto());
        //jCboFuncionario_tto.setSelectedIndex(comprasTto.getFuncionariosTto());
        jFmtData_tto.setText(Util.dateStr(comprasTto.getDataTto()));
        jTxtTotal_tto.setText(Util.doubleStr(comprasTto.getTotalTto()));

    }
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnIncluirLateral = new javax.swing.JButton();
        jBtnAlterarLateral = new javax.swing.JButton();
        jBtnExcluirLateral = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtNumPedido_tto = new javax.swing.JTextField();
        jFmtData_tto = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtTotal_tto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCboFornecedor_tto = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jCboFuncionario_tto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_1.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir_1.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnIncluir)
                .addGap(18, 18, 18)
                .addComponent(jBtnAlterar)
                .addGap(18, 18, 18)
                .addComponent(jBtnExcluir)
                .addGap(18, 18, 18)
                .addComponent(jBtnConfirmar)
                .addGap(18, 18, 18)
                .addComponent(jBtnCancelar)
                .addGap(18, 18, 18)
                .addComponent(jBtnPesquisar)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(21, 21, 21))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Valor unitário", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBtnIncluirLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluirLateral.setText("Incluir");
        jBtnIncluirLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirLateralActionPerformed(evt);
            }
        });

        jBtnAlterarLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_1.png"))); // NOI18N
        jBtnAlterarLateral.setText("Alterar");

        jBtnExcluirLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir_1.png"))); // NOI18N
        jBtnExcluirLateral.setText("Excluir");

        jLabel1.setText("NumPedido");

        jLabel2.setText("Total");

        jLabel3.setText("Data");

        jLabel5.setText("Fornecedor");

        jCboFornecedor_tto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboFornecedor_ttoActionPerformed(evt);
            }
        });

        jLabel6.setText("Funcionário");

        jCboFuncionario_tto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTxtNumPedido_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtData_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jCboFornecedor_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jCboFuncionario_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTxtTotal_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnIncluirLateral)
                            .addComponent(jBtnAlterarLateral)
                            .addComponent(jBtnExcluirLateral, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTxtNumPedido_tto, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addComponent(jFmtData_tto)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jCboFornecedor_tto)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jCboFuncionario_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTotal_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnIncluirLateral)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAlterarLateral)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluirLateral)
                        .addGap(98, 98, 98)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:

        Util.habilitar(true, jTxtNumPedido_tto, jFmtData_tto, jCboFornecedor_tto, jCboFornecedor_tto, jTxtTotal_tto,
                jBtnIncluirLateral, jBtnAlterarLateral, jBtnExcluirLateral,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.habilitar(false, jTxtNumPedido_tto, jFmtData_tto, jCboFornecedor_tto, jCboFuncionario_tto, jTxtTotal_tto,
                jBtnIncluirLateral, jBtnAlterarLateral, jBtnExcluirLateral,
                jBtnConfirmar, jBtnCancelar);
        Util.limparCampos();
        Util.mensagem("Cancelamento concluído");
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirLateralActionPerformed
        // TODO add your handling code here:
        jDlgComprasProdutos.setTitle("Inclusão");
        jDlgComprasProdutos.setVisible(true);


    }//GEN-LAST:event_jBtnIncluirLateralActionPerformed

    private void jCboFornecedor_ttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboFornecedor_ttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboFornecedor_ttoActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        //incluindo = true;
        Util.habilitar(true, jTxtNumPedido_tto, jFmtData_tto, jCboFornecedor_tto, jCboFuncionario_tto, jTxtTotal_tto,
                jBtnIncluirLateral, jBtnAlterarLateral, jBtnExcluirLateral,
                jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        /*
        if (Util.perguntar("Deseja excluir o funcionário?") == true) {
            int sel = jTable1.getSelectedRow();
            comprasTto = comprasControle.getBean(sel);
            compras_DAO.delete(comprasTto);

            List lista = compras_DAO.listAll();
            comprasControle.setList(lista);
        } else {
            Util.mensagem("Exclusão cancelada");
        }
         */
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgComprasPesquisa jDlgComprasPesquisa = new JDlgComprasPesquisa(null, true);
        jDlgComprasPesquisa.setVisible(true);

    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        /*
        comprasTto = viewBean();
        if (incluindo == true) {
            compras_DAO.insert(comprasTto);
        } else {
            compras_DAO.update(comprasTto);
        }

        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        */
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCompras dialog = new JDlgCompras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterarLateral;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnExcluirLateral;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluirLateral;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboFornecedor_tto;
    private javax.swing.JComboBox<String> jCboFuncionario_tto;
    private javax.swing.JFormattedTextField jFmtData_tto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtNumPedido_tto;
    private javax.swing.JTextField jTxtTotal_tto;
    // End of variables declaration//GEN-END:variables
}
