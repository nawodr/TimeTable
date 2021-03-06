/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture.View;

import DB.DBConnection;
import Lecture.Controller.LectureController;
import Lecture.Model.LectureModel;
import Module.View.pnl_Module;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Charith Madushan
 */
public class pnl_Lecture extends javax.swing.JPanel {
    LectureController lectureController = new LectureController();
    /**
     * Creates new form pnl_Lecture
     * @throws java.sql.SQLException
     */
    public pnl_Lecture() throws SQLException {
       initComponents();
       showLecureList();
       resetForm();
       refreshData();
       
       txt_id.setVisible(false);
       lbl_Error.setVisible(false);
    }
    
    
     public void refreshData(){
        try {
            DefaultTableModel mdl = (DefaultTableModel) tbl_lec.getModel();
            mdl.setRowCount(0);
            showLecureList();
            
            DefaultComboBoxModel cmbMdl1 = new DefaultComboBoxModel(lectureController.LoadBuiling().toArray());
            cmb_buildings.setModel(cmbMdl1);
            cmb_buildings.setSelectedItem("");
        } catch (Exception e) {
        }
    }
     
     public void resetForm() {
        txt_id.setText("");
        txt_EmpId.setText("");
        txt_EmpName.setText("");
        cmb_Faculty.setSelectedItem("");
        cmb_Department.setSelectedItem("");
        cmb_center.setSelectedItem("");
        cmb_buildings.setSelectedItem("");
        cmb_le.setSelectedItem("");
        txt_rank.setText("");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_lec = new javax.swing.JTable();
        lbl_Error = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmb_Faculty = new javax.swing.JComboBox<>();
        txt_EmpId = new javax.swing.JTextField();
        txt_rank = new javax.swing.JTextField();
        cmb_Department = new javax.swing.JComboBox<>();
        txt_id = new javax.swing.JLabel();
        cmb_Building = new javax.swing.JLabel();
        cmb_Center = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        cmb_level = new javax.swing.JLabel();
        txt_Rank = new javax.swing.JLabel();
        cmb_center = new javax.swing.JComboBox<>();
        cmb_buildings = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_le = new javax.swing.JComboBox<>();
        txt_EmpName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_Submit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADD A New Lecture");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbl_lec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Employee Id", "Employee Name", "Faculty", "Department", "Center", "Building", "Level", "Rank"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_lec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_lecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_lec);

        lbl_Error.setBackground(new java.awt.Color(255, 51, 51));
        lbl_Error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Error.setForeground(new java.awt.Color(255, 51, 51));
        lbl_Error.setText("jLabel5");

        cmb_Faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Faculty", "Computing", "Engineering", "Business", "Human & Science" }));
        cmb_Faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_FacultyActionPerformed(evt);
            }
        });

        txt_EmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_EmpIdKeyPressed(evt);
            }
        });

        cmb_Department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "IT", "ISE", "Cyber", "SE" }));

        txt_id.setText("id");

        cmb_Building.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_Building.setText("Building");

        cmb_Center.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_Center.setText("Center");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Genaerate Rank");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmb_level.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_level.setText("Level");

        txt_Rank.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Rank.setText("Rank");

        cmb_center.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Center", "Malabe", "Metro", "Matara", "Kandy", "Kurunagala", "Jaffna" }));
        cmb_center.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_centerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Employee Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employee Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Faculty");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Department");

        cmb_le.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Level", "1", "2", "3", "4", "5", "6" }));

        txt_EmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmpNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_id)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_Building)
                            .addComponent(cmb_Center, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_level)
                            .addComponent(txt_Rank, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txt_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmb_le, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_buildings, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_center, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_Department, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_id)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addComponent(cmb_Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_Center)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_buildings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Building))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_le, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_level))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Rank)
                    .addComponent(jButton2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btn_Submit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Submit.setText("Submit");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Submit)
                .addGap(18, 18, 18)
                .addComponent(btn_clear)
                .addGap(18, 18, 18)
                .addComponent(btn_update)
                .addGap(18, 18, 18)
                .addComponent(btn_delete)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Submit)
                    .addComponent(btn_clear)
                    .addComponent(btn_update)
                    .addComponent(btn_delete))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(lbl_Error))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 566, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add a Lecture", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        LectureController mod = new LectureController();
        int lId = Integer.parseInt(txt_id.getText());
        JPanel panel = new JPanel();
        try {
            int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Delete", "Delete",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
            if(res == 0) {

                if (mod.DeleteLecture(lId) > 0) {
                    JOptionPane.showMessageDialog(null, "Lecture Deleted successfully!", "Delete Location", JOptionPane.INFORMATION_MESSAGE);
                    refreshData();
                    resetForm();
                }
            } else if (res == 1) {
                System.out.println("Pressed NO");
            }

        } catch (SQLException ex) {
            Logger.getLogger(pnl_Module.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        String customerCode = (String) txt_EmpId.getText();

        try {
            if (validateData()) {

                LectureController ldl = new LectureController();
                ldl.updateLecture(updateLecture());
                showLecureList();
                refreshData();
                resetForm();
                JOptionPane.showMessageDialog(null, "Lecture Update Successful!", "Update", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            Logger.getLogger(pnl_Module.class
                .getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Check your update lecture code", "Validation", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        resetForm();
        refreshData();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        LectureController lec = new LectureController();

        try {
            if(validateData()){
                if(lec.addLecture(CreateLecture()) != 0){
                    JOptionPane.showMessageDialog(null, "Lecture Added Successful!", "Add Lecturer", JOptionPane.INFORMATION_MESSAGE);
                    refreshData();
                    resetForm();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(jPanel1, "Failed! MYSQL ERROR", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_SubmitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Level = cmb_le.getSelectedItem().toString();
        String id = txt_EmpId.getText();
        txt_rank.setText(Level+"."+id);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_lecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_lecMouseClicked
        DefaultTableModel tdl = (DefaultTableModel) tbl_lec.getModel();

        String id = tdl.getValueAt(tbl_lec.getSelectedRow(), 0).toString();
        String tblempid = tdl.getValueAt(tbl_lec.getSelectedRow(), 1).toString();
        String tblempname= tdl.getValueAt(tbl_lec.getSelectedRow(), 2).toString();
        String tbfaculty = tdl.getValueAt(tbl_lec.getSelectedRow(), 3).toString();
        String tbdepartment = tdl.getValueAt(tbl_lec.getSelectedRow(), 4).toString();
        String tbcenter = tdl.getValueAt(tbl_lec.getSelectedRow(), 5).toString();
        String tbbuilding = tdl.getValueAt(tbl_lec.getSelectedRow(), 6).toString();
        String tblevel = tdl.getValueAt(tbl_lec.getSelectedRow(), 7).toString();
        String tbrank = tdl.getValueAt(tbl_lec.getSelectedRow(), 8).toString();

        txt_id.setText(id);
        txt_EmpId.setText(tblempid);
        txt_EmpName.setText(tblempname);
        cmb_Faculty.setSelectedItem(tbfaculty);
        cmb_Department.setSelectedItem(tbdepartment);
        cmb_center.setSelectedItem(tbcenter);
        cmb_buildings.setSelectedItem(tbbuilding);
        cmb_le.setSelectedItem(tblevel);
        txt_rank.setText(tbrank);

    }//GEN-LAST:event_tbl_lecMouseClicked

    private void cmb_centerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_centerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_centerActionPerformed

    private void txt_EmpIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EmpIdKeyPressed
        String cap = txt_EmpId.getText();
        int length = cap.length();
        char c = evt.getKeyChar();

        if(c >= '0' && c <= '9'){
            if(length <7){
                txt_EmpId.setEditable(true);
            } else{
                txt_EmpId.setEditable(false);
            }
        }
        else {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE){
                txt_EmpId.setEditable(true);
            }else{
                txt_EmpId.setEditable(false);
            }
        }
    }//GEN-LAST:event_txt_EmpIdKeyPressed

    private void cmb_FacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_FacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_FacultyActionPerformed

    private void txt_EmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmpNameActionPerformed

    
    private LectureModel CreateLecture() {

        LectureModel lecture = new LectureModel();

        try {
            int x = Integer.parseInt(txt_EmpId.getText());
            int y = Integer.parseInt(cmb_le.getSelectedItem().toString());
            

            lecture.setEmpid(x);
            lecture.setEmpname(txt_EmpName.getText().trim());
            lecture.setFaculty(cmb_Faculty.getSelectedItem().toString());
            lecture.setDepartment(cmb_Department.getSelectedItem().toString());
            lecture.setCenter(cmb_center.getSelectedItem().toString());
            lecture.setBuilding(cmb_buildings.getSelectedItem().toString());
            lecture.setLevel(y);
            lecture.setRank(txt_rank.getText().trim());

        } catch (Exception e) {
        }
        return lecture;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Submit;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel cmb_Building;
    private javax.swing.JLabel cmb_Center;
    private javax.swing.JComboBox<String> cmb_Department;
    private javax.swing.JComboBox<String> cmb_Faculty;
    private javax.swing.JComboBox<String> cmb_buildings;
    private javax.swing.JComboBox<String> cmb_center;
    private javax.swing.JComboBox<String> cmb_le;
    private javax.swing.JLabel cmb_level;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JTable tbl_lec;
    private javax.swing.JTextField txt_EmpId;
    private javax.swing.JTextField txt_EmpName;
    private javax.swing.JLabel txt_Rank;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_rank;
    // End of variables declaration//GEN-END:variables

    
    public void showLecureList() throws SQLException{
        
    LectureController lec = new LectureController();
        
        List<LectureModel> List = lec.ShowLectureList();
        DefaultTableModel dtm = (DefaultTableModel) tbl_lec.getModel();

        for(int i = 0; i < List.size(); i++){
            Object[] row = new Object[9];
            
            row[0]= List.get(i).getId();
            row[1]= List.get(i).getEmpid();
            row[2]= List.get(i).getEmpname();
            row[3]= List.get(i).getFaculty();
            row[4]= List.get(i).getDepartment();
            row[5]= List.get(i).getCenter();
            row[6]= List.get(i).getBuilding();
            row[7]= List.get(i).getLevel();
            row[8]= List.get(i).getRank();
            
            dtm.addRow(row);
        }
    }
    
    
       private LectureModel updateLecture() {
    LectureModel ld = new LectureModel();

        try {
           int id = Integer.parseInt(txt_id.getText());
           int Empid = Integer.parseInt(txt_EmpId.getText());
           int Level = Integer.parseInt(cmb_le.getSelectedItem().toString());
           
           
            ld.setId(id);
            ld.setEmpid(Empid);
            ld.setEmpname(txt_EmpName.getText()); 
            ld.setFaculty(cmb_Faculty.getSelectedItem().toString());
            ld.setDepartment(cmb_Department.getSelectedItem().toString());
            ld.setCenter(cmb_center.getSelectedItem().toString());
            ld.setBuilding(cmb_buildings.getSelectedItem().toString());
            ld.setLevel(Level);
            ld.setRank(txt_rank.getText());
            

        } catch (Exception e) {
        }
        return ld;

}
       
       
           /*
     check whether any location is exist by passing  query,id & Column name
     */
    public boolean isExist(String name, String id, String query, String colName) throws SQLException {
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
        boolean isAvailable = false;
        int col = 0;
        
        try {
            ps = connection.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (!rs.getString(colName).isEmpty()) {
                isAvailable = true;
            }
//                
            }
        } catch (SQLException ex) {
            throw ex;
        }finally {
            try {
                if(ps != null){
                    ps.close();
                }
            } catch (Exception ex) {
                throw ex;
            }
            
        }
        return isAvailable;
    }
    
    public Boolean validateData() {


        if (txt_EmpName.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Enter Employee Name");
            txt_EmpName.grabFocus();
            return false;
        }
        
        if (txt_EmpId.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Enter Employee ID");
            txt_EmpId.grabFocus();
            return false;
        }
        if (cmb_Faculty.getSelectedItem().toString().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Faculty");
            cmb_Faculty.grabFocus();
            return false;
        }
        if (cmb_Department.getSelectedItem().toString().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Department");
            cmb_Department.grabFocus();
            return false;
        }
        
        if (cmb_center.getSelectedItem().toString().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Center");
            cmb_center.grabFocus();
            return false;
        }
         if (cmb_buildings.getSelectedItem().toString().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Building");
            cmb_buildings.grabFocus();
            return false;
        }
          if (cmb_le.getSelectedItem().toString().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Level");
            cmb_le.grabFocus();
            return false;
        }
        
        if (txt_rank.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Genarate Rank");
            txt_rank.grabFocus();
            return false;
        }
           
        return true;
         
    }
}
