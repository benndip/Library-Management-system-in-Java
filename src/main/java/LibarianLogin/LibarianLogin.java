/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibarianLogin;

import LibarianSection.LibarianSection;
import com.mycompany.librarymanagement.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author benndip
 */
public class LibarianLogin extends javax.swing.JFrame {

    /**
     * Creates new form LibarianLogin
     */
    DatabaseConnection conn;
    public LibarianLogin() {
        initComponents();
         conn = new DatabaseConnection();
        if(conn == null){
            JOptionPane.showMessageDialog(this, "Database Not available", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 190, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 190, -1));

        loginBtn.setBackground(new java.awt.Color(125, 6, 245));
        loginBtn.setFont(new java.awt.Font("Ubuntu", 3, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 250, 250));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 140, 40));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/benndip/NetBeansProjects/LibraryManagement/src/main/java/LibarianLogin/LibarianLogin_background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String libarianName = name.getText();
        String libarianPassword = password.getText();
        if(libarianName.isEmpty() || libarianPassword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in both Name and Password", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            libarianLogin(libarianName, libarianPassword);
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LibarianLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibarianLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibarianLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibarianLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibarianLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
    
    private void libarianLogin(String libarianName, String libarianPassword){
        Connection dbconn = conn.dbConnection();
        if(dbconn != null){
            try{
                PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("SELECT * FROM libarians WHERE name=? AND password =?;");
            st.setString(1, libarianName);
            st.setString(2, libarianPassword);
            ResultSet res = st.executeQuery();
                if(res.next()){
                this.dispose();
                LibarianSection libarianSection = new LibarianSection();
                libarianSection.setVisible(true);
                libarianSection.pack();
                libarianSection.setLocationRelativeTo(null);
                libarianSection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            } catch (SQLException ex){
                Logger.getLogger(LibarianLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("no connection");
        }
    }
}
