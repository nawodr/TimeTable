package WorkingDays;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class WorkingDaysandHours extends javax.swing.JPanel {

    WorkingDaysandHoursController controller = new WorkingDaysandHoursController();
    WorkingDaysModel workingDaysModel = new WorkingDaysModel();
    TimeSlotsModel timeSlotsModel = new TimeSlotsModel();
    
    int workingIdList[] = null;
    int timeIdList[][] = null;
    int timeSlotsType = 0;
    
    int index = -1;
    String noOfWorkingDays;
    String workingDays;
    String workingHours;
    String dateTime;
    String startTime;
    String endTime;
    
    public WorkingDaysandHours() {
        
        initComponents();
        
        clearWorkingDaysFields();
        clearTimeSlotsFields();
        
    }
    
    public void clearWorkingDaysFields() {
        
        controller.loadNoOfDaysCombo(noOfDaysComboBox);
        controller.loadHoursCombo(hoursComboBox, 0);
        controller.loadMinutesCombo(minutesComboBox);
        workingIdList = controller.loadWorkingDaysTable(workingTable);
        
        noOfDaysComboBox.setSelectedItem("0");
        mondayCheckBox.setSelected(false);
        tuesdayCheckBox.setSelected(false);
        wednesdayCheckBox.setSelected(false);
        thursdayCheckBox.setSelected(false);
        fridayCheckBox.setSelected(false);
        saturdayCheckBox.setSelected(false);
        sundayCheckBox.setSelected(false);
        hoursComboBox.setSelectedItem("1");
        minutesComboBox.setSelectedItem("00");
        
        submitButton.setEnabled(true);
        resetButton.setEnabled(false);
        
        clearVariable();
        
    }
    
    public void clearTimeSlotsFields() {
        
        controller.loadHoursCombo(startHoursComboBox, 1);
        controller.loadMinutesCombo(startMinutesComboBox);
        controller.loadHoursCombo(endHoursComboBox, 1);
        controller.loadMinutesCombo(endMinutesComboBox);
        timeIdList = controller.loadTimeSlotsTable(timeTable);
       
        startHoursComboBox.setSelectedItem("1");
        startMinutesComboBox.setSelectedItem("00");
        
        if(timeSlotsType == 0) {
        
            endHoursComboBox.setSelectedItem("2");
            endMinutesComboBox.setSelectedItem("00");
            
            hourSlotsButton.setBackground(new Color(153, 153, 153));
            minuteSlotsButton.setBackground(new Color(155, 27, 27));
            
        }
        
        else {
        
            endHoursComboBox.setSelectedItem("1");
            endMinutesComboBox.setSelectedItem("30");
        
            minuteSlotsButton.setBackground(new Color(153, 153, 153));
            hourSlotsButton.setBackground(new Color(155, 27, 27));
            
        }
        
        timeSubmitButton.setEnabled(true);
        timeResetButton.setEnabled(false);
        
        clearVariable();
        
    }
    
    public void clearVariable() {
        
        noOfWorkingDays = "";
        workingDays = "";
        workingHours = "";
        dateTime = "";
        startTime = "";
        endTime = "";
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTabbedPane = new javax.swing.JTabbedPane();
        daysHoursPanel = new javax.swing.JPanel();
        workingTitleLabel = new javax.swing.JLabel();
        workingScrollPane = new javax.swing.JScrollPane();
        workingTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        workingEditButton = new javax.swing.JButton();
        workingRemoveButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        noOfDaysLabel = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        noOfDaysComboBox = new javax.swing.JComboBox<>();
        mondayCheckBox = new javax.swing.JCheckBox();
        tuesdayCheckBox = new javax.swing.JCheckBox();
        wednesdayCheckBox = new javax.swing.JCheckBox();
        thursdayCheckBox = new javax.swing.JCheckBox();
        fridayCheckBox = new javax.swing.JCheckBox();
        saturdayCheckBox = new javax.swing.JCheckBox();
        sundayCheckBox = new javax.swing.JCheckBox();
        hoursLabel = new javax.swing.JLabel();
        minutesLabel = new javax.swing.JLabel();
        minutesComboBox = new javax.swing.JComboBox<>();
        hoursComboBox = new javax.swing.JComboBox<>();
        label3 = new javax.swing.JLabel();
        workingTimeLabel = new javax.swing.JLabel();
        workingDaysLabel = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        timeSlotsPanel = new javax.swing.JPanel();
        hourSlotsButton = new javax.swing.JButton();
        minuteSlotsButton = new javax.swing.JButton();
        timeTitleLabel = new javax.swing.JLabel();
        timeScrollPane = new javax.swing.JScrollPane();
        timeTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        timeRemoveButton = new javax.swing.JButton();
        timeEditButton = new javax.swing.JButton();
        timeResetButton = new javax.swing.JButton();
        timeSubmitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        startLabel1 = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        startHoursComboBox = new javax.swing.JComboBox<>();
        label4 = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        endHoursComboBox = new javax.swing.JComboBox<>();
        endMinutesComboBox = new javax.swing.JComboBox<>();
        startMinutesLabel = new javax.swing.JLabel();
        startMinutesComboBox = new javax.swing.JComboBox<>();
        startHoursLabel = new javax.swing.JLabel();
        dateDateChooser = new com.toedter.calendar.JDateChooser();

        contentTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        contentTabbedPane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contentTabbedPane.setOpaque(true);
        contentTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTabbedPaneMouseClicked(evt);
            }
        });

        workingTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        workingTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workingTitleLabel.setText("Manage Working Days And Hours");

        workingTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        workingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "No Of Working Days", "Working Days", "Working Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workingTableMouseClicked(evt);
            }
        });
        workingScrollPane.setViewportView(workingTable);
        if (workingTable.getColumnModel().getColumnCount() > 0) {
            workingTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            workingTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            workingTable.getColumnModel().getColumn(2).setPreferredWidth(500);
            workingTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jPanel1.setBackground(java.awt.Color.black);

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

        resetButton.setBackground(java.awt.Color.black);
        resetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.setBorder(null);
        resetButton.setFocusable(false);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        workingEditButton.setBackground(java.awt.Color.black);
        workingEditButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        workingEditButton.setText("Update");
        workingEditButton.setBorder(null);
        workingEditButton.setFocusable(false);
        workingEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workingEditButtonActionPerformed(evt);
            }
        });

        workingRemoveButton.setBackground(java.awt.Color.black);
        workingRemoveButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        workingRemoveButton.setText("Remove");
        workingRemoveButton.setBorder(null);
        workingRemoveButton.setFocusable(false);
        workingRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workingRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workingEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workingRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workingRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workingEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(java.awt.Color.white);

        noOfDaysLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        noOfDaysLabel.setText("   Number of Days");

        label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label1.setText(":");

        noOfDaysComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        noOfDaysComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        noOfDaysComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfDaysComboBoxActionPerformed(evt);
            }
        });

        mondayCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        mondayCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mondayCheckBox.setText("Monday");
        mondayCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mondayCheckBoxMouseClicked(evt);
            }
        });

        tuesdayCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        tuesdayCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tuesdayCheckBox.setText("Tuesday");
        tuesdayCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tuesdayCheckBoxMouseClicked(evt);
            }
        });

        wednesdayCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        wednesdayCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wednesdayCheckBox.setText("Wednesday");
        wednesdayCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wednesdayCheckBoxMouseClicked(evt);
            }
        });

        thursdayCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        thursdayCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        thursdayCheckBox.setText("Thursday");
        thursdayCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thursdayCheckBoxMouseClicked(evt);
            }
        });

        fridayCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        fridayCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fridayCheckBox.setText("Friday");
        fridayCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fridayCheckBoxMouseClicked(evt);
            }
        });

        saturdayCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        saturdayCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saturdayCheckBox.setText("Saturday");
        saturdayCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saturdayCheckBoxMouseClicked(evt);
            }
        });

        sundayCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        sundayCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sundayCheckBox.setText("Sunday");
        sundayCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sundayCheckBoxMouseClicked(evt);
            }
        });

        hoursLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        hoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoursLabel.setText("Hours");

        minutesLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        minutesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minutesLabel.setText("Minutes");

        minutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        minutesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        minutesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutesComboBoxActionPerformed(evt);
            }
        });

        hoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        hoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        hoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursComboBoxActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label3.setText(":");

        workingTimeLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        workingTimeLabel.setText("   Working Time per Day");

        workingDaysLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        workingDaysLabel.setText("   Working Days");

        label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label2.setText(":");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(workingTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(hoursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(hoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(workingDaysLabel)
                            .addComponent(noOfDaysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saturdayCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sundayCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfDaysComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mondayCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuesdayCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thursdayCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wednesdayCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fridayCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfDaysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1)
                    .addComponent(noOfDaysComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workingDaysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2)
                    .addComponent(mondayCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tuesdayCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wednesdayCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thursdayCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fridayCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saturdayCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sundayCheckBox)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workingTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3)
                    .addComponent(hoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout daysHoursPanelLayout = new javax.swing.GroupLayout(daysHoursPanel);
        daysHoursPanel.setLayout(daysHoursPanelLayout);
        daysHoursPanelLayout.setHorizontalGroup(
            daysHoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(daysHoursPanelLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(workingTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(daysHoursPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(workingScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        daysHoursPanelLayout.setVerticalGroup(
            daysHoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daysHoursPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(workingTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daysHoursPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workingScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 179, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentTabbedPane.addTab("Days Hours ", daysHoursPanel);

        hourSlotsButton.setBackground(new java.awt.Color(155, 27, 27));
        hourSlotsButton.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        hourSlotsButton.setForeground(new java.awt.Color(255, 255, 255));
        hourSlotsButton.setText("1 Hour Time Slot");
        hourSlotsButton.setBorder(null);
        hourSlotsButton.setFocusable(false);
        hourSlotsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourSlotsButtonActionPerformed(evt);
            }
        });

        minuteSlotsButton.setBackground(new java.awt.Color(155, 27, 27));
        minuteSlotsButton.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        minuteSlotsButton.setForeground(new java.awt.Color(255, 255, 255));
        minuteSlotsButton.setText("30 Min Time Slot");
        minuteSlotsButton.setBorder(null);
        minuteSlotsButton.setFocusable(false);
        minuteSlotsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuteSlotsButtonActionPerformed(evt);
            }
        });

        timeTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        timeTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeTitleLabel.setText("Manage Time Slots");

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

        jPanel5.setBackground(java.awt.Color.black);

        timeRemoveButton.setBackground(java.awt.Color.black);
        timeRemoveButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeRemoveButton.setText("Remove");
        timeRemoveButton.setBorder(null);
        timeRemoveButton.setFocusable(false);
        timeRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeRemoveButtonActionPerformed(evt);
            }
        });

        timeEditButton.setBackground(java.awt.Color.black);
        timeEditButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeEditButton.setText("Update");
        timeEditButton.setBorder(null);
        timeEditButton.setFocusable(false);
        timeEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeEditButtonActionPerformed(evt);
            }
        });

        timeResetButton.setBackground(java.awt.Color.black);
        timeResetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeResetButton.setForeground(new java.awt.Color(255, 255, 255));
        timeResetButton.setText("Reset");
        timeResetButton.setBorder(null);
        timeResetButton.setFocusable(false);
        timeResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeResetButtonActionPerformed(evt);
            }
        });

        timeSubmitButton.setBackground(java.awt.Color.black);
        timeSubmitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timeSubmitButton.setText("Submit");
        timeSubmitButton.setBorder(null);
        timeSubmitButton.setFocusable(false);
        timeSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(java.awt.Color.white);

        startLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        startLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startLabel1.setText("Date");

        startLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        startLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startLabel.setText("Start");

        label6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label6.setText(":");

        startHoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startHoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        startHoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHoursComboBoxActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label4.setText(":");

        endLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        endLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endLabel.setText("End");

        label5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label5.setText(":");

        endHoursComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        endHoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        endHoursComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endHoursComboBoxActionPerformed(evt);
            }
        });

        endMinutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        endMinutesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        endMinutesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endMinutesComboBoxActionPerformed(evt);
            }
        });

        startMinutesLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        startMinutesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startMinutesLabel.setText("Minutes");

        startMinutesComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startMinutesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        startMinutesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMinutesComboBoxActionPerformed(evt);
            }
        });

        startHoursLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        startHoursLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startHoursLabel.setText("Hours");

        dateDateChooser.setDateFormatString("yyyy-MM-dd");
        dateDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateDateChooser.setPreferredSize(new java.awt.Dimension(195, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(endHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(endMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(startLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label4)
                                .addGap(21, 21, 21)
                                .addComponent(startHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startMinutesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(startHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(startLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label6)
                                .addGap(18, 18, 18)
                                .addComponent(dateDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startMinutesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(startLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(startHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endHoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endMinutesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout timeSlotsPanelLayout = new javax.swing.GroupLayout(timeSlotsPanel);
        timeSlotsPanel.setLayout(timeSlotsPanelLayout);
        timeSlotsPanelLayout.setHorizontalGroup(
            timeSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeSlotsPanelLayout.createSequentialGroup()
                .addGroup(timeSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeSlotsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(timeSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(timeSlotsPanelLayout.createSequentialGroup()
                                .addComponent(timeTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(timeSlotsPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(timeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                                .addGap(39, 39, 39)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(timeSlotsPanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(hourSlotsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minuteSlotsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        timeSlotsPanelLayout.setVerticalGroup(
            timeSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeSlotsPanelLayout.createSequentialGroup()
                .addGroup(timeSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourSlotsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuteSlotsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(timeTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(timeSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentTabbedPane.addTab("Time Slots", timeSlotsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void workingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workingTableMouseClicked

        clearVariable();

        mondayCheckBox.setSelected(false);
        tuesdayCheckBox.setSelected(false);
        wednesdayCheckBox.setSelected(false);
        thursdayCheckBox.setSelected(false);
        fridayCheckBox.setSelected(false);
        saturdayCheckBox.setSelected(false);
        sundayCheckBox.setSelected(false);
        
        int r = workingTable.getSelectedRow();

        index = Integer.parseInt(workingTable.getValueAt(r, 0).toString());
        noOfWorkingDays = workingTable.getValueAt(r, 1).toString();
        workingDays = workingTable.getValueAt(r, 2).toString();
        workingHours = workingTable.getValueAt(r, 3).toString();
        
        noOfDaysComboBox.setSelectedItem(noOfWorkingDays);
        
        String days[] = workingDays.split(", ");
        
        for (String day : days) {
            if (null != day) {
                switch (day) {
                    case "Monday":
                        mondayCheckBox.setSelected(true);
                        break;
                    case "Tuesday":
                        tuesdayCheckBox.setSelected(true);
                        break;
                    case "Wednesday":
                        wednesdayCheckBox.setSelected(true);
                        break;
                    case "Thursday":
                        thursdayCheckBox.setSelected(true);
                        break;
                    case "Friday":
                        fridayCheckBox.setSelected(true);
                        break;
                    case "Saturday":
                        saturdayCheckBox.setSelected(true);
                        break;
                    case "Sunday":
                        sundayCheckBox.setSelected(true);
                        break;
                    default:
                        break;
                }
            }
        }
        
        hoursComboBox.setSelectedItem(workingHours.split(" Hrs ")[0]);
        minutesComboBox.setSelectedItem(workingHours.split(" Hrs ")[1].substring(0, 2));
        
        submitButton.setEnabled(false);
        
    }//GEN-LAST:event_workingTableMouseClicked

    private void contentTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTabbedPaneMouseClicked

        if(contentTabbedPane.getSelectedIndex() == 0) {
        
            clearWorkingDaysFields();
        
        }
        
        else {
        
            clearTimeSlotsFields();
            
        }
    }//GEN-LAST:event_contentTabbedPaneMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        
        clearWorkingDaysFields();
        
    }//GEN-LAST:event_resetButtonActionPerformed

    private void noOfDaysComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfDaysComboBoxActionPerformed
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_noOfDaysComboBoxActionPerformed

    private void hoursComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursComboBoxActionPerformed
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_hoursComboBoxActionPerformed

    private void minutesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutesComboBoxActionPerformed
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_minutesComboBoxActionPerformed

    private void mondayCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mondayCheckBoxMouseClicked
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_mondayCheckBoxMouseClicked

    private void tuesdayCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuesdayCheckBoxMouseClicked
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_tuesdayCheckBoxMouseClicked

    private void wednesdayCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wednesdayCheckBoxMouseClicked
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_wednesdayCheckBoxMouseClicked

    private void thursdayCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thursdayCheckBoxMouseClicked
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_thursdayCheckBoxMouseClicked

    private void fridayCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fridayCheckBoxMouseClicked
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_fridayCheckBoxMouseClicked

    private void saturdayCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saturdayCheckBoxMouseClicked
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_saturdayCheckBoxMouseClicked

    private void sundayCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sundayCheckBoxMouseClicked
        
        resetButton.setEnabled(true);
        
    }//GEN-LAST:event_sundayCheckBoxMouseClicked

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
       
        boolean isValid;
        
        int count = 0;
        String monday = "";
        String tuesday = "";
        String wednesday = "";
        String thursday = "";
        String friday = "";
        String saturday = "";
        String sunday = "";
        
        if(mondayCheckBox.isSelected()) {
        
            monday = "Monday ";
            count++;
            
        }
        
        if(tuesdayCheckBox.isSelected()) {
        
            tuesday = "Tuesday ";
            count++;
            
        }
        
        if(wednesdayCheckBox.isSelected()) {
        
            wednesday = "Wednesday ";
            count++;
            
        }
        
        if(thursdayCheckBox.isSelected()) {
        
            thursday = "Thursday ";
            count++;
            
        }
        
        if(fridayCheckBox.isSelected()) {
        
            friday = "Friday ";
            count++;
            
        }
        
        if(saturdayCheckBox.isSelected()) {
        
            saturday = "Saturday ";
            count++;
            
        }
        
        if(sundayCheckBox.isSelected()) {
        
            sunday = "Sunday ";
            count++;
            
        }
        
        int noOfDays = Integer.parseInt(noOfDaysComboBox.getSelectedItem().toString());
        String workingDaysText = (monday + tuesday + wednesday + thursday + friday + saturday + sunday).trim().replaceAll(" ", ", ");
        String workingHrs= hoursComboBox.getSelectedItem().toString();
        String workingMin = minutesComboBox.getSelectedItem().toString();
        if(count == noOfDays) {
            
            isValid = true;
            
        }
        
        else {
            
            isValid = false;
            
        }
        
        if(isValid) {
        
            workingDaysModel = new WorkingDaysModel(noOfDays, workingDaysText, workingHrs, workingMin);
          
            if(controller.insertWorkingDays(workingDaysModel)) {
            
                JOptionPane.showMessageDialog(this, "Insert Success!");
                clearWorkingDaysFields();
                
            }
            
            else {
            
                JOptionPane.showMessageDialog(this, "Can not insert this record. Plases try again later.");
            
            }
        }
        
        else {
        
            JOptionPane.showMessageDialog(this, "Invalid details.");
            
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void workingEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workingEditButtonActionPerformed
        
        if(index != -1) {
        
            boolean isValid;

            int count = 0;
            String monday = "";
            String tuesday = "";
            String wednesday = "";
            String thursday = "";
            String friday = "";
            String saturday = "";
            String sunday = "";

            if(mondayCheckBox.isSelected()) {

                monday = "Monday ";
                count++;

            }

            if(tuesdayCheckBox.isSelected()) {

                tuesday = "Tuesday ";
                count++;

            }

            if(wednesdayCheckBox.isSelected()) {

                wednesday = "Wednesday ";
                count++;

            }

            if(thursdayCheckBox.isSelected()) {

                thursday = "Thursday ";
                count++;

            }

            if(fridayCheckBox.isSelected()) {

                friday = "Friday ";
                count++;

            }

            if(saturdayCheckBox.isSelected()) {

                saturday = "Saturday ";
                count++;

            }

            if(sundayCheckBox.isSelected()) {

                sunday = "Sunday ";
                count++;

            }

            int noOfDays = Integer.parseInt(noOfDaysComboBox.getSelectedItem().toString());
            String workingDaysText = (monday + tuesday + wednesday + thursday + friday + saturday + sunday).trim().replaceAll(" ", ", ");
            String workingHrs= hoursComboBox.getSelectedItem().toString();
            String workingMin = minutesComboBox.getSelectedItem().toString();
            if(count == noOfDays) {

                isValid = true;

            }

            else {

                isValid = false;

            }

            if(isValid) {

                workingDaysModel = new WorkingDaysModel(workingIdList[index - 1], noOfDays, workingDaysText, workingHrs, workingMin);

                if(controller.updateWorkingDays(workingDaysModel)) {

                    JOptionPane.showMessageDialog(this, "Edit Success!");
                    clearWorkingDaysFields();

                }

                else {

                    JOptionPane.showMessageDialog(this, "Can not edit this record. Plases try again later.");
            
                }
            }

            else {

                JOptionPane.showMessageDialog(this, "Invalid details.");
            
            }
        }
        
        else {

            JOptionPane.showMessageDialog(this, "Please select record first.");
            
        }
    }//GEN-LAST:event_workingEditButtonActionPerformed

    private void workingRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workingRemoveButtonActionPerformed

        int k = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this record?"); 
        
        if(k == 0) {
            
            if(index != -1) {

                if(controller.deleteWorkingDays(workingIdList[index - 1])) {

                    JOptionPane.showMessageDialog(this, "Remove Success!");
                    clearWorkingDaysFields();

                }

                else {

                    JOptionPane.showMessageDialog(this, "Can not remove this record. Plases try again later.");

                }
            }

            else {

                JOptionPane.showMessageDialog(this, "Please select record first.");

            }
        }
    }//GEN-LAST:event_workingRemoveButtonActionPerformed

    private void timeEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeEditButtonActionPerformed

        if(index != -1) {

            boolean isValid;

            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");

            String date = dateFormat.format(dateDateChooser.getDate());
            String startTimes = startHoursComboBox.getSelectedItem().toString() + "." + startMinutesComboBox.getSelectedItem().toString();
            String endTimes = endHoursComboBox.getSelectedItem().toString() + "." + endMinutesComboBox.getSelectedItem().toString();
            double timeRang = Double.parseDouble(endTimes) - Double.parseDouble(startTimes);

            int startHour = Integer.parseInt(startHoursComboBox.getSelectedItem().toString());
            int startMinute = Integer.parseInt(startMinutesComboBox.getSelectedItem().toString());
            int endHour = Integer.parseInt(endHoursComboBox.getSelectedItem().toString());
            int endMinute = Integer.parseInt(endMinutesComboBox.getSelectedItem().toString());

            if(timeRang < 0) {

                isValid = false;

            }

            else {

                if(timeSlotsType == 0) {

                    if(timeRang > 1) {

                        isValid = false;

                    }

                    else {

                        isValid = controller.validateDuplicate(date, startHour, endHour, startMinute, endMinute);

                    }
                }

                else {

                    if(timeRang > 0.5) {

                        isValid = false;

                    }

                    else {

                        isValid = controller.validateDuplicate(date, startHour, endHour, startMinute, endMinute);

                    }
                }
            }

            if(isValid) {

                timeSlotsModel = new TimeSlotsModel(timeIdList[index - 1][0], date, startTimes.replace(".", ":"), endTimes.replace(".", ":"), timeIdList[index - 1][1]);

                if(controller.updateTimeSlots(timeSlotsModel)) {

                    JOptionPane.showMessageDialog(this, "Edit Success!");
                    clearTimeSlotsFields();

                }

                else {

                    JOptionPane.showMessageDialog(this, "Can not edit this record. Plases try again later.");

                }
            }

            else {

                JOptionPane.showMessageDialog(this, "Invalid details.");

            }
        }

        else {

            JOptionPane.showMessageDialog(this, "Please select record first.");

        }
    }//GEN-LAST:event_timeEditButtonActionPerformed

    private void timeRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeRemoveButtonActionPerformed

        int k = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this record?");

        if(k == 0) {

            if(index != -1) {

                if(controller.deleteTimeSlots(timeIdList[index - 1][0])) {

                    JOptionPane.showMessageDialog(this, "Remove Success!");
                    clearTimeSlotsFields();

                }

                else {

                    JOptionPane.showMessageDialog(this, "Can not remove this record. Plases try again later.");

                }
            }

            else {

                JOptionPane.showMessageDialog(this, "Please select record first.");

            }
        }
    }//GEN-LAST:event_timeRemoveButtonActionPerformed

    private void timeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeTableMouseClicked

        try {
            
            clearVariable();

            int r = timeTable.getSelectedRow();

            index = Integer.parseInt(timeTable.getValueAt(r, 0).toString());
            dateTime = timeTable.getValueAt(r, 1).toString();
            startTime = timeTable.getValueAt(r, 2).toString();
            endTime = timeTable.getValueAt(r, 3).toString();

            startHoursComboBox.setSelectedItem(startTime.split(":")[0]);
            startMinutesComboBox.setSelectedItem(startTime.split(":")[1]);
            endHoursComboBox.setSelectedItem(endTime.split(":")[0]);
            endMinutesComboBox.setSelectedItem(endTime.split(":")[1]);

            timeSlotsType = timeIdList[r][1];

            Date selectedDate = new SimpleDateFormat ("yyyy-MM-dd").parse(dateTime);
            dateDateChooser.setDate(selectedDate);
            
            if(timeIdList[r][1] == 0) {

                hourSlotsButton.setBackground(new Color(153, 153, 153));
                minuteSlotsButton.setBackground(new Color(155, 27, 27));

            }

            else {

                minuteSlotsButton.setBackground(new Color(153, 153, 153));
                hourSlotsButton.setBackground(new Color(155, 27, 27));

            }

            timeSubmitButton.setEnabled(false);
            
        }
    
        catch(Exception e) {
        
        }
    }//GEN-LAST:event_timeTableMouseClicked

    private void timeResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeResetButtonActionPerformed

        clearTimeSlotsFields();
    }//GEN-LAST:event_timeResetButtonActionPerformed

    private void timeSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeSubmitButtonActionPerformed

        boolean isValid;

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");

        String date = dateFormat.format(dateDateChooser.getDate());
        String startTimes = startHoursComboBox.getSelectedItem().toString() + ":" + startMinutesComboBox.getSelectedItem().toString();
        String endTimes = endHoursComboBox.getSelectedItem().toString() + ":" + endMinutesComboBox.getSelectedItem().toString();

        int startHour = Integer.parseInt(startHoursComboBox.getSelectedItem().toString());
        int startMinute = Integer.parseInt(startMinutesComboBox.getSelectedItem().toString());
        int endHour = Integer.parseInt(endHoursComboBox.getSelectedItem().toString());
        int endMinute = Integer.parseInt(endMinutesComboBox.getSelectedItem().toString());

        int hoursRang = endHour - startHour;
        int minutesRang = endMinute - startMinute;

        if(timeSlotsType == 0) {

            if(hoursRang == 1 && minutesRang == 0) {

                isValid = controller.validateDuplicate(date, startHour, endHour, startMinute, endMinute);

            }

            else {

                isValid = false;

            }
        }

        else {

            if((hoursRang == 0 && minutesRang == 30) || (hoursRang == 1 && minutesRang == -30)) {

                isValid = controller.validateDuplicate(date, startHour, endHour, startMinute, endMinute);

            }

            else {

                isValid = false;

            }
        }

        if(isValid) {

            timeSlotsModel = new TimeSlotsModel(date, startTimes, endTimes, timeSlotsType);

            if(controller.insertTimeSlots(timeSlotsModel)) {

                JOptionPane.showMessageDialog(this, "Insert Success!");
                clearTimeSlotsFields();

            }

            else {

                JOptionPane.showMessageDialog(this, "Can not insert this record. Plases try again later.");

            }
        }

        else {

            JOptionPane.showMessageDialog(this, "Invalid details.");

        }
    }//GEN-LAST:event_timeSubmitButtonActionPerformed

    private void startMinutesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMinutesComboBoxActionPerformed

        timeResetButton.setEnabled(true);
    }//GEN-LAST:event_startMinutesComboBoxActionPerformed

    private void startHoursComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHoursComboBoxActionPerformed

        timeResetButton.setEnabled(true);
    }//GEN-LAST:event_startHoursComboBoxActionPerformed

    private void endMinutesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endMinutesComboBoxActionPerformed

        timeResetButton.setEnabled(true);
    }//GEN-LAST:event_endMinutesComboBoxActionPerformed

    private void endHoursComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endHoursComboBoxActionPerformed

        timeResetButton.setEnabled(true);
    }//GEN-LAST:event_endHoursComboBoxActionPerformed

    private void minuteSlotsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuteSlotsButtonActionPerformed

        timeSlotsType = 1;
        clearTimeSlotsFields();
    }//GEN-LAST:event_minuteSlotsButtonActionPerformed

    private void hourSlotsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourSlotsButtonActionPerformed

        timeSlotsType = 0;
        clearTimeSlotsFields();
    }//GEN-LAST:event_hourSlotsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane contentTabbedPane;
    private com.toedter.calendar.JDateChooser dateDateChooser;
    private javax.swing.JPanel daysHoursPanel;
    private javax.swing.JComboBox<String> endHoursComboBox;
    private javax.swing.JLabel endLabel;
    private javax.swing.JComboBox<String> endMinutesComboBox;
    private javax.swing.JCheckBox fridayCheckBox;
    private javax.swing.JButton hourSlotsButton;
    private javax.swing.JComboBox<String> hoursComboBox;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JButton minuteSlotsButton;
    private javax.swing.JComboBox<String> minutesComboBox;
    private javax.swing.JLabel minutesLabel;
    private javax.swing.JCheckBox mondayCheckBox;
    private javax.swing.JComboBox<String> noOfDaysComboBox;
    private javax.swing.JLabel noOfDaysLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JCheckBox saturdayCheckBox;
    private javax.swing.JComboBox<String> startHoursComboBox;
    private javax.swing.JLabel startHoursLabel;
    private javax.swing.JLabel startLabel;
    private javax.swing.JLabel startLabel1;
    private javax.swing.JComboBox<String> startMinutesComboBox;
    private javax.swing.JLabel startMinutesLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JCheckBox sundayCheckBox;
    private javax.swing.JCheckBox thursdayCheckBox;
    private javax.swing.JButton timeEditButton;
    private javax.swing.JButton timeRemoveButton;
    private javax.swing.JButton timeResetButton;
    private javax.swing.JScrollPane timeScrollPane;
    private javax.swing.JPanel timeSlotsPanel;
    private javax.swing.JButton timeSubmitButton;
    private javax.swing.JTable timeTable;
    private javax.swing.JLabel timeTitleLabel;
    private javax.swing.JCheckBox tuesdayCheckBox;
    private javax.swing.JCheckBox wednesdayCheckBox;
    private javax.swing.JLabel workingDaysLabel;
    private javax.swing.JButton workingEditButton;
    private javax.swing.JButton workingRemoveButton;
    private javax.swing.JScrollPane workingScrollPane;
    private javax.swing.JTable workingTable;
    private javax.swing.JLabel workingTimeLabel;
    private javax.swing.JLabel workingTitleLabel;
    // End of variables declaration//GEN-END:variables
   
}
