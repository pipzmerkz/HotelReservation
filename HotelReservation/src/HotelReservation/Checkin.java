package HotelReservation;

import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Checkin extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public Checkin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        LName = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        IDType = new javax.swing.JComboBox<>();
        IDNum = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        RoomType = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Rate = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        Checkin = new javax.swing.JButton();
        CheckIn = new com.toedter.calendar.JDateChooser();
        CheckOut = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        PhoneNum = new javax.swing.JTextField();
        Days = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        Paid = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        Balance = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(68, 108, 179));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(250, 250, 250));
        jLabel16.setText("CHECKIN");

        Back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Guest Information:");

        jLabel35.setText("Last Name:");

        FName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FNameKeyReleased(evt);
            }
        });

        jLabel36.setText("First Name:");

        LName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LNameKeyReleased(evt);
            }
        });

        jLabel37.setText("Address:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Identification Information:");

        jLabel39.setText("ID Type:");

        IDType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Type", "Driver's License", "Passport", "Health Card", "Military ID", "Student ID" }));
        IDType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTypeActionPerformed(evt);
            }
        });

        IDNum.setEnabled(false);
        IDNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDNumKeyReleased(evt);
            }
        });

        jLabel40.setText("ID Number:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Room Information:");

        jLabel42.setText("Room Type:");

        RoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room Type", "Single", "Double", "Triple", "Quad", "Queen", "King", "Twin", "Double-Double", "Studio", "Master Suite", "Junior Suite" }));
        RoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTypeActionPerformed(evt);
            }
        });

        jLabel43.setText("Check in:");

        jLabel44.setText("Check out:");

        jLabel45.setText("No of Days:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Rates:");

        Rate.setEnabled(false);

        jLabel47.setText("Rate/Day: ");

        Total.setEnabled(false);

        jLabel48.setText("Total:");

        Checkin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Checkin.setText("Check In");
        Checkin.setEnabled(false);
        Checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckinActionPerformed(evt);
            }
        });

        CheckIn.setDateFormatString("yyyy-MM-dd");
        CheckIn.setEnabled(false);

        CheckOut.setDateFormatString("yyyy-MM-dd");
        CheckOut.setEnabled(false);

        jLabel49.setText("Phone Number:");

        PhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PhoneNumKeyReleased(evt);
            }
        });

        Days.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        Days.setEnabled(false);
        Days.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DaysCatchSpinnerValue(evt);
            }
        });

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane3.setViewportView(Address);

        jLabel51.setText("Amount Paid:");

        Paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PaidKeyReleased(evt);
            }
        });

        jLabel52.setText("Balance:");

        Balance.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel37)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PhoneNum)
                                .addComponent(LName)
                                .addComponent(FName, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(0, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RoomType, 0, 150, Short.MAX_VALUE)
                                    .addComponent(CheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel41)
                            .addComponent(jLabel38)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Days, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rate)
                            .addComponent(CheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(Total)
                            .addComponent(Paid)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Checkin))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Balance)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel34)
                            .addGap(38, 38, 38))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel46))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel47)
                                    .addComponent(Rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel43)
                                        .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel35))
                                    .addComponent(CheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel44)
                            .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)))
                    .addComponent(jLabel37)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addGap(4, 4, 4)
                        .addComponent(Checkin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Phone Number", "Address", "Room Type", "Checkin", "No of Days", "Checkout", "Rate/Day", "ID Type", "ID Number", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable);

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Search:");

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Back))
                            .addComponent(jScrollPane5)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateJTable(){
    String sql = "select * from reservations";
    try{
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        jTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    }
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
    }
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MainMenu M = new MainMenu();
        M.setLocationRelativeTo(null);
        M.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void FNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FNameKeyReleased
        if (!FName.getText().equals("") && !LName.getText().equals("")
            && !PhoneNum.getText().equals("") && !Address.getText().equals("")
            && !IDNum.getText().equals("") && !Rate.getText().equals("")
            && !Total.getText().equals("")){
            Checkin.setEnabled(true);
        }
    }//GEN-LAST:event_FNameKeyReleased

    private void LNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LNameKeyReleased
        if (!FName.getText().equals("") && !LName.getText().equals("")
            && !PhoneNum.getText().equals("") && !Address.getText().equals("")
            && !IDNum.getText().equals("") && !Rate.getText().equals("")
            && !Total.getText().equals("")){
            Checkin.setEnabled(true);
        }
    }//GEN-LAST:event_LNameKeyReleased

    private void IDTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTypeActionPerformed
        IDNum.setEnabled(true);
    }//GEN-LAST:event_IDTypeActionPerformed

    private void IDNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDNumKeyReleased
        if (!FName.getText().equals("") && !LName.getText().equals("")
            && !PhoneNum.getText().equals("") && !Address.getText().equals("")
            && !IDNum.getText().equals("") && !Rate.getText().equals("")
            && !Total.getText().equals("")){
            Checkin.setEnabled(true);
        }
    }//GEN-LAST:event_IDNumKeyReleased

    private void RoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomTypeActionPerformed
        CheckIn.setEnabled(true);
        Days.setEnabled(true);
        String RT = String.valueOf(RoomType.getSelectedItem());
        switch(RT){
            case "Single":
            Rate.setText("1000");
            break;
            case "Double":
            Rate.setText("2000");
            break;
            case "Triple":
            Rate.setText("3000");
            break;
            case "Quad":
            Rate.setText("4000");
            break;
            case "Queen":
            Rate.setText("4500");
            break;
            case "King":
            Rate.setText("5000");
            break;
            case "Twin":
            Rate.setText("2500");
            break;
            case "Double-Double":
            Rate.setText("4500");
            break;
            case "Studio":
            Rate.setText("3500");
            break;
            case "Master Suite":
            Rate.setText("8000");
            break;
            case "Junior Suite":
            Rate.setText("6000");
            break;
        }
    }//GEN-LAST:event_RoomTypeActionPerformed

    private void CheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckinActionPerformed
        
        Boolean scan = true;
        Boolean sub = true;
        Boolean checker = true;
        String select = "select fname, lname, phonenum, address, roomtype, checkin, days, checkout, idtype, idnum, rate, total from checkin";
        String insert = "insert into checkin (fname, lname, phonenum, address, roomtype, checkin, days, checkout, idtype, idnum, rate, total, paid, balance) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        String first = String.valueOf(FName.getText());
        String last = String.valueOf(LName.getText());
        String num = String.valueOf(PhoneNum.getText());
        String add = String.valueOf(Address.getText());
        String rtype = String.valueOf(RoomType.getSelectedItem());
        Date in = CheckIn.getDate();
        java.sql.Date CIn = convertUtilToSql(in);
        int day = (int) Days.getValue();
        Date out = CheckOut.getDate();
        java.sql.Date COut = convertUtilToSql(out);
        String idt = String.valueOf(IDType.getSelectedItem());
        String idn = String.valueOf(IDNum.getText());
        int ra = Integer.valueOf(Rate.getText());
        int tot = Integer.valueOf(Total.getText());
        int paid = Integer.valueOf(Paid.getText());
        int bal = Integer.valueOf(Balance.getText());

        try{
            if(scan == true){
                pst = conn.prepareStatement(select);
                rs = pst.executeQuery();
                while(rs.next()){
                    String dbrtype = rs.getString("roomtype");
                    Date dbin = rs.getDate("checkin");
                    Date dbout = rs.getDate("checkout");

                    if(dbrtype.equals(RoomType.getSelectedItem()) ||
                        dbin.equals(CheckIn.getDate()) ||
                        dbout.equals(CheckOut.getDate())){
                        JOptionPane.showMessageDialog(null, "Room Not Available At This Time");
                        checker = false;
                        RoomType.setSelectedItem("Room Type");
                        Days.setValue(0);
                        CheckOut.setDate(null);
                        IDType.setSelectedItem("ID Type");
                        IDNum.setText("");
                        Rate.setText("");
                        Total.setText("");
                        Paid.setText("");
                        Balance.setText("");
                        CheckIn.setDate(null);
                        break;
                        
                    }
                    else{
                        checker = true;    
                    }
                }
            }
            if (sub == true){
                if(FName.getText() != null && LName.getText() != null && PhoneNum.getText() != null
                    && Address.getText() != null && RoomType.getSelectedItem() != null
                    && CheckIn.getDate() != null && Days.getValue() != null
                    && CheckOut.getDate() != null && IDType.getSelectedItem() != null
                    && IDNum.getText() != null && Rate.getText() != null && Total.getText() != null
                    && Paid.getText() != null && Balance.getText() != null && checker == true){

                    pst = conn.prepareStatement(insert);
                    pst.setString(1, first);
                    pst.setString(2, last);
                    pst.setString(3, num);
                    pst.setString(4, add);
                    pst.setString(5, rtype);
                    pst.setDate(6, CIn);
                    pst.setInt(7, day);
                    pst.setDate(8, COut);
                    pst.setString(9, idt);
                    pst.setString(10, idn);
                    pst.setInt(11, ra);
                    pst.setInt(12, tot);
                    pst.setInt(13, paid);
                    pst.setInt(14, bal);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Checked In");
                    
                    String sql = "delete from reservations where fname = ?";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1,first);
                    pst.execute();
                    
                    MainMenu M = new MainMenu();
                    M.setLocationRelativeTo(null);
                    M.setVisible(true);
                    setVisible(false);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please fill all the fields.");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_CheckinActionPerformed

    private void PhoneNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumKeyReleased
        if (!FName.getText().equals("") && !LName.getText().equals("")
            && !PhoneNum.getText().equals("") && !Address.getText().equals("")
            && !IDNum.getText().equals("") && !Rate.getText().equals("")
            && !Total.getText().equals("")){
            Checkin.setEnabled(true);
        }
    }//GEN-LAST:event_PhoneNumKeyReleased

    private void DaysCatchSpinnerValue(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DaysCatchSpinnerValue
        SimpleDateFormat datefmt = new SimpleDateFormat("MM/dd/yyyy");
        Date date = CheckIn.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int D = (int) Days.getValue();
        cal.add(Calendar.DAY_OF_MONTH, D);
        Date futureDate = cal.getTime();
        CheckOut.setDate(futureDate);

        int r = Integer.parseInt(Rate.getText());
        int d = (int) Days.getValue();
        int x = r * d;
        String tot = String.valueOf(x);
        Total.setText(tot);
    }//GEN-LAST:event_DaysCatchSpinnerValue

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        conn = mysqlconnect.ConnectDB();
        UpdateJTable();
    }//GEN-LAST:event_formWindowActivated

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String sql = "select * from reservations where fname like ? or lname like ?"
                   + "or phonenum like ? or  address like ? or roomtype like ? or checkin like ?"
                   + "or days like ? or checkout like ? or idtype like ? or idnum like ? or rate like ? or total like ?";
           try{
               pst = conn.prepareStatement(sql);
               pst.setString(1,search.getText() + "%");
               pst.setString(2,search.getText() + "%");
               pst.setString(3,search.getText() + "%");
               pst.setString(4,search.getText() + "%");
               pst.setString(5,search.getText() + "%");
               pst.setString(6,search.getText() + "%");
               pst.setString(7,search.getText() + "%");
               pst.setString(8,search.getText() + "%");
               pst.setString(9,search.getText() + "%");
               pst.setString(10,search.getText() + "%");
               pst.setString(11,search.getText() + "%");
               pst.setString(12,search.getText() + "%");
               rs = pst.executeQuery();
               jTable.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
    }//GEN-LAST:event_searchKeyReleased

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int row = jTable.getSelectedRow();
        FName.setText(jTable.getModel().getValueAt(row,0).toString());
        LName.setText(jTable.getModel().getValueAt(row,1).toString());
        PhoneNum.setText(jTable.getModel().getValueAt(row,2).toString());
        Address.setText(jTable.getModel().getValueAt(row,3).toString());
        RoomType.setSelectedItem(jTable.getModel().getValueAt(row,4).toString());
        Date CI = (Date) jTable.getModel().getValueAt(row,5);
        CheckIn.setDate(CI);
        int day = (int) jTable.getModel().getValueAt(row,6);
        Days.setValue(day);
        Date CO = (Date) jTable.getModel().getValueAt(row,7);
        CheckOut.setDate(CO);
        IDType.setSelectedItem(jTable.getModel().getValueAt(row,8).toString());
        IDNum.setText(jTable.getModel().getValueAt(row,9).toString());
        Rate.setText(jTable.getModel().getValueAt(row,10).toString());
        Total.setText(jTable.getModel().getValueAt(row,11).toString());
    }//GEN-LAST:event_jTableMouseClicked

    private void PaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaidKeyReleased
        Checkin.setEnabled(true);
        int paid = Integer.parseInt(Paid.getText());
        int tot = Integer.parseInt(Total.getText());
        int bal = tot - paid;
        String x = String.valueOf(bal);
        Balance.setText(x);
    }//GEN-LAST:event_PaidKeyReleased

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
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Checkin CI = new Checkin();
                CI.setLocationRelativeTo(null);
                CI.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Balance;
    private com.toedter.calendar.JDateChooser CheckIn;
    private com.toedter.calendar.JDateChooser CheckOut;
    private javax.swing.JButton Checkin;
    private javax.swing.JSpinner Days;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField IDNum;
    private javax.swing.JComboBox<String> IDType;
    private javax.swing.JTextField LName;
    private javax.swing.JTextField Paid;
    private javax.swing.JTextField PhoneNum;
    private javax.swing.JTextField Rate;
    private javax.swing.JComboBox<String> RoomType;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
