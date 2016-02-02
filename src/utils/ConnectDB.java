/**
 * 
 */
package utils;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

import com.mysql.jdbc.Connection;
import com.sun.deploy.util.SystemUtils;
import data.Computer;

/**
 * @author josetarsitano
 *
 */
public class ConnectDB {
	static Connection _con = utils.ConnectDB.startConnection();

    private static String component[] = {"id", "name", "motherBoard", "CPU", "RAM", "GPU", "ROM", "powerSupply",
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
    
    public static void pushComputerOnDB(HashMap<String, String> a) throws SQLException {
        String sql = "INSERT INTO computer " +
                "(name, motherBoard, CPU, RAM, GPU, ROM, powerSupply, price, RAM_freq, CPU_freq, GPU_freq, GPU_RAM, E_S, case_pc, airing, OS, brand, soundCard, pict)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = _con.prepareStatement(sql);

        /* Remplacement des virgules qui créent des conflits pour les requetes. */
    	String listComponent[] = new String[component.length];
        for (int i = 0; i < a.size(); i++) {
    		listComponent[i] = (String)a.get(component[i]);
    		if (listComponent[i] != null)
    			listComponent[i] = listComponent[i].replace(",", ".");

            preparedStatement.setString(i+1, listComponent[i]);
		}

        preparedStatement.executeUpdate();
    }

    public static ArrayList<Computer> getAllComputerOnDB() throws SQLException {
        String selectSQL = "SELECT * FROM computer";
        PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);

        ResultSet rs = preparedStatement.executeQuery(selectSQL);

        return dbToArrayList(rs);
    }
    
    public static ArrayList<Computer> getComputerOnDB(Computer wishedComp) throws SQLException {
        String WHERE = "";
        
        for(int i = 0; i  < component.length; i++){
            try {
                Field field = wishedComp.getClass().getDeclaredField("_" + component[i]);
                String value = (String)field.get(wishedComp);
                
                // TODO
                System.out.println(value);
                if(value != null && !Objects.equals(value, "Sélectionner")){
                    WHERE = WHERE + "`" + component[i] + "` LIKE '" + value + "' AND ";
                }

            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        String selectSQL;
        if(WHERE.equals("")) {
            selectSQL = "SELECT * FROM `computer`;";
        } else {
            WHERE = WHERE.substring(0, WHERE.length()-5);
            WHERE = WHERE + ";";

            selectSQL = "SELECT * FROM `computer` WHERE "+ WHERE;
        }

        PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);
        ResultSet rs = preparedStatement.executeQuery(selectSQL );

        return dbToArrayList(rs);
    }
    
    public static Computer getOneComputer(String idComputer) throws SQLException {
        int newIdComputer = Integer.parseInt(idComputer);
    	String selectSQL = "SELECT * FROM computer WHERE id = " + newIdComputer;
    	PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);
    	ResultSet rs = preparedStatement.executeQuery(selectSQL);
    	
    	Computer tmp = new Computer();

    	while(rs.next()) {
            tmp.setId(rs.getString("id"));
    		tmp.setName(rs.getString("name"));
    		tmp.setBrand(rs.getString("brand"));
    		tmp.setMotherBoard(rs.getString("motherBoard"));
    		tmp.setCPU(rs.getString("CPU"));
    		tmp.setCPU_freq(rs.getString("CPU_freq"));
    		tmp.setGPU(rs.getString("GPU"));
    		tmp.setGPU_freq(rs.getString("GPU_freq"));
    		tmp.setGPU_RAM(rs.getString("GPU_RAM"));
    		tmp.setRAM(rs.getString("RAM"));
    		tmp.setRAM_freq(rs.getString("RAM_freq"));
    		tmp.setAiring(rs.getString("airing"));
    		tmp.setCase_PC(rs.getString("case_pc"));
    		tmp.setE_S(rs.getString("E_S"));
    		tmp.setOS(rs.getString("OS"));
    		tmp.setPict(rs.getString("pict"));
    		tmp.setPowerSupply(rs.getString("powerSupply"));
    		tmp.setPrice(rs.getString("price"));
    		tmp.setROM(rs.getString("ROM"));
    		tmp.setSoundCard(rs.getString("soundCard"));
    	}

    	return tmp;
    }

    public static String[] getCriteria(String element) throws SQLException {

        String selectSQL = "SELECT DISTINCT " + element + " FROM computer WHERE `"+ element +"` <> 'null' ORDER BY "+ element;
        PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);

        ResultSet rs = preparedStatement.executeQuery(selectSQL );

        ArrayList<String> list = new ArrayList<>();
        list.add("Sélectionner");
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
    
    public static void pushReservOnDB(int idUser, String idComp, String nameComp, String priceComp) throws SQLException {
        int newIdComputer = Integer.parseInt(idComp);
    	String sql = "INSERT INTO reserve " +
                "(id_user, id_computer, name_computer, price_computer)" +
                " VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = _con.prepareStatement(sql);
        preparedStatement.setInt(1, idUser);
        preparedStatement.setInt(2, newIdComputer);
        preparedStatement.setString(3, nameComp);
        preparedStatement.setString(4, priceComp);
        preparedStatement.executeUpdate();
    }

    public static void removeReservOnDB(int idUser, String idComp) throws SQLException {
        int newIdComputer = Integer.parseInt(idComp);
        String sql = "DELETE FROM reserve WHERE id_user = ? AND id_computer = ?";
        PreparedStatement preparedStatement = _con.prepareStatement(sql);
        preparedStatement.setInt(1, idUser);
        preparedStatement.setInt(2, newIdComputer);
        preparedStatement.executeUpdate();
    }

    public static boolean verifReserv(int idUser, String idComp) throws SQLException {
        int newIdComputer = Integer.parseInt(idComp);
    	String selectSQL;
        selectSQL = "SELECT id_user,id_computer FROM reserve WHERE id_user = " + idUser + " AND id_computer = " + newIdComputer;
        PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);
        ResultSet rs = preparedStatement.executeQuery(selectSQL);

        int verifIdComp = 0;
        while (rs.next())
        	verifIdComp = rs.getInt(2);
        
        return verifIdComp == newIdComputer;
    }
    
    public static ArrayList<String[]> getReservation() throws SQLException {
    	String selectSQL;
        selectSQL = "SELECT * FROM reserve";
        PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);
        ResultSet rs = preparedStatement.executeQuery(selectSQL);

        String[] idCompList = new String[100];
        String[] nameCompList = new String[100];
        String[] dateList = new String[100];
        String[] priceList = new String[100];
        int i = 0;
        while (rs.next()) {
        	idCompList[i] = rs.getString(2);
	        nameCompList[i] = rs.getString(3);
	        dateList[i] = rs.getString(4);
            priceList[i] = rs.getString(5);
	        i++;
        }
        
        ArrayList<String[]> arrReserv = new ArrayList<>();
        arrReserv.add(idCompList);
        arrReserv.add(nameCompList);
        arrReserv.add(dateList);
        arrReserv.add(priceList);
        
        return arrReserv;
    }

}
