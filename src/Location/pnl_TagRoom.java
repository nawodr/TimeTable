/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import DB.DBConnection;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class pnl_TagRoom extends javax.swing.JPanel {

    addLocations addLoc = new addLocations();
    /**
     * Creates new form pnl_TagRoom
     */
    public pnl_TagRoom() throws SQLException {
        initComponents();
        refreshData();
        
        
    }
    
    public void resetForm(){
        cmb_Tag.setSelectedItem("");
        txt_TagName.setText("");
        txt_TagCode.setText("");
        txt_Tag.setText("");
        cmb_Room.setSelectedItem("");
    }

    public void refreshData() throws SQLException{
        try {
            for (int i = 0; i < 5; i++) {
                DefaultTableCellRenderer Renderer = new DefaultTableCellRenderer();
//                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                tbl_TagLoc.getColumnModel().getColumn(i).setCellRenderer( Renderer );
                DefaultTableModel tMdl = (DefaultTableModel) tbl_TagLoc.getModel();
                tMdl.setRowCount(0);
            } 
            showYnSList();
            
            DefaultComboBoxModel cmbMdl;
            cmbMdl = new DefaultComboBoxModel(new addLocations().LoadTagId().toArray());
            cmb_Tag.setModel(cmbMdl);
            cmb_Tag.setSelectedItem("");
            
        } catch (Exception e) {
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
        tbl_TagLoc = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lbl_Error3 = new javax.swing.JLabel();
        lbl_Rtype3 = new javax.swing.JLabel();
        lbl_Id3 = new javax.swing.JLabel();
        cmb_Room = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        cmb_Tag = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt_TagName = new javax.swing.JTextField();
        txt_TagCode = new javax.swing.JTextField();
        txt_Tag = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_Add2 = new javax.swing.JButton();
        cus_Update3 = new javax.swing.JButton();
        cus_delete3 = new javax.swing.JButton();
        cus_New3 = new javax.swing.JButton();
        cus_Exit3 = new javax.swing.JButton();

        tbl_TagLoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tag Name", "Tag Code", "Related Tag", "Room"
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
        tbl_TagLoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TagLocMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_TagLoc);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Tag");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Room");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText(":");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText(":");

        lbl_Error3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Error3.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Error3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cmb_Room.setToolTipText("");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Tag Id");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText(":");

        cmb_Tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TagActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Tag Name");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText(":");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Tag Code");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText(":");

        txt_TagName.setEditable(false);

        txt_TagCode.setEditable(false);

        txt_Tag.setEditable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lbl_Error3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40)
                                .addGap(18, 18, 18)
                                .addComponent(txt_TagName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(142, 142, 142)
                        .addComponent(lbl_Id3)
                        .addGap(107, 107, 107)
                        .addComponent(lbl_Rtype3))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel43)
                            .addGap(18, 18, 18)
                            .addComponent(txt_TagCode))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel38)
                            .addGap(18, 18, 18)
                            .addComponent(txt_Tag))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel41)
                            .addGap(18, 18, 18)
                            .addComponent(cmb_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_Id3)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbl_Rtype3))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(cmb_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txt_TagName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TagCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(txt_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(cmb_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Error3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Room For a Tag");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setAlignmentY(0.0F);
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_Add2.setBackground(new java.awt.Color(187, 51, 51));
        btn_Add2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btn_Add2.setText("Add");
        btn_Add2.setAlignmentY(0.0F);
        btn_Add2.setPreferredSize(new java.awt.Dimension(73, 23));
        btn_Add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add2ActionPerformed(evt);
            }
        });

        cus_Update3.setBackground(new java.awt.Color(187, 51, 51));
        cus_Update3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_Update3.setText("Update");
        cus_Update3.setAlignmentY(0.0F);
        cus_Update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_Update3ActionPerformed(evt);
            }
        });

        cus_delete3.setBackground(new java.awt.Color(187, 51, 51));
        cus_delete3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_delete3.setText("Delete");
        cus_delete3.setAlignmentY(0.0F);
        cus_delete3.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_delete3ActionPerformed(evt);
            }
        });

        cus_New3.setBackground(new java.awt.Color(187, 51, 51));
        cus_New3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_New3.setText("New");
        cus_New3.setAlignmentY(0.0F);
        cus_New3.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_New3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_New3ActionPerformed(evt);
            }
        });

        cus_Exit3.setBackground(new java.awt.Color(187, 51, 51));
        cus_Exit3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_Exit3.setText("Exit");
        cus_Exit3.setAlignmentY(0.0F);
        cus_Exit3.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_Exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_Exit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Add2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cus_Update3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cus_delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cus_New3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cus_Exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_Add2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_Update3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_New3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_Exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_TagLocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TagLocMouseClicked
        //set data to text fields
        DefaultTableModel mdl = (DefaultTableModel) tbl_TagLoc.getModel();

        //set data to text fields when row is selected
        String tblId = mdl.getValueAt(tbl_TagLoc.getSelectedRow(), 0).toString();
        String tblTagName = mdl.getValueAt(tbl_TagLoc.getSelectedRow(), 1).toString();
        String tblTagCode = mdl.getValueAt(tbl_TagLoc.getSelectedRow(), 2).toString();
        String tblTag = mdl.getValueAt(tbl_TagLoc.getSelectedRow(), 3).toString();
        String tblRoom = mdl.getValueAt(tbl_TagLoc.getSelectedRow(), 4).toString();

        //set values to text fields
        cmb_Tag.setSelectedItem(tblId);
        txt_TagName.setText(tblTagName);
        txt_TagCode.setText(tblTagCode);
        txt_Tag.setText(tblTag);
        cmb_Room.setSelectedItem(tblRoom);
    }//GEN-LAST:event_tbl_TagLocMouseClicked

    private void cus_Exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_Exit3ActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Exit", "Exit",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(res == 0) {
            Component comp = SwingUtilities.getRoot(this);
            ((Window) comp).dispose();
        }
    }//GEN-LAST:event_cus_Exit3ActionPerformed

    private void cmb_TagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TagActionPerformed
        String tag =  cmb_Tag.getSelectedItem().toString();
        try {
            /*
            Show Customers to All Fieled
            */
            loadTagToFields(tag);
            
            if (txt_Tag.getText().equals("Lecture") || txt_Tag.getText().equals("Tutorial")) {

                //              addLoc.LoadRooms("Lecture Hall");

                DefaultComboBoxModel cmbMdl;
                cmbMdl = new DefaultComboBoxModel(addLoc.LoadRooms("Lecture Hall").toArray());
                cmb_Room.setModel(cmbMdl);
                cmb_Room.setSelectedItem("");
            }
            else{
                DefaultComboBoxModel cmbMdl;
                cmbMdl = new DefaultComboBoxModel(addLoc.LoadRooms("Labarotaory").toArray());
                cmb_Room.setModel(cmbMdl);
                cmb_Room.setSelectedItem("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_TagRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb_TagActionPerformed

    private void btn_Add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add2ActionPerformed
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();

        String tagId = cmb_Tag.getSelectedItem().toString();
        String query = "Select Id FROM tag_Location WHERE id = ?";
        String colName = "Id";
        
        try {
            if(!addLoc.isExist(tagId,query,colName)){
                
                JOptionPane.showMessageDialog(null, "This Tag Already Exist!", "Validation", JOptionPane.ERROR_MESSAGE);
            }else{
                ps = connection.prepareStatement("INSERT INTO tag_Location (id,tag_Name,tag_Code,related_Tag,room_Name) VALUES (?,?,?,?,?)");
                
                // set db value
                ps.setInt(1, Integer.parseInt(cmb_Tag.getSelectedItem().toString()));
                ps.setString(2, txt_TagName.getText());
                ps.setString(3, txt_TagCode.getText());
                ps.setString(4, txt_Tag.getText());
                ps.setString(5, cmb_Room.getSelectedItem().toString());

                ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Location Added Successfully For Tag", "Add Location", JOptionPane.INFORMATION_MESSAGE);
            showYnSList();
            }
            } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_btn_Add2ActionPerformed

    private void cus_New3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_New3ActionPerformed
        resetForm();
    }//GEN-LAST:event_cus_New3ActionPerformed

    private void cus_Update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_Update3ActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();
        int tagId = Integer.parseInt(cmb_Tag.getSelectedItem().toString());
        
        int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Update", "Update Location",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(res == 0) {
        
        try {
            
                ps = connection.prepareStatement("UPDATE tag_Location SET tag_Name = ?, tag_Code = ?, related_Tag = ?, room_Name = ? WHERE id = ?");
                
                // set db value
                
                ps.setString(1, txt_TagName.getText());
                ps.setString(2, txt_TagCode.getText());
                ps.setString(3, txt_Tag.getText());
                ps.setString(4, cmb_Room.getSelectedItem().toString());
                ps.setInt(5, tagId);

                ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Location Update Successfully For Tag", "Add Location", JOptionPane.INFORMATION_MESSAGE);
            showYnSList();
            
            
        } catch (SQLException ex) {
            
        }
        }
    }//GEN-LAST:event_cus_Update3ActionPerformed

    private void cus_delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_delete3ActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Delete", "Delete Location",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(res == 0) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
        int tagId = Integer.parseInt(cmb_Tag.getSelectedItem().toString());
        
        try {
            ps = connection.prepareStatement("DELETE FROM tag_Location WHERE id = ?");
            ps.setInt(1, tagId);
            ps.executeUpdate();
            showYnSList();
            resetForm();
            JOptionPane.showMessageDialog(null, "Location Deleted successfully!", "Delete Location", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (SQLException ex) {
           
        }  
        }
    }//GEN-LAST:event_cus_delete3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add2;
    private javax.swing.JComboBox<String> cmb_Room;
    private javax.swing.JComboBox<String> cmb_Tag;
    private javax.swing.JButton cus_Exit3;
    private javax.swing.JButton cus_New3;
    private javax.swing.JButton cus_Update3;
    private javax.swing.JButton cus_delete3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Error3;
    private javax.swing.JLabel lbl_Id3;
    private javax.swing.JLabel lbl_Rtype3;
    private javax.swing.JTable tbl_TagLoc;
    private javax.swing.JTextField txt_Tag;
    private javax.swing.JTextField txt_TagCode;
    private javax.swing.JTextField txt_TagName;
    // End of variables declaration//GEN-END:variables

     /*
    * load Customer Details to All Fieled             
     */
                
    public void loadTagToFields(String id) throws SQLException{
        
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = connection.prepareStatement("SELECT tagId,tagName,tagCode,relatedTag FROM Tag WHERE tagId = ?");

            //excuite sql
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                // get db value
                txt_TagName.setText(rs.getString("tagName"));
                txt_TagCode.setText(rs.getString("tagCode"));
                txt_Tag.setText(rs.getString("relatedTag"));
                
            }
        } catch (SQLException ex) {
                throw ex;
        }
    }
    
    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("id", "int");
        hm.put("tag_Name", "String");
        hm.put("tag_Code", "String");
        hm.put("related_Tag", "String");
        hm.put("room_Name", "String");

        new LoadTable(tbl_TagLoc, "SELECT * FROM tag_Location", hm);

    }
}
