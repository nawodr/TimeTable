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
import javax.swing.table.DefaultTableModel;
import student.util.LoadTable;

/**
 *
 * @author Nawod
 */
public class pnl_SubjectRoom extends javax.swing.JPanel {

    addLocations addLoc = new addLocations();

    /**
     * Creates new form pnl_SubjectRoom
     */
    public pnl_SubjectRoom() throws SQLException {
        initComponents();
        refreshData();
    }

    public void resetForm() {
        cmb_ModuleCode.setSelectedItem("");
        txt_Name.setText("");
        txt_Year.setText("");
        txt_Sem.setText("");
        cmb_Room.setSelectedItem("");
        lbl_Error.setVisible(false);
    }

    public void refreshData() throws SQLException {
        lbl_Error.setVisible(false);
        try {
            showYnSList();

            DefaultComboBoxModel cmbMdl = new DefaultComboBoxModel(new addLocations().LoadModuleCode().toArray());
            cmb_ModuleCode.setModel(cmbMdl);
            cmb_ModuleCode.setSelectedItem("");

            DefaultComboBoxModel cmbMdl1 = new DefaultComboBoxModel(new addLocations().LoadRooms().toArray());
            cmb_Room.setModel(cmbMdl1);
            cmb_Room.setSelectedItem("");

        } catch (Exception e) {
            Logger.getLogger(pnl_SubjectRoom.class.getName()).log(Level.SEVERE, null, e);
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

        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Subject = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lbl_Error = new javax.swing.JLabel();
        lbl_Rtype3 = new javax.swing.JLabel();
        lbl_Id3 = new javax.swing.JLabel();
        cmb_ModuleCode = new javax.swing.JComboBox<>();
        cmb_Room = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txt_Sem = new javax.swing.JTextField();
        txt_Year = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_Add = new javax.swing.JButton();
        cus_Update1 = new javax.swing.JButton();
        cus_delete1 = new javax.swing.JButton();
        cus_New1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1005, 528));

        tbl_Subject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Module Code", "Module Name", "Offered Year", "Offered Semester", "Rooms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tbl_Subject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SubjectMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_Subject);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Module Code");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Semester");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Room");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText(":");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText(":");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText(":");

        lbl_Error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cmb_ModuleCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ModuleCodeActionPerformed(evt);
            }
        });

        cmb_Room.setToolTipText("");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Offered Year");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText(":");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText(":");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Module Name");

        txt_Sem.setEditable(false);

        txt_Year.setEditable(false);

        txt_Name.setEditable(false);

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
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Sem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmb_ModuleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(320, 320, 320)
                                .addComponent(lbl_Id3)
                                .addGap(107, 107, 107)
                                .addComponent(lbl_Rtype3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(cmb_ModuleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(lbl_Id3)
                        .addGap(27, 27, 27)))
                .addComponent(lbl_Rtype3)
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txt_Sem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(cmb_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Room For Session ");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setAlignmentY(0.0F);
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setPreferredSize(new java.awt.Dimension(1005, 60));

        btn_Add.setBackground(new java.awt.Color(187, 51, 51));
        btn_Add.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btn_Add.setText("Submit");
        btn_Add.setAlignmentY(0.0F);
        btn_Add.setPreferredSize(new java.awt.Dimension(73, 23));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        cus_Update1.setBackground(new java.awt.Color(187, 51, 51));
        cus_Update1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_Update1.setText("Update");
        cus_Update1.setAlignmentY(0.0F);
        cus_Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_Update1ActionPerformed(evt);
            }
        });

        cus_delete1.setBackground(new java.awt.Color(187, 51, 51));
        cus_delete1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_delete1.setText("Delete");
        cus_delete1.setAlignmentY(0.0F);
        cus_delete1.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_delete1ActionPerformed(evt);
            }
        });

        cus_New1.setBackground(new java.awt.Color(187, 51, 51));
        cus_New1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_New1.setText("Reset");
        cus_New1.setAlignmentY(0.0F);
        cus_New1.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_New1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_New1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cus_Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cus_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cus_New1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_New1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_SubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SubjectMouseClicked
        //set data to text fields
        DefaultTableModel mdl = (DefaultTableModel) tbl_Subject.getModel();

        //set data to text fields when row is selected
        String tblmCode = mdl.getValueAt(tbl_Subject.getSelectedRow(), 0).toString();
        String tblmName = mdl.getValueAt(tbl_Subject.getSelectedRow(), 1).toString();
        String tblyear = mdl.getValueAt(tbl_Subject.getSelectedRow(), 2).toString();
        String tblsem = mdl.getValueAt(tbl_Subject.getSelectedRow(), 3).toString();
        String tblRoom = mdl.getValueAt(tbl_Subject.getSelectedRow(), 4).toString();

        //set values to text fields
        cmb_ModuleCode.setSelectedItem(tblmCode);
        txt_Name.setText(tblmName);
        txt_Year.setText(tblyear);
        txt_Year.setText(tblsem);
        cmb_Room.setSelectedItem(tblRoom);
    }//GEN-LAST:event_tbl_SubjectMouseClicked

    private void cmb_ModuleCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ModuleCodeActionPerformed
        String moduleCode = cmb_ModuleCode.getSelectedItem().toString();

        try {
            loadModuleToFields(moduleCode);
        } catch (SQLException ex) {
            Logger.getLogger(pnl_SubjectRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmb_ModuleCodeActionPerformed

    private void cus_New1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_New1ActionPerformed
        resetForm();
    }//GEN-LAST:event_cus_New1ActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();

        String moduleId = cmb_ModuleCode.getSelectedItem().toString();
        String query = "Select code FROM module_Location WHERE code = ?";
        String colName = "code";
        try {
            if (txt_Name.getText().isEmpty()) {
                lbl_Error.setVisible(true);
                lbl_Error.setText("Please Select Module Code");
                cmb_ModuleCode.grabFocus();
            } else if (addLoc.isExist(moduleId, query, colName)) {

                JOptionPane.showMessageDialog(null, "This Module Already Exist!", "Validation", JOptionPane.ERROR_MESSAGE);
            } else {
                ps = connection.prepareStatement("INSERT INTO module_Location (code,name,year,semester,room) VALUES (?,?,?,?,?)");

                // set db value
                ps.setString(1, moduleId);
                ps.setString(2, txt_Name.getText());
                ps.setString(3, txt_Year.getText());
                ps.setString(4, txt_Sem.getText());
                ps.setString(5, cmb_Room.getSelectedItem().toString());

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Location Added Successfully For Module", "Add Location", JOptionPane.INFORMATION_MESSAGE);
                showYnSList();
                resetForm();
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_SubjectRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void cus_Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_Update1ActionPerformed

        try {
            PreparedStatement ps = null;
            Connection connection = DBConnection.getConnection();
            String moduleCode = cmb_ModuleCode.getSelectedItem().toString();
            String query = "Select code FROM module_Location WHERE code = ?";
            String colName = "code";
            if (!addLoc.isExist(moduleCode, query, colName)) {
                lbl_Error.setVisible(true);
                lbl_Error.setText("Please Select Row you Want To Update");
            } else {
                int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Update", "Update Location", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (res == 0) {

                    ps = connection.prepareStatement("UPDATE module_Location SET name = ?, year = ?, semester = ?, room = ? WHERE code = ?");

                    // set db value
                    ps.setString(1, txt_Name.getText());
                    ps.setString(2, txt_Year.getText());
                    ps.setString(3, txt_Sem.getText());
                    ps.setString(4, cmb_Room.getSelectedItem().toString());
                    ps.setString(5, moduleCode);

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Location Update Successfully For Module", "Add Location", JOptionPane.INFORMATION_MESSAGE);
                    showYnSList();
                    resetForm();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_SubjectRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cus_Update1ActionPerformed

    private void cus_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_delete1ActionPerformed

        try {
            String moduleCode = cmb_ModuleCode.getSelectedItem().toString();
            String query = "Select code FROM module_Location WHERE code = ?";
            String colName = "code";

            if (!addLoc.isExist(moduleCode, query, colName)) {
                lbl_Error.setVisible(true);
                lbl_Error.setText("Please Select Row you Want To Delete");
            } else {
                int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Delete", "Delete Location", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (res == 0) {
                    Connection connection = DBConnection.getConnection();
                    PreparedStatement ps = null;

                    ps = connection.prepareStatement("DELETE FROM module_Location WHERE code = ?");
                    ps.setString(1, moduleCode);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Location Deleted successfully!", "Delete Location", JOptionPane.INFORMATION_MESSAGE);
                    showYnSList();
                    resetForm();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_SubjectRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cus_delete1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JComboBox<String> cmb_ModuleCode;
    private javax.swing.JComboBox<String> cmb_Room;
    private javax.swing.JButton cus_New1;
    private javax.swing.JButton cus_Update1;
    private javax.swing.JButton cus_delete1;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JLabel lbl_Id3;
    private javax.swing.JLabel lbl_Rtype3;
    private javax.swing.JTable tbl_Subject;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Sem;
    private javax.swing.JTextField txt_Year;
    // End of variables declaration//GEN-END:variables

    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("code", "String");
        hm.put("name", "String");
        hm.put("year", "String");
        hm.put("semester", "String");
        hm.put("room", "String");

        new LoadTable(tbl_Subject, "SELECT * FROM module_Location", hm);
    }

    /*
    * load session Details to All Fieled             
     */
    public void loadModuleToFields(String code) throws SQLException {

        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement("SELECT mname,offeredyear,offeredsem FROM Module WHERE mcode = ?");

            //excuite sql
            ps.setString(1, code);
            rs = ps.executeQuery();

            while (rs.next()) {
                // get db value
                txt_Name.setText(rs.getString("mname"));
                txt_Year.setText(rs.getString("offeredyear"));
                txt_Sem.setText(rs.getString("offeredsem"));

            }
        } catch (SQLException ex) {
            throw ex;
        }
    }
}
