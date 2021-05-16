/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import java.awt.Component;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Window;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import main_menu.MainFrame;
import student.view.TagDetails;
import student.view.pnl_Student;
import static student.view.pnl_Student.jLayeredPane1;
import static student.view.pnl_Student.setpanels;

/**
 *
 * @author Nawod
 */
public final class pnl_Location extends javax.swing.JPanel {

    
    addLocations addLoc = new addLocations();
    MainFrame mainFrame;

    /**
     * Creates new form pnl_Location
     */
    public pnl_Location() throws SQLException {
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

        buttonGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tBtn_Building = new javax.swing.JToggleButton();
        tBtn_Room = new javax.swing.JToggleButton();
        LpanelBody1 = new javax.swing.JLayeredPane();

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        tBtn_Building.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tBtn_Building.setText("Add Building Details");
        tBtn_Building.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tBtn_Building.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBtn_BuildingActionPerformed(evt);
            }
        });

        tBtn_Room.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tBtn_Room.setText("Add Room For a Building");
        tBtn_Room.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tBtn_Room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBtn_RoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tBtn_Building, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(tBtn_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBtn_Building, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tBtn_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout LpanelBody1Layout = new javax.swing.GroupLayout(LpanelBody1);
        LpanelBody1.setLayout(LpanelBody1Layout);
        LpanelBody1Layout.setHorizontalGroup(
            LpanelBody1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LpanelBody1Layout.setVerticalGroup(
            LpanelBody1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LpanelBody1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LpanelBody1))
        );

        jTabbedPane1.addTab("Buildings & Rooms", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    pnl_TagRoom tagR;    pnl_SubjectRoom subR;    pnl_LecRoom lecR;    pnl_SessionRoom sr;
    pnl_GroupRoom grpR;
    pnl_AddBuilding bulding;
    private void tBtn_BuildingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBtn_BuildingActionPerformed
        if (bulding == null) {
            try {
                bulding = new pnl_AddBuilding();
            } catch (SQLException ex) {
                Logger.getLogger(pnl_AddBuilding.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
            setpanels2(bulding);
    }//GEN-LAST:event_tBtn_BuildingActionPerformed

    pnl_AddRoom room;
    private void tBtn_RoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBtn_RoomActionPerformed
        if (room == null) {
            try {
                room = new pnl_AddRoom();
            } catch (SQLException ex) {
                Logger.getLogger(pnl_AddRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
            setpanels2(room);
    }//GEN-LAST:event_tBtn_RoomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLayeredPane LpanelBody1;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton tBtn_Building;
    private javax.swing.JToggleButton tBtn_Room;
    // End of variables declaration//GEN-END:variables

   
    public static void setpanels2(JPanel panel) {
        LpanelBody1.removeAll();
        panel.setSize(LpanelBody1.getSize());
        LpanelBody1.add(panel);
        panel.setVisible(true);
        LpanelBody1.moveToFront(panel);
    }
}
