/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibarianSection;

/**
 *
 * @author benndip
 */
public class LibarianSection extends javax.swing.JFrame {

    /**
     * Creates new form LibarianSection
     */
    public LibarianSection() {
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

        addBookBtn = new javax.swing.JButton();
        viewBookBtn = new javax.swing.JButton();
        issueBookBtn = new javax.swing.JButton();
        viewIssuedBooksBtn = new javax.swing.JButton();
        returnBookBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBookBtn.setText("Add Book");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 180, 40));

        viewBookBtn.setText("View Books");
        getContentPane().add(viewBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 180, 40));

        issueBookBtn.setText("Issue Book");
        getContentPane().add(issueBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 180, 40));

        viewIssuedBooksBtn.setText("View Issued Books");
        viewIssuedBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIssuedBooksBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewIssuedBooksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 180, 40));

        returnBookBtn.setText("Return Book");
        getContentPane().add(returnBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 180, 40));

        logoutBtn.setText("Logout");
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 180, 40));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jLabel2.setText("Libarian Section");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 290, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/benndip/NetBeansProjects/LibraryManagement/src/main/java/LibraryManagement/LibraryManagement_background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void viewIssuedBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIssuedBooksBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewIssuedBooksBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LibarianSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibarianSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibarianSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibarianSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibarianSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookBtn;
    private javax.swing.JButton issueBookBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton returnBookBtn;
    private javax.swing.JButton viewBookBtn;
    private javax.swing.JButton viewIssuedBooksBtn;
    // End of variables declaration//GEN-END:variables
}
