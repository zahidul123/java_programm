
import java.sql.*;
import javax.swing.JOptionPane;

public class mysql_connect {

    public static Connection connectDB() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost/MHProject", "root", "");
            return conn;
        } catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);
            return null;
        }
    }
}
