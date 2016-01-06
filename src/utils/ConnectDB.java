/**
 * 
 */
package utils;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.servlet.http.HttpServletRequest;

import com.mysql.jdbc.Connection;
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
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8888/projet_poo?" +
                            "user=root&password=");


            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            /* Création de l'objet gérant les requêtes */
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery( "SELECT * FROM user;");
        } catch (Exception ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}
