/**
 * 
 */
package utils;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author josetarsitano
 *
 */
public class ConnectDB {

    public static void startConnection() {
        Connection conn = null;

        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            conn = DriverManager.getConnection("jdbc:mysql://localhost:8888/projet_poo?" +
                            "user=root&password=");


            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}
