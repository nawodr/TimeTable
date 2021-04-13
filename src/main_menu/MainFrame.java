/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_menu;

import DB.DBConnection;
import Location.pnl_Location;
import WorkingDays.WorkingDaysandHours;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menu.SplashScreen;
import student.view.TagDetails;
import student.view.pnl_Student;

/**
 *
 * @author Tiran Harsha
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        date_time();
        execute();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);

    }

    private void execute() {

        ImageIcon iconWorkingDay = null;
        ImageIcon iconSubmenu = null;
        System.out.println("aaaa");
        try {
            iconWorkingDay = new ImageIcon(MainFrame.class.getResource("workingTime.png"));
            iconSubmenu = new javax.swing.ImageIcon(getClass().getResource("/resource/426430-PE93QI-643.jpg"));

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scnd = new javax.swing.JLabel();
        datee = new javax.swing.JLabel();
        dayy = new javax.swing.JLabel();
        timee = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        pnl_menu = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        panelBody = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABC Institute");

        panelHeader.setBackground(new java.awt.Color(0, 0, 0));
        panelHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ABC Institute");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Time Table Management System");

        scnd.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        scnd.setForeground(new java.awt.Color(204, 204, 204));
        scnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scnd.setText("55");

        datee.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        datee.setForeground(new java.awt.Color(204, 204, 204));
        datee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datee.setText("September 25,2019");

        dayy.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N
        dayy.setForeground(new java.awt.Color(204, 204, 204));
        dayy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayy.setText("Wed");

        timee.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        timee.setForeground(new java.awt.Color(204, 204, 204));
        timee.setText("12.33");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(dayy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timee, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(scnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(datee, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dayy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(scnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(datee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.setPreferredSize(new java.awt.Dimension(250, 413));
        panelMenu.setRequestFocusEnabled(false);

        pnl_menu.setBackground(new java.awt.Color(102, 102, 102));

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_teacher_50px_2.png"))); // NOI18N
        jToggleButton1.setText("Lecturer");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_teacher_50px_3.png"))); // NOI18N
        jToggleButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_teacher_50px_3.png"))); // NOI18N
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_teacher_50px_3.png"))); // NOI18N

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_student_registration_50px.png"))); // NOI18N
        jToggleButton2.setText("Students");
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_student_registration_50px_1.png"))); // NOI18N
        jToggleButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_student_registration_50px_1.png"))); // NOI18N
        jToggleButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_student_registration_50px_1.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_clock_50px.png"))); // NOI18N
        jToggleButton3.setText("Working Days");
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_clock_50px_1.png"))); // NOI18N
        jToggleButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_clock_50px_1.png"))); // NOI18N
        jToggleButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_clock_50px_1.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_book_50px.png"))); // NOI18N
        jToggleButton4.setText("Modules");
        jToggleButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_book_50px_1.png"))); // NOI18N
        jToggleButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_book_50px_1.png"))); // NOI18N
        jToggleButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_book_50px_1.png"))); // NOI18N
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton5);
        jToggleButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_room_50px_1.png"))); // NOI18N
        jToggleButton5.setText("Room Allocate");
        jToggleButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_room_50px_2.png"))); // NOI18N
        jToggleButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_room_50px_2.png"))); // NOI18N
        jToggleButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_room_50px_2.png"))); // NOI18N
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton6);
        jToggleButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_location_50px_1.png"))); // NOI18N
        jToggleButton6.setText("Location");
        jToggleButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_location_50px_2.png"))); // NOI18N
        jToggleButton6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_location_50px_2.png"))); // NOI18N
        jToggleButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_location_50px_2.png"))); // NOI18N
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton7);
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_all_out_50px.png"))); // NOI18N
        jToggleButton7.setText("Sessions");
        jToggleButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_all_out_50px_1.png"))); // NOI18N
        jToggleButton7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_all_out_50px_1.png"))); // NOI18N
        jToggleButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_all_out_50px_1.png"))); // NOI18N
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton8);
        jToggleButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_chart_50px_1.png"))); // NOI18N
        jToggleButton8.setText("Charts");
        jToggleButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_chart_50px_2.png"))); // NOI18N
        jToggleButton8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_chart_50px_2.png"))); // NOI18N
        jToggleButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_chart_50px_2.png"))); // NOI18N
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButton9);
        jToggleButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_tags_50px.png"))); // NOI18N
        jToggleButton9.setText("Tags");
        jToggleButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_tags_50px_1.png"))); // NOI18N
        jToggleButton9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_tags_50px_1.png"))); // NOI18N
        jToggleButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/main_menu/icons8_tags_50px_1.png"))); // NOI18N
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBody.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/zzz.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabel3.setPreferredSize(new java.awt.Dimension(500, 500));
        panelBody.add(jLabel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setBounds(0, 0, 1035, 704);
    }// </editor-fold>//GEN-END:initComponents
    pnl_Student ps;
    TagDetails td = new TagDetails();
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        panelBody.removeAll();
        if (ps == null) {
            ps = new pnl_Student();
            panelBody.add(ps);
        } else {
            panelBody.add(ps);
        }
        panelBody.repaint();
        panelBody.revalidate();

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    WorkingDaysandHours wh = new WorkingDaysandHours();
    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
         panelBody.removeAll();
        if (wh == null) {
            wh = new WorkingDaysandHours();
            panelBody.add(wh);
        } else {
            panelBody.add(wh);
        }
        panelBody.repaint();
        panelBody.revalidate();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        panelBody.removeAll();
        try {
            panelBody.add(new pnl_Location());
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        panelBody.repaint();
        panelBody.revalidate();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    
//    pnl_Student ps;
//    TagDetails td = new TagDetails();
    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        panelBody.removeAll();
        if (td == null) {
            td = new TagDetails();
            panelBody.add(td);
        } else {
            panelBody.add(td);
        }
        panelBody.repaint();
        panelBody.revalidate();
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        SplashScreen screen = new SplashScreen();
        screen.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                screen.prg_bar.setValue(i);
            }
        } catch (Exception e) {
        }
//        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                screen.setVisible(false);
                new MainFrame().setVisible(true);
            }
        });

        DBConnection.getConnection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel datee;
    private javax.swing.JLabel dayy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    public javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel pnl_menu;
    private javax.swing.JLabel scnd;
    private javax.swing.JLabel timee;
    // End of variables declaration//GEN-END:variables

    public void date_time() {

        SimpleDateFormat sd = new SimpleDateFormat("MMMMM dd,yyyy");
        SimpleDateFormat sd1 = new SimpleDateFormat("EEE");

        new Thread(new Runnable() {

            @Override
            public void run() {

                while (true) {
                    java.util.Date d = new java.util.Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                    SimpleDateFormat hour = new SimpleDateFormat("HH");
                    SimpleDateFormat sdfs = new SimpleDateFormat("ss");
                    datee.setText(sd.format(d));
                    dayy.setText(sd1.format(d));
                    timee.setText(sdf.format(d));
                    scnd.setText(sdfs.format(d));

                }
            }
        }).start();
    }

}
