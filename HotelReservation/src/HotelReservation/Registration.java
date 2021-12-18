package HotelReservation;
import java.sql.*;
import javax.swing.JOptionPane;
public class Registration extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;

    public Registration() {
        initComponents();
    }
    
    public void reveal(){
        if(showpassCB.isSelected()){
            txtpass.setEchoChar((char)0);
        }
        else{
            txtpass.setEchoChar('*');
        } 
    }
    
    public void creveal(){
        if(showcpassCB.isSelected()){
            txtcpass.setEchoChar((char)0);
        }
        else{
            txtcpass.setEchoChar('*');
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtuname = new javax.swing.JTextPane();
        txtpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtfname = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtlname = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        showpassCB = new javax.swing.JCheckBox();
        showcpassCB = new javax.swing.JCheckBox();
        Save = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtempnum = new javax.swing.JTextPane();
        txtcpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(68, 108, 179));
        jPanel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("REGISTRATION FORM");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtuname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtunameKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtuname);

        txtpass.setName("password"); // NOI18N
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jLabel5.setText("First Name:");

        txtfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfnameKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtfname);

        txtlname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlnameKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtlname);

        jLabel6.setText("Last name:");

        jLabel7.setText("Confirm Password:");

        showpassCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassCBActionPerformed(evt);
            }
        });

        showcpassCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcpassCBActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.setEnabled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel8.setText("Employee Number:");

        txtempnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtempnumFocusLost(evt);
            }
        });
        txtempnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtempnumKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(txtempnum);

        txtcpass.setName("password"); // NOI18N
        txtcpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcpassKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showpassCB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcpass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showcpassCB))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(showpassCB))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Save)
                            .addComponent(Login)))
                    .addComponent(showcpassCB))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(524, 524, 524))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showpassCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassCBActionPerformed
        reveal();
    }//GEN-LAST:event_showpassCBActionPerformed
    private void showcpassCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcpassCBActionPerformed
        creveal();
    }//GEN-LAST:event_showcpassCBActionPerformed
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Boolean scanuser = true;
        Boolean createacc = true;
        String select = "select empnum, fname, lname, uname, password from accounts";
        String insert = "insert into accounts (empnum, fname, lname, uname, password) values(?,?,?,?,?)";
        
        int num = Integer.valueOf(txtempnum.getText());
        String first = String.valueOf(txtfname.getText());
        String last = String.valueOf(txtlname.getText());
        String user = String.valueOf(txtuname.getText());
        String password = String.valueOf(txtpass.getPassword());
        String confirm = String.valueOf(txtcpass.getPassword());
        try{
            if(scanuser == true){
            pst = conn.prepareStatement(select);
            rs = pst.executeQuery();
            while(rs.next()){
                String dbempnum = rs.getString("empnum");
                String dbfname = rs.getString("fname");
                String dblname = rs.getString("lname");
                String dbuname = rs.getString("uname");
                String dbpass = rs.getString("password");
                
                if(dbempnum.equals(txtempnum.getText()) || dbuname.equals(txtuname.getText())){
                    JOptionPane.showMessageDialog(null, "Employee Number/Username is already in use.");
                    createacc = false;
                }
            }
            
            }
            if(createacc == true){
            if(password.equals(confirm) && txtempnum.getText() != null &&
               txtfname.getText() != null && txtlname.getText() != null && txtuname.getText() != null){
            pst = conn.prepareStatement(insert);
            pst.setString(1, txtempnum.getText());
            pst.setString(2, txtfname.getText());
            pst.setString(3, txtlname.getText());
            pst.setString(4, txtuname.getText());
            pst.setString(5, password);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Account Created!");
            Login L = new Login();
            L.setVisible(true);
            setVisible(false);
            dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"The Passwords doesn't match");
                showpassCB.setSelected(true);
                reveal();
                txtpass.setText("");
                txtcpass.setText("");
            }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }        
    }//GEN-LAST:event_SaveActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        conn = mysqlconnect.ConnectDB();
    }//GEN-LAST:event_formWindowActivated

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Login L = new Login();
        L.setLocationRelativeTo(null);
        L.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_LoginActionPerformed

    private void txtempnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtempnumKeyReleased
        if(!txtempnum.getText().equals("") && !txtfname.getText().equals("")
        && !txtlname.getText().equals("") && !txtuname.getText().equals("")
        && !txtpass.getText().equals("") && !txtcpass.getText().equals("")){
            Save.setEnabled(true);
        }
        else{
            Save.setEnabled(false);
        }
    }//GEN-LAST:event_txtempnumKeyReleased

    private void txtfnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyReleased
        if(!txtempnum.getText().equals("") && !txtfname.getText().equals("")
        && !txtlname.getText().equals("") && !txtuname.getText().equals("")
        && !txtpass.getText().equals("") && !txtcpass.getText().equals("")){
            Save.setEnabled(true);
        }
        else{
            Save.setEnabled(false);
        }
    }//GEN-LAST:event_txtfnameKeyReleased

    private void txtlnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnameKeyReleased
        if(!txtempnum.getText().equals("") && !txtfname.getText().equals("")
        && !txtlname.getText().equals("") && !txtuname.getText().equals("")
        && !txtpass.getText().equals("") && !txtcpass.getText().equals("")){
            Save.setEnabled(true);
        }
        else{
            Save.setEnabled(false);
        }
    }//GEN-LAST:event_txtlnameKeyReleased

    private void txtunameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunameKeyReleased
        if(!txtempnum.getText().equals("") && !txtfname.getText().equals("")
        && !txtlname.getText().equals("") && !txtuname.getText().equals("")
        && !txtpass.getText().equals("") && !txtcpass.getText().equals("")){
            Save.setEnabled(true);
        }
        else{
            Save.setEnabled(false);
        }
    }//GEN-LAST:event_txtunameKeyReleased

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        if(!txtempnum.getText().equals("") && !txtfname.getText().equals("")
        && !txtlname.getText().equals("") && !txtuname.getText().equals("")
        && !txtpass.getText().equals("") && !txtcpass.getText().equals("")){
            Save.setEnabled(true);
        }
        else{
            Save.setEnabled(false);
        }
    }//GEN-LAST:event_txtpassKeyReleased

    private void txtcpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpassKeyReleased
        if(!txtempnum.getText().equals("") && !txtfname.getText().equals("")
        && !txtlname.getText().equals("") && !txtuname.getText().equals("")
        && !txtpass.getText().equals("") && !txtcpass.getText().equals("")){
            Save.setEnabled(true);
        }
        else{
            Save.setEnabled(false);
        }
    }//GEN-LAST:event_txtcpassKeyReleased

    private void txtempnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtempnumFocusLost
        Boolean numeric = true;
        try{
            String emp = txtempnum.getText();
            Integer.parseInt(emp);
        }catch (NumberFormatException e) {
            numeric = false;
        }
            
        if(numeric == false){
            JOptionPane.showMessageDialog(null, "Employee Number is in wrong format.");
        }
    }//GEN-LAST:event_txtempnumFocusLost
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registration R = new Registration();
                R.setLocationRelativeTo(null);
                R.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JCheckBox showcpassCB;
    private javax.swing.JCheckBox showpassCB;
    private javax.swing.JPasswordField txtcpass;
    private javax.swing.JTextPane txtempnum;
    private javax.swing.JTextPane txtfname;
    private javax.swing.JTextPane txtlname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextPane txtuname;
    // End of variables declaration//GEN-END:variables
}
