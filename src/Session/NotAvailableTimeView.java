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

        addPanel.setVisible(true);
        managePanel.setVisible(false);

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

        contentPanel = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        endHoursComboBox = new javax.swing.JComboBox<String>();
        endMinutesComboBox = new javax.swing.JComboBox<String>();
        startHoursComboBox = new javax.swing.JComboBox<String>();
        startMinutesComboBox = new javax.swing.JComboBox<String>();
        hoursLabel = new javax.swing.JLabel();
        minutesLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        lecturerLabel = new javax.swing.JLabel();
        sessionLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        subGroupLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateDateChooser = new com.toedter.calendar.JDateChooser();
        lecturerComboBox = new javax.swing.JComboBox<String>();
        sessionComboBox = new javax.swing.JComboBox<String>();
        groupComboBox = new javax.swing.JComboBox<String>();
        subGroupComboBox = new javax.swing.JComboBox<String>();
        managePanel = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        timeScrollPane = new javax.swing.JScrollPane();
        timeTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(1136, 640));
        contentPanel.setLayout(null);

        addPanel.setBackground(new java.awt.Color(255, 255, 255));
        addPanel.setPreferredSize(new java.awt.Dimension(1136, 640));

        startLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        startLabel.setText("Start");

        endLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        endLabel.setText("End");

        endHoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        endHoursComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        endHoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endHoursComboBoxActionPerformed(evt);
            }
        });

        endMinutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        endMinutesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00" }));
        endMinutesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endMinutesComboBoxActionPerformed(evt);
            }
        });

        startHoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startHoursComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        startHoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHoursComboBoxActionPerformed(evt);
            }
        });

        startMinutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startMinutesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00" }));
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

        submitButton.setBackground(new java.awt.Color(155, 27, 27));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorder(null);
        submitButton.setFocusable(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(155, 27, 27));
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

        lecturerLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lecturerLabel.setText("Lecturer");

        sessionLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sessionLabel.setText("Session");

        groupLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        groupLabel.setText("Group");

        subGroupLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        subGroupLabel.setText("Sub Group");

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dateLabel.setText("Date");

        dateDateChooser.setDateFormatString("yyyy-MM-dd");
        dateDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateDateChooser.setPreferredSize(new java.awt.Dimension(195, 25));

        lecturerComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lecturerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Lecturer" }));
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

        sessionComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        sessionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Session" }));
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

        groupComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Group" }));
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

        subGroupComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        subGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Sub Group" }));
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

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subGroupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sessionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sessionComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(subGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(endHoursComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hoursLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startHoursComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 112, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(startMinutesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minutesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(endMinutesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(dateDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minutesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sessionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(subGroupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                        .addComponent(lecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sessionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        contentPanel.add(addPanel);
        addPanel.setBounds(0, 0, 1136, 640);

        managePanel.setBackground(new java.awt.Color(255, 255, 255));
        managePanel.setPreferredSize(new java.awt.Dimension(1136, 640));

        deleteButton.setBackground(new java.awt.Color(155, 27, 27));
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

        backButton.setBackground(new java.awt.Color(155, 27, 27));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Manage Not Available Times");

        timeTable.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
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

        refreshButton.setBackground(new java.awt.Color(155, 27, 27));
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.setBorder(null);
        refreshButton.setFocusable(false);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managePanelLayout = new javax.swing.GroupLayout(managePanel);
        managePanel.setLayout(managePanelLayout);
        managePanelLayout.setHorizontalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managePanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)))
                    .addGroup(managePanelLayout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        managePanelLayout.setVerticalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199))
        );

        contentPanel.add(managePanel);
        managePanel.setBounds(0, 0, 1136, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
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

                //clearAddFields();

            }
            
            else {

                JOptionPane.showMessageDialog(this, "Can not insert this record. Plases try again later.");

                
            }
        } 
        
        else {

            JOptionPane.showMessageDialog(this, "Invalid details.");

        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed

        addPanel.setVisible(false);
        managePanel.setVisible(true);

        controller.loadNotAvailableTable(timeTable);

    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if((!id.isEmpty()) && (!id.equals(""))) {

            if(controller.deleteNotAvailableTime(id)) {

                controller.loadNotAvailableTable(timeTable);

            }

            else {

                JOptionPane.showMessageDialog(this, "Can not delete this record. Plases try again later.");

            }
        }

        else {

            JOptionPane.showMessageDialog(this, "Please select record.");

        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        addPanel.setVisible(true);
        managePanel.setVisible(false);

    }//GEN-LAST:event_backButtonActionPerformed

    private void timeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeTableMouseClicked

        clearVariable();

        int r = timeTable.getSelectedRow();

        id = timeTable.getValueAt(r, 0).toString();

    }//GEN-LAST:event_timeTableMouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

        controller.loadNotAvailableTable(timeTable);

    }//GEN-LAST:event_refreshButtonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel contentPanel;
    private com.toedter.calendar.JDateChooser dateDateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> endHoursComboBox;
    private javax.swing.JLabel endLabel;
    private javax.swing.JComboBox<String> endMinutesComboBox;
    private javax.swing.JComboBox<String> groupComboBox;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JComboBox<String> lecturerComboBox;
    private javax.swing.JLabel lecturerLabel;
    private javax.swing.JPanel managePanel;
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
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
   
}
