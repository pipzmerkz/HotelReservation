package HotelReservation;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Reservation extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;
    public Reservation() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IDType = new javax.swing.JComboBox<>();
        IDNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RoomType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Rate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        CheckIn = new com.toedter.calendar.JDateChooser();
        CheckOut = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        PhoneNum = new javax.swing.JTextField();
        Days = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        Back = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(68, 108, 179));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Guest Information:");

        jLabel2.setText("Last Name:");

        FName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FNameKeyReleased(evt);
            }
        });

        jLabel3.setText("First Name:");

        LName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LNameKeyReleased(evt);
            }
        });

        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Identification Information:");

        jLabel6.setText("ID Type:");

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

        jLabel7.setText("ID Number:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Room Information:");

        jLabel9.setText("Room Type:");

        RoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room Type", "Single", "Double", "Triple", "Quad", "Queen", "King", "Twin", "Double-Double", "Studio", "Master Suite", "Junior Suite" }));
        RoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTypeActionPerformed(evt);
            }
        });

        jLabel10.setText("Check in:");

        jLabel11.setText("Check out:");

        jLabel12.setText("No of Days:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Rates:");

        Rate.setEnabled(false);

        jLabel14.setText("Rate/Day: ");

        Total.setEnabled(false);

        jLabel18.setText("Total:");

        Submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Submit.setText("SUBMIT");
        Submit.setEnabled(false);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        CheckIn.setDateFormatString("yyyy-MM-dd");
        CheckIn.setEnabled(false);

        CheckOut.setDateFormatString("yyyy-MM-dd");
        CheckOut.setEnabled(false);

        jLabel17.setText("Phone Number:");

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
        jScrollPane1.setViewportView(Address);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneNum)
                                    .addComponent(LName)
                                    .addComponent(FName, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RoomType, 0, 150, Short.MAX_VALUE)
                                    .addComponent(CheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Days, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rate)
                            .addComponent(CheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(Total)))
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(38, 38, 38))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14)
                                    .addComponent(Rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addComponent(CheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11)
                            .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IDType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IDNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(12, 12, 12)))
                        .addGap(0, 30, Short.MAX_VALUE))))
        );

        Back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(250, 250, 250));
        jLabel16.setText("RESERVATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		return sDate;
    }
    
   
    
    private void FNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FNameKeyReleased
        if (!FName.getText().equals("") && !LName.getText().equals("")
            && !PhoneNum.getText().equals("") && !Address.getText().equals("")
            && !IDNum.getText().equals("") && !Rate.getText().equals("")
            && !Total.getText().equals("")){
            Submit.setEnabled(true);
        }
    }//GEN-LAST:event_FNameKeyReleased

    private void LNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LNameKeyReleased
        if (!FName.getText().equals("") && !LName.getText().equals("")
            && !PhoneNum.getText().equals("") && !Address.getText().equals("")
            && !IDNum.getText().equals("") && !Rate.getText().equals("")
            && !Total.getText().equals("")){
            Submit.setEnabled(true);
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
            Submit.setEnabled(true);
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

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        
        
        Boolean scan = true;
        Boolean sub = true;
        Boolean checker = false;
        String select = "select fname, lname, phonenum, address, roomtype, checkin, days, checkout, idtype, idnum, rate, total from reservations";
        String insert = "insert into reservations (fname, lname, phonenum, address, roomtype, checkin, days, checkout, idtype, idnum, rate, total) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        
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
                            JOptionPane.showMessageDialog(null, "Room Not Available");
                            checker = false;
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
                && CheckOut.getDate() != null && IDType.getSelectedItem() != null && IDNum.getText() != null
                && Rate.getText() != null && Total.getText() != null && checker == true){
                    
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
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Reservation Saved!");
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
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void PhoneNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumKeyReleased
        if (!FName.getText().equals("") && !LName.getText().equals("")
            && !PhoneNum.getText().equals("") && !Address.getText().equals("")
            && !IDNum.getText().equals("") && !Rate.getText().equals("")
            && !Total.getText().equals("")){
            Submit.setEnabled(true);
        }
    }//GEN-LAST:event_PhoneNumKeyReleased

    private void DaysCatchSpinnerValue(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DaysCatchSpinnerValue
        SimpleDateFormat datefmt = new SimpleDateFormat("MM/dd/yyyy"); // Or format you're using
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

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MainMenu M = new MainMenu();
        M.setLocationRelativeTo(null);
        M.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        conn = mysqlconnect.ConnectDB();
    }//GEN-LAST:event_formWindowActivated
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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reservation R = new Reservation();
                R.setLocationRelativeTo(null);
                R.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JButton Back;
    private com.toedter.calendar.JDateChooser CheckIn;
    private com.toedter.calendar.JDateChooser CheckOut;
    private javax.swing.JSpinner Days;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField IDNum;
    private javax.swing.JComboBox<String> IDType;
    private javax.swing.JTextField LName;
    private javax.swing.JTextField PhoneNum;
    private javax.swing.JTextField Rate;
    private javax.swing.JComboBox<String> RoomType;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
