/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import org.jvnet.substance.SubstanceDefaultLookAndFeel;
import org.jvnet.substance.button.StandardButtonShaper;
import org.jvnet.substance.painter.GradientWaveGradientPainter;
import org.jvnet.substance.skin.BusinessBlueSteelSkin;
import org.jvnet.substance.theme.SubstanceCremeTheme;
import org.jvnet.substance.theme.SubstanceEbonyTheme;
import org.jvnet.substance.theme.SubstanceOrangeTheme;
import org.jvnet.substance.watermark.SubstanceCopperplateEngravingWatermark;
import org.jvnet.substance.watermark.SubstanceMetalWallWatermark;
import org.jvnet.substance.watermark.SubstancePlanktonWatermark;
import org.jvnet.substance.watermark.SubstanceWoodWatermark;

/**
 *
 * @author Tiran Harsha
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
         
        new Thread(new Runnable() {


            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {

                    
                    prg_bar.setValue(i);

                    try {
                        Thread.sleep(50);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

                new main_menu.MainFrame().setVisible(true);
                dispose();
            }//
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        prg_bar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/zz.jpg"))); // NOI18N
        jLabel1.setLabelFor(jLabel1);
        jLabel1.setMaximumSize(new java.awt.Dimension(34, 350));
        jLabel1.setMinimumSize(new java.awt.Dimension(34, 350));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(34, 350));
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        prg_bar.setForeground(new java.awt.Color(204, 0, 0));
        prg_bar.setMaximumSize(new java.awt.Dimension(32767, 10));
        prg_bar.setMinimumSize(new java.awt.Dimension(10, 10));
        prg_bar.setPreferredSize(new java.awt.Dimension(146, 10));
        prg_bar.setStringPainted(true);
        prg_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prg_barMouseClicked(evt);
            }
        });
        jPanel1.add(prg_bar, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(515, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void prg_barMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prg_barMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_prg_barMouseClicked

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SplashScreen sp = new SplashScreen();
                try {
                    LookAndFeel look = new SubstanceDefaultLookAndFeel();
                    UIManager.setLookAndFeel(look);
                    SubstanceDefaultLookAndFeel.setSkin(new BusinessBlueSteelSkin());                
                    SubstanceDefaultLookAndFeel.setCurrentWatermark(new SubstancePlanktonWatermark());
                    SubstanceDefaultLookAndFeel.setCurrentGradientPainter(new GradientWaveGradientPainter());
                    SubstanceDefaultLookAndFeel.setCurrentButtonShaper(new StandardButtonShaper());
                    sp.setDefaultLookAndFeelDecorated(true);
                    sp.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar prg_bar;
    // End of variables declaration//GEN-END:variables

   
}
