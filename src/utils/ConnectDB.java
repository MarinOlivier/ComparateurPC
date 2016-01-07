/**
 * 
 */
package utils;

import java.sql.*;
import java.util.Map;

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
    
    public static void pushComputerOnDB(Map a, java.sql.Connection c) throws SQLException {
    	Statement s = c.createStatement();
    	//System.out.println(a);
    	
    	String component[] = {"name", "motherBoard", "CPU", "RAM", "GPU", "ROM", "PowerSupply", 
    							"price", "RAM_freq", "CPU_freq", "GPU_freq", "GPU_RAM", "E_S", 
    							"case_pc", "airing", "OS", "brand", "soundCard"};
    	
    	String listComponent[] = new String[19];
    	for (int i = 0; i < a.size(); i++) {
    		listComponent[i] = listComponent[i] != null ? listComponent[i].replace(",", ".") : (String)a.get(component[i]);
    		System.out.println(listComponent[i]);
		}
    	
    	// TODO.
    	//s.executeUpdate("INSERT INTO computer VALUES ('')");
    }
}
