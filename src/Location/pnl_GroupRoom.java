/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import DB.DBConnection;
import java.awt.Component;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import student.util.LoadTable;

/**
 *
 * @author Nawod
 */
public class pnl_GroupRoom extends javax.swing.JPanel {

    addLocations addLoc = new addLocations();
    /**
     * Creates new form pnl_GroupRoom
     */
    public pnl_GroupRoom() throws SQLException {
        initComponents();
        refreshData();
    }
    
    public void refreshData() throws SQLException{
        try {
            showYnSList();
            
            DefaultComboBoxModel cmbMdl;
            cmbMdl = new DefaultComboBoxModel(new addLocations().LoadGroupId().toArray());
            cmb_GrpId.setModel(cmbMdl);
            cmb_GrpId.setSelectedItem("");
            
            DefaultComboBoxModel cmbMdl1 = new DefaultComboBoxModel(new addLocations().LoadRooms().toArray());
            cmb_Room.setModel(cmbMdl1);
            cmb_Room.setSelectedItem("");
            
        } catch (Exception e) {
        }
    }
    
    public void resetForm(){
        cmb_GrpId.setSelectedItem("");
        cmb_Room.setSelectedItem("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lbl_Rtype3 = new javax.swing.JLabel();
        lbl_Id3 = new javax.swing.JLabel();
        cmb_Room = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cmb_GrpId = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_GrpLocation = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btn_Add = new javax.swing.JButton();
        cus_Update = new javax.swing.JButton();
        cus_delete = new javax.swing.JButton();
        cus_New = new javax.swing.JButton();
        cus_Exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1005, 528));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Room");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText(":");

        cmb_Room.setToolTipText("");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Group Id");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText(":");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(371, 371, 371)
                                .addComponent(lbl_Id3)
                                .addGap(107, 107, 107)
                                .addComponent(lbl_Rtype3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_GrpId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_Id3)
                .addGap(27, 27, 27)
                .addComponent(lbl_Rtype3)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(cmb_GrpId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(cmb_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tbl_GrpLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Group Id", "Room"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_GrpLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_GrpLocationMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_GrpLocation);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setAlignmentY(0.0F);
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setPreferredSize(new java.awt.Dimension(1005, 60));

        btn_Add.setBackground(new java.awt.Color(187, 51, 51));
        btn_Add.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btn_Add.setText("Add");
        btn_Add.setAlignmentY(0.0F);
        btn_Add.setPreferredSize(new java.awt.Dimension(73, 23));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        cus_Update.setBackground(new java.awt.Color(187, 51, 51));
        cus_Update.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_Update.setText("Update");
        cus_Update.setAlignmentY(0.0F);
        cus_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_UpdateActionPerformed(evt);
            }
        });

        cus_delete.setBackground(new java.awt.Color(187, 51, 51));
        cus_delete.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_delete.setText("Delete");
        cus_delete.setAlignmentY(0.0F);
        cus_delete.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_deleteActionPerformed(evt);
            }
        });

        cus_New.setBackground(new java.awt.Color(187, 51, 51));
        cus_New.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_New.setText("New");
        cus_New.setAlignmentY(0.0F);
        cus_New.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_NewActionPerformed(evt);
            }
        });

        cus_Exit.setBackground(new java.awt.Color(187, 51, 51));
        cus_Exit.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_Exit.setText("Exit");
        cus_Exit.setAlignmentY(0.0F);
        cus_Exit.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cus_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cus_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cus_New, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cus_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_New, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Room For a Group");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_GrpLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_GrpLocationMouseClicked
        DefaultTableModel mdl = (DefaultTableModel) tbl_GrpLocation.getModel();

        //set data to text fields when row is selected
        String tblId = mdl.getValueAt(tbl_GrpLocation.getSelectedRow(), 0).toString();
        String tblRoom = mdl.getValueAt(tbl_GrpLocation.getSelectedRow(), 1).toString();

        //set values to text fields
        cmb_GrpId.setSelectedItem(tblId);
        cmb_Room.setSelectedItem(tblRoom);
    }//GEN-LAST:event_tbl_GrpLocationMouseClicked

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();

        String GrpId = cmb_GrpId.getSelectedItem().toString();
        String query = "Select group_Id FROM group_Location WHERE group_Id = ?";
        String colName = "group_Id";
        
        try {
            if(addLoc.isExist(GrpId,query,colName)){
                
                JOptionPane.showMessageDialog(null, "This Tag Already Exist!", "Validation", JOptionPane.ERROR_MESSAGE);
            }else{
                ps = connection.prepareStatement("INSERT INTO group_Location (group_Id,room) VALUES (?,?)");
                
                // set db value
                ps.setString(1, cmb_GrpId.getSelectedItem().toString());
                ps.setString(2, cmb_Room.getSelectedItem().toString());

                ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Location Added Successfully For group", "Add Location", JOptionPane.INFORMATION_MESSAGE);
            showYnSList();
            }
            } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void cus_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_UpdateActionPerformed
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();
        String GrpId = cmb_GrpId.getSelectedItem().toString();
        
        int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Update", "Update Location",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(res == 0) {
        
        try {
            
                ps = connection.prepareStatement("UPDATE group_Location SET room = ? WHERE group_Id = ?");
                
                // set db value
                ps.setString(1, cmb_Room.getSelectedItem().toString());
                ps.setString(2, GrpId);

                ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Location Update Successfully For Group", "Add Location", JOptionPane.INFORMATION_MESSAGE);
            showYnSList();
            
            
        } catch (SQLException ex) {
            
        }
        }
    }//GEN-LAST:event_cus_UpdateActionPerformed

    private void cus_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_deleteActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Delete", "Delete Location",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(res == 0) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
            String GrpId = cmb_GrpId.getSelectedItem().toString();
        
        try {
            ps = connection.prepareStatement("DELETE FROM group_Location WHERE group_Id = ?");
            ps.setString(1, GrpId);
            ps.executeUpdate();
            showYnSList();
            resetForm();
            JOptionPane.showMessageDialog(null, "Location Deleted successfully!", "Delete Location", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (SQLException ex) {
           
        }  
        }
    }//GEN-LAST:event_cus_deleteActionPerformed

    private void cus_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_NewActionPerformed
        resetForm();
    }//GEN-LAST:event_cus_NewActionPerformed

    private void cus_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_ExitActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Exit", "Exit",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(res == 0) {
            Component comp = SwingUtilities.getRoot(this);
            ((Window) comp).dispose();
        }
    }//GEN-LAST:event_cus_ExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JComboBox<String> cmb_GrpId;
    private javax.swing.JComboBox<String> cmb_Room;
    private javax.swing.JButton cus_Exit;
    private javax.swing.JButton cus_New;
    private javax.swing.JButton cus_Update;
    private javax.swing.JButton cus_delete;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Id3;
    private javax.swing.JLabel lbl_Rtype3;
    private javax.swing.JTable tbl_GrpLocation;
    // End of variables declaration//GEN-END:variables

    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("group_Id", "String");
        hm.put("room", "String");

        new LoadTable(tbl_GrpLocation, "SELECT * FROM group_Location", hm);
    }


}
