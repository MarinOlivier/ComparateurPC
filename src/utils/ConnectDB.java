/**
 * 
 */
package utils;

import java.sql.*;
import com.mysql.jdbc.Connection;
/**
 * @author josetarsitano
 *
 */
public class ConnectDB {
    public static Connection startConnection() {
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8889/projet_poo?" + "user=root&password=root");            
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }

        return conn;
    }
    
    public static void pushComputerOnDB(Array a, Connection c) throws SQLException {
    	Statement s = c.createStatement();
    	s.executeUpdate("INSERT INTO user " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001);");
    }
}
