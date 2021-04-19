/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import student.view.GrpIdGenerate;

/**
 *
 * @author RPsandeepa
 */
public class addConsecutiveSession extends javax.swing.JPanel {

    Connection connection = DBConnection.getConnection();
    PreparedStatement pst, pst1, pst2, pst3, pst4, pst5;
    ResultSet rs;
    String finalTags = null;
    String sessID = null;
    ArrayList<ConsecutiveSession> Conseclist = new ArrayList<ConsecutiveSession>();

    /**
     * Creates new form addConsecutiveSession
     */
    public addConsecutiveSession() {
        initComponents();
        txt_id.setVisible(false);
        SubGroupSelection();
        txt_csSelectionId.setVisible(false);
        txt_csSelectedId.setVisible(false);
//        showConsecutiveSessionNList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_csSelection = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_csSelected = new javax.swing.JTable();
        btn_select = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        txt_csSelectedId = new javax.swing.JTextField();
        txt_csSelectionId = new javax.swing.JTextField();
        btn_set = new javax.swing.JButton();
        txt_error_selection = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_cs = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btn_deletecs = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        selection_sId = new javax.swing.JComboBox<>();
        txt_error_cs = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Consective Session");

        tbl_csSelection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Session", "Tag"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_csSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csSelectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_csSelection);

        tbl_csSelected.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Session", "Tag"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_csSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csSelectedMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_csSelected);

        btn_select.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_select.setText("Add");
        btn_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectActionPerformed(evt);
            }
        });

        btn_remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_set.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_set.setText("Set");
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });

        txt_error_selection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error_selection.setForeground(new java.awt.Color(255, 51, 51));
        txt_error_selection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tbl_cs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Group ID", "Consecutive Session", "Session ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_cs);

        jPanel5.setBackground(new java.awt.Color(155, 27, 27));

        btn_deletecs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_deletecs.setText("Delete");
        btn_deletecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletecsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_deletecs)
                .addGap(43, 43, 43))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_deletecs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Group Id");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        selection_sId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        txt_error_cs.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(398, 398, 398))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_error_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_csSelectedId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_csSelectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btn_set, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jScrollPane6)
                .addGap(18, 18, 18)
                .addComponent(txt_error_cs)
                .addGap(151, 151, 151))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selection_sId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(359, 359, 359))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selection_sId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_csSelectedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_csSelectionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_select)
                        .addGap(18, 18, 18)
                        .addComponent(btn_remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_error_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_set))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txt_error_cs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_csMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csMouseClicked
        // TODO add your handling code here:
        int i = tbl_cs.getSelectedRow();
        TableModel model = tbl_cs.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_csMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_csSelection.getModel();
        model.setRowCount(0);
        String sGid = selection_sId.getSelectedItem().toString();
        showSessionNList(sGid);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_csSelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csSelectionMouseClicked
        int i = tbl_csSelection.getSelectedRow();
        TableModel model = tbl_csSelection.getModel();
        txt_csSelectionId.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_csSelectionMouseClicked

    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectActionPerformed
        if (txt_csSelectionId.getText().equals("")) {

            txt_error_selection.setText("Select First*");
        } else {
            txt_error_selection.setText("");
            String selected_id = txt_csSelectionId.getText();
            showSelectedSessionNList(selected_id);
        }
    }//GEN-LAST:event_btn_selectActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        if (txt_csSelectedId.getText().equals("")) {

            txt_error_selection.setText("Select First*");
        } else {
            txt_error_selection.setText("");
            DefaultTableModel model = (DefaultTableModel) tbl_csSelected.getModel();
            model.removeRow(Integer.parseInt(txt_csSelectedId.getText()) - 1);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void tbl_csSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csSelectedMouseClicked
        int i = tbl_csSelected.getSelectedRow();
        TableModel model = tbl_csSelection.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_csSelectedId.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_csSelectedMouseClicked

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed

        try {

            DefaultTableModel model = (DefaultTableModel) tbl_csSelected.getModel();
            DefaultTableModel model2 = (DefaultTableModel) tbl_cs.getModel();
            
            if(tbl_csSelected.getRowCount() == 0){
                txt_error_selection.setText("Select Sessions First*");
            }else{
                txt_error_selection.setText("");
                
                TagCreator();
                
                String sessionList[] = sessID.split(",");
                boolean lock = false;
                Conseclist = getConsecutiveSessionNList();
                
                for (int x = 0; x < sessionList.length; x++) {

                    for (int i = 0; i < Conseclist.size(); i++) {
                        String sessionList2[] = Conseclist.get(i).getSessionID().split(",");

                        for (int a = 0; a < sessionList2.length; a++) {
                            if (sessionList[x].equals(sessionList2[a])) {
                                lock = true;
                            }
                        }
                    }
                }
                
                if (lock) {
                    txt_error_selection.setText("This Sessions Already Exist");
                } else {
                    
                    String q1 = "insert into sp2_consecutive_session (sGid,cSession,sessionID) values (?,?,?)";
                    pst4 = connection.prepareStatement(q1);
                    pst4.setString(1, selection_sId.getSelectedItem().toString());
                    pst4.setString(2, finalTags);
                    pst4.setString(3, sessID);
                    
                    pst4.executeUpdate();
                    
                    model.setRowCount(0);
                    model2.setRowCount(0);
                    showConsecutiveSessionNList();
                    txt_id.setText("");
                    JOptionPane.showMessageDialog(null, "Inserting Successful!");
                    
                }
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_setActionPerformed

    private void btn_deletecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletecsActionPerformed
        
        try {
            
            DefaultTableModel model = (DefaultTableModel) tbl_cs.getModel();
            
            if (txt_id.getText().equals("")) {

                txt_error_cs.setText("Select First*");
            }else {
                txt_error_cs.setText("");
                
                String id = txt_id.getText();
                
                String q2 = "DELETE FROM sp2_consecutive_session WHERE id=?";
                pst5 = connection.prepareStatement(q2);
                pst5.setString(1, id);
                pst5.executeUpdate();
                model.setRowCount(0);
                showConsecutiveSessionNList();
                txt_id.setText("");
                JOptionPane.showMessageDialog(this, "Deleted");
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btn_deletecsActionPerformed

    public ArrayList<sessionDetails> getselectedSessionNList(String id) {
        ArrayList<sessionDetails> list = new ArrayList<sessionDetails>();
        try {

            String querry = "select * from session where id =?";
            pst2 = connection.prepareStatement(querry);
            pst2.setString(1, id);
            rs = pst2.executeQuery();
            sessionDetails sDetails;
            while (rs.next()) {
                sDetails = new sessionDetails(rs.getInt("id"), rs.getString("subject"), rs.getString("tag"), rs.getString("subgroup_id"));
                list.add(sDetails);
            }

        } catch (Exception e) {
            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public void showSelectedSessionNList(String id) {
        ArrayList<sessionDetails> list = getselectedSessionNList(id);
        DefaultTableModel model = (DefaultTableModel) tbl_csSelected.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSession();
            row[2] = list.get(i).gettag();

            model.addRow(row);
        }
    }

    public void SubGroupSelection() {
        try {

            String query = "SELECT * FROM session group by group_id";
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery();

            String Gid = rs.getString("group_id");
            if (Gid != null) {
                selection_sId.addItem(Gid);
//                System.out.println(Gid);
            }

        } catch (Exception e) {
        }
    }

    public ArrayList<sessionDetails> getSessionNList(String sGid) {

        ArrayList<sessionDetails> list = new ArrayList<sessionDetails>();

        try {

            String querry = "select * from session where group_id =?";
            pst1 = connection.prepareStatement(querry);
            pst1.setString(1, sGid);
            rs = pst1.executeQuery();

            sessionDetails sDetails;

            while (rs.next()) {
                sDetails = new sessionDetails(rs.getInt("id"), rs.getString("subject"), rs.getString("tag"), rs.getString("group_id"));
                list.add(sDetails);
            }

        } catch (Exception e) {
            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, e);
        }

        return list;
    }

    public void showSessionNList(String sGid) {
        ArrayList<sessionDetails> list = getSessionNList(sGid);
        DefaultTableModel model = (DefaultTableModel) tbl_csSelection.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSession();
            row[2] = list.get(i).gettag();

            model.addRow(row);
        }
    }
    
    public void TagCreator() {
        DefaultTableModel model = (DefaultTableModel) tbl_csSelected.getModel();
        int x = tbl_csSelected.getRowCount();
        String[] tags = new String[x];
        String[] newtags = new String[x];

        newtags[0] = model.getValueAt(0, 2).toString() + ',' + model.getValueAt(0, 1).toString();
        sessID = model.getValueAt(0, 0).toString();
        int i = 1;
        while (x != i) {

            tags[i] = model.getValueAt(i, 2).toString() + ',' + model.getValueAt(i, 1).toString();
            newtags[i] = '(' + newtags[i - 1] + ')' + ',' + '(' + tags[i] + ')';
            finalTags = newtags[i];
            sessID = sessID.concat("," + model.getValueAt(i, 0));
            i++;
        }
    }
    
    public ArrayList<ConsecutiveSession> getConsecutiveSessionNList() {
        ArrayList<ConsecutiveSession> list = new ArrayList<>();
        try {

            String querry = "select * from sp2_consecutive_session";
            pst3 = connection.prepareStatement(querry);           
            rs = pst3.executeQuery();
            ConsecutiveSession ConsecutiveSession;
            while (rs.next()) {
                ConsecutiveSession = new ConsecutiveSession(rs.getInt("id"), rs.getString("sGid"), rs.getString("cSession"), rs.getString("sessionID"));
                list.add(ConsecutiveSession);
            }

        } catch (Exception e) {
            Logger.getLogger(GrpIdGenerate.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    
    public void showConsecutiveSessionNList() {
        ArrayList<ConsecutiveSession> list = getConsecutiveSessionNList();
        DefaultTableModel model = (DefaultTableModel) tbl_cs.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getsGid();
            row[2] = list.get(i).getcSession();
            row[3] = list.get(i).getSessionID();

            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deletecs;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_set;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> selection_sId;
    private javax.swing.JTable tbl_cs;
    private javax.swing.JTable tbl_csSelected;
    private javax.swing.JTable tbl_csSelection;
    private javax.swing.JTextField txt_csSelectedId;
    private javax.swing.JTextField txt_csSelectionId;
    private javax.swing.JLabel txt_error_cs;
    private javax.swing.JLabel txt_error_selection;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
