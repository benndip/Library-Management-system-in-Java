/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddLibarian;

import com.mycompany.librarymanagement.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author benndip
 */
public class AddLibarian extends javax.swing.JFrame {

    /**
     * Creates new form AddLibarian
     */
    DatabaseConnection conn;
    public AddLibarian() {
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

        email = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        addLibarianBtn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 240, 40));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 240, 40));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 240, 40));
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 240, 40));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 240, 40));

        addLibarianBtn.setBackground(new java.awt.Color(181, 0, 255));
        addLibarianBtn.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        addLibarianBtn.setForeground(new java.awt.Color(254, 254, 254));
        addLibarianBtn.setText("ADD");
        addLibarianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLibarianBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addLibarianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 240, 60));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/benndip/NetBeansProjects/LibraryManagement/src/main/java/AddLibarian/AddLibarian_background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void addLibarianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLibarianBtnActionPerformed
        // TODO add your handling code here:
        String lname = name.getText();
        String lpassword = String.valueOf(password.getPassword());
	String lemail = email.getText();
	String lcity = city.getText();
	String laddress = address.getText();
        String lcontact = contact.getText();
        
	int status = addlibrarian(lname, lpassword, laddress, lemail, lcity, lcontact);
        
	if(status>0){
            JOptionPane.showMessageDialog(this,"Librarian added successfully!");
            name.setText(null);
            password.setText(null);
            email.setText(null);
            city.setText(null);
            address.setText(null);
            contact.setText(null);
	}else{
            JOptionPane.showMessageDialog(this,"Sorry, unable to add librarian!");
	}        
    }//GEN-LAST:event_addLibarianBtnActionPerformed

     public int addlibrarian(String name,String password,String email,String address,String city, String contact){
	int status=0;
	try{
		Connection dbconn = conn.dbConnection();
		PreparedStatement ps = dbconn.prepareStatement("insert into libarians (name, password, email, address, city, contact) values(?,?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.setString(4,address);
		ps.setString(5,city);
                ps.setString(6,contact);
		status = ps.executeUpdate();
		dbconn.close();
	}catch(Exception e){System.out.println(e);}
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
            java.util.logging.Logger.getLogger(AddLibarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLibarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLibarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLibarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLibarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLibarianBtn;
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField city;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
