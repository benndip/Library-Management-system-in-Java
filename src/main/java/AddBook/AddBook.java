/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddBook;

import com.mycompany.librarymanagement.DatabaseConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author benndip
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    DatabaseConnection conn;
    public AddBook() {
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

        callno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(callno, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 200, 50));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 200, 50));
        getContentPane().add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 200, 50));
        getContentPane().add(publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 200, 50));
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 200, 50));

        addBtn.setBackground(new java.awt.Color(185, 1, 254));
        addBtn.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(254, 254, 254));
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 140, 50));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/benndip/NetBeansProjects/LibraryManagement/src/main/java/AddBook/AddBook_background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        int bcallno = Integer.parseInt(callno.getText());
        String bname = name.getText();
        String bauthor = author.getText();
        String bpublisher = publisher.getText();
        int bquantity = Integer.parseInt(quantity.getText());
        Date currentDate = Date.valueOf(LocalDate.now());
        
        int status = addbooks(bcallno, bname, bauthor, bpublisher, bquantity, currentDate);
        
        if(status>0){
            JOptionPane.showMessageDialog(this, "Book added successfully!");
            callno.setText(null);
            name.setText(null);
            author.setText(null);
            publisher.setText(null);
            quantity.setText(null);
	}else{
            JOptionPane.showMessageDialog(this,"Sorry, unable to add books!");
	}        
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    
     public int addbooks(Integer callno, String name, String author, String publisher, Integer quantity, Date currentDate){
        int status = 0;
        try {
            Connection dbconn = conn.dbConnection();
            PreparedStatement ps = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO books (callno, name, author, publisher, quantity, added_date) values (?,?,?,?,?,?)");
            ps.setInt(1, callno);
            ps.setString(2, name);
            ps.setString(3, author);
            ps.setString(4, publisher);
            ps.setInt(5, quantity);
            ps.setDate(6, currentDate);
            
            status = ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.toString());
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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField author;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField callno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField publisher;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
