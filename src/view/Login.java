/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import controller.LoginController;

/**
 *
 * @author Carlos Mucavel
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonSair = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("v3.0 - Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/logo.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(0, 20, 230, 240);

        jLabelUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuário");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(280, 40, 60, 19);

        jTextFieldUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(280, 70, 200, 50);

        jLabelPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Palavra-Passe");
        getContentPane().add(jLabelPassword);
        jLabelPassword.setBounds(280, 130, 110, 19);

        jPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(280, 160, 200, 50);

        jButtonSair.setBackground(new java.awt.Color(204, 0, 0));
        jButtonSair.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(280, 240, 80, 40);

        jButtonEntrar.setBackground(new java.awt.Color(0, 153, 0));
        jButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(400, 240, 80, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 90, 70, 100);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/fundoLogin.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(-6, -5, 520, 310);

        setSize(new java.awt.Dimension(518, 333));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    LoginController loginC = new LoginController();
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // SAIR
        if(loginC.sair());
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        // ENTRAR
        entrar();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jTextFieldUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            entrar();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyPressed

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           entrar();
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed
    private void entrar(){
        String nome = jTextFieldUsuario.getText();
        String password = jPasswordField.getText();
        
        if(loginC.entrar(nome, password)){
            dispose();
        }else{
            loginC.erro_login();
            jTextFieldUsuario.setText("");
            jPasswordField.setText("");
            jTextFieldUsuario.requestFocus();
        }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
