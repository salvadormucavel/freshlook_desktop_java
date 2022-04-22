/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LoginController;
import model.Model;

/**
 *
 * @author Carlos Mucavel
 */
public class ConfirmarID extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmarID
     */
    public ConfirmarID() {
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

        jLabelConfirmId = new javax.swing.JLabel();
        jTextFieldConfirm = new javax.swing.JTextField();
        jPasswordFieldConfirm = new javax.swing.JPasswordField();
        jButtonConfirm = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jLabelpass = new javax.swing.JLabel();
        jLabelIDfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("v2.0 - Identidade");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelConfirmId.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelConfirmId.setForeground(new java.awt.Color(0, 0, 0));
        jLabelConfirmId.setText("Confirmar Identidade");
        getContentPane().add(jLabelConfirmId);
        jLabelConfirmId.setBounds(40, 10, 190, 24);

        jTextFieldConfirm.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldConfirm);
        jTextFieldConfirm.setBounds(50, 60, 170, 40);

        jPasswordFieldConfirm.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPasswordFieldConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPasswordFieldConfirm);
        jPasswordFieldConfirm.setBounds(50, 130, 170, 40);

        jButtonConfirm.setText("Confirmar");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirm);
        jButtonConfirm.setBounds(90, 180, 90, 30);

        jLabelNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(120, 40, 40, 16);

        jLabelpass.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelpass.setText("Palavra-Passe");
        getContentPane().add(jLabelpass);
        jLabelpass.setBounds(90, 100, 100, 30);
        getContentPane().add(jLabelIDfundo);
        jLabelIDfundo.setBounds(0, -4, 270, 230);

        setSize(new java.awt.Dimension(282, 256));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        // CONFIRMAR
        LoginController loginC = new LoginController();
        Model model = new Model();
        
        model.setNome(jTextFieldConfirm.getText());
        model.setPassword(jPasswordFieldConfirm.getText());
        
        if(loginC.confirm(model.getNome(), model.getPassword())){
            jTextFieldConfirm.setText("");
            jPasswordFieldConfirm.setText("");
            jTextFieldConfirm.requestFocus();
            dispose();
        }else{
            loginC.erro_login();
            jTextFieldConfirm.setText("");
            jPasswordFieldConfirm.setText("");
            jTextFieldConfirm.requestFocus();
        }
    }//GEN-LAST:event_jButtonConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmarID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmarID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JLabel jLabelConfirmId;
    private javax.swing.JLabel jLabelIDfundo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelpass;
    private javax.swing.JPasswordField jPasswordFieldConfirm;
    private javax.swing.JTextField jTextFieldConfirm;
    // End of variables declaration//GEN-END:variables
}
