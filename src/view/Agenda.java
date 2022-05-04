/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.Conexao;
import controller.AgendaController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Mucavel
 */
public class Agenda extends javax.swing.JFrame {
    AgendaController agendaC = new AgendaController();
    PreparedStatement query;
    ResultSet result;
    ResultSetMetaData resultMeta;
    Conexao conexao = new Conexao();
    
    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        clientesHoje();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelFreshLook = new javax.swing.JLabel();
        jLabelAgenda = new javax.swing.JLabel();
        jButtonRemover = new javax.swing.JButton();
        jComboBoxClientes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jLabelFundoAgenda = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuBloquear = new javax.swing.JMenu();
        jMenuItemBloquear = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemAgendar = new javax.swing.JMenuItem();
        jMenuItemAddAdm = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("v3.0 - Agenda");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Salão de Cabelereiro");
        getContentPane().add(jLabelTitle);
        jLabelTitle.setBounds(400, 10, 250, 30);

        jLabelFreshLook.setFont(new java.awt.Font("Monotype Corsiva", 0, 32)); // NOI18N
        jLabelFreshLook.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFreshLook.setText("Fresh Look");
        getContentPane().add(jLabelFreshLook);
        jLabelFreshLook.setBounds(450, 50, 180, 37);

        jLabelAgenda.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgenda.setText("Agenda");
        getContentPane().add(jLabelAgenda);
        jLabelAgenda.setBounds(470, 170, 90, 40);

        jButtonRemover.setBackground(new java.awt.Color(204, 0, 51));
        jButtonRemover.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonRemover.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/remover.png"))); // NOI18N
        jButtonRemover.setText("Remover Cliente");
        jButtonRemover.setBorder(null);
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemover);
        jButtonRemover.setBounds(893, 170, 140, 40);

        jComboBoxClientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes do Dia", "Todos Clientes" }));
        jComboBoxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxClientes);
        jComboBoxClientes.setBounds(10, 170, 130, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/atualizar.png"))); // NOI18N
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 170, 110, 40);

        jTableTabela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Idade", "Corte", "Preço", "Data", "Hora", "Observações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabela.setRowHeight(26);
        jTableTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPaneTabela.setViewportView(jTableTabela);
        if (jTableTabela.getColumnModel().getColumnCount() > 0) {
            jTableTabela.getColumnModel().getColumn(0).setMinWidth(2);
            jTableTabela.getColumnModel().getColumn(0).setMaxWidth(2);
            jTableTabela.getColumnModel().getColumn(1).setMinWidth(220);
            jTableTabela.getColumnModel().getColumn(1).setMaxWidth(220);
            jTableTabela.getColumnModel().getColumn(2).setMinWidth(100);
            jTableTabela.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableTabela.getColumnModel().getColumn(3).setMinWidth(50);
            jTableTabela.getColumnModel().getColumn(3).setMaxWidth(50);
            jTableTabela.getColumnModel().getColumn(4).setMinWidth(150);
            jTableTabela.getColumnModel().getColumn(4).setMaxWidth(150);
            jTableTabela.getColumnModel().getColumn(5).setMinWidth(100);
            jTableTabela.getColumnModel().getColumn(5).setMaxWidth(100);
            jTableTabela.getColumnModel().getColumn(6).setMinWidth(100);
            jTableTabela.getColumnModel().getColumn(6).setMaxWidth(100);
            jTableTabela.getColumnModel().getColumn(7).setMinWidth(70);
            jTableTabela.getColumnModel().getColumn(7).setMaxWidth(70);
        }

        getContentPane().add(jScrollPaneTabela);
        jScrollPaneTabela.setBounds(-7, 230, 1060, 440);

        jLabelFundoAgenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelFundoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/fundoAgenda.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoAgenda);
        jLabelFundoAgenda.setBounds(0, 0, 1056, 683);

        jMenuBloquear.setText("Bloquear");

        jMenuItemBloquear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/bloquear.png"))); // NOI18N
        jMenuItemBloquear.setText("Bloquear");
        jMenuItemBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBloquearActionPerformed(evt);
            }
        });
        jMenuBloquear.add(jMenuItemBloquear);

        jMenuBar.add(jMenuBloquear);

        jMenuOpcoes.setText("Opções");

        jMenuItemAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cliente.png"))); // NOI18N
        jMenuItemAgendar.setText("Agendar Cliente");
        jMenuItemAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendarActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemAgendar);

        jMenuItemAddAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/admin.png"))); // NOI18N
        jMenuItemAddAdm.setText("Adicionar Administrador");
        jMenuItemAddAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddAdmActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemAddAdm);

        jMenuBar.add(jMenuOpcoes);

        jMenu1.setText("Sair");

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/sair.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar.add(jMenu1);

        setJMenuBar(jMenuBar);

        setSize(new java.awt.Dimension(1058, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    private void jMenuItemBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBloquearActionPerformed
        // BLOQUEAR
        if(agendaC.bloquear()){
            dispose();
        }
    }//GEN-LAST:event_jMenuItemBloquearActionPerformed

    private void jMenuItemAddAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddAdmActionPerformed
        // ADICONAR ADMINISTRADOR
        agendaC.confirmID();
    }//GEN-LAST:event_jMenuItemAddAdmActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // SAIR
        agendaC.sair();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTAO ATUALIZAR
        int index = jComboBoxClientes.getSelectedIndex();
        if(index == 0){
            clientesHoje();
        }else{
            todosClientes();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientesActionPerformed
        // CLIENTES
        int index = jComboBoxClientes.getSelectedIndex();
        if(index == 0){
            clientesHoje();
        }else{
            todosClientes();
        }
    }//GEN-LAST:event_jComboBoxClientesActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // APAGAR CLIENTE
        try{
            if(jTableTabela.getSelectedRow() != -2){
                int id_cliente = (int) jTableTabela.getValueAt(jTableTabela.getSelectedRow(), 0);
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo Remover o Cliente?", "AVISO!",JOptionPane.YES_NO_OPTION);
                if(resposta == JOptionPane.YES_OPTION){
                    if(agendaC.removerCliente(id_cliente)){
                        JOptionPane.showMessageDialog(null, "Cliente Removido!");
                        int index = jComboBoxClientes.getSelectedIndex();
                        if(index == 0){
                            clientesHoje();
                        }else{
                            todosClientes();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro! Não foi possível remover.");
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Selecione um Cliente!");
        }
        
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jMenuItemAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendarActionPerformed
        // AGENDAMENTO
       agendaC.agendar();
    }//GEN-LAST:event_jMenuItemAgendarActionPerformed
    public void clientesHoje(){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localdate = LocalDate.now();
        String dia = localdate.format(date);
        
        int c;
        try {
            query = conexao.conexao().prepareStatement("SELECT * FROM clientes WHERE dia=? ORDER BY hora");
            query.setString(1, dia);
            result = query.executeQuery();
            resultMeta = result.getMetaData();
            c = resultMeta.getColumnCount();
            
            DefaultTableModel tabela = (DefaultTableModel) jTableTabela.getModel();
            tabela.setRowCount(0);
            
            while(result.next()){
                Vector vector = new Vector();
                
                for(int i=0; i<=c; i++){
                    vector.add(result.getInt("id_cliente"));
                    vector.add(result.getString("nome"));
                    vector.add(result.getString("telefone"));
                    vector.add(result.getString("idade"));
                    vector.add(result.getString("corte"));
                    vector.add(result.getString("preco"));
                    vector.add(result.getString("dia"));
                    vector.add(result.getString("hora"));
                    vector.add(result.getString("observ"));
                }
                tabela.addRow(vector);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void todosClientes(){
        int c;
        try {
            query = conexao.conexao().prepareStatement("SELECT * FROM clientes ORDER BY dia");
            result = query.executeQuery();
            resultMeta = result.getMetaData();
            c = resultMeta.getColumnCount();
            
            DefaultTableModel tabela = (DefaultTableModel) jTableTabela.getModel();
            tabela.setRowCount(0);
            
            while(result.next()){
                Vector vector = new Vector();
                
                for(int i=0; i<=c; i++){
                    vector.add(result.getInt("id_cliente"));
                    vector.add(result.getString("nome"));
                    vector.add(result.getString("telefone"));
                    vector.add(result.getString("idade"));
                    vector.add(result.getString("corte"));
                    vector.add(result.getString("preco"));
                    vector.add(result.getString("dia"));
                    vector.add(result.getString("hora"));
                    vector.add(result.getString("observ"));
                }
                tabela.addRow(vector);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<String> jComboBoxClientes;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelFreshLook;
    private javax.swing.JLabel jLabelFundoAgenda;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuBloquear;
    private javax.swing.JMenuItem jMenuItemAddAdm;
    private javax.swing.JMenuItem jMenuItemAgendar;
    private javax.swing.JMenuItem jMenuItemBloquear;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTable jTableTabela;
    // End of variables declaration//GEN-END:variables
}
