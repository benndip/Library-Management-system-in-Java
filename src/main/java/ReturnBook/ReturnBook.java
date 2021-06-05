/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReturnBook;

import com.mycompany.librarymanagement.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author benndip
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBook
     */
    DatabaseConnection conn;
    public ReturnBook() {
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

        checkBookProperlyTxt = new javax.swing.JLabel();
        bookCallNo = new javax.swing.JTextField();
        studentId = new javax.swing.JTextField();
        returnBookBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkBookProperlyTxt.setForeground(new java.awt.Color(255, 0, 0));
        checkBookProperlyTxt.setText("Check Book  Properly !");
        getContentPane().add(checkBookProperlyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, 30));
        getContentPane().add(bookCallNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 210, 50));
        getContentPane().add(studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 210, 50));

        returnBookBtn.setBackground(new java.awt.Color(173, 0, 255));
        returnBookBtn.setForeground(new java.awt.Color(254, 254, 254));
        returnBookBtn.setText("Return Book");
        returnBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 220, 60));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/benndip/NetBeansProjects/LibraryManagement/src/main/java/ReturnBook/ReturnBook_background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookBtnActionPerformed
        // TODO add your handling code here:
          String rbbookcallno = bookCallNo.getText();
        int rbstudentid = Integer.parseInt(studentId.getText());
        
        int status = returnbook(rbbookcallno, rbstudentid);
        if(status>0){
            updatebook(rbbookcallno);
            JOptionPane.showMessageDialog(this, "Book returned sucessfully. Thanks!");
            bookCallNo.setText("");
            studentId.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Not possible cuz this book has been returned already");
            bookCallNo.setText("");
            studentId.setText("");
        }
    }//GEN-LAST:event_returnBookBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    public int returnbook(String bcallno, int studentid){
        int status = 0;    
        try {
            Connection dbconn = conn.dbConnection();
            PreparedStatement ps = dbconn.prepareStatement("delete from issued_books where book_call_no=? and student_id=? ");
            ps.setString(1, bcallno);
            ps.setInt(2, studentid);
            status = ps.executeUpdate();
            updatebook(bcallno);
            System.out.println("delete tried with status" + status);
            dbconn.close();
        } catch (Exception e) {
        }
        return status;
   }
    
   public int updatebook(String bcallno){
        int status = 0;
        int quantity = 0;
        int issued = 0;
        try {
            Connection dbconn = conn.dbConnection();
            PreparedStatement ps = dbconn.prepareStatement("select quantity, issued from books where callno=?");
            ps.setString(1,bcallno);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
		quantity = rs.getInt("quantity");
		issued = rs.getInt("issued");
		}
            if(issued > 0){
                PreparedStatement ps1 = dbconn.prepareStatement("update books set quantity=?, issued=? where callno=? ");
                ps1.setInt(1, quantity++);
                ps1.setInt(2, issued--);
                ps1.setString(3, bcallno);
                status = ps1.executeUpdate();
            }
            
            System.out.println("update tried with status" + status);
            dbconn.close();
        } catch (Exception e) {
        }
        return status;
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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bookCallNo;
    private javax.swing.JLabel checkBookProperlyTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton returnBookBtn;
    private javax.swing.JTextField studentId;
    // End of variables declaration//GEN-END:variables
}
