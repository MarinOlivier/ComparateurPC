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
    	//System.out.println(a);
    	
    	String component[] = {"name", "motherBoard", "CPU", "RAM", "GPU", "ROM", "PowerSupply", 
    							"price", "RAM_freq", "CPU_freq", "GPU_freq", "GPU_RAM", "E_S", 
    							"case_pc", "airing", "OS", "brand", "soundCard"};

        String sql = "INSERT INTO computer " +
                "(name, motherBoard, CPU, RAM, GPU, ROM, powerSupply, price, RAM_freq, CPU_freq, GPU_freq, GPU_RAM, E_S, case_pc, airing, OS, brand, soundCard)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = c.prepareStatement(sql);

    	String listComponent[] = new String[19];
        for (int i = 0; i < a.size(); i++) {
    		listComponent[i] = (String)a.get(component[i]);
    		listComponent[i] = listComponent[i] != null ? listComponent[i].replace(",", ".") : (String)a.get(component[i]);

            preparedStatement.setString(i+1, listComponent[i]);
		}

        preparedStatement.executeUpdate();

    }
}
