
package teachercounselling;


import java.sql.*;
import javax.swing.*;



public class Test  {
 
    Connection conn=null; 
   public static Connection ConnectrDb(){
     try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testlogin","root","");
       JOptionPane.showMessageDialog(null,"Database Connected!");
       return conn;
   }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Database Connection Failed!");
           return null;
           }
       
   }
    
}
