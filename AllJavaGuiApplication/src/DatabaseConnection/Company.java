
package DatabaseConnection;

import java.sql.*;



public class Company  {
 
    
  // public static Connection conn=null; 
   public static Connection creator()throws Exception{
     String username="root";
    String password="";
    String url="jdbc:mysql://localhost/student";
     Class.forName("com.mysql.jdbc.Driver");
          
       Connection conn = DriverManager.getConnection(url, username, password);
       return conn;
       
   }
    
}
