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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import student.controller.SubGrpIdGenCont;
import student.util.LoadTable;

/**
 *
 * @author RPsandeepa
 */
public class SubGrpIdGenerate extends javax.swing.JPanel {

    /**
     * Creates new form SubGrpIdGen
     */
    PreparedStatement pst, pstg, psGetAll, psUpAll, smt1, smt2, smt3, smt4, smt5, smt6, smt7, upsmt1, upsmt2, delsmt1, delsmt2;
    ResultSet rs;

    public SubGrpIdGenerate() {
        initComponents();
        yNsSelection();
        errorMsg.setVisible(false);
        id.setVisible(true);
        gId_id.setVisible(false);
        showYnSList();
        sGnSelection();
        sgid.setVisible(false);
    }

    SubGrpIdGenCont sig = new SubGrpIdGenCont();

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
        jComboBox1 = new javax.swing.JComboBox<>();
        errorMsg = new javax.swing.JLabel();
        id_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        id = new javax.swing.JLabel();
        gId_id = new javax.swing.JLabel();
        sgid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sub_id_gen = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Group Number");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        errorMsg.setForeground(java.awt.Color.red);
        errorMsg.setText("error");

        id_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_lbl.setText("Selected Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Sub Group Number");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setText("Id");

        gId_id.setText("jLabel4");

        sgid.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(sgid)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gId_id)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_lbl)
                        .addComponent(id))
                    .addComponent(sgid))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorMsg)
                    .addComponent(gId_id))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tbl_sub_id_gen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sub Group Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sub_id_gen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sub_id_genMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sub_id_gen);
        if (tbl_sub_id_gen.getColumnModel().getColumnCount() > 0) {
            tbl_sub_id_gen.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_sub_id_gen.getColumnModel().getColumn(1).setPreferredWidth(900);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sub Group ID Details");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setText("Generate");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteMouseClicked(evt);
            }
        });
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_update)
                    .addComponent(btn_add)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        errorMsg.setVisible(false);

//        String subId;
//
//        subId = jComboBox1.getSelectedItem() + "." + jComboBox2.getSelectedItem();
//
//        try {
//
//            if (inputDataValidator() == true && allReady() == true) {
//
//                int i = sig.addHandleClick(subId);
//                showYnSList();
//                if (i != 0) {
//                    JOptionPane.showMessageDialog(this, "Successfully Addeda!", "Done", JOptionPane.PLAIN_MESSAGE);
//
//                } else {
//                    JOptionPane.showMessageDialog(this, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//
//            }
//showYnSList();
//        } catch (SQLException ex) {
//            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {

            DefaultTableModel model = (DefaultTableModel) tbl_sub_id_gen.getModel();
            Connection connection = DBConnection.getConnection();

            if (jComboBox1.getSelectedItem().equals("Select") && jComboBox2.getSelectedItem().equals("Select")) {
                errorMsg.setText("Select Items*");
                errorMsg.setVisible(true);
            } else {

                errorMsg.setText("");
                errorMsg.setVisible(false);
                String selectedGid = jComboBox1.getSelectedItem().toString();

                String getGIdQuery = "select idGrpNumGen from GroupNumGenerate where GrpNum=?";
                pstg = connection.prepareStatement(getGIdQuery);
                pstg.setString(1, selectedGid);
//                rs = pstg.executeUpdate();
                rs = pstg.executeQuery();
                while (rs.next()) {
                    gId_id.setText(rs.getString("idGrpNumGen"));
                }

                model.addRow(new Object[]{jComboBox1.getSelectedItem().toString() + "." + jComboBox2.getSelectedItem().toString()});

                String generateSID = (jComboBox1.getSelectedItem().toString() + "." + jComboBox2.getSelectedItem().toString());

                String queryAddSubGen = "INSERT INTO SubGrpGenerate (sGno, SubGrpGenName, gId) VALUES (?,?,?)";
                pst = connection.prepareStatement(queryAddSubGen);
                pst.setString(1, jComboBox2.getSelectedItem().toString());
                pst.setString(2, generateSID);
                pst.setString(3, gId_id.getText());
                pst.executeUpdate();
                model.setRowCount(0);
                pst.close();

                String queryGetAllDeta = "select sGid from all_details where gId =?";
                psGetAll = connection.prepareStatement(queryGetAllDeta);
                psGetAll.setString(1, jComboBox1.getSelectedItem().toString());
                rs = psGetAll.executeQuery();
//                System.out.println(generateSID);
                String ck_sGid = null;

                while (rs.next()) {
                    ck_sGid = rs.getString("sGid");
                }
//                System.out.println(ck_sGid);
                if (ck_sGid.isEmpty()) {

                    System.out.println(ck_sGid);
                    String queryUpAllDeta = "UPDATE all_details SET sGid=? where gId=?";
                    psUpAll = connection.prepareStatement(queryUpAllDeta);
                    psUpAll.setString(1, generateSID);
                    psUpAll.setString(2, jComboBox1.getSelectedItem().toString());
                    psUpAll.executeUpdate();

                } else {

                    String q1 = "select yNsId from GroupNumGenerate where grpNum=?";
                    smt1 = connection.prepareStatement(q1);
                    smt1.setString(1, jComboBox1.getSelectedItem().toString());
                    ResultSet rs1 = smt1.executeQuery();
                    String rs_q1 = "";
                    while (rs1.next()) {
                        rs_q1 = rs1.getString("yNsId");
                    }

                    String q2 = "select yerName from AcdYerAndSem where idAcdYerAndSem=?";
                    smt2 = connection.prepareStatement(q2);
                    smt2.setString(1, rs_q1);
                    ResultSet rs2 = smt2.executeQuery();
                    String yNs = "";
                    while (rs2.next()) {
                        yNs = rs2.getString("yerName");
                    }

                    String q3 = "select dpId from GroupNumGenerate where grpNum=?";
                    smt3 = connection.prepareStatement(q3);
                    smt3.setString(1, jComboBox1.getSelectedItem().toString());
                    ResultSet rs3 = smt3.executeQuery();
                    String rs_q2 = "";
                    while (rs3.next()) {
                        rs_q2 = rs3.getString("dpId");
                    }

                    String q4 = "select degName from DegreePro where idDegPro=?";
                    smt4 = connection.prepareStatement(q4);
                    smt4.setString(1, rs_q2);
                    ResultSet rs4 = smt4.executeQuery();
                    String dp = "";
                    while (rs4.next()) {
                        dp = rs4.getString("degName");
                    }

                    String q5 = "select gnoId from GroupNumGenerate where grpNum=?";
                    smt5 = connection.prepareStatement(q5);
                    smt5.setString(1, jComboBox1.getSelectedItem().toString());
                    ResultSet rs5 = smt5.executeQuery();
                    String rs_q3 = "";
                    while (rs5.next()) {
                        rs_q3 = rs5.getString("gnoId");
                    }

                    String q6 = "select grp_num from GroupNum where idGrp_num=?";
                    smt6 = connection.prepareStatement(q6);
                    smt6.setString(1, rs_q3);
                    ResultSet rs6 = smt6.executeQuery();
                    String gNo = "";
                    while (rs6.next()) {
                        gNo = rs6.getString("grp_num");
                    }

                    String queryAddAllDeta = "INSERT INTO all_details (yNs, dp, gNo, gId, sGid) VALUES (?, ?, ?, ?, ?)";
                    smt7 = connection.prepareStatement(queryAddAllDeta);
                    smt7.setString(1, yNs);
                    smt7.setString(2, dp);
                    smt7.setString(3, gNo);
                    smt7.setString(4, jComboBox1.getSelectedItem().toString());
                    smt7.setString(5, generateSID);
                    smt7.executeUpdate();

                }

                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                showYnSList();

                JOptionPane.showMessageDialog(this, "Inserting Successful!");

            }

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, e);
        }


    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked

    }//GEN-LAST:event_btn_deleteMouseClicked

    private void tbl_sub_id_genMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sub_id_genMouseClicked

        errorMsg.setVisible(false);

        int selectedRow = tbl_sub_id_gen.getSelectedRow();
//        System.out.println(selectedRow);
        int Id = (int) tbl_sub_id_gen.getValueAt(selectedRow, 0);
        String valueAt = (String) tbl_sub_id_gen.getValueAt(selectedRow, 1);
        String valuId = String.valueOf(Id);
        id.setText(valuId);

        String[] val = valueAt.split("");

        String first = val[0] + val[1] + val[2] + val[3] + val[4] + val[5] + val[6] + val[7] + val[8] + val[9] + val[10];
        jComboBox1.setSelectedItem(first);

        String second = val[12] + val[13];
        jComboBox2.setSelectedItem(second);

        TableModel mt = tbl_sub_id_gen.getModel();
        sgid.setText(mt.getValueAt(selectedRow, 1).toString());
    }//GEN-LAST:event_tbl_sub_id_genMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

//        try {
        //
        //            int selectedRow = tbl_sub_id_gen.getSelectedRow();
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
        //                    String newSubId = jComboBox1.getSelectedItem() + "." + jComboBox2.getSelectedItem();
        //
        //                    int i = sig.updateHandleClick(final_id, newSubId);
        ////                System.out.println(i);
        //                    if (i != 0) {
        ////                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
        //                        JOptionPane.showMessageDialog(this, "Successfully Updated!");
        //                        showYnSList();
        //                    } else {
        //                        JOptionPane.showMessageDialog(this, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
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
        int selectedRow = tbl_sub_id_gen.getSelectedRow();
        String sId = id.getText().toString();
        String newGenerateID = (jComboBox1.getSelectedItem().toString() + "." + jComboBox2.getSelectedItem().toString());

        try {

            DefaultTableModel model = (DefaultTableModel) tbl_sub_id_gen.getModel();
            Connection connection = DBConnection.getConnection();

            if (selectedRow == -1) {
                errorMsg.setVisible(true);
                errorMsg.setText("Select Sub Group ID*");

            } else {

                errorMsg.setVisible(true);
                errorMsg.setText("");

                TableModel mt = tbl_sub_id_gen.getModel();
//                id.setText(mt.getValueAt(selectedRow, 1).toString());

                String queryUpSubGrpGen = "UPDATE SubGrpGenerate SET SubGrpGenName=? WHERE idSubGrpGen=?";
                upsmt1 = connection.prepareStatement(queryUpSubGrpGen);
                upsmt1.setString(1, newGenerateID);
                upsmt1.setString(2, id.getText().toString());
                upsmt1.executeUpdate();
//                System.out.println(queryUpGrpGen);

                String queryUpAllDetils = "UPDATE all_details SET sGid=? WHERE sGid=?";
                upsmt2 = connection.prepareStatement(queryUpAllDetils);
                upsmt2.setString(1, newGenerateID);
                upsmt2.setString(2, sgid.getText().toString());
                upsmt2.executeUpdate();

//                System.out.println(sId);
                model.setRowCount(0);
                showYnSList();

                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);

                JOptionPane.showMessageDialog(this, "Record Updated!");

            }

        } catch (Exception e) {
            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

//        int selectedRow = tbl_sub_id_gen.getSelectedRow();
//
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
//                    int i = sig.deleteHandleClick(final_id);
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
        int selectedRow = tbl_sub_id_gen.getSelectedRow();
        String sId = id.getText().toString();

        int v = JOptionPane.showConfirmDialog(this, "Are You Sure Delete", "Delete", JOptionPane.YES_NO_OPTION);

        if (v == JOptionPane.YES_OPTION) {
            
            try {

            DefaultTableModel model = (DefaultTableModel) tbl_sub_id_gen.getModel();

            Connection connection = DBConnection.getConnection();

            if (selectedRow == -1) {
                errorMsg.setVisible(true);
                errorMsg.setText("Select Sub Group ID*");

            } else {
                errorMsg.setText("");

                TableModel mt = tbl_sub_id_gen.getModel();
                sgid.setText(mt.getValueAt(selectedRow, 1).toString());

                String q1 = "DELETE FROM SubGrpGenerate WHERE idSubGrpGen=?";
                delsmt1 = connection.prepareStatement(q1);
                delsmt1.setString(1, sId);
                delsmt1.executeUpdate();

                String q2 = "DELETE FROM all_details WHERE sGid=?";
                delsmt2 = connection.prepareStatement(q2);
                delsmt2.setString(1, sgid.getText().toString());
                delsmt2.executeUpdate();

                model.setRowCount(0);
                showYnSList();
                JOptionPane.showMessageDialog(this, "Record Deleted!");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        } else {
        }


    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        id.setText(" ");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        showYnSList();

    }//GEN-LAST:event_jButton1ActionPerformed

    public void yNsSelection() {
        PreparedStatement pst;
        ResultSet rs;

        try {

            Connection connection = DBConnection.getConnection();

            String query = "select * from GroupNumGenerate";
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String grpNum = rs.getString("GrpNum");
                jComboBox1.addItem(grpNum);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void sGnSelection() {
        PreparedStatement pst;
        ResultSet rs;

        try {

            Connection connection = DBConnection.getConnection();

            String query = "select * from SubGrpNumtbl";
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String grpNum = rs.getString("subGrpNum");
                jComboBox2.addItem(grpNum);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("idSubGrpGen", "int");
        hm.put("SubGrpGenName", "String");

        new LoadTable(tbl_sub_id_gen, "Select * from SubGrpGenerate", hm);
    }

    public boolean inputDataValidator() throws SQLException {

        String degPro = jComboBox1.getSelectedItem() + "." + jComboBox2.getSelectedItem();

        if (degPro.isEmpty()) {
            errorMsg.setText("Sub Group Number is Required.");
            errorMsg.setVisible(true);
            return false;
        }
        return true;
    }

    public boolean allReady() {

        String subId = jComboBox1.getSelectedItem() + "." + jComboBox2.getSelectedItem();

        try {
            if (!sig.getAllReady(subId)) {

                errorMsg.setText("Sub Group Number Already Exist");
                errorMsg.setVisible(true);
                return false;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Degree.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel gId_id;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel sgid;
    private javax.swing.JTable tbl_sub_id_gen;
    // End of variables declaration//GEN-END:variables
}
