/**
 * 
 */
package utils;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

import com.mysql.jdbc.Connection;
import data.Computer;

/**
 * @author josetarsitano
 *
 */
public class ConnectDB {

    private static String component[] = {"name", "motherBoard", "CPU", "RAM", "GPU", "ROM", "powerSupply",
            "price", "RAM_freq", "CPU_freq", "GPU_freq", "GPU_RAM", "E_S",
            "case_PC", "airing", "OS", "brand", "soundCard", "pict"};


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
    
    public static void pushComputerOnDB(HashMap<String, String> a, java.sql.Connection c) throws SQLException {

        String sql = "INSERT INTO computer " +
                "(name, motherBoard, CPU, RAM, GPU, ROM, powerSupply, price, RAM_freq, CPU_freq, GPU_freq, GPU_RAM, E_S, case_pc, airing, OS, brand, soundCard, pict)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = c.prepareStatement(sql);

    	String listComponent[] = new String[component.length];
        for (int i = 0; i < a.size(); i++) {
    		listComponent[i] = (String)a.get(component[i]);
    		if (listComponent[i] != null)
    			listComponent[i] = listComponent[i].replace(",", ".");

            preparedStatement.setString(i+1, listComponent[i]);
		}

        preparedStatement.executeUpdate();
    }

    public static ArrayList<Computer> getAllComputerOnDB(java.sql.Connection c) throws SQLException {
        String selectSQL = "SELECT * FROM computer";
        PreparedStatement preparedStatement = c.prepareStatement(selectSQL);

        ResultSet rs = preparedStatement.executeQuery(selectSQL);

        return dbToArrayList(rs);
    }
    public static ArrayList<Computer> getComputerOnDB(java.sql.Connection c, Computer wishedComp) throws SQLException {
        String WHERE = "";

        for(int i = 0; i  < component.length; i++){
            try {
                Field field = wishedComp.getClass().getDeclaredField("_" + component[i]);
                String value = (String)field.get(wishedComp);

                if(value != null){
                    WHERE = WHERE + "`" + component[i] + "` LIKE '" + value + "' AND ";
                }

            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        WHERE = WHERE.substring(0, WHERE.length()-5);
        WHERE = WHERE + ";";

        String selectSQL = "SELECT * FROM `computer` WHERE "+ WHERE;
        PreparedStatement preparedStatement = c.prepareStatement(selectSQL);
        ResultSet rs = preparedStatement.executeQuery(selectSQL );

        return dbToArrayList(rs);
    }

    public static String[] getCriteria(java.sql.Connection c, String element) throws SQLException {

        String selectSQL = "SELECT DISTINCT "+ element +" FROM computer WHERE `"+ element +"` <> 'null' ORDER BY "+ element;
        PreparedStatement preparedStatement = c.prepareStatement(selectSQL);

        ResultSet rs = preparedStatement.executeQuery(selectSQL );

        ArrayList<String> list = new ArrayList<>();
        list.add("null");
        while(rs.next()){
            list.add(rs.getString(element));
        }
        return list.toArray(new String[list.size()]);
    }


    private static ArrayList<Computer> dbToArrayList(ResultSet rs){

        ArrayList<Computer> comptList = new ArrayList<>();
        try {
            while(rs.next()) {
                Computer comp = new Computer();
                for(int i = 0; i < component.length; i++) {
                    try {
                        Field field = comp.getClass().getDeclaredField("_" + component[i]);
                        field.set(comp, rs.getString(component[i]));
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
                comptList.add(comp);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return comptList;
    }

}
