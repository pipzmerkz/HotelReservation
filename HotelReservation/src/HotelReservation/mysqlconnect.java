package HotelReservation;
import java.sql.*;
import javax.swing.*;
public class mysqlconnect {
    
    public static Connection ConnectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/hotelreservation","root","");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
