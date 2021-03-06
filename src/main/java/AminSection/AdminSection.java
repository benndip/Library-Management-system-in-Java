/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AminSection;

import LibraryManagement.LibraryManagement;
import AddLibarian.AddLibarian;
import DeleteLibarian.DeleteLibarian;
import ViewLibarians.ViewLibarians;
import javax.swing.JFrame;

/**
 *
 * @author benndip
 */
public class AdminSection extends javax.swing.JFrame {

    /**
     * Creates new form AdminSection
     */
    public AdminSection() {
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

        addLibarianBtn = new javax.swing.JButton();
        viewLibarianBtn = new javax.swing.JButton();
        deleteLibarianBtn = new javax.swing.JButton();
        logoutTxt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addLibarianBtn.setText("Add Libarian");
        addLibarianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLibarianBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addLibarianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 240, 50));

        viewLibarianBtn.setText("View Libarian");
        viewLibarianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLibarianBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewLibarianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 240, 50));

        deleteLibarianBtn.setText("Delete Libarian");
        deleteLibarianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLibarianBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteLibarianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 240, 50));

        logoutTxt.setText("Logout");
        logoutTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutTxtActionPerformed(evt);
            }
        });
        getContentPane().add(logoutTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 240, 50));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jLabel2.setText("Admin Section");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/benndip/NetBeansProjects/LibraryManagement/src/main/java/LibraryManagement/LibraryManagement_background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutTxtActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.setVisible(true);
        libraryManagement.pack();
        libraryManagement.setLocationRelativeTo(null);
        libraryManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_logoutTxtActionPerformed

    private void addLibarianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLibarianBtnActionPerformed
        // TODO add your this.setVisible(false);
        AddLibarian addLibarianManagement = new AddLibarian();
        addLibarianManagement.setVisible(true);
        addLibarianManagement.pack();
        addLibarianManagement.setLocationRelativeTo(null);
        addLibarianManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_addLibarianBtnActionPerformed

    private void viewLibarianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLibarianBtnActionPerformed
        // TODO add your handling code here:
        ViewLibarians viewLibarians = new ViewLibarians();
        viewLibarians.setVisible(true);
        viewLibarians.pack();
        viewLibarians.setLocationRelativeTo(null);
        viewLibarians.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_viewLibarianBtnActionPerformed

    private void deleteLibarianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLibarianBtnActionPerformed
        // TODO add your handling code here:
        DeleteLibarian deleteLibarian = new DeleteLibarian();
        deleteLibarian.setVisible(true);
        deleteLibarian.pack();
        deleteLibarian.setLocationRelativeTo(null);
        deleteLibarian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_deleteLibarianBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLibarianBtn;
    private javax.swing.JButton deleteLibarianBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutTxt;
    private javax.swing.JButton viewLibarianBtn;
    // End of variables declaration//GEN-END:variables
}
