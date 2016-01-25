/**
 * 
 */
package utils;

import java.sql.*;
import java.util.*;

import com.mysql.jdbc.Connection;
import data.Computer;

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

    public static HashSet<HashMap<String, String>> getComputerOnDB(java.sql.Connection c) throws SQLException {
        String selectSQL = "SELECT * FROM computer";
        PreparedStatement preparedStatement = c.prepareStatement(selectSQL);

        ResultSet rs = preparedStatement.executeQuery(selectSQL );

        String component[] = {"name", "motherBoard", "CPU", "RAM", "GPU", "ROM", "PowerSupply",
                "price", "RAM_freq", "CPU_freq", "GPU_freq", "GPU_RAM", "E_S",
                "case_pc", "airing", "OS", "brand", "soundCard"};

        HashSet<HashMap<String, String>> comptList = new HashSet<>();

        while (rs.next()) {
            HashMap<String, String> hash = new HashMap<>();
            for(int i = 0; i  < component.length; i++){
                hash.put(component[i], rs.getString(component[i]));
            }

            comptList.add(hash);
        }

        return comptList;
    }
}
