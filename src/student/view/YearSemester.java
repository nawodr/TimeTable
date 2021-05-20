/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DB.DBConnection;
import java.sql.Connection;
import java.util.HashMap;
import java.util.LinkedHashMap;
//import javafx.util.Pair;
import javax.swing.JButton;
import student.controller.YearSemController;
import student.util.LoadTable;

/**
 *
 * @author RPsandeepa
 */
public class YearSemester extends javax.swing.JPanel {

    public YearSemester() {
        initComponents();
        errorMsg.setVisible(false);
//        id.setVisible(false);
        showYnSList();
    }

    YearSemController yc = new YearSemController();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        errorMsg = new javax.swing.JLabel();
        txt_acd_yer_and_sem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_year = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_delete_yer_and_sem = new javax.swing.JButton();
        btn_update_yer_sem = new javax.swing.JButton();
        btn_acd_yer_and_sem = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Selected ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Academic Year And Semester");

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setText("id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("*");

        errorMsg.setForeground(java.awt.Color.red);
        errorMsg.setText("Error Message");

        txt_acd_yer_and_sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Y1.S1", "Y1.S2", "Y2.S1", "Y2.S2", "Y3.S1", "Y3.S2", "Y4.S1", "Y4.Y2" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_acd_yer_and_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_acd_yer_and_sem, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        tbl_year.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Academic Year And Semester"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_yearMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_year);
        if (tbl_year.getColumnModel().getColumnCount() > 0) {
            tbl_year.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_year.getColumnModel().getColumn(1).setPreferredWidth(900);
        }

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btn_delete_yer_and_sem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete_yer_and_sem.setText("Delete");
        btn_delete_yer_and_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_yer_and_semActionPerformed(evt);
            }
        });

        btn_update_yer_sem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update_yer_sem.setText("Update");
        btn_update_yer_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_yer_semActionPerformed(evt);
            }
        });

        btn_acd_yer_and_sem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_acd_yer_and_sem.setText("Submit");
        btn_acd_yer_and_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acd_yer_and_semActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back.setText("Reset");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_acd_yer_and_sem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update_yer_sem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete_yer_and_sem)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete_yer_and_sem)
                    .addComponent(btn_update_yer_sem)
                    .addComponent(btn_acd_yer_and_sem)
                    .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Year And Semester Details");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel3)))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acd_yer_and_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acd_yer_and_semActionPerformed

        try {

            if (inputDataValidator() == true && allReady() == true) {

                errorMsg.setVisible(false);

                String yer_sem = txt_acd_yer_and_sem.getSelectedItem().toString();
                showYnSList();
                int i = yc.addHandleClick(yer_sem);
                if (i != 0) {
                    JOptionPane.showMessageDialog(jPanel1, "Successfully Addeda!", "Done", JOptionPane.PLAIN_MESSAGE);
                    txt_acd_yer_and_sem.setSelectedItem("Select");

                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
            showYnSList();
        } catch (SQLException ex) {

//            Logger.getLogger(Degree.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(jPanel1, "Failed! MYSQL ERROR", "Error", JOptionPane.ERROR_MESSAGE);

        }
        showYnSList();
    }//GEN-LAST:event_btn_acd_yer_and_semActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        id.setText(" ");
        txt_acd_yer_and_sem.setSelectedItem("Select");
        showYnSList();

        // TODO add your handling code here:
//        jPanel1.removeAll();
//        jPanel1.add(new pnl_Student());
//        jPanel1.revalidate();
//        jPanel1.repaint();

    }//GEN-LAST:event_btn_backActionPerformed

    private void tbl_yearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_yearMouseClicked

        errorMsg.setVisible(false);

        int selectedRow = tbl_year.getSelectedRow();
        int Id = (int) tbl_year.getValueAt(selectedRow, 0);
        String valueAt = (String) tbl_year.getValueAt(selectedRow, 1);
        String valuId = String.valueOf(Id);
        id.setText(valuId);
        txt_acd_yer_and_sem.setSelectedItem(valueAt);

    }//GEN-LAST:event_tbl_yearMouseClicked

    private void btn_delete_yer_and_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_yer_and_semActionPerformed

        errorMsg.setVisible(false);

        int selectedRow = tbl_year.getSelectedRow();

        if (selectedRow != -1) {

            String idYS = id.getText();
            int final_id = Integer.parseInt(idYS);

            int v = JOptionPane.showConfirmDialog(jPanel1, "Are You Sure Delete", "Delete", JOptionPane.YES_NO_OPTION);

            if (v == JOptionPane.YES_OPTION) {

                try {

                    int i = yc.deleteHandleClick(final_id);

                    if (i != 0) {
//                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(jPanel1, "Successfully Deleted!");
                        txt_acd_yer_and_sem.setSelectedItem("Select");
                        showYnSList();

                    } else {
                        JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException ex) {

                    Logger.getLogger(YearSemester.class.getName()).log(Level.SEVERE, null, ex);

                }

            } else if (v == JOptionPane.NO_OPTION) {

            } else {

            }

        } else {
            errorMsg.setText("Please Selected Row");
            errorMsg.setVisible(true);
        }
        showYnSList();
    }//GEN-LAST:event_btn_delete_yer_and_semActionPerformed

    private void btn_update_yer_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_yer_semActionPerformed

        try {

            int selectedRow = tbl_year.getSelectedRow();

            if (selectedRow != -1) {

                errorMsg.setVisible(false);

                String idYS = id.getText();
                int final_id = Integer.parseInt(idYS);

                if (inputDataValidator() == true && allReady() == true) {

                    errorMsg.setVisible(false);

                    String yer_sem = txt_acd_yer_and_sem.getSelectedItem().toString();

                    int i = yc.updateHandleClick(final_id, yer_sem);
//                System.out.println(i);
                    if (i != 0) {
//                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!");
                        txt_acd_yer_and_sem.setSelectedItem("Select");
                        showYnSList();
                    } else {
                        JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

            } else {
                errorMsg.setText("Please Selected Row");
                errorMsg.setVisible(true);
            }
            showYnSList();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_update_yer_semActionPerformed

    public boolean inputDataValidator() throws SQLException {

        String degPro = txt_acd_yer_and_sem.getSelectedItem().toString();

        if (degPro.equals("Select")) {
            errorMsg.setText("Academic Year And Semester is Required.");
            errorMsg.setVisible(true);
            return false;
        }
        return true;
    }

    public boolean allReady() {

        String degPro = txt_acd_yer_and_sem.getSelectedItem().toString().toUpperCase();

        try {
            if (!yc.getAllReady(degPro)) {

                errorMsg.setText("Academic Year And Semester Already Exist");
                errorMsg.setVisible(true);
                return false;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Degree.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("idAcdYerAndSem", "int");
        hm.put("yerName", "String");

        new LoadTable(tbl_year, "Select * from AcdYerAndSem", hm);

    }

//    public void refreshTable()
//    {
//        try{
//            Connection connection = DBConnection.getConnection();
//            String querry = "select * from AcdYerAndSem";
//            Statement st;
//            ResultSet rs;
//            
//            st = connection.createStatement();
//            rs= st.executeQuery(querry);
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
    /**
     *
     * Customer inputs validate (check Customer Code, Telphone Number, Email are
     * already exist or not)
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acd_yer_and_sem;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete_yer_and_sem;
    private javax.swing.JButton btn_update_yer_sem;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tbl_year;
    private javax.swing.JComboBox<String> txt_acd_yer_and_sem;
    // End of variables declaration//GEN-END:variables

}
