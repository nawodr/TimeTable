package Session;

import java.awt.Color;
import javax.swing.JOptionPane;

public class SessionView extends javax.swing.JPanel {

    SessionController controller = new SessionController();
    SessionModel model = new SessionModel();
    
    int lecCount = 0;
    boolean isUpdate = false;
    
    int id = -99;
    String lecturers;
    String tag;
    String group_id;
    String subgroup_id;
    String sub_code;
    String subject;
    String stu_count;
    String tag_duration;
    
    public SessionView() {
        
        initComponents();
        
        clearAddFields();
        
    }

    public void clearAddFields() {
        
        lecturersTagButton.setBackground(new Color(255, 255, 255));
        groupSubjectButton.setBackground(new Color(240, 240, 240));
        
        step1Panel.setVisible(true);
        step2Panel.setVisible(false);
        
        controller.loadSessionTable(sessionTable);
        controller.loadLecturerCombo(lecturerComboBox);
        controller.loadTagCombo(tagComboBox);
        controller.loadGroupCombo(groupComboBox, isLabTag());
        controller.loadSubjectCombo(subjectComboBox);
        selectedLabel.setText("");
        noOfStudentTextField.setText("");
        durationTextField.setText("");
          
        submitButton.setText("Submit");
        submitButton.setEnabled(true);
        clear1Button.setEnabled(true);
        clear2Button.setEnabled(true);
            
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
    
    public boolean isLabTag() {
        
        if("Lab".equals(tagComboBox.getSelectedItem().toString())) {
        
            return true;
            
        }
        
        else {
        
            return false;
            
        }
    }
    
    public boolean validateValue() {
        
        boolean isValid = true;
        
        String sub = subjectComboBox.getSelectedItem().toString();
        
        if((lecturers.equals("")) || (lecturers.equals("Select Lecturer")) || (lecturers.isEmpty())) {
        
            isValid = false;
            
        }
        
        else if((tag.equals("")) || (tag.equals("Select Tag")) || (tag.isEmpty())) {
        
            isValid = false;
            
        }
        
        else if((group_id.equals("")) || (group_id.equals("Select Student Group")) || (group_id.isEmpty())) {
        
            isValid = false;
            
        }
        
        else if((sub.equals("")) || (sub.equals("Select Subject")) || (sub.isEmpty())) {
        
            isValid = false;
            
        }
        
        else if((stu_count.equals("")) || (stu_count.isEmpty())) {
        
            isValid = false;
            
        }
        
        else if((tag_duration.equals("")) || (tag_duration.isEmpty())) {
        
            isValid = false;
            
        }
        
        else {
        
            isValid = true;
        }
        
        return isValid;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTabbedPane = new javax.swing.JTabbedPane();
        sessionPanel = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        searchComboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        sessionScrollPane = new javax.swing.JScrollPane();
        sessionTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        refreshtButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        lecturersTagButton = new javax.swing.JButton();
        groupSubjectButton = new javax.swing.JButton();
        step1Panel = new javax.swing.JPanel();
        lecturerComboBox = new javax.swing.JComboBox<>();
        lecturerLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        tagLabel = new javax.swing.JLabel();
        tagComboBox = new javax.swing.JComboBox<>();
        selectedLecturerLabel = new javax.swing.JLabel();
        selectedLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        clear1Button = new javax.swing.JButton();
        step2Panel = new javax.swing.JPanel();
        groupComboBox = new javax.swing.JComboBox<>();
        groupLabel = new javax.swing.JLabel();
        noOfStudentLabel = new javax.swing.JLabel();
        subjectComboBox = new javax.swing.JComboBox<>();
        subjectLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        noOfStudentTextField = new javax.swing.JTextField();
        durationTextField = new javax.swing.JTextField();
        hrsLabel = new javax.swing.JLabel();
        clear2Button = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        contentTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        contentTabbedPane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contentTabbedPane.setOpaque(true);
        contentTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTabbedPaneMouseClicked(evt);
            }
        });

        searchTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Session ID", "Subject", "Student Group", "Tag" }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.setFocusable(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        sessionTable.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        sessionTable.setModel(new javax.swing.table.DefaultTableModel(
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
        sessionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sessionTableMouseClicked(evt);
            }
        });
        sessionScrollPane.setViewportView(sessionTable);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        refreshtButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshtButton.setText("Refresh");
        refreshtButton.setBorder(null);
        refreshtButton.setFocusable(false);
        refreshtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshtButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.setFocusable(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewButton.setText("View");
        viewButton.setBorder(null);
        viewButton.setFocusable(false);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout sessionPanelLayout = new javax.swing.GroupLayout(sessionPanel);
        sessionPanel.setLayout(sessionPanelLayout);
        sessionPanelLayout.setHorizontalGroup(
            sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sessionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sessionPanelLayout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sessionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        sessionPanelLayout.setVerticalGroup(
            sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sessionPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(sessionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sessionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentTabbedPane.addTab("Manage Sessions", sessionPanel);

        addPanel.setBackground(new java.awt.Color(255, 255, 255));

        contentPanel.setLayout(null);

        lecturersTagButton.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lecturersTagButton.setText("Select Lecturers & Tag");
        lecturersTagButton.setBorder(null);
        lecturersTagButton.setEnabled(false);
        lecturersTagButton.setFocusable(false);
        lecturersTagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturersTagButtonActionPerformed(evt);
            }
        });
        contentPanel.add(lecturersTagButton);
        lecturersTagButton.setBounds(0, 0, 221, 31);

        groupSubjectButton.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        groupSubjectButton.setText("Select Group & Subject");
        groupSubjectButton.setBorder(null);
        groupSubjectButton.setEnabled(false);
        groupSubjectButton.setFocusable(false);
        groupSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupSubjectButtonActionPerformed(evt);
            }
        });
        contentPanel.add(groupSubjectButton);
        groupSubjectButton.setBounds(220, 0, 244, 31);

        step1Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Step 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lecturerComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lecturerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lecturer" }));
        lecturerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerComboBoxActionPerformed(evt);
            }
        });

        lecturerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lecturerLabel.setText("Lecturer");

        addButton.setBackground(new java.awt.Color(0, 153, 204));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("+");
        addButton.setBorder(null);
        addButton.setFocusable(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        tagLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tagLabel.setText("Tag");

        tagComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tagComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Tag" }));
        tagComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagComboBoxActionPerformed(evt);
            }
        });

        selectedLecturerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectedLecturerLabel.setText("Selected Lecturer(s)");

        selectedLabel.setBackground(new java.awt.Color(204, 204, 204));
        selectedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectedLabel.setOpaque(true);

        nextButton.setBackground(new java.awt.Color(0, 153, 204));
        nextButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.setBorder(null);
        nextButton.setFocusable(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        clear1Button.setBackground(new java.awt.Color(153, 0, 51));
        clear1Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear1Button.setForeground(new java.awt.Color(255, 255, 255));
        clear1Button.setText("Clear");
        clear1Button.setBorder(null);
        clear1Button.setFocusable(false);
        clear1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout step1PanelLayout = new javax.swing.GroupLayout(step1Panel);
        step1Panel.setLayout(step1PanelLayout);
        step1PanelLayout.setHorizontalGroup(
            step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step1PanelLayout.createSequentialGroup()
                .addGroup(step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(step1PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clear1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, step1PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selectedLecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(step1PanelLayout.createSequentialGroup()
                                    .addComponent(lecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(tagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tagComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        step1PanelLayout.setVerticalGroup(
            step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step1PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tagComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lecturerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(selectedLecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(step1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        contentPanel.add(step1Panel);
        step1Panel.setBounds(10, 50, 950, 376);

        step2Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Step 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        groupComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Group" }));
        groupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupComboBoxActionPerformed(evt);
            }
        });

        groupLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        groupLabel.setText("Student Group");

        noOfStudentLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noOfStudentLabel.setText("No of Student");

        subjectComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject" }));
        subjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectComboBoxActionPerformed(evt);
            }
        });

        subjectLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subjectLabel.setText("Subject");

        durationLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        durationLabel.setText("Duration");

        noOfStudentTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noOfStudentTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noOfStudentTextFieldKeyTyped(evt);
            }
        });

        durationTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        durationTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                durationTextFieldKeyTyped(evt);
            }
        });

        hrsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrsLabel.setText("Hrs");

        clear2Button.setBackground(new java.awt.Color(153, 0, 51));
        clear2Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear2Button.setForeground(new java.awt.Color(255, 255, 255));
        clear2Button.setText("Clear");
        clear2Button.setBorder(null);
        clear2Button.setFocusable(false);
        clear2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 102, 0));
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

        submitButton.setBackground(new java.awt.Color(0, 153, 204));
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

        javax.swing.GroupLayout step2PanelLayout = new javax.swing.GroupLayout(step2Panel);
        step2Panel.setLayout(step2PanelLayout);
        step2PanelLayout.setHorizontalGroup(
            step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step2PanelLayout.createSequentialGroup()
                        .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(step2PanelLayout.createSequentialGroup()
                        .addComponent(subjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step2PanelLayout.createSequentialGroup()
                        .addComponent(noOfStudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(noOfStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(step2PanelLayout.createSequentialGroup()
                        .addGroup(step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(step2PanelLayout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clear2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(step2PanelLayout.createSequentialGroup()
                                .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hrsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        step2PanelLayout.setVerticalGroup(
            step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step2PanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(noOfStudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(noOfStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hrsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(subjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(step2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        contentPanel.add(step2Panel);
        step2Panel.setBounds(10, 50, 952, 376);

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        contentTabbedPane.addTab("Add New Session", addPanel);

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

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed

        searchButton.setEnabled(true);
    }//GEN-LAST:event_searchComboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String value = searchTextField.getText().trim();
        int type = searchComboBox.getSelectedIndex();

        controller.searchSession(sessionTable, value, type);

    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshtButtonActionPerformed

        controller.loadSessionTable(sessionTable);
        searchTextField.setText("");
        searchComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_refreshtButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed

        if(id != -99) {

            contentTabbedPane.setSelectedIndex(1);
            submitButton.setEnabled(false);
            clear1Button.setEnabled(false);
            clear2Button.setEnabled(false);

            selectedLabel.setText(lecturers);
            tagComboBox.setSelectedItem(tag);
            groupComboBox.setSelectedItem(group_id);
            subjectComboBox.setSelectedItem(sub_code + "-" + subject);
            noOfStudentTextField.setText(stu_count);
            durationTextField.setText(tag_duration);

        }

        else {

            JOptionPane.showMessageDialog(this, "Please select record.");

        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        if(id != -99) {

            contentTabbedPane.setSelectedIndex(1);
            isUpdate = true;
            submitButton.setText("Update");
            submitButton.setEnabled(true);
            clear1Button.setEnabled(true);
            clear2Button.setEnabled(true);

            selectedLabel.setText(lecturers);
            tagComboBox.setSelectedItem(tag);
            groupComboBox.setSelectedItem(group_id);
            subjectComboBox.setSelectedItem(sub_code + "-" + subject);
            noOfStudentTextField.setText(stu_count);
            durationTextField.setText(tag_duration);

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

    private void lecturersTagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturersTagButtonActionPerformed

    }//GEN-LAST:event_lecturersTagButtonActionPerformed

    private void groupSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupSubjectButtonActionPerformed

    }//GEN-LAST:event_groupSubjectButtonActionPerformed

    private void lecturerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerComboBoxActionPerformed

    }//GEN-LAST:event_lecturerComboBoxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String newLecturer = lecturerComboBox.getSelectedItem().toString();

        if(!newLecturer.equals("Select Lecturer")) {

            if(lecCount < 4) {

                String addedLecturer = selectedLabel.getText().trim();

                addedLecturer = addedLecturer + "  " + newLecturer;

                selectedLabel.setText(addedLecturer);
                controller.loadLecturerCombo(lecturerComboBox);

                lecCount++;

            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void tagComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagComboBoxActionPerformed

    }//GEN-LAST:event_tagComboBoxActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        groupSubjectButton.setBackground(new Color(255, 255, 255));
        lecturersTagButton.setBackground(new Color(240, 240, 240));

        step2Panel.setVisible(true);
        step1Panel.setVisible(false);

        controller.loadGroupCombo(groupComboBox, isLabTag());

    }//GEN-LAST:event_nextButtonActionPerformed

    private void clear1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ButtonActionPerformed

        controller.loadLecturerCombo(lecturerComboBox);
        controller.loadTagCombo(tagComboBox);
        selectedLabel.setText("");

    }//GEN-LAST:event_clear1ButtonActionPerformed

    private void groupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupComboBoxActionPerformed

    }//GEN-LAST:event_groupComboBoxActionPerformed

    private void subjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectComboBoxActionPerformed

    }//GEN-LAST:event_subjectComboBoxActionPerformed

    private void noOfStudentTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfStudentTextFieldKeyTyped

        char enter = evt.getKeyChar();

        if(!(Character.isDigit(enter))) {

            evt.consume();

        }
    }//GEN-LAST:event_noOfStudentTextFieldKeyTyped

    private void durationTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_durationTextFieldKeyTyped

        char enter = evt.getKeyChar();

        if(!(Character.isDigit(enter))) {

            String letter = String.valueOf(enter);

            if((!(letter.equals(".")))) {

                evt.consume();

            }
        }
    }//GEN-LAST:event_durationTextFieldKeyTyped

    private void clear2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ButtonActionPerformed

        controller.loadGroupCombo(groupComboBox, isLabTag());
        controller.loadSubjectCombo(subjectComboBox);
        noOfStudentTextField.setText("");
        durationTextField.setText("");

    }//GEN-LAST:event_clear2ButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        lecturersTagButton.setBackground(new Color(255, 255, 255));
        groupSubjectButton.setBackground(new Color(240, 240, 240));

        step1Panel.setVisible(true);
        step2Panel.setVisible(false);

        controller.loadGroupCombo(groupComboBox, isLabTag());
        controller.loadSubjectCombo(subjectComboBox);
        noOfStudentTextField.setText("");
        durationTextField.setText("");

    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        lecturers = selectedLabel.getText().trim();
        tag = tagComboBox.getSelectedItem().toString();
        group_id = groupComboBox.getSelectedItem().toString();
        subgroup_id = groupComboBox.getSelectedItem().toString();
        stu_count = noOfStudentTextField.getText().trim();
        tag_duration = durationTextField.getText().trim();

        if(validateValue()) {

            String sub[] = subjectComboBox.getSelectedItem().toString().split("-");

            sub_code = sub[0];
            subject = sub[1];

            if(isUpdate) {

                model = new SessionModel(id, lecturers, tag, group_id, subgroup_id, sub_code, subject, stu_count, tag_duration);

                if(controller.updateSession(model)) {

                    clearAddFields();

                }

                else {

                    JOptionPane.showMessageDialog(this, "Can not update this record. Plases try again later.");

                }

                isUpdate = false;

            }

            else {

                model = new SessionModel(lecturers, tag, group_id, subgroup_id, sub_code, subject, stu_count, tag_duration);

                if(controller.insertSession(model)) {

                    clearAddFields();
                    contentTabbedPane.setSelectedIndex(0);
                    controller.loadSessionTable(sessionTable);

                }

                else {

                    JOptionPane.showMessageDialog(this, "Can not insert this record. Plases try again later.");

                }
            }
        }

        else {

            JOptionPane.showMessageDialog(this, "Invalid details.");

        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void contentTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTabbedPaneMouseClicked

    }//GEN-LAST:event_contentTabbedPaneMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clear1Button;
    private javax.swing.JButton clear2Button;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTabbedPane contentTabbedPane;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JComboBox<String> groupComboBox;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JButton groupSubjectButton;
    private javax.swing.JLabel hrsLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> lecturerComboBox;
    private javax.swing.JLabel lecturerLabel;
    private javax.swing.JButton lecturersTagButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel noOfStudentLabel;
    private javax.swing.JTextField noOfStudentTextField;
    private javax.swing.JButton refreshtButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel selectedLabel;
    private javax.swing.JLabel selectedLecturerLabel;
    private javax.swing.JPanel sessionPanel;
    private javax.swing.JScrollPane sessionScrollPane;
    private javax.swing.JTable sessionTable;
    private javax.swing.JPanel step1Panel;
    private javax.swing.JPanel step2Panel;
    private javax.swing.JComboBox<String> subjectComboBox;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> tagComboBox;
    private javax.swing.JLabel tagLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
