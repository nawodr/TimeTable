/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.view;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import student.controller.GrpIdGenerateCon;
import student.util.LoadTable;

/**
 *
 * @author RPsandeepa
 */
public class GrpIdGenerate extends javax.swing.JPanel {

    Connection connection;
    PreparedStatement pstYns, pstDp, pstGno, pst, pst2;
    ResultSet rs;

    /**
     * Creates new form GrpIdGenerate
     */
    public GrpIdGenerate() {
        initComponents();
        yNsSelection();
        dNpSelection();
        gNnSelection();
        errorMsg.setVisible(false);
        id_lbl.setVisible(true);
        yNs_id.setVisible(false);
        dP_id.setVisible(false);
        gP_id.setVisible(false);
        gid.setVisible(false);
        showYnSList();
    }

    GrpIdGenerateCon gig = new GrpIdGenerateCon();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_grp_num_gen = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_generate = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCombo_yer_and_sem = new javax.swing.JComboBox<>();
        jCombo_deg_pro = new javax.swing.JComboBox<>();
        jCombo_grp_num = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        errorMsg = new javax.swing.JLabel();
        id_lbl = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        yNs_id = new javax.swing.JLabel();
        dP_id = new javax.swing.JLabel();
        gP_id = new javax.swing.JLabel();
        gid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        tbl_grp_num_gen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Group Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_grp_num_gen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_grp_num_genMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_grp_num_gen);
        if (tbl_grp_num_gen.getColumnModel().getColumnCount() > 0) {
            tbl_grp_num_gen.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_grp_num_gen.getColumnModel().getColumn(1).setPreferredWidth(900);
        }

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btn_generate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_generate.setText("Generate");
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_del.setText("Delete");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_generate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_del)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_del)
                            .addComponent(btn_update)
                            .addComponent(btn_generate))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Academic Year And Semester");

        jCombo_yer_and_sem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCombo_yer_and_sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jCombo_deg_pro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCombo_deg_pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jCombo_grp_num.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCombo_grp_num.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Group Number");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Degree Program");

        errorMsg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errorMsg.setForeground(java.awt.Color.red);
        errorMsg.setText("error");

        id_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_lbl.setText("Selected Id");

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setText("id");

        yNs_id.setText("jLabel5");

        dP_id.setText("jLabel6");

        gP_id.setText("jLabel7");

        gid.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(id)
                                .addGap(64, 64, 64)
                                .addComponent(gid)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCombo_yer_and_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCombo_deg_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCombo_grp_num, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yNs_id, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dP_id, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gP_id, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_lbl)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id)
                        .addComponent(gid)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCombo_yer_and_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yNs_id))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCombo_deg_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dP_id))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCombo_grp_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gP_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMsg)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Group Id Details");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel4)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed

        Connection connection = DBConnection.getConnection();
        PreparedStatement ps, smt;
        int selectedRow = tbl_grp_num_gen.getSelectedRow();
        String idGen = id.getText();

        int v = JOptionPane.showConfirmDialog(null, "Are You Sure Delete", "Delete", JOptionPane.YES_NO_OPTION);

        if (v == JOptionPane.YES_OPTION) {

            try {

                DefaultTableModel model = (DefaultTableModel) tbl_grp_num_gen.getModel();

                if (selectedRow == -1) {
                    errorMsg.setVisible(true);
                    errorMsg.setText("Select Group ID*");

                } else {

                    errorMsg.setText("");

                    int i = tbl_grp_num_gen.getSelectedRow();
                    TableModel mt = tbl_grp_num_gen.getModel();
                    gid.setText(mt.getValueAt(i, 1).toString());

                    String queryDelGen = "DELETE FROM GroupNumGenerate WHERE idGrpNumGen=?";
                    ps = connection.prepareStatement(queryDelGen);
                    ps.setString(1, idGen);
                    ps.executeUpdate();

                    String queryAllDet = "DELETE FROM all_details WHERE gId=? and sGid=?";
                    ps = connection.prepareStatement(queryAllDet);
                    ps.setString(1, gid.getText().toString());
                    ps.setString(2, "-");
                    ps.executeUpdate();

                    showYnSList();
                    JOptionPane.showMessageDialog(this, "Successfully Deleted!");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

//        if (selectedRow != -1) {
//
//            String idYS = id_lbl.getText();
//            int final_id = Integer.parseInt(idYS);
//
//            int v = JOptionPane.showConfirmDialog(this, "Are You Sure Delete", "Delete", JOptionPane.YES_NO_OPTION);
//
//            if (v == JOptionPane.YES_OPTION) {
//
//                try {
//
//                    int i = gig.deleteHandleClick(final_id);
//
//                    showYnSList();
//
//                    if (i != 0) {
////                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
//                        JOptionPane.showMessageDialog(this, "Successfully Deleted!");
////                    txt_deg_pro.setText("");
//
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//
//                } catch (SQLException ex) {
//
//                    Logger.getLogger(YearSemester.class.getName()).log(Level.SEVERE, null, ex);
//
//                }
//
//            } else if (v == JOptionPane.NO_OPTION) {
//
//            } else {
//
//            }
//
//        } else {
//            errorMsg.setText("Please Selected Row");
//            errorMsg.setVisible(true);
//        }
//        showYnSList();
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateActionPerformed

//        errorMsg.setVisible(false);
//        String groupId;
//
//        groupId = jCombo_yer_and_sem.getSelectedItem() + "." + jCombo_deg_pro.getSelectedItem() + "." + jCombo_grp_num.getSelectedItem();
//
//        try {
//
//            if (inputDataValidator() == true && allReady() == true) {
//
//                int i = gig.addHandleClick(groupId);
//                showYnSList();
//                if (i != 0) {
//                    JOptionPane.showMessageDialog(this, "Successfully Addeda!", "Done", JOptionPane.PLAIN_MESSAGE);
//
//                } else {
//                    JOptionPane.showMessageDialog(this, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//                showYnSList();
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            DefaultTableModel model = (DefaultTableModel) tbl_grp_num_gen.getModel();
            connection = DBConnection.getConnection();

            if (jCombo_yer_and_sem.getSelectedItem().equals("Select") && jCombo_deg_pro.getSelectedItem().equals("Select") && jCombo_grp_num.getSelectedItem().equals("Select")) {
                errorMsg.setText("Select Items*");
                errorMsg.setVisible(true);

            } else {
                errorMsg.setText("");
                errorMsg.setVisible(false);

                model.addRow(new Object[]{jCombo_yer_and_sem.getSelectedItem().toString() + "." + jCombo_deg_pro.getSelectedItem().toString() + "." + jCombo_grp_num.getSelectedItem().toString()});

                String getYnsQuery = "select idAcdYerAndSem from AcdYerAndSem where yerName = '" + jCombo_yer_and_sem.getSelectedItem().toString() + "'";
                String getDpQuery = "select idDegPro from DegreePro where degName = '" + jCombo_deg_pro.getSelectedItem().toString() + "'";
                String getGnoQuery = "select idGrp_num from GroupNum where grp_num = '" + jCombo_grp_num.getSelectedItem().toString() + "'";

                pstYns = connection.prepareStatement(getYnsQuery);
                rs = pstYns.executeQuery();
                while (rs.next()) {
                    yNs_id.setText(rs.getString("idAcdYerAndSem"));
                }

                pstDp = connection.prepareStatement(getDpQuery);
                rs = pstDp.executeQuery();
                while (rs.next()) {
                    dP_id.setText(rs.getString("idDegPro"));
                }
                pstGno = connection.prepareStatement(getGnoQuery);
                rs = pstGno.executeQuery();
                while (rs.next()) {
                    gP_id.setText(rs.getString("idGrp_num"));
                }

                String groupId = jCombo_yer_and_sem.getSelectedItem() + "." + jCombo_deg_pro.getSelectedItem() + "." + jCombo_grp_num.getSelectedItem();

                String queryGpIdGen = "INSERT INTO GroupNumGenerate (GrpNum, yNsId, dpId, gnoId) VALUES (?, ?, ?, ?)";
                pst = connection.prepareStatement(queryGpIdGen, PreparedStatement.RETURN_GENERATED_KEYS);
                pst.setString(1, groupId);
                pst.setString(2, yNs_id.getText());
                pst.setString(3, dP_id.getText());
                pst.setString(4, gP_id.getText());
                pst.executeUpdate();

                String queryAllDetails = "INSERT INTO all_details (yNs, dp, gNo, gId, sGid) VALUES (?, ?, ?, ?, ?)";
                pst2 = connection.prepareStatement(queryAllDetails, PreparedStatement.RETURN_GENERATED_KEYS);
                pst2.setString(1, jCombo_yer_and_sem.getSelectedItem().toString());
                pst2.setString(2, jCombo_deg_pro.getSelectedItem().toString());
                pst2.setString(3, jCombo_grp_num.getSelectedItem().toString());
                pst2.setString(4, groupId);
                pst2.setString(5, "");
                pst2.executeUpdate();

                model.setRowCount(0);
                showYnSList();

                jCombo_yer_and_sem.setSelectedIndex(0);
                jCombo_deg_pro.setSelectedIndex(0);
                jCombo_grp_num.setSelectedIndex(0);

                JOptionPane.showMessageDialog(null, "Successfully Addeda!", "Done", JOptionPane.PLAIN_MESSAGE);
            }

        } catch (Exception e) {
            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_btn_generateActionPerformed

    private void tbl_grp_num_genMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_grp_num_genMouseClicked

        errorMsg.setVisible(false);

        int selectedRow = tbl_grp_num_gen.getSelectedRow();
        int Id = (int) tbl_grp_num_gen.getValueAt(selectedRow, 0);
        String valueAt = (String) tbl_grp_num_gen.getValueAt(selectedRow, 1);
        String valuId = String.valueOf(Id);
        id.setText(valuId);
        //System.out.println(valueAt);

        String[] val = valueAt.split("\\.");

        String first = val[0]+"."+ val[1];
        
        //System.out.println(val.length);
        jCombo_yer_and_sem.setSelectedItem(first);

        String second = val[2];
        jCombo_deg_pro.setSelectedItem(second);

        String third = val[3];      
        jCombo_grp_num.setSelectedItem(third);

        TableModel mt = tbl_grp_num_gen.getModel();
        gid.setText(mt.getValueAt(selectedRow, 1).toString());

    }//GEN-LAST:event_tbl_grp_num_genMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        Connection connection = DBConnection.getConnection();
//        try {
//
//            int selectedRow = tbl_grp_num_gen.getSelectedRow();
//
//            if (selectedRow != -1) {
//
//                errorMsg.setVisible(false);
//
//                String idYS = id_lbl.getText();
//                int final_id = Integer.parseInt(idYS);
//
//                if (inputDataValidator() == true && allReady() == true) {
//
//                    errorMsg.setVisible(false);
//
//                    String newSubId = jCombo_yer_and_sem.getSelectedItem() + "." + jCombo_deg_pro.getSelectedItem() + "." + jCombo_grp_num.getSelectedItem();
//
//                    int i = gig.updateHandleClick(final_id, newSubId);
////                System.out.println(i);
//                    if (i != 0) {
////                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
//                        JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!");
//                        showYnSList();
//                    } else {
//                        JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//
//                }
//
//            } else {
//                errorMsg.setText("Please Selected Row");
//                errorMsg.setVisible(true);
//            }
//
//        } catch (Exception e) {
//        }
//        showYnSList();

        int selectedRow = tbl_grp_num_gen.getSelectedRow();
//        System.out.println(selectedRow);
        String newGenerateID = (jCombo_yer_and_sem.getSelectedItem().toString() + "." + jCombo_deg_pro.getSelectedItem().toString() + "." + jCombo_grp_num.getSelectedItem().toString());

        try {

            DefaultTableModel model = (DefaultTableModel) tbl_grp_num_gen.getModel();

            PreparedStatement ps, smt;

            if (selectedRow == -1) {
                errorMsg.setVisible(true);
                errorMsg.setText("Select Group ID*");

            } else {

                errorMsg.setText("");
                errorMsg.setVisible(false);

                TableModel mt = tbl_grp_num_gen.getModel();
                gid.setText(mt.getValueAt(selectedRow, 1).toString());
                String idx = gid.getText();
//                System.out.println(idx);
//                System.out.println(newGenerateID);

                String queryUpGrpGen = "UPDATE GroupNumGenerate SET GrpNum=? WHERE idGrpNumGen=?";
                ps = connection.prepareStatement(queryUpGrpGen);
                ps.setString(1, newGenerateID);
                ps.setString(2, id.getText().toString());
                ps.executeUpdate();
//                System.out.println(queryUpGrpGen);

                String queryUpAllDetils = "UPDATE all_details SET gId=? WHERE gId=? AND sGid =?";
                smt = connection.prepareStatement(queryUpAllDetils);
                smt.setString(1, newGenerateID);
                smt.setString(2, idx);
                smt.setString(3, "");
                smt.executeUpdate();

                model.setRowCount(0);
                showYnSList();

                jCombo_yer_and_sem.setSelectedIndex(0);
                jCombo_deg_pro.setSelectedIndex(0);
                jCombo_grp_num.setSelectedIndex(0);

                JOptionPane.showMessageDialog(null, "Successfully Updated!");

            }

        } catch (Exception e) {
            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        id.setText(" ");
//        txt_deg_pro.setText("");
        jCombo_yer_and_sem.setSelectedIndex(0);
        jCombo_deg_pro.setSelectedIndex(0);
        jCombo_grp_num.setSelectedIndex(0);
        showYnSList();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void yNsSelection() {
        PreparedStatement pst;
        ResultSet rs;

        try {

            Connection connection = DBConnection.getConnection();

            String query = "select * from AcdYerAndSem";
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String yNs = rs.getString("yerName");
                jCombo_yer_and_sem.addItem(yNs);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void dNpSelection() {
        PreparedStatement pst;
        ResultSet rs;

        try {

            Connection connection = DBConnection.getConnection();

            String query = "select * from DegreePro";
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String dnS = rs.getString("degName");
                jCombo_deg_pro.addItem(dnS);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void gNnSelection() {
        PreparedStatement pst;
        ResultSet rs;

        try {

            Connection connection = DBConnection.getConnection();

            String query = "select * from GroupNum";
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String gNn = rs.getString("grp_num");
                jCombo_grp_num.addItem(gNn);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("idGrpNumGen", "int");
        hm.put("GrpNum", "String");

        new LoadTable(tbl_grp_num_gen, "Select * from GroupNumGenerate", hm);
    }

    public boolean inputDataValidator() throws SQLException {

        String groupId = jCombo_yer_and_sem.getSelectedItem() + "." + jCombo_deg_pro.getSelectedItem() + "." + jCombo_grp_num.getSelectedItem();

        if (groupId.isEmpty()) {
            errorMsg.setText("Degree Program is Required.");
            errorMsg.setVisible(true);
            return false;
        }
        return true;
    }

    public boolean allReady() {

        String groupId = jCombo_yer_and_sem.getSelectedItem() + "." + jCombo_deg_pro.getSelectedItem() + "." + jCombo_grp_num.getSelectedItem();

        try {
            if (!gig.getAllReady(groupId)) {

                errorMsg.setText("Group Number Already Exist");
                errorMsg.setVisible(true);
                return false;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Degree.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_generate;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel dP_id;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel gP_id;
    private javax.swing.JLabel gid;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCombo_deg_pro;
    private javax.swing.JComboBox<String> jCombo_grp_num;
    private javax.swing.JComboBox<String> jCombo_yer_and_sem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_grp_num_gen;
    private javax.swing.JLabel yNs_id;
    // End of variables declaration//GEN-END:variables
}
