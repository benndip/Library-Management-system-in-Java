/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SplashScreen;

import LibraryManagement.LibraryManagement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author benndip
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
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

        Background = new javax.swing.JPanel();
        loadingBar = new javax.swing.JProgressBar();
        loadingValue = new javax.swing.JLabel();
        loadingState = new javax.swing.JLabel();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);

        Background.setBackground(new java.awt.Color(170, 186, 187));
        Background.setAlignmentX(400.0F);
        Background.setAlignmentY(400.0F);
        Background.setMinimumSize(new java.awt.Dimension(1000, 900));
        Background.setPreferredSize(new java.awt.Dimension(900, 500));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Background.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 473, 400, 10));

        loadingValue.setForeground(new java.awt.Color(254, 254, 254));
        loadingValue.setText("0 %");
        Background.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, -1, -1));

        loadingState.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        loadingState.setForeground(new java.awt.Color(254, 254, 254));
        loadingState.setText("Loading ...");
        Background.add(loadingState, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 210, 30));

        background_image.setIcon(new javax.swing.ImageIcon("/home/benndip/Downloads/Background_image.png")); // NOI18N
        background_image.setText("jLabel1");
        background_image.setPreferredSize(new java.awt.Dimension(900, 500));
        Background.add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new SplashScreen().setVisible(true);
            }
        });
        
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        
        try {
            for(int i = 0; i<=100; i++){
                Thread.sleep(200);
                sp.loadingValue.setText(i +"%");
                if(i==10){
                    sp.loadingState.setText("Turning on Modules...");
                }
                 if(i==20){
                    sp.loadingState.setText("Loading on Modules...");
                }
                 if(i==50){
                    sp.loadingState.setText("Connecting to Database...");
                }
                 if(i==70){
                    sp.loadingState.setText("Connection successful !");
                }
                 if(i==70){
                    sp.loadingState.setText("Connection successful !");
                }
                 if(i==80){
                    sp.loadingState.setText("Launching Application");
                }
                 if(i==100){
                     LibraryManagement libraryManangement = new LibraryManagement();
                     libraryManangement.setVisible(true);
                     libraryManangement.pack();
                     libraryManangement.setLocationRelativeTo(null);
                     libraryManangement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     sp.setVisible(false);
                     sp.dispose();
                 }
                 
                 sp.loadingBar.setValue(i);
                 sp.loadingBar.setVisible(true);
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel background_image;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingState;
    private javax.swing.JLabel loadingValue;
    // End of variables declaration//GEN-END:variables
}
