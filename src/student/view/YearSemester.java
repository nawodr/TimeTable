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
import javafx.util.Pair;
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
        id.setVisible(false);
        showYnSList();
    }

    YearSemController yc = new YearSemController();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_acd_yer_and_sem = new javax.swing.JTextField();
        errorMsg = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_year = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();
        btn_delete_yer_and_sem = new javax.swing.JButton();
        btn_update_yer_sem = new javax.swing.JButton();
        btn_acd_yer_and_sem = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Academic Year And Semester");

        errorMsg.setForeground(java.awt.Color.red);
        errorMsg.setText("Error Message");

        id.setText("id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(txt_acd_yer_and_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(id)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_acd_yer_and_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMsg)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tbl_year.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Academic Year And Semester"
            }
        ));
        tbl_year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_yearMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_year);

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_delete_yer_and_sem.setText("Delete");
        btn_delete_yer_and_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_yer_and_semActionPerformed(evt);
            }
        });

        btn_update_yer_sem.setText("Update");
        btn_update_yer_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_yer_semActionPerformed(evt);
            }
        });

        btn_acd_yer_and_sem.setText("Submit");
        btn_acd_yer_and_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acd_yer_and_semActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_acd_yer_and_sem)
                        .addGap(40, 40, 40)
                        .addComponent(btn_update_yer_sem)
                        .addGap(38, 38, 38)
                        .addComponent(btn_delete_yer_and_sem)
                        .addGap(30, 30, 30)
                        .addComponent(btn_back))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, Short.MAX_VALUE)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete_yer_and_sem)
                    .addComponent(btn_back)
                    .addComponent(btn_update_yer_sem)
                    .addComponent(btn_acd_yer_and_sem))
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acd_yer_and_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acd_yer_and_semActionPerformed

        try {

            if (inputDataValidator() == true && allReady() == true) {

                errorMsg.setVisible(false);

                String yer_sem = txt_acd_yer_and_sem.getText().trim().toUpperCase();
                showYnSList();
                int i = yc.addHandleClick(yer_sem);
                if (i != 0) {
                    JOptionPane.showMessageDialog(jPanel1, "Successfully Addeda!", "Done", JOptionPane.PLAIN_MESSAGE);
                    txt_acd_yer_and_sem.setText("");

                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (SQLException ex) {

//            Logger.getLogger(Degree.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(jPanel1, "Failed! MYSQL ERROR", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btn_acd_yer_and_semActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
//        jPanel1.removeAll();
//        jPanel1.add(new pnl_Student());
//        jPanel1.revalidate();
//        jPanel1.repaint();


    }//GEN-LAST:event_btn_backActionPerformed

    private void tbl_yearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_yearMouseClicked

        int selectedRow = tbl_year.getSelectedRow();
        int Id = (int) tbl_year.getValueAt(selectedRow, 0);
        String valueAt = (String) tbl_year.getValueAt(selectedRow, 1);
        String valuId = String.valueOf(Id);
        id.setText(valuId);
        txt_acd_yer_and_sem.setText(valueAt);

    }//GEN-LAST:event_tbl_yearMouseClicked

    private void btn_delete_yer_and_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_yer_and_semActionPerformed

        String idYS = id.getText();
        int final_id = Integer.parseInt(idYS);

        int v = JOptionPane.showConfirmDialog(jPanel1, "Are You Sure Delete", "Delete", JOptionPane.YES_NO_OPTION);

        if (v == JOptionPane.YES_OPTION) {

            try {

                int i = yc.deleteHandleClick(final_id);

                if (i != 0) {
//                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(jPanel1, "Successfully Deleted!");
                    txt_acd_yer_and_sem.setText("");
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

    }//GEN-LAST:event_btn_delete_yer_and_semActionPerformed

    private void btn_update_yer_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_yer_semActionPerformed

        String idYS = id.getText();
        int final_id = Integer.parseInt(idYS);

        try {

            if (inputDataValidator() == true && allReady() == true) {

                errorMsg.setVisible(false);

                String yer_sem = txt_acd_yer_and_sem.getText().trim().toUpperCase();

                int i = yc.updateHandleClick(final_id, yer_sem);
//                System.out.println(i);
                if (i != 0) {
//                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!");
                    txt_acd_yer_and_sem.setText("");
                    showYnSList();
                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_update_yer_semActionPerformed

    public boolean inputDataValidator() throws SQLException {

        String degPro = txt_acd_yer_and_sem.getText().toString();

        if (degPro.isEmpty()) {
            errorMsg.setText("Academic Year And Semester is Required.");
            errorMsg.setVisible(true);
            return false;
        }
        return true;
    }

    public boolean allReady() {

        String degPro = txt_acd_yer_and_sem.getText().toString().toUpperCase();

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
        HashMap hm = new HashMap();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_year;
    private javax.swing.JTextField txt_acd_yer_and_sem;
    // End of variables declaration//GEN-END:variables

}
