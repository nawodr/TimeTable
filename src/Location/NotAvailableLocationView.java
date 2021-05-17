package Location;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class NotAvailableLocationView extends javax.swing.JPanel {

    NotAvailableLocationController controller = new NotAvailableLocationController();
    NotAvailableLocationModel model = new NotAvailableLocationModel();
    
    String id;
    String room;
    String date;
    String startTime;
    String endTime;
    
    public NotAvailableLocationView() {
        
        initComponents();
        
        clearAddFields();
        
    }
    
    public void clearAddFields() {
        
        addPanel.setVisible(true);
        
        controller.loadNotAvailableTable(locationTable);
        controller.loadRoomCombo(roomComboBox);
        controller.loadHoursCombo(startHoursComboBox);
        controller.loadMinutesCombo(startMinutesComboBox);
        controller.loadHoursCombo(endHoursComboBox);
        controller.loadMinutesCombo(endMinutesComboBox);
        
        Date currentDate = new Date();
        dateDateChooser.setDate(currentDate);
        
        clearVariable();
        
    }
    
    public void clearVariable() {
    
        id = "";
        room = "";
        date = "";
        startTime = "";
        endTime = "";
        
    }
    
    public void setValue() {
        
        if((room.equals("")) || (room.equals("Select Room")) || (room.isEmpty())) {
        
            room = "";
            
        } 
        
        else {
        
            String rom[] = room.split("-");
            room = rom[0];
            
        }
    }
    
    public boolean validateValue() {
        
        boolean isValid = true;
        
        if(room.equals("")) {
        
            isValid = false;
            
        }
        
        else if((date.equals("")) || (date == null) || (date.isEmpty())) {
        
            isValid = false;
            
        }
        
        else if((startTime.equals("")) || (startTime.equals("0:00")) || (startTime.isEmpty())) {
        
            isValid = false;
            
        }
        
        else if((endTime.equals("")) || (endTime.equals("0:00")) || (endTime.isEmpty())) {
        
            isValid = false;
            
        }
		
        else {
			
            int startHour = Integer.parseInt(startHoursComboBox.getSelectedItem().toString());
            int startMinute = Integer.parseInt(startMinutesComboBox.getSelectedItem().toString());
            int endHour = Integer.parseInt(endHoursComboBox.getSelectedItem().toString());
            int endMinute = Integer.parseInt(endMinutesComboBox.getSelectedItem().toString());

            int hoursRang = endHour - startHour;
            int minutesRang = endMinute - startMinute;
			
            if(hoursRang <= -1) {
				
                isValid = false;

            }

            else if(hoursRang == 0) {

                if(minutesRang <= 0) {

                    isValid = false;

                }
				
                else {
					
                    isValid = controller.validateDuplicate(room, date, startHour, endHour, startMinute, endMinute);

                }
            }

            else {

                isValid = controller.validateDuplicate(room, date, startHour, endHour, startMinute, endMinute);
			
            }
        }
		
        return isValid;
        
    }
	    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        locationScrollPane = new javax.swing.JScrollPane();
        locationTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        roomLabel = new javax.swing.JLabel();
        roomComboBox = new javax.swing.JComboBox<String>();
        dateDateChooser = new com.toedter.calendar.JDateChooser();
        dateLabel = new javax.swing.JLabel();
        hoursLabel = new javax.swing.JLabel();
        minutesLabel = new javax.swing.JLabel();
        startMinutesComboBox = new javax.swing.JComboBox<String>();
        endMinutesComboBox = new javax.swing.JComboBox<String>();
        endHoursComboBox = new javax.swing.JComboBox<String>();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        startHoursComboBox = new javax.swing.JComboBox<String>();
        jPanel6 = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        addPanel.setBackground(new java.awt.Color(255, 255, 255));
        addPanel.setPreferredSize(new java.awt.Dimension(1136, 640));

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Add Location");

        locationTable.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        locationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "colum 1", "colum 2", "colum 3", "colum 4", "colum 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        locationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locationTableMouseClicked(evt);
            }
        });
        locationScrollPane.setViewportView(locationTable);

        jPanel1.setBackground(java.awt.Color.white);

        roomLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        roomLabel.setText("Room");

        roomComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        roomComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Room" }));
        roomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomComboBoxActionPerformed(evt);
            }
        });

        dateDateChooser.setDateFormatString("yyyy-MM-dd");
        dateDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateDateChooser.setPreferredSize(new java.awt.Dimension(195, 25));

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dateLabel.setText("Date");

        hoursLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        hoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoursLabel.setText("Hours");

        minutesLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        minutesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minutesLabel.setText("Minutes");

        startMinutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startMinutesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00" }));
        startMinutesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMinutesComboBoxActionPerformed(evt);
            }
        });

        endMinutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        endMinutesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00" }));
        endMinutesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endMinutesComboBoxActionPerformed(evt);
            }
        });

        endHoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        endHoursComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        endHoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endHoursComboBoxActionPerformed(evt);
            }
        });

        startLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        startLabel.setText("Start");

        endLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        endLabel.setText("End");

        startHoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startHoursComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        startHoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHoursComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(endLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(roomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(endHoursComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startHoursComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minutesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(endMinutesComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startMinutesComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hoursLabel)
                                    .addComponent(minutesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(locationScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setAlignmentY(0.0F);
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setPreferredSize(new java.awt.Dimension(1005, 60));

        refreshButton.setBackground(new java.awt.Color(155, 27, 27));
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.setBorder(null);
        refreshButton.setFocusable(false);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(java.awt.Color.black);
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(java.awt.Color.black);
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setBorder(null);
        submitButton.setFocusable(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(java.awt.Color.black);
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setBorder(null);
        clearButton.setFocusable(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                    .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void endHoursComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endHoursComboBoxActionPerformed

    }//GEN-LAST:event_endHoursComboBoxActionPerformed

    private void endMinutesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endMinutesComboBoxActionPerformed

    }//GEN-LAST:event_endMinutesComboBoxActionPerformed

    private void startHoursComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHoursComboBoxActionPerformed

    }//GEN-LAST:event_startHoursComboBoxActionPerformed

    private void startMinutesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMinutesComboBoxActionPerformed

    }//GEN-LAST:event_startMinutesComboBoxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");

        room = roomComboBox.getSelectedItem().toString();
        date = dateFormat.format(dateDateChooser.getDate());
        startTime = startHoursComboBox.getSelectedItem().toString() + ":" + startMinutesComboBox.getSelectedItem().toString();
        endTime = endHoursComboBox.getSelectedItem().toString() + ":" + endMinutesComboBox.getSelectedItem().toString();

        setValue();

        if(validateValue()) {

            model = new NotAvailableLocationModel(room, date, startTime, endTime);

            if(controller.insertNotAvailableLocation(model)) {

                JOptionPane.showMessageDialog(this, "Insert Success!");
                clearAddFields();

            }

            else {

                JOptionPane.showMessageDialog(this, "Can not insert this record. Plases try again later.");

            }
        }

        else {

            JOptionPane.showMessageDialog(this, "Invalid details.");

        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        clearAddFields();

    }//GEN-LAST:event_clearButtonActionPerformed

    private void roomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomComboBoxActionPerformed

    }//GEN-LAST:event_roomComboBoxActionPerformed

    private void locationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationTableMouseClicked

        clearVariable();

        int r = locationTable.getSelectedRow();

        id = locationTable.getValueAt(r, 0).toString();

    }//GEN-LAST:event_locationTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if((!id.isEmpty()) && (!id.equals(""))) {

            int k = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this record?"); 

            if(k == 0) {

                if(controller.deleteNotAvailableLocation(id)) {

                    JOptionPane.showMessageDialog(this, "Delete Success!");
                    controller.loadNotAvailableTable(locationTable);

                }

                else {

                    JOptionPane.showMessageDialog(this, "Can not delete this record. Plases try again later.");

                }
            }
        }

        else {

            JOptionPane.showMessageDialog(this, "Please select record.");

        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

        controller.loadNotAvailableTable(locationTable);

    }//GEN-LAST:event_refreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel addPanel;
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser dateDateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> endHoursComboBox;
    private javax.swing.JLabel endLabel;
    private javax.swing.JComboBox<String> endMinutesComboBox;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane locationScrollPane;
    private javax.swing.JTable locationTable;
    private javax.swing.JLabel minutesLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JComboBox<String> startHoursComboBox;
    private javax.swing.JLabel startLabel;
    private javax.swing.JComboBox<String> startMinutesComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
   
}
