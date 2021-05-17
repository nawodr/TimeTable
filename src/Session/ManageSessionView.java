package Session;

import javax.swing.JOptionPane;

public class ManageSessionView extends javax.swing.JPanel {

    SessionController controller = new SessionController();
    SessionModel model = new SessionModel();
        
    int id = -99;
    String lecturers;
    String tag;
    String group_id;
    String subgroup_id;
    String sub_code;
    String subject;
    String stu_count;
    String tag_duration;
    
    public ManageSessionView() {
        
        initComponents();
        
        clearAddFields();
        
    }

    public void clearAddFields() {
        
        controller.loadSessionTable(sessionTable);
        
        clearVariable();
        
    }
    
    public void clearVariable() {
    
        id = -99;
        lecturers = "";
        tag = "";
        group_id = "";
        subgroup_id = "";
        sub_code = "";
        subject = "";
        stu_count = "";
        tag_duration = "";
        
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sessionPanel = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        searchComboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        sessionScrollPane = new javax.swing.JScrollPane();
        sessionTable = new javax.swing.JTable();
        refreshtButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        sessionPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Session ID", "Subject", "Student Group", "Tag" }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(0, 51, 51));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.setFocusable(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        sessionTable.setAutoCreateRowSorter(true);
        sessionTable.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        sessionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer", "Subject Code", "Subject Name", "Group ID", "Tag"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sessionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sessionTableMouseClicked(evt);
            }
        });
        sessionScrollPane.setViewportView(sessionTable);

        refreshtButton.setBackground(new java.awt.Color(255, 153, 0));
        refreshtButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshtButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshtButton.setText("Refresh");
        refreshtButton.setBorder(null);
        refreshtButton.setFocusable(false);
        refreshtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshtButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(0, 153, 204));
        viewButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View");
        viewButton.setBorder(null);
        viewButton.setFocusable(false);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 102, 0));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.setFocusable(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(153, 0, 51));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sessionPanelLayout = new javax.swing.GroupLayout(sessionPanel);
        sessionPanel.setLayout(sessionPanelLayout);
        sessionPanelLayout.setHorizontalGroup(
            sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(sessionPanelLayout.createSequentialGroup()
                        .addComponent(searchTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sessionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        sessionPanelLayout.setVerticalGroup(
            sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessionPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sessionPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sessionPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sessionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sessionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sessionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed

        searchButton.setEnabled(true);
    }//GEN-LAST:event_searchComboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String value = searchTextField.getText().trim();
        int type = searchComboBox.getSelectedIndex();

        controller.searchSession(sessionTable, value, type);

    }//GEN-LAST:event_searchButtonActionPerformed

    private void sessionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessionTableMouseClicked

        clearVariable();

        int r = sessionTable.getSelectedRow();

        id = Integer.parseInt(sessionTable.getValueAt(r, 0).toString());
        lecturers = sessionTable.getValueAt(r, 1).toString() + "  " + sessionTable.getValueAt(r, 2).toString() + "  " + sessionTable.getValueAt(r, 3).toString();
        sub_code = sessionTable.getValueAt(r, 4).toString();
        subject = sessionTable.getValueAt(r, 5).toString();
        group_id = sessionTable.getValueAt(r, 6).toString();
        subgroup_id = sessionTable.getValueAt(r, 6).toString();
        stu_count = sessionTable.getValueAt(r, 7).toString();
        tag = sessionTable.getValueAt(r, 8).toString();
        tag_duration = sessionTable.getValueAt(r, 9).toString();

    }//GEN-LAST:event_sessionTableMouseClicked

    private void refreshtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshtButtonActionPerformed

        controller.loadSessionTable(sessionTable);
        searchTextField.setText("");
        searchComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_refreshtButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed

        if(id != -99) {

            model = new SessionModel(id, lecturers, tag, group_id, subgroup_id, sub_code, subject, stu_count, tag_duration);
            AddNewSessionView addNewSessionView = new AddNewSessionView(model, false);
            
//            contentTabbedPane.setSelectedIndex(1);
//            submitButton.setEnabled(false);
//            clear1Button.setEnabled(false);
//            clear2Button.setEnabled(false);
//
//            selectedLabel.setText(lecturers);
//            tagComboBox.setSelectedItem(tag);
//            groupComboBox.setSelectedItem(group_id);
//            subjectComboBox.setSelectedItem(sub_code + "-" + subject);
//            noOfStudentTextField.setText(stu_count);
//            durationTextField.setText(tag_duration);

        }

        else {

            JOptionPane.showMessageDialog(this, "Please select record.");

        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        if(id != -99) {

//            contentTabbedPane.setSelectedIndex(1);
//            isUpdate = true;
//            submitButton.setText("Update");
//            submitButton.setEnabled(true);
//            clear1Button.setEnabled(true);
//            clear2Button.setEnabled(true);
//
//            selectedLabel.setText(lecturers);
//            tagComboBox.setSelectedItem(tag);
//            groupComboBox.setSelectedItem(group_id);
//            subjectComboBox.setSelectedItem(sub_code + "-" + subject);
//            noOfStudentTextField.setText(stu_count);
//            durationTextField.setText(tag_duration);

        }

        else {

            JOptionPane.showMessageDialog(this, "Please select record.");

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if(id != -99) {

            if(controller.deleteSession(id)) {

                controller.loadSessionTable(sessionTable);

            }

            else {

                JOptionPane.showMessageDialog(this, "Can not delete this record. Plases try again later.");

            }
        }

        else {

            JOptionPane.showMessageDialog(this, "Please select record.");

        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton refreshtButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JPanel sessionPanel;
    private javax.swing.JScrollPane sessionScrollPane;
    private javax.swing.JTable sessionTable;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
