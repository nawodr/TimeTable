/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import DB.DBConnection;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
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
public class pnl_AddRoom extends javax.swing.JPanel {

    addLocations addLoc = new addLocations();
    /**
     * Creates new form pnl_Location
     */
    public pnl_AddRoom() throws SQLException {
        initComponents();
        
        showLocationList();
        resetForm();
        refreshData();
        
        cmb_buildingName.grabFocus();
        lbl_Id.setVisible(false);
        lbl_Rtype.setVisible(false);
        lbl_Error.setVisible(false);
        
        
    }
    public void refreshData() throws SQLException{
        try {
            for (int i = 0; i < 5; i++) {
                DefaultTableCellRenderer Renderer = new DefaultTableCellRenderer();
//                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                tbl_Locations.getColumnModel().getColumn(i).setCellRenderer( Renderer );
                DefaultTableModel tMdl = (DefaultTableModel) tbl_Locations.getModel();
                tMdl.setRowCount(0);
            }
            showLocationList();
            
            DefaultComboBoxModel cmbMdl;
            cmbMdl = new DefaultComboBoxModel(new addLocations().LoadBuiling().toArray());
            cmb_buildingName.setModel(cmbMdl);
            cmb_buildingName.setSelectedIndex(0);
        } catch (Exception e) {
        }
    }
    public void resetForm() {
        cmb_buildingName.setSelectedIndex(0);
        txt_roomName.setText("");
        radio_lecHall.setSelected(true);
        txt_capacity.setText("");
        lbl_Error.setVisible(false);
        
        
    }

    public Boolean validateData() {

        if (cmb_buildingName.getSelectedItem().toString().equals("Select")) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Building Name");
            cmb_buildingName.grabFocus();
            return false;
        }
        
        if (txt_roomName.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Enter Room Name");
            txt_roomName.grabFocus();
            return false;
        }
        
        if (lbl_Rtype.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Room Type");
            return false;
        }
        
        if (txt_capacity.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Enter Room Capacity");
            txt_capacity.grabFocus();
            return false;
        }
        int capacity = Integer.parseInt(txt_capacity.getText());
        if (capacity <= 0 || capacity >150) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Maximum Room Capacity is 150");
            txt_capacity.grabFocus();
            return false;
        }
        
        return true;
         
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_Id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Locations = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_roomName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_capacity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_Error = new javax.swing.JLabel();
        radio_lecHall = new javax.swing.JRadioButton();
        radio_lab = new javax.swing.JRadioButton();
        lbl_Rtype = new javax.swing.JLabel();
        lbl_Id1 = new javax.swing.JLabel();
        cmb_buildingName = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        btn_Add = new javax.swing.JButton();
        cus_Update1 = new javax.swing.JButton();
        cus_delete1 = new javax.swing.JButton();
        cus_New1 = new javax.swing.JButton();
        cus_Exit1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1005, 528));

        jPanel2.setPreferredSize(new java.awt.Dimension(1005, 528));

        tbl_Locations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Building Name", "Room Name", "Room Type", "Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tbl_Locations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_LocationsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_Locations);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Rooms");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Building Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Room Name");

        txt_roomName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Room Type");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Capacity");

        txt_capacity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_capacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_capacityKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(":");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(":");

        lbl_Error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(radio_lecHall);
        radio_lecHall.setText("Lecture Hall");
        radio_lecHall.setToolTipText("");
        radio_lecHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_lecHallActionPerformed(evt);
            }
        });
        radio_lecHall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radio_lecHallKeyPressed(evt);
            }
        });

        buttonGroup1.add(radio_lab);
        radio_lab.setText("Labarotaory");
        radio_lab.setToolTipText("");
        radio_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_labActionPerformed(evt);
            }
        });

        cmb_buildingName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_buildingName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_roomName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(radio_lecHall, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radio_lab)))))
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(lbl_Rtype)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(lbl_Id1)
                        .addGap(103, 103, 103))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(lbl_Id1)
                        .addGap(27, 27, 27)
                        .addComponent(lbl_Rtype)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel4))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(cmb_buildingName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_roomName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radio_lecHall)
                                    .addComponent(radio_lab)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(13, 13, 13)
                        .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
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
        btn_Add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_AddKeyPressed(evt);
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
        cus_Update1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cus_Update1KeyPressed(evt);
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
        cus_delete1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cus_delete1KeyPressed(evt);
            }
        });

        cus_New1.setBackground(new java.awt.Color(187, 51, 51));
        cus_New1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_New1.setText("New");
        cus_New1.setAlignmentY(0.0F);
        cus_New1.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_New1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_New1ActionPerformed(evt);
            }
        });

        cus_Exit1.setBackground(new java.awt.Color(187, 51, 51));
        cus_Exit1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cus_Exit1.setText("Exit");
        cus_Exit1.setAlignmentY(0.0F);
        cus_Exit1.setPreferredSize(new java.awt.Dimension(73, 23));
        cus_Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_Exit1ActionPerformed(evt);
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
                .addComponent(cus_Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cus_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cus_New1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cus_Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_New1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cus_Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(206, 206, 206))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(3, 3, 3)))
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_Id)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_LocationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_LocationsMouseClicked
        tableSelection();
    }//GEN-LAST:event_tbl_LocationsMouseClicked

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        saveLocation();
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_AddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_AddKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            saveLocation();
        }
    }//GEN-LAST:event_btn_AddKeyPressed

    private void cus_Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_Update1ActionPerformed

        if (lbl_Id.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Row you Want To Update");
        }else{
            int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Update", "Update Room",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);        
            if(res == 0) {
                try {
                    updateLocation();
                } catch (SQLException ex) {
                    Logger.getLogger(pnl_AddRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_cus_Update1ActionPerformed

    private void cus_Update1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cus_Update1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                updateLocation();
            } catch (SQLException ex) {
                Logger.getLogger(pnl_AddRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cus_Update1KeyPressed

    private void cus_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_delete1ActionPerformed
        if (lbl_Id.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Row you Want To Delete");
        }else{
            int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Delete", "Delete Room",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(res == 0) {
                deleteLocation();
        }
        }
    }//GEN-LAST:event_cus_delete1ActionPerformed

    private void cus_delete1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cus_delete1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            deleteLocation();
        }
    }//GEN-LAST:event_cus_delete1KeyPressed

    private void cus_New1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_New1ActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_cus_New1ActionPerformed

    private void cus_Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_Exit1ActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Exit", "Exit",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(res == 0) {
            Component comp = SwingUtilities.getRoot(this);
            ((Window) comp).dispose();
        }
    }//GEN-LAST:event_cus_Exit1ActionPerformed

    private void txt_capacityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_capacityKeyPressed
        
        String cap = txt_capacity.getText();
        int length = cap.length();
        char c = evt.getKeyChar();

        if(c >= '0' && c <= '9'){
            if(length <3){
                txt_capacity.setEditable(true);
            } else{
                txt_capacity.setEditable(false);
            }
        }
        else {
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE){
                txt_capacity.setEditable(true);
            }else{
                txt_capacity.setEditable(false);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_capacity.getText().isEmpty()) {
                    txt_capacity.grabFocus();
            } else {
                btn_Add.grabFocus();
            }
        }
    }//GEN-LAST:event_txt_capacityKeyPressed

    private void radio_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_labActionPerformed
        lbl_Rtype.setText(radio_lab.getText());
    }//GEN-LAST:event_radio_labActionPerformed

    private void radio_lecHallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radio_lecHallKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_lecHallKeyPressed

    private void radio_lecHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_lecHallActionPerformed
        lbl_Rtype.setText(radio_lecHall.getText());
    }//GEN-LAST:event_radio_lecHallActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_buildingName;
    private javax.swing.JButton cus_Exit1;
    private javax.swing.JButton cus_New1;
    private javax.swing.JButton cus_Update1;
    private javax.swing.JButton cus_delete1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Id1;
    private javax.swing.JLabel lbl_Rtype;
    private javax.swing.JRadioButton radio_lab;
    private javax.swing.JRadioButton radio_lecHall;
    private javax.swing.JTable tbl_Locations;
    private javax.swing.JTextField txt_capacity;
    private javax.swing.JTextField txt_roomName;
    // End of variables declaration//GEN-END:variables

    /*
        Add Location Details
    */
     private void saveLocation() {
         Locations locations = new Locations();
         try {
            if (validateData()) {
                
                int capacity = Integer.parseInt(txt_capacity.getText()); //cast txt_capacity to Integer
                String rName = txt_roomName.getText();
                
                if(!addLoc.isExistLocation(rName)){
                    
                    locations.setBuilding_Name(cmb_buildingName.getSelectedItem().toString().trim());
                    locations.setRoom_Name(txt_roomName.getText().trim());
                    locations.setRoom_Type(lbl_Rtype.getText());
                    locations.setCapacity(capacity);
                    
                    String id = Integer.toString(addLoc.addLocations(locations));//get auto increment id
                    lbl_Id.setText(id);
                    refreshData();
                    JOptionPane.showMessageDialog(this, "Room Added Successfully", "Add Room", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "This Building Name & Room Name Already Used", "Add Room", JOptionPane.ERROR_MESSAGE);
                    cmb_buildingName.grabFocus();
                }
            }
            } catch (Exception e) {
                Logger.getLogger(pnl_Location.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Check Your Add Location Code", "Validation", JOptionPane.ERROR_MESSAGE);
                
            }
    }
     
      private void updateLocation() throws SQLException{
        String rName = txt_roomName.getText();
        int id = Integer.parseInt(lbl_Id.getText());
        
        try {
            if (validateData()) {
                //Check Location Whether Exist
                if (addLoc.isExistLocation(rName)) {
                    JOptionPane.showMessageDialog(null, "This Location Already Exist!", "Validation", JOptionPane.ERROR_MESSAGE);
                    cmb_buildingName.grabFocus();
                }else{
                    Locations location = new Locations();
                    int capacity = Integer.parseInt(txt_capacity.getText()); //cast txt_capacity to Integer
                    int Lid = Integer.parseInt(lbl_Id.getText()); //cast txt_capacity to Integer

                    location.setBuilding_Name(cmb_buildingName.getSelectedItem().toString());
                    
                    //check whether Building Name changed
//                    if(bName.equals(b)){
//                        location.setRoom_Name(bName + txt_roomName.getText());
//                    }
//                    else{
                        location.setRoom_Name(txt_roomName.getText());
//                    }
                    location.setRoom_Type(lbl_Rtype.getText());
                    location.setCapacity(capacity);
                    location.setId(Lid);

                    addLoc.UpdateLocations(location);
                    refreshData();
                    JOptionPane.showMessageDialog(null, "Location Updating Successfully", "Update Location", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        } catch (Exception e) {
            Logger.getLogger(pnl_AddRoom.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Check your update Location code", "Validation", JOptionPane.ERROR_MESSAGE);
            
        }
     }
     
     /*
    * Show Customer Details to List             
     */
    public void showLocationList() throws SQLException{
        
        
        List<Locations> newLocList = addLoc.ShowLocationList();
        DefaultTableModel dtm = (DefaultTableModel) tbl_Locations.getModel();

        for(int i = 0; i < newLocList.size(); i++){
            Object[] row = new Object[8];
            
            row[0]= newLocList.get(i).getId();
            row[1]= newLocList.get(i).getBuilding_Name();
            row[2]= newLocList.get(i).getRoom_Name();
            row[3]= newLocList.get(i).getRoom_Type();
            row[4]= newLocList.get(i).getCapacity();
            
            dtm.addRow(row);
        }
    }
    
    /*
    * Show Customer Details to fields when select from List             
     */
    public void tableSelection(){
        //set data to text fields
        DefaultTableModel mdl = (DefaultTableModel) tbl_Locations.getModel();

        //set data to text fields when row is selected
        String tblId = mdl.getValueAt(tbl_Locations.getSelectedRow(), 0).toString();
        String tblBilName = mdl.getValueAt(tbl_Locations.getSelectedRow(), 1).toString();
        String tblRoomName = mdl.getValueAt(tbl_Locations.getSelectedRow(), 2).toString();
        String tblRoomType = mdl.getValueAt(tbl_Locations.getSelectedRow(), 3).toString();
        String tblCapacity = mdl.getValueAt(tbl_Locations.getSelectedRow(), 4).toString();

        //set values to text fields
        lbl_Id.setText(tblId);
        cmb_buildingName.setSelectedItem(tblBilName);
        txt_roomName.setText(tblRoomName);
        lbl_Rtype.setText(tblRoomType);
        txt_capacity.setText(tblCapacity);
        
        if("Lecture Hall".equals(lbl_Rtype.getText())){
            radio_lecHall.setSelected(true);
        } else {
            radio_lab.setSelected(true);
        }
    }
    
    public void deleteLocation(){
        int lId = Integer.parseInt(lbl_Id.getText());        
        String query = "Select Id FROM location WHERE Id = ?";
        String colName = "Id";
        
        try {
            if (!addLoc.isExist(lbl_Id.getText(),query,colName)) {
                JOptionPane.showMessageDialog(null, "Location Doesn't Exist!", "Validation", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (addLoc.DeleteLocation(lId) > 0) {
                JOptionPane.showMessageDialog(null, "Location Deleted Successfully!", "Delete Location", JOptionPane.INFORMATION_MESSAGE);
                refreshData();
                resetForm();
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(pnl_Location.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
