package Session;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class NotAvailableTimeView extends javax.swing.JPanel {

    NotAvailableTimeController controller = new NotAvailableTimeController();
    NotAvailableTimeModel model = new NotAvailableTimeModel();

    boolean isLecturer = false;
    boolean isSession = false;
    boolean isGroup = false;
    boolean isSubGroup = false;
        
    String id;
    String lecturer;
    String session;
    String group;
    String subGroup;
    String date;
    String startTime;
    String endTime;
    
    public NotAvailableTimeView() {
        
        initComponents();
        
        clearAddFields();
        
    }
    
    public void clearAddFields() {

        controller.loadNotAvailableTable(timeTable);
        controller.loadLecturerCombo(lecturerComboBox);
        controller.loadSessionCombo(sessionComboBox);
        controller.loadGroupCombo(groupComboBox);
        controller.loadSubGroupCombo(subGroupComboBox);
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
        lecturer = "";
        session = "";
        group = "";
        subGroup = "";
        date = "";
        startTime = "";
        endTime = "";

    }

    public void setValue() {

        if ((lecturer.equals("")) || (lecturer.equals("Select Lecturer")) || (lecturer.isEmpty())) {

            lecturer = "";
            isLecturer = false;

        } else {

            String lec[] = lecturer.split("-");
            lecturer = lec[0];
            isLecturer = true;

        }

        if ((session.equals("")) || (session.equals("Select Session")) || (session.isEmpty())) {

            session = "";
            isSession = false;
            

        } else {

            String ses[] = session.split("-");
            session = ses[0];
            isSession = true;
            
        }

        if ((group.equals("")) || (group.equals("Select Group")) || (group.isEmpty())) {

            group = "";
            isGroup = false;
            
        }
        
        else {
        
            isGroup = true;
            
        }

        if ((subGroup.equals("")) || (subGroup.equals("Select Sub Group")) || (subGroup.isEmpty())) {

            subGroup = "";
            isSubGroup = false;
                    
        }
        
        else {
        
            isSubGroup = true;
            
        }
    }

    public boolean validateValue() {
        
        boolean isValid = true;
        
        if((lecturer.equals("")) && (session.equals("")) && (group.equals("")) && (subGroup.equals(""))) {
        
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
			
                    if(isLecturer) {

                        isValid = controller.validateDuplicate(lecturer, date, startHour, endHour, startMinute, endMinute, 0);

                    }
			
                    else if(isSession) {

                        isValid = controller.validateDuplicate(session, date, startHour, endHour, startMinute, endMinute, 1);

                    }

                    else if(isGroup) {
        
                        isValid = controller.validateDuplicate(group, date, startHour, endHour, startMinute, endMinute, 2);

                    }

                    else if(isSubGroup) {

                        isValid = controller.validateDuplicate(subGroup, date, startHour, endHour, startMinute, endMinute, 3);

                    }

                    else {

                        isValid = false;

                    }

                }
            }

            else {

                if(isLecturer) {

                    isValid = controller.validateDuplicate(lecturer, date, startHour, endHour, startMinute, endMinute, 0);

                }
		
                else if(isSession) {

                    isValid = controller.validateDuplicate(session, date, startHour, endHour, startMinute, endMinute, 1);

                }

                else if(isGroup) {
                
                    isValid = controller.validateDuplicate(group, date, startHour, endHour, startMinute, endMinute, 2);

                }

                else if(isSubGroup) {

                    isValid = controller.validateDuplicate(subGroup, date, startHour, endHour, startMinute, endMinute, 3);

                }

                else {

                    isValid = false;

                }	
            }
        }
		
        return isValid;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPanel = new javax.swing.JPanel();
        timeScrollPane = new javax.swing.JScrollPane();
        timeTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        startLabel = new javax.swing.JLabel();
        lecturerComboBox = new javax.swing.JComboBox<>();
        subGroupLabel = new javax.swing.JLabel();
        startHoursComboBox = new javax.swing.JComboBox<>();
        dateDateChooser = new com.toedter.calendar.JDateChooser();
        endMinutesComboBox = new javax.swing.JComboBox<>();
        groupLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        sessionLabel = new javax.swing.JLabel();
        groupComboBox = new javax.swing.JComboBox<>();
        endLabel = new javax.swing.JLabel();
        endHoursComboBox = new javax.swing.JComboBox<>();
        lecturerLabel = new javax.swing.JLabel();
        startMinutesComboBox = new javax.swing.JComboBox<>();
        hoursLabel = new javax.swing.JLabel();
        minutesLabel = new javax.swing.JLabel();
        sessionComboBox = new javax.swing.JComboBox<>();
        subGroupComboBox = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        addPanel.setBackground(new java.awt.Color(255, 255, 255));
        addPanel.setPreferredSize(new java.awt.Dimension(1136, 640));

        timeTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        timeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeTableMouseClicked(evt);
            }
        });
        timeScrollPane.setViewportView(timeTable);

        jPanel1.setBackground(java.awt.Color.white);

        startLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        startLabel.setText("Start");

        lecturerComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lecturerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lecturer" }));
        lecturerComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                lecturerComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        lecturerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerComboBoxActionPerformed(evt);
            }
        });

        subGroupLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        subGroupLabel.setText("Sub Group");

        startHoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startHoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        startHoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHoursComboBoxActionPerformed(evt);
            }
        });

        dateDateChooser.setDateFormatString("yyyy-MM-dd");
        dateDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateDateChooser.setPreferredSize(new java.awt.Dimension(195, 25));

        endMinutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        endMinutesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        endMinutesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endMinutesComboBoxActionPerformed(evt);
            }
        });

        groupLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        groupLabel.setText("Group");

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dateLabel.setText("Date");

        sessionLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sessionLabel.setText("Session");

        groupComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Group" }));
        groupComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                groupComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        groupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupComboBoxActionPerformed(evt);
            }
        });

        endLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        endLabel.setText("End");

        endHoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        endHoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        endHoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endHoursComboBoxActionPerformed(evt);
            }
        });

        lecturerLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lecturerLabel.setText("Lecturer");

        startMinutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startMinutesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        startMinutesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMinutesComboBoxActionPerformed(evt);
            }
        });

        hoursLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        hoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoursLabel.setText("Hours");

        minutesLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        minutesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minutesLabel.setText("Minutes");

        sessionComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        sessionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Session" }));
        sessionComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                sessionComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        sessionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionComboBoxActionPerformed(evt);
            }
        });

        subGroupComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        subGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Sub Group" }));
        subGroupComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                subGroupComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        subGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subGroupComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(endHoursComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(hoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minutesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subGroupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sessionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dateDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lecturerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sessionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subGroupComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sessionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subGroupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sessionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hoursLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(minutesLabel)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(startHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(endHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(startLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(endMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setAlignmentY(0.0F);
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setPreferredSize(new java.awt.Dimension(1005, 60));

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

        refreshButton.setBackground(java.awt.Color.black);
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.setBorder(null);
        refreshButton.setFocusable(false);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Not Available Time");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
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

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        lecturer = lecturerComboBox.getSelectedItem().toString();
        session = sessionComboBox.getSelectedItem().toString();
        group = groupComboBox.getSelectedItem().toString();
        subGroup = subGroupComboBox.getSelectedItem().toString();
        date = dateFormat.format(dateDateChooser.getDate());
        startTime = startHoursComboBox.getSelectedItem().toString() + ":" + startMinutesComboBox.getSelectedItem().toString();
        endTime = endHoursComboBox.getSelectedItem().toString() + ":" + endMinutesComboBox.getSelectedItem().toString();

        setValue();

        if (validateValue()) {

            model = new NotAvailableTimeModel(lecturer, session, group, subGroup, date, startTime, endTime);

            if (controller.insertNotAvailableTime(model)) {

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

    private void lecturerComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_lecturerComboBoxPopupMenuWillBecomeInvisible

        String value = lecturerComboBox.getSelectedItem().toString();

        if (!value.equals("Select Lecturer")) {

            controller.loadSessionCombo(sessionComboBox);
            controller.loadGroupCombo(groupComboBox);
            controller.loadSubGroupCombo(subGroupComboBox);

        }
    }//GEN-LAST:event_lecturerComboBoxPopupMenuWillBecomeInvisible

    private void lecturerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerComboBoxActionPerformed

    }//GEN-LAST:event_lecturerComboBoxActionPerformed

    private void sessionComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_sessionComboBoxPopupMenuWillBecomeInvisible

        String value = sessionComboBox.getSelectedItem().toString();

        if (!value.equals("Select Session")) {

            controller.loadLecturerCombo(lecturerComboBox);
            controller.loadGroupCombo(groupComboBox);
            controller.loadSubGroupCombo(subGroupComboBox);

        }
    }//GEN-LAST:event_sessionComboBoxPopupMenuWillBecomeInvisible

    private void sessionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionComboBoxActionPerformed

    }//GEN-LAST:event_sessionComboBoxActionPerformed

    private void groupComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_groupComboBoxPopupMenuWillBecomeInvisible

        String value = groupComboBox.getSelectedItem().toString();

        if (!value.equals("Select Group")) {

            controller.loadLecturerCombo(lecturerComboBox);
            controller.loadSessionCombo(sessionComboBox);
            controller.loadSubGroupCombo(subGroupComboBox);

        }
    }//GEN-LAST:event_groupComboBoxPopupMenuWillBecomeInvisible

    private void groupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupComboBoxActionPerformed

    }//GEN-LAST:event_groupComboBoxActionPerformed

    private void timeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeTableMouseClicked

        clearVariable();

        int r = timeTable.getSelectedRow();

        id = timeTable.getValueAt(r, 0).toString();
    }//GEN-LAST:event_timeTableMouseClicked

    private void subGroupComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_subGroupComboBoxPopupMenuWillBecomeInvisible

        String value = subGroupComboBox.getSelectedItem().toString();

        if (!value.equals("Select Sub Group")) {

            controller.loadLecturerCombo(lecturerComboBox);
            controller.loadSessionCombo(sessionComboBox);
            controller.loadGroupCombo(groupComboBox);

        }
    }//GEN-LAST:event_subGroupComboBoxPopupMenuWillBecomeInvisible

    private void subGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subGroupComboBoxActionPerformed

    }//GEN-LAST:event_subGroupComboBoxActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

        controller.loadNotAvailableTable(timeTable);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if((!id.isEmpty()) && (!id.equals(""))) {

            int k = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this record?");

            if(k == 0) {

                if(controller.deleteNotAvailableTime(id)) {

                    JOptionPane.showMessageDialog(this, "Delete Success!");
                    controller.loadNotAvailableTable(timeTable);

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

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        clearAddFields();
        
    }//GEN-LAST:event_clearButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser dateDateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> endHoursComboBox;
    private javax.swing.JLabel endLabel;
    private javax.swing.JComboBox<String> endMinutesComboBox;
    private javax.swing.JComboBox<String> groupComboBox;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> lecturerComboBox;
    private javax.swing.JLabel lecturerLabel;
    private javax.swing.JLabel minutesLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox<String> sessionComboBox;
    private javax.swing.JLabel sessionLabel;
    private javax.swing.JComboBox<String> startHoursComboBox;
    private javax.swing.JLabel startLabel;
    private javax.swing.JComboBox<String> startMinutesComboBox;
    private javax.swing.JComboBox<String> subGroupComboBox;
    private javax.swing.JLabel subGroupLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JScrollPane timeScrollPane;
    private javax.swing.JTable timeTable;
    // End of variables declaration//GEN-END:variables
   
}
