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
        	
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8889/projet_poo?" +
                            "user=root&password=root");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            /* Création de l'objet gérant les requêtes */
            Statement statement = conn.createStatement();
            ResultSet resultat = statement.executeQuery("SELECT * FROM user;");
            
            /* Récupération des données du résultat de la requête de lecture */
            while (resultat.next()) {
                int idUser = resultat.getInt("id");
                String nameUser = resultat.getString("name");
                String pwdUser = resultat.getString("password");
                String roleUser = resultat.getString("role");
                /* Traiter ici les valeurs récupérées. */
                System.out.println(idUser + " " + nameUser + " " + pwdUser + " " + roleUser);
            }
        } catch (Exception ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}
