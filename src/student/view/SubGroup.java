/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.view;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import student.controller.SubGrpController;
import student.util.LoadTable;

/**
 *
 * @author RPsandeepa
 */
public class SubGroup extends javax.swing.JPanel {

    /**
     * Creates new form Add_sub_grp_num
     */
    public SubGroup() {
        initComponents();
        errorMsg.setVisible(false);
//        id.setVisible(false);
        showYnSList();

    }

    SubGrpController sb = new SubGrpController();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sub_grp = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_sub_grp_num = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        errorMsg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_sub_grp_num = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_back_deg1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        tbl_sub_grp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
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
        tbl_sub_grp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sub_grpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sub_grp);
        if (tbl_sub_grp.getColumnModel().getColumnCount() > 0) {
            tbl_sub_grp.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_sub_grp.getColumnModel().getColumn(1).setPreferredWidth(900);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sub Group Number");

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setText("id");

        errorMsg.setForeground(java.awt.Color.red);
        errorMsg.setText("error");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Selected ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(146, 146, 146))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sub_grp_num, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(82, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_sub_grp_num, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMsg)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sub Group Details");

        jPanel2.setBackground(new java.awt.Color(155, 27, 27));

        btn_sub_grp_num.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_sub_grp_num.setText("Submit");
        btn_sub_grp_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sub_grp_numActionPerformed(evt);
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

        btn_back_deg1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back_deg1.setText("Reset");
        btn_back_deg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_deg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back_deg1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_sub_grp_num)
                .addGap(18, 18, 18)
                .addComponent(btn_update)
                .addGap(18, 18, 18)
                .addComponent(btn_del)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_back_deg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_del)
                            .addComponent(btn_update)
                            .addComponent(btn_sub_grp_num))))
                .addContainerGap())
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sub_grp_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sub_grp_numActionPerformed

        try {

            if (inputDataValidator() == true && allReady() == true) {

                String sub_grp_num = txt_sub_grp_num.getText().trim();

                int i = sb.addHandleClick(sub_grp_num);
                if (i != 0) {
                    JOptionPane.showMessageDialog(jPanel1, "Successfully Addeda!", "Done", JOptionPane.PLAIN_MESSAGE);
                    txt_sub_grp_num.setText("");
                    showYnSList();
                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }
showYnSList();
            }

        } catch (SQLException ex) {

//            Logger.getLogger(Degree.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(jPanel1, "Failed! MYSQL ERROR", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btn_sub_grp_numActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        try {

            int selectedRow = tbl_sub_grp.getSelectedRow();

            if (selectedRow != -1) {

                errorMsg.setVisible(false);

                String idYS = id.getText();
                int final_id = Integer.parseInt(idYS);

                if (inputDataValidator() == true && allReady() == true) {

                    errorMsg.setVisible(false);

                    String sub_grp_num = txt_sub_grp_num.getText().trim().toUpperCase();

                    int i = sb.updateHandleClick(final_id, sub_grp_num);
//                System.out.println(i);
                    if (i != 0) {
//                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!");
                        txt_sub_grp_num.setText("");
                        showYnSList();
                    } else {
                        JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

            } else {
                errorMsg.setText("Please Selected Row");
                errorMsg.setVisible(true);
            }

        } catch (Exception e) {
        }
showYnSList();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed

        errorMsg.setVisible(false);

        int selectedRow = tbl_sub_grp.getSelectedRow();

        if (selectedRow != -1) {

            String idYS = id.getText();
            int final_id = Integer.parseInt(idYS);

            int v = JOptionPane.showConfirmDialog(jPanel1, "Are You Sure Delete", "Delete", JOptionPane.YES_NO_OPTION);

            if (v == JOptionPane.YES_OPTION) {

                try {

                    int i = sb.deleteHandleClick(final_id);

                    showYnSList();

                    if (i != 0) {
//                    JOptionPane.showMessageDialog(jPanel1, "Successfully Updated!", "Done", JOptionPane.PLAIN_MESSAGE);
                        JOptionPane.showMessageDialog(jPanel1, "Successfully Deleted!");
                        txt_sub_grp_num.setText("");

                    } else {
                        JOptionPane.showMessageDialog(jPanel1, "Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException e) {

                    Logger.getLogger(YearSemester.class.getName()).log(Level.SEVERE, null, e);

                }

            } else if (v == JOptionPane.NO_OPTION) {

            } else {

            }

        } else {
            errorMsg.setText("Please Selected Row");
            errorMsg.setVisible(true);
        }
showYnSList();
    }//GEN-LAST:event_btn_delActionPerformed

    private void tbl_sub_grpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sub_grpMouseClicked

        errorMsg.setVisible(false);

        int selectedRow = tbl_sub_grp.getSelectedRow();
        int Id = (int) tbl_sub_grp.getValueAt(selectedRow, 0);
        String valueAt = (String) tbl_sub_grp.getValueAt(selectedRow, 1);
        String valuId = String.valueOf(Id);
        id.setText(valuId);
        txt_sub_grp_num.setText(valueAt);

    }//GEN-LAST:event_tbl_sub_grpMouseClicked

    private void btn_back_deg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_deg1ActionPerformed
        
        id.setText(" ");
        txt_sub_grp_num.setText("");
        showYnSList();

        
    }//GEN-LAST:event_btn_back_deg1ActionPerformed

    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("idSubGrpNum", "int");
        hm.put("subGrpNum", "String");

        new LoadTable(tbl_sub_grp, "Select * from SubGrpNumtbl", hm);
    }

    public boolean inputDataValidator() throws SQLException {

        String degPro = txt_sub_grp_num.getText().toString();

        if (degPro.isEmpty()) {
            errorMsg.setText("Sub Group Number is Required.");
            errorMsg.setVisible(true);
            return false;
        }
        return true;
    }

    public boolean allReady() {

        String degPro = txt_sub_grp_num.getText().toString().toUpperCase();

        try {
            if (!sb.getAllReady(degPro)) {

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
    private javax.swing.JButton btn_back_deg1;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_sub_grp_num;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_sub_grp;
    public static javax.swing.JTextField txt_sub_grp_num;
    // End of variables declaration//GEN-END:variables
}
