/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FornecedoresTto;
import bean.FuncionariosTto;
import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author tate
 */
public class JDlgCompras extends javax.swing.JDialog {

    /**
     * Creates new form JDlgVendas
     */
    JDlgInclusaoProduto_Compras jDlgInclusaoProduto_Compras;

    public JDlgCompras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jDlgInclusaoProduto_Compras = new JDlgInclusaoProduto_Compras(null, true);

        setTitle("Compras");
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idfuncionarios_tto = new javax.swing.JComboBox<FuncionariosTto>();
        jBtnAlterar1 = new javax.swing.JButton();
        idfornecedores_tto = new javax.swing.JComboBox<FornecedoresTto>();
        jBtbExcluir1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        data_tto = new javax.swing.JFormattedTextField();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        idcompra_tto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnExcluir = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        total_tto = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jBtnIncluir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idfuncionarios_tto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfuncionarios_ttoActionPerformed(evt);
            }
        });

        jBtnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar1ActionPerformed(evt);
            }
        });

        jBtbExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtbExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbExcluir1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Funcionario");

        jLabel3.setText("Fornecedor");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUTO", "QUANTIDADE", "VALOR UNITARIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        data_tto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_ttoActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        idcompra_tto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcompra_ttoActionPerformed(evt);
            }
        });

        jLabel1.setText("Num Compra");

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        total_tto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_ttoActionPerformed(evt);
            }
        });

        jLabel5.setText("Total");

        jBtnIncluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnIncluir1)
                            .addComponent(jBtbExcluir1)
                            .addComponent(jBtnAlterar1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idcompra_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(data_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idfornecedores_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idfuncionarios_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(total_tto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idfornecedores_tto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idcompra_tto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(data_tto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(idfuncionarios_tto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(total_tto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jBtnIncluir1)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAlterar1)
                        .addGap(30, 30, 30)
                        .addComponent(jBtbExcluir1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCancelar)
                        .addComponent(jBtnPesquisar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir)
                        .addComponent(jBtnExcluir)
                        .addComponent(jBtnAlterar)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idfuncionarios_ttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfuncionarios_ttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idfuncionarios_ttoActionPerformed

    private void jBtnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar1ActionPerformed
        // TODO add your handling code here:
        JDlgAlteracaoProduto_Compras jDlgAlteracaoProduto_Compras = new JDlgAlteracaoProduto_Compras(null, true);
        jDlgAlteracaoProduto_Compras.setVisible(true);

        Util.limparCampos(idcompra_tto, data_tto, idfornecedores_tto, idfuncionarios_tto, total_tto, jBtnIncluir,
                jBtnCancelar, jBtnExcluir, jBtnPesquisar, jBtnConfirmar, jBtnAlterar);

        Util.habilitar(true, jBtnIncluir, idfuncionarios_tto, idfornecedores_tto, idcompra_tto, total_tto, data_tto,
                jBtnPesquisar, jBtnExcluir, jBtnConfirmar, jBtnCancelar, jBtnAlterar);

    }//GEN-LAST:event_jBtnAlterar1ActionPerformed

    private void jBtbExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbExcluir1ActionPerformed
        // TODO add your handling code here:
        Util.limparCampos(idcompra_tto, data_tto, idfornecedores_tto, idfuncionarios_tto, total_tto, jBtnIncluir,
                jBtnCancelar, jBtnExcluir, jBtnPesquisar, jBtnConfirmar, jBtnAlterar);

        Util.habilitar(false, jBtnIncluir, idfuncionarios_tto, idfornecedores_tto, idcompra_tto, total_tto, data_tto,
                jBtnPesquisar, jBtnExcluir, jBtnConfirmar, jBtnCancelar, jBtnAlterar);

    }//GEN-LAST:event_jBtbExcluir1ActionPerformed

    private void data_ttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_ttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_ttoActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        Util.limparCampos(idcompra_tto, data_tto, idfornecedores_tto, idfuncionarios_tto, total_tto, jBtnIncluir,
                jBtnCancelar, jBtnExcluir, jBtnPesquisar, jBtnConfirmar, jBtnAlterar);

        Util.habilitar(true, jBtnIncluir, idfuncionarios_tto, idfornecedores_tto, idcompra_tto, total_tto, data_tto,
                jBtnPesquisar, jBtnExcluir, jBtnConfirmar, jBtnCancelar, jBtnAlterar);

    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.limparCampos(idcompra_tto, data_tto, idfornecedores_tto, idfuncionarios_tto, total_tto, jBtnIncluir,
                jBtnCancelar, jBtnExcluir, jBtnPesquisar, jBtnConfirmar, jBtnAlterar);

        Util.habilitar(false, jBtnIncluir, idfuncionarios_tto, idfornecedores_tto, idcompra_tto, total_tto, data_tto,
                jBtnPesquisar, jBtnExcluir, jBtnConfirmar, jBtnCancelar, jBtnAlterar);

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.limparCampos(idcompra_tto, data_tto, idfornecedores_tto, idfuncionarios_tto, total_tto, jBtnIncluir,
                jBtnCancelar, jBtnExcluir, jBtnPesquisar, jBtnConfirmar, jBtnAlterar);

        Util.habilitar(true, jBtnIncluir, idfuncionarios_tto, idfornecedores_tto, idcompra_tto, total_tto, data_tto,
                jBtnPesquisar, jBtnExcluir, jBtnConfirmar, jBtnCancelar, jBtnAlterar);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void idcompra_ttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcompra_ttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idcompra_ttoActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed

        if (Util.perguntar("Deseja excluir a compra?") == true) {
        }

        Util.limparCampos(idcompra_tto, data_tto, idfornecedores_tto, idfuncionarios_tto, total_tto, jBtnIncluir,
                jBtnCancelar, jBtnExcluir, jBtnPesquisar, jBtnConfirmar, jBtnAlterar);

        Util.habilitar(false, jBtnIncluir, idfuncionarios_tto, idfornecedores_tto, idcompra_tto, total_tto, data_tto,
                jBtnPesquisar, jBtnExcluir, jBtnConfirmar, jBtnCancelar, jBtnAlterar);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        Util.limparCampos(idcompra_tto, data_tto, idfornecedores_tto, idfuncionarios_tto, total_tto, jBtnIncluir,
                jBtnCancelar, jBtnExcluir, jBtnPesquisar, jBtnConfirmar, jBtnAlterar);

        Util.habilitar(true, jBtnIncluir, idfuncionarios_tto, idfornecedores_tto, idcompra_tto, total_tto, data_tto,
                jBtnPesquisar, jBtnExcluir, jBtnConfirmar, jBtnCancelar, jBtnAlterar);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed

    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void total_ttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_ttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_ttoActionPerformed

    private void jBtnIncluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir1ActionPerformed
        // TODO add your handling code here:
        JDlgInclusaoProduto_Compras jDlgInclusaoProduto_Compras = new JDlgInclusaoProduto_Compras(null, true);
        jDlgInclusaoProduto_Compras.setVisible(true);
    }//GEN-LAST:event_jBtnIncluir1ActionPerformed

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
    private javax.swing.JFormattedTextField data_tto;
    private javax.swing.JTextField idcompra_tto;
    private javax.swing.JComboBox<FornecedoresTto> idfornecedores_tto;
    private javax.swing.JComboBox<FuncionariosTto> idfuncionarios_tto;
    private javax.swing.JButton jBtbExcluir1;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterar1;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluir1;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField total_tto;
    // End of variables declaration//GEN-END:variables
}
