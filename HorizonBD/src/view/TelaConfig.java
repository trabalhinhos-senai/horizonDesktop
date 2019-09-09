/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import model.Config;
import model.Config_Contato;
import model.Config_Endereco;
import repository.ConfigRep;

/**
 *
 * @author gabri
 */
public class TelaConfig extends javax.swing.JFrame {

    Config config = new Config();
    ConfigRep confRep = new ConfigRep();
    Config_Contato cc = new Config_Contato();
    Config_Endereco ce = new Config_Endereco();

    public TelaConfig() {
        initComponents();
        disableConfig();
        Preencher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtEmailConfig = new javax.swing.JLabel();
        cxtEmailConfig = new javax.swing.JTextField();
        txtIdConfig = new javax.swing.JLabel();
        cxtIdConfig = new javax.swing.JTextField();
        txtEnderecoConfig = new javax.swing.JLabel();
        cxtEnderecoConfig = new javax.swing.JTextField();
        txtTelefoneConfig = new javax.swing.JLabel();
        txtNumeroConfig = new javax.swing.JLabel();
        cxtNumeroConfig = new javax.swing.JTextField();
        txtCidadeConfig = new javax.swing.JLabel();
        cxtCidadeConfig = new javax.swing.JTextField();
        txtBairroConfig = new javax.swing.JLabel();
        cxtBairroConfig = new javax.swing.JTextField();
        btnModificarConfig = new javax.swing.JButton();
        btnSalvarConfig = new javax.swing.JButton();
        cxtNomeConfig = new javax.swing.JTextField();
        txtnomeConfig = new javax.swing.JLabel();
        btnFecharJanelaConfig = new javax.swing.JButton();
        btnCancelarModifConfig = new javax.swing.JButton();
        cxtTelefoneConfig = new javax.swing.JFormattedTextField();
        btnCadastrarUsuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtClientes = new javax.swing.JLabel();

        jLabel3.setText("Nome da empresa");

        jLabel5.setText("Endereço da empresa");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HORIZON ORÇAMENTOS - CONFIGURAÇÃO");
        setMinimumSize(new java.awt.Dimension(926, 623));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(926, 623));

        txtEmailConfig.setText("E-Mail");

        txtIdConfig.setText("ID");

        txtEnderecoConfig.setText("Endereço");

        cxtEnderecoConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtEnderecoConfigActionPerformed(evt);
            }
        });

        txtTelefoneConfig.setText("Telefone");

        txtNumeroConfig.setText("Número");

        cxtNumeroConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtNumeroConfigActionPerformed(evt);
            }
        });

        txtCidadeConfig.setText("Cidade");

        cxtCidadeConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtCidadeConfigActionPerformed(evt);
            }
        });

        txtBairroConfig.setText("Bairro");

        btnModificarConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnModificarConfig.setText("Modificar");
        btnModificarConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarConfigActionPerformed(evt);
            }
        });

        btnSalvarConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvarConfig.setText("Salvar");
        btnSalvarConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarConfigActionPerformed(evt);
            }
        });

        txtnomeConfig.setText("Nome");

        btnFecharJanelaConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        btnFecharJanelaConfig.setText("Fechar Configurações");
        btnFecharJanelaConfig.setToolTipText("Fechar janela atual");
        btnFecharJanelaConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharJanelaConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharJanelaConfigActionPerformed(evt);
            }
        });

        btnCancelarModifConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btnCancelarModifConfig.setText("Cancelar");
        btnCancelarModifConfig.setToolTipText("Cancelar Cadastro");
        btnCancelarModifConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarModifConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModifConfigActionPerformed(evt);
            }
        });

        try {
            cxtTelefoneConfig.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        btnCadastrarUsuario.setText("Usuários");
        btnCadastrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefoneConfig)
                            .addComponent(txtEmailConfig)
                            .addComponent(cxtEmailConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomeConfig)
                            .addComponent(cxtNomeConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEnderecoConfig)
                                        .addComponent(cxtEnderecoConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCidadeConfig)
                                        .addComponent(cxtCidadeConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBairroConfig)
                                        .addComponent(cxtBairroConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumeroConfig)
                                        .addComponent(cxtNumeroConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIdConfig)
                                        .addComponent(cxtIdConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(515, 515, 515)))
                            .addComponent(cxtTelefoneConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnModificarConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvarConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarModifConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFecharJanelaConfig)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdConfig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxtIdConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnomeConfig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxtNomeConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtEnderecoConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtEnderecoConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtNumeroConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtNumeroConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCidadeConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtCidadeConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBairroConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtBairroConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmailConfig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxtEmailConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefoneConfig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxtTelefoneConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecharJanelaConfig)
                    .addComponent(btnCancelarModifConfig)
                    .addComponent(btnCadastrarUsuario))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(834, 60));

        txtClientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtClientes.setText("CONFIGURAÇÕES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(txtClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharJanelaConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharJanelaConfigActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharJanelaConfigActionPerformed

    private void btnSalvarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarConfigActionPerformed

        try {
            disableConfig();
            btnModificarConfig.setEnabled(true);
            if (cxtNomeConfig.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Nome não pode estar em branco!");
            } else {                
                config.setNome_empresa(cxtNomeConfig.getText());
                ce.setEndereco_config(cxtEnderecoConfig.getText());
                ce.setBairro_config(cxtBairroConfig.getText());
                cc.setTelefone_config(cxtTelefoneConfig.getText());
                cc.setEmail_config(cxtEmailConfig.getText());
                
                config.setConfig_contato(cc);
                config.setConfig_Endereco(ce);
                
                confRep.salvarModif(config);
                JOptionPane.showMessageDialog(rootPane, "Configurações alteradas com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Dados incompletos ou incorretos, \n'*' Verifique as informações necessárias para continuar!");
        }


    }//GEN-LAST:event_btnSalvarConfigActionPerformed

    private void btnModificarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarConfigActionPerformed
        enableConfig();
        btnModificarConfig.setEnabled(false);
        btnCadastrarUsuario.setEnabled(false);
    }//GEN-LAST:event_btnModificarConfigActionPerformed

    private void cxtCidadeConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtCidadeConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtCidadeConfigActionPerformed

    private void cxtNumeroConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtNumeroConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtNumeroConfigActionPerformed

    private void cxtEnderecoConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtEnderecoConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtEnderecoConfigActionPerformed

    private void btnCancelarModifConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModifConfigActionPerformed
        disableConfig();
        Preencher();
    }//GEN-LAST:event_btnCancelarModifConfigActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        TelaCadastroUser telaCadastroUser = new TelaCadastroUser();
        telaCadastroUser.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void disableConfig() {
        btnSalvarConfig.setVisible(false);
        cxtIdConfig.setEnabled(false);
        cxtNomeConfig.setEnabled(false);
        cxtEnderecoConfig.setEnabled(false);
        cxtCidadeConfig.setEnabled(false);
        cxtBairroConfig.setEnabled(false);
        cxtNumeroConfig.setEnabled(false);
        cxtTelefoneConfig.setEnabled(false);
        cxtEmailConfig.setEnabled(false);
        btnCancelarModifConfig.setVisible(false);
        btnModificarConfig.setEnabled(true);
        btnCadastrarUsuario.setEnabled(true);
    }

    private void enableConfig() {
        btnSalvarConfig.setVisible(true);
        btnCancelarModifConfig.setVisible(true);
        cxtIdConfig.setEnabled(false);
        cxtNomeConfig.setEnabled(true);
        cxtEnderecoConfig.setEnabled(true);
        cxtCidadeConfig.setEnabled(true);
        cxtBairroConfig.setEnabled(true);
        cxtNumeroConfig.setEnabled(true);
        cxtTelefoneConfig.setEnabled(true);
        cxtEmailConfig.setEnabled(true);
    }

    private void Preencher() {
        

        cxtNomeConfig.setText(config.getNome_empresa());
        cxtEnderecoConfig.setText(ce.getEndereco_config());
        cxtBairroConfig.setText(ce.getBairro_config());
        cxtTelefoneConfig.setText(cc.getTelefone_config());
        cxtEmailConfig.setText(cc.getEmail_config());
        
    }

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
            java.util.logging.Logger.getLogger(TelaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               ConfigRep cRep = new ConfigRep();
               cRep.listar();
                new TelaConfig().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnCancelarModifConfig;
    private javax.swing.JButton btnFecharJanelaConfig;
    private javax.swing.JButton btnModificarConfig;
    private javax.swing.JButton btnSalvarConfig;
    private javax.swing.JTextField cxtBairroConfig;
    private javax.swing.JTextField cxtCidadeConfig;
    private javax.swing.JTextField cxtEmailConfig;
    private javax.swing.JTextField cxtEnderecoConfig;
    private javax.swing.JTextField cxtIdConfig;
    private javax.swing.JTextField cxtNomeConfig;
    private javax.swing.JTextField cxtNumeroConfig;
    private javax.swing.JFormattedTextField cxtTelefoneConfig;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel txtBairroConfig;
    private javax.swing.JLabel txtCidadeConfig;
    private javax.swing.JLabel txtClientes;
    private javax.swing.JLabel txtEmailConfig;
    private javax.swing.JLabel txtEnderecoConfig;
    private javax.swing.JLabel txtIdConfig;
    private javax.swing.JLabel txtNumeroConfig;
    private javax.swing.JLabel txtTelefoneConfig;
    private javax.swing.JLabel txtnomeConfig;
    // End of variables declaration//GEN-END:variables
}
