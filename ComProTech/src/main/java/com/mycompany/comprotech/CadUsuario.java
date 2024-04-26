/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.comprotech;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class CadUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadUsuario
     */
    public CadUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CbSexo = new javax.swing.JComboBox<>();
        LblLogin = new javax.swing.JLabel();
        TxtNovoLogin = new javax.swing.JTextField();
        LblLogin1 = new javax.swing.JLabel();
        TxtNomeUsu = new javax.swing.JTextField();
        LblLogin2 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        LblLogin3 = new javax.swing.JLabel();
        TxtCpf = new javax.swing.JTextField();
        LblLogin4 = new javax.swing.JLabel();
        CbTipo = new javax.swing.JComboBox<>();
        LblLogin5 = new javax.swing.JLabel();
        LblLogin6 = new javax.swing.JLabel();
        LblLogin7 = new javax.swing.JLabel();
        BtnCriaConta = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtNovaSenha = new javax.swing.JPasswordField();
        TxtConfSenha = new javax.swing.JPasswordField();
        TxtIdade = new javax.swing.JTextField();
        LblLogin8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CbSexo.setForeground(new java.awt.Color(66, 141, 255));
        CbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMININO" }));
        CbSexo.setSelectedIndex(-1);
        CbSexo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbSexoItemStateChanged(evt);
            }
        });

        LblLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin.setText("Login");

        TxtNovoLogin.setForeground(new java.awt.Color(66, 141, 255));

        LblLogin1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin1.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin1.setText("E-mail");

        TxtNomeUsu.setForeground(new java.awt.Color(66, 141, 255));

        LblLogin2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin2.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin2.setText("Nome completo");

        TxtEmail.setForeground(new java.awt.Color(66, 141, 255));

        LblLogin3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin3.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin3.setText("CPF/CNPJ");

        TxtCpf.setForeground(new java.awt.Color(66, 141, 255));

        LblLogin4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin4.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin4.setText("Sexo");

        CbTipo.setForeground(new java.awt.Color(66, 141, 255));
        CbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USUARIO", "ADMIN" }));
        CbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTipoItemStateChanged(evt);
            }
        });

        LblLogin5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin5.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin5.setText("Tipo");

        LblLogin6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin6.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin6.setText("Senha");

        LblLogin7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin7.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin7.setText("Confirmar senha");

        BtnCriaConta.setBackground(new java.awt.Color(164, 194, 247));
        BtnCriaConta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCriaConta.setForeground(new java.awt.Color(66, 141, 255));
        BtnCriaConta.setText("Criar Conta");
        BtnCriaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCriaContaActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(164, 194, 247));
        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(66, 141, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setPreferredSize(new java.awt.Dimension(90, 27));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        TxtNovaSenha.setForeground(new java.awt.Color(66, 141, 255));

        TxtConfSenha.setForeground(new java.awt.Color(66, 141, 255));

        TxtIdade.setForeground(new java.awt.Color(66, 141, 255));

        LblLogin8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblLogin8.setForeground(new java.awt.Color(66, 141, 255));
        LblLogin8.setText("Idade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCriaConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblLogin1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(LblLogin3)
                                    .addGap(92, 92, 92))
                                .addComponent(TxtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(LblLogin2)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(TxtNomeUsu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(LblLogin8)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(TxtIdade)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtNovoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblLogin))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblLogin4)
                                .addComponent(CbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblLogin5)
                                .addComponent(CbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(TxtNovaSenha)
                        .addComponent(TxtConfSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblLogin7)
                                .addComponent(LblLogin6))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCriaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblLogin)
                        .addComponent(LblLogin4)
                        .addComponent(LblLogin5))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CbTipo)
                        .addComponent(CbSexo)
                        .addComponent(TxtNovoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LblLogin2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LblLogin8)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblLogin1)
                        .addComponent(LblLogin3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(LblLogin6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(TxtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(LblLogin7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(TxtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbSexoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbSexoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CbSexoItemStateChanged

    private void CbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CbTipoItemStateChanged

    private void BtnCriaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCriaContaActionPerformed
        String sexo = "", tipo = "";
        
        var novoLogin = TxtNovoLogin.getText();
        var novaSenha = new String(TxtNovaSenha.getPassword());
        String nome = TxtNomeUsu.getText();
        Object selectedSexo = CbSexo.getSelectedItem();
        if (selectedSexo != null) {
            if (selectedSexo.equals("MASCULINO")) {
                sexo = "Ma";
            } else if (selectedSexo.equals("FEMININO")) {
                sexo = "Fe";
            }
        }
        Object selectedTipo = CbTipo.getSelectedItem();
        if (selectedTipo != null) {
            if (selectedTipo.equals("USUARIO")) {
                tipo = "USUARIO";
            } else if (selectedTipo.equals("ADMIN")) {
                tipo = "ADMIN";
            }
        }       
        String cpf = TxtCpf.getText();        
        String email = TxtEmail.getText();
        
        int idade = 0; // Inicializa a idade com 0
        try {
            idade = Integer.parseInt(TxtIdade.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida!");
        }
        var confirmaNovaSenha =
                new String(TxtConfSenha.getPassword());
        
        var usuario = new CadastroUsuario(novoLogin, novaSenha, nome, sexo, cpf, tipo, email, idade);
        var dao = new UsuarioDAO();
        //string pool
        if (novaSenha.equals(confirmaNovaSenha)){
            try {
                dao.cadastrar(usuario);
                JOptionPane.showMessageDialog(null, "Par usuário/senha inválido");
            } catch (Exception ex) {
                Logger.getLogger(CadUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BtnCriaContaActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:       
        // Instanciando a tela Cadusuario
        ViewLogin viewLogin = new ViewLogin();

        // Exibindo a tela Cadusuario
        viewLogin.setVisible(true);

        // Ocultando a tela ViewLogin
        this.setVisible(false);         
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        // Instanciando a tela Cadusuario
        ViewLogin viewLogin = new ViewLogin();

        // Exibindo a tela Cadusuario
        viewLogin.setVisible(true);

        // Ocultando a tela ViewLogin
        this.setVisible(false);      
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnCriaConta;
    private javax.swing.JComboBox<String> CbSexo;
    private javax.swing.JComboBox<String> CbTipo;
    private javax.swing.JLabel LblLogin;
    private javax.swing.JLabel LblLogin1;
    private javax.swing.JLabel LblLogin2;
    private javax.swing.JLabel LblLogin3;
    private javax.swing.JLabel LblLogin4;
    private javax.swing.JLabel LblLogin5;
    private javax.swing.JLabel LblLogin6;
    private javax.swing.JLabel LblLogin7;
    private javax.swing.JLabel LblLogin8;
    private javax.swing.JPasswordField TxtConfSenha;
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtIdade;
    private javax.swing.JTextField TxtNomeUsu;
    private javax.swing.JPasswordField TxtNovaSenha;
    private javax.swing.JTextField TxtNovoLogin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
