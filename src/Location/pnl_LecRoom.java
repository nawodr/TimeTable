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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class pnl_LecRoom extends javax.swing.JPanel {

    addLocations addLoc = new addLocations();
    /**
     * Creates new form pnl_LecRoom
     */
    public pnl_LecRoom() throws SQLException {
        initComponents();
        refreshData();
    }

    public void refreshData() throws SQLException{
        lbl_Error.setVisible(false);
        try {
            showYnSList();
            
            DefaultComboBoxModel cmbMdl;
            cmbMdl = new DefaultComboBoxModel(new addLocations().LoadLecturerId().toArray());
            cmb_Id.setModel(cmbMdl);
            cmb_Id.setSelectedItem("");
            
        } catch (Exception e) {
        }
    }
    public void resetForm(){
        cmb_Id.setSelectedItem("");
        txt_Faculty.setText("");
        txt_Building.setText("");
        cmb_Room.setSelectedItem("");
        lbl_Error.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Lecturer = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lbl_Rtype3 = new javax.swing.JLabel();
        lbl_Id3 = new javax.swing.JLabel();
        cmb_Id = new javax.swing.JComboBox<>();
        cmb_Room = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txt_Faculty = new javax.swing.JTextField();
        txt_Building = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        lbl_Error = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_Add = new javax.swing.JButton();
        cus_Update = new javax.swing.JButton();
        cus_delete = new javax.swing.JButton();
        cus_New = new javax.swing.JButton();
        cus_Exit = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1005, 528));

        tbl_Lecturer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecturer Id", "Lecturer Name", "Faculty", "Building", "Room"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Lecturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_LecturerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_Lecturer);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Lecturer Id");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Faculty");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Room");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText(":");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText(":");

        cmb_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_IdActionPerformed(evt);
            }
        });

        cmb_Room.setToolTipText("");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText(":");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Building");

        txt_Faculty.setEditable(false);

        txt_Building.setEditable(false);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Lecturer Name");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText(":");

        txt_Name.setEditable(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText(":");

        lbl_Error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Id3)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)))
                        .addComponent(lbl_Rtype3))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Building, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(cmb_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(lbl_Id3)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Rtype3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txt_Building, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(cmb_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Room For a Lecturer");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setAlignmentY(0.0F);
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_LecturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_LecturerMouseClicked
        DefaultTableModel mdl = (DefaultTableModel) tbl_Lecturer.getModel();

        //set data to text fields when row is selected
        String tblId = mdl.getValueAt(tbl_Lecturer.getSelectedRow(), 0).toString();
        String tblName = mdl.getValueAt(tbl_Lecturer.getSelectedRow(), 1).toString();
        String tblFaculty = mdl.getValueAt(tbl_Lecturer.getSelectedRow(), 2).toString();
        String tblBuilding = mdl.getValueAt(tbl_Lecturer.getSelectedRow(), 3).toString();
        String tblRoom = mdl.getValueAt(tbl_Lecturer.getSelectedRow(), 4).toString();

        //set values to text fields
        cmb_Id.setSelectedItem(tblId);
        txt_Name.setText(tblName);
        txt_Faculty.setText(tblFaculty);
        txt_Building.setText(tblBuilding);
        cmb_Room.setSelectedItem(tblRoom);
    }//GEN-LAST:event_tbl_LecturerMouseClicked

    private void cmb_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_IdActionPerformed
           String lecId =  cmb_Id.getSelectedItem().toString();
            /*
            Show Customers to All Fieled
            */
            try{
                loadLecturerToFields(lecId);
                DefaultComboBoxModel cmbMdl = new DefaultComboBoxModel(new addLocations().LoadRooms().toArray());
                cmb_Room.setModel(cmbMdl);
//                cmb_Room.setSelectedItem("");
            
            
            }catch (Exception e){
                
            }
            
    }//GEN-LAST:event_cmb_IdActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();

        String lecId = cmb_Id.getSelectedItem().toString();
        String query = "Select id FROM lecturer_Location WHERE id = ?";
        String colName = "id";
        
        try {
            if (txt_Name.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Lecturer Id");
            cmb_Id.grabFocus();
        }else if(addLoc.isExist(lecId,query,colName)){
                
                JOptionPane.showMessageDialog(null, "This Tag Already Exist!", "Validation", JOptionPane.ERROR_MESSAGE);
            }else{
                ps = connection.prepareStatement("INSERT INTO lecturer_Location (id,name,faculty,building,room) VALUES (?,?,?,?,?)");
                
                // set db value
                ps.setInt(1, Integer.parseInt(cmb_Id.getSelectedItem().toString()));
                ps.setString(2, txt_Name.getText());
                ps.setString(3, txt_Faculty.getText());
                ps.setString(4, txt_Building.getText());
                ps.setString(5, cmb_Room.getSelectedItem().toString());

                ps.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Location Added Successfully For Lecturer", "Add Location", JOptionPane.INFORMATION_MESSAGE);
                showYnSList();
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_LecRoom.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_AddActionPerformed

    private void cus_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_UpdateActionPerformed
        
        
        try {
            PreparedStatement ps = null;
            Connection connection = DBConnection.getConnection();
            String lecId = cmb_Id.getSelectedItem().toString();
            String query = "Select id FROM lecturer_Location WHERE id = ?";
            String colName = "id";
            if (!addLoc.isExist(lecId,query,colName)) {
                lbl_Error.setVisible(true);
                lbl_Error.setText("Please Select Row you Want To Update");
            } else{
                int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Update", "Update Location",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(res == 0) {
                    ps = connection.prepareStatement("UPDATE lecturer_Location SET name = ?, faculty = ?, building = ?, room = ? WHERE id = ?");

                    // set db value
                    ps.setString(1, txt_Name.getText());
                    ps.setString(2, txt_Faculty.getText());
                    ps.setString(3, txt_Building.getText());
                    ps.setString(4, cmb_Room.getSelectedItem().toString());
                    ps.setInt(5, Integer.parseInt(cmb_Id.getSelectedItem().toString()));

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Location Update Successfully For Lecturer", "Update Location", JOptionPane.INFORMATION_MESSAGE);
                    showYnSList();
                }
            }   
        } catch (SQLException ex) {
            Logger.getLogger(pnl_LecRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cus_UpdateActionPerformed

    private void cus_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_deleteActionPerformed
        
        try {
            String tagId = cmb_Id.getSelectedItem().toString();
            String query = "Select id FROM lecturer_Location WHERE id = ?";
            String colName = "id";
            if (!addLoc.isExist(tagId,query,colName)) {
                lbl_Error.setVisible(true);
                lbl_Error.setText("Please Select Row you Want To Delete");
            } else{
                int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Delete", "Delete Location",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(res == 0) {
                    Connection connection = DBConnection.getConnection();
                    PreparedStatement ps = null;

                    
                    ps = connection.prepareStatement("DELETE FROM lecturer_Location WHERE id = ?");
                    ps.setInt(1, Integer.parseInt(cmb_Id.getSelectedItem().toString()));
                    ps.executeUpdate();
                    showYnSList();
                    resetForm();

                    JOptionPane.showMessageDialog(null, "Location Deleted successfully!", "Delete Location", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException ex) {
           Logger.getLogger(pnl_LecRoom.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> cmb_Id;
    private javax.swing.JComboBox<String> cmb_Room;
    private javax.swing.JButton cus_Exit;
    private javax.swing.JButton cus_New;
    private javax.swing.JButton cus_Update;
    private javax.swing.JButton cus_delete;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JLabel lbl_Id3;
    private javax.swing.JLabel lbl_Rtype3;
    private javax.swing.JTable tbl_Lecturer;
    private javax.swing.JTextField txt_Building;
    private javax.swing.JTextField txt_Faculty;
    private javax.swing.JTextField txt_Name;
    // End of variables declaration//GEN-END:variables

    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("id", "String");
        hm.put("name", "String");
        hm.put("faculty", "String");
        hm.put("building", "String");
        hm.put("room", "String");

        new LoadTable(tbl_Lecturer, "SELECT * FROM lecturer_Location", hm);
    }
    
    /*
    * load session Details to All Fieled             
     */
                
    public void loadLecturerToFields(String id) throws SQLException{
        
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = connection.prepareStatement("SELECT id,empname,faculty,building FROM Lecture WHERE id = ?");

            //excuite sql
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                // get db value
                txt_Name.setText(rs.getString("empname"));
                txt_Faculty.setText(rs.getString("faculty"));
                txt_Building.setText(rs.getString("building"));
                
            }
        } catch (SQLException ex) {
                throw ex;
        }
    }

}
