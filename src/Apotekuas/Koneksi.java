/*
    201351016_Andika Muhammad Aditya_IF PAGI B
*/

package Apotekuas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
        Connection con;
        Statement stm; 
    public static Connection config(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/apotekuas","root","");
            Statement stm=con.createStatement();
      
            return con;
        } catch (Exception ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
