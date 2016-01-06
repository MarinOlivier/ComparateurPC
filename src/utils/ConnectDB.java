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
    public static void startConnection() {
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8888/projet_poo?" +
                            "user=root&password=");

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            /* Création de l'objet gérant les requêtes */
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM user;");
        } catch (Exception ex) {
            // handle any errors LOL
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}
