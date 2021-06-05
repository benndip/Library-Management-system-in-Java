/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IssueBook;

import LibarianSection.LibarianSection;
import com.mycompany.librarymanagement.DatabaseConnection;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author benndip
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    DatabaseConnection conn;
    public IssueBook() {
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

        issueBookBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        bookCallNo = new javax.swing.JTextField();
        studentId = new javax.swing.JTextField();
        studentName = new javax.swing.JTextField();
        studentContact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        issueBookBtn.setBackground(new java.awt.Color(141, 1, 254));
        issueBookBtn.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        issueBookBtn.setForeground(new java.awt.Color(254, 254, 254));
        issueBookBtn.setText("Issue Book");
        issueBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(issueBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 210, 60));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, -1));
        getContentPane().add(bookCallNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 170, -1));
        getContentPane().add(studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 170, -1));
        getContentPane().add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 170, -1));
        getContentPane().add(studentContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/benndip/NetBeansProjects/LibraryManagement/src/main/java/IssueBook/IssueBook_background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void issueBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookBtnActionPerformed
        // TODO add your handling code here:
        int booknallno = Integer.parseInt(bookCallNo.getText());
        int studentid = parseInt(studentId.getText());
        String studentname = studentName.getText();
        String studentcontact = studentContact.getText();
        Date currentDate = Date.valueOf(LocalDate.now());
        if(studentname.isEmpty()|| studentcontact.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            issueBoook(booknallno, studentid, studentname, studentcontact, currentDate);
        }
    }//GEN-LAST:event_issueBookBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bookCallNo;
    private javax.swing.JButton issueBookBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField studentContact;
    private javax.swing.JTextField studentId;
    private javax.swing.JTextField studentName;
    // End of variables declaration//GEN-END:variables
    
    private void issueBoook(Integer bookcallno, int studentid,String studentname, String studentcontact, Date currentDate ){
         Connection dbconn = conn.dbConnection();
        if(dbconn != null){
            try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO issued_books (book_call_no,student_id,student_name,student_contact,issueddate) VALUES (?,?,?,?,?);");
            st.setInt(1, bookcallno);
            st.setInt(2, studentid);
            st.setString(3, studentname);
            st.setString(4, studentcontact);
            st.setDate(5, currentDate);
                int res = st.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(this, "Book with id: " + bookcallno + " issued successfully to " + studentname + " !");
                bookCallNo.setText(null);
                studentContact.setText(null);
                studentId.setText(null);
                studentName.setText(null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("no connection");
        }
    }
}
