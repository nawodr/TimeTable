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
public class pnl_AddBuilding extends javax.swing.JPanel {

    addLocations addLoc = new addLocations();

    /**
     * Creates new form SessionRoom
     */
    public pnl_AddBuilding() throws SQLException {
        initComponents();
        refreshData();
        lbl_Id.setVisible(false);
        lbl_Rtype1.setVisible(false);
        lbl_Error.setVisible(false);
    }

    public void resetForm() {
        txt_buildingName.setText("");
    }

    public void refreshData() throws SQLException {
        try {
            showYnSList();

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
        tbl_Session = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_Add = new javax.swing.JButton();
        cus_Update1 = new javax.swing.JButton();
        cus_delete1 = new javax.swing.JButton();
        cus_New1 = new javax.swing.JButton();
        cus_Exit1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_Rtype1 = new javax.swing.JLabel();
        lbl_Id1 = new javax.swing.JLabel();
        txt_buildingName = new javax.swing.JTextField();
        lbl_Error = new javax.swing.JLabel();
        lbl_Id = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(1005, 528));

        tbl_Session.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Building Id", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Session.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SessionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_Session);
        if (tbl_Session.getColumnModel().getColumnCount() > 0) {
            tbl_Session.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Building Details");
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
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cus_Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cus_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cus_New1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cus_Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Building Name");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText(":");

        lbl_Error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Id1)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buildingName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(lbl_Rtype1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_Id1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbl_Rtype1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txt_buildingName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)
                        .addGap(6, 6, 6)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Id)
                .addGap(10, 10, 10)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_SessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SessionMouseClicked
        //set data to text fields
        DefaultTableModel mdl = (DefaultTableModel) tbl_Session.getModel();

        //set data to text fields when row is selected
        String tblId = mdl.getValueAt(tbl_Session.getSelectedRow(), 0).toString();
        String tblSub = mdl.getValueAt(tbl_Session.getSelectedRow(), 1).toString();

        //set values to text fields
        lbl_Id.setText(tblId);
        txt_buildingName.setText(tblSub);
    }//GEN-LAST:event_tbl_SessionMouseClicked

    private void cus_Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_Exit1ActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Exit", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (res == 0) {
            Component comp = SwingUtilities.getRoot(this);
            ((Window) comp).dispose();
        }

    }//GEN-LAST:event_cus_Exit1ActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();

        String buildingId = txt_buildingName.getText();
        String query = "Select name FROM building_Details WHERE name = ?";
        String colName = "name";
        try {
            if (txt_buildingName.getText().isEmpty()) {
                lbl_Error.setVisible(true);
                lbl_Error.setText("Please Enter Building Name");
                txt_buildingName.grabFocus();

            } else if (addLoc.isExist(buildingId, query, colName)) {

                JOptionPane.showMessageDialog(null, "This Building Already Exist!", "Validation", JOptionPane.ERROR_MESSAGE);
            } else {
                ps = connection.prepareStatement("INSERT INTO building_Details (name) VALUES (?)");

                // set db value
                ps.setString(1, txt_buildingName.getText());

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Building Added Successfully", "Add Buildings", JOptionPane.INFORMATION_MESSAGE);
                showYnSList();
                resetForm();
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnl_AddBuilding.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void cus_Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_Update1ActionPerformed
        try {
            PreparedStatement ps = null;
            Connection connection = DBConnection.getConnection();

            String buildingId = txt_buildingName.getText();
            String query = "Select name FROM building_Details WHERE name = ?";
            String colName = "name";
            if (lbl_Id.getText().isEmpty()) {
                lbl_Error.setVisible(true);
                lbl_Error.setText("Please Select Row you Want To Update");

            } else if (addLoc.isExist(buildingId, query, colName)) {

                JOptionPane.showMessageDialog(null, "This Building Name Already Exist!", "Validation", JOptionPane.ERROR_MESSAGE);
            } else {
                int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Update", "Update Building", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (res == 0) {
                    ps = connection.prepareStatement("UPDATE building_Details SET name = ?"
                            + " WHERE id = ?");
                }

                // set db value
                ps.setString(1, txt_buildingName.getText());
                ps.setString(2, buildingId);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Building Name Update Successfully", "Update Building", JOptionPane.INFORMATION_MESSAGE);
                showYnSList();
                resetForm();
            }

        } catch (SQLException ex) {
            Logger.getLogger(pnl_AddBuilding.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cus_Update1ActionPerformed

    private void cus_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_delete1ActionPerformed
        if (lbl_Id.getText().isEmpty()) {
            lbl_Error.setVisible(true);
            lbl_Error.setText("Please Select Row you Want To Delete");
        } else {
            int res = JOptionPane.showConfirmDialog(null, "Are Sure Want To Delete", "Delete Location", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (res == 0) {
                Connection connection = DBConnection.getConnection();
                PreparedStatement ps = null;

                String buildingId = lbl_Id.getText();

                try {
                    ps = connection.prepareStatement("DELETE FROM building_Details WHERE id = ?");
                    ps.setString(1, buildingId);
                    ps.executeUpdate();
                    showYnSList();
                    JOptionPane.showMessageDialog(null, "Building Deleted successfully!", "Delete Building", JOptionPane.INFORMATION_MESSAGE);
                    resetForm();
                } catch (SQLException ex) {
                    Logger.getLogger(pnl_AddBuilding.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_cus_delete1ActionPerformed
    }
    private void cus_New1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_New1ActionPerformed
        resetForm();
    }//GEN-LAST:event_cus_New1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton cus_Exit1;
    private javax.swing.JButton cus_New1;
    private javax.swing.JButton cus_Update1;
    private javax.swing.JButton cus_delete1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Id1;
    private javax.swing.JLabel lbl_Rtype1;
    private javax.swing.JTable tbl_Session;
    private javax.swing.JTextField txt_buildingName;
    // End of variables declaration//GEN-END:variables

    public void showYnSList() {
        LinkedHashMap hm = new LinkedHashMap();

        hm.put("id", "String");
        hm.put("name", "String");

        new LoadTable(tbl_Session, "SELECT * FROM building_Details", hm);
    }

}
