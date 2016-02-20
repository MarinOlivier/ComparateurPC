/**
 * 
 */
package utils;

import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.*;

import com.mysql.jdbc.Connection;
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

    public static data.User getUserOnDB(String username, String password) throws SQLException {
        String selectSQL = "SELECT * FROM user";
        PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);
        ResultSet rs = preparedStatement.executeQuery(selectSQL);

        data.User user = new data.User();
        while (rs.next()) {
            user.setUserId(rs.getInt(1));
            user.setUsername(rs.getString(2));
            user.setRole(rs.getString(3));
            user.setPassword(rs.getString(4));
            user.setSalt(rs.getInt(5));
        }

        return user;
    }

    public static boolean checkUser(String username, String password) throws SQLException {
        String selectSQL = "SELECT username, password, salt FROM user WHERE username = '" + username + "'";
        PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);
        ResultSet rs = preparedStatement.executeQuery(selectSQL);

        int salt = 0;
        String usernameTmp = null;
        String passwordTmp = null;
        while (rs.next()) {
            usernameTmp = rs.getString("username");
            passwordTmp = rs.getString("password");
            salt = rs.getInt("salt");
        }

        if (salt == 0)
            return false;

        password += salt;

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        md.update(password.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        return Objects.equals(usernameTmp, username) && Objects.equals(sb.toString(), passwordTmp);
    }

    public static boolean isUserExist(String username) throws SQLException {
        String selectSQL = "SELECT id FROM user WHERE username = '" + username + "'";
        PreparedStatement preparedStatement = _con.prepareStatement(selectSQL);
        ResultSet rs = preparedStatement.executeQuery(selectSQL);

        return rs.next();
    }

    public static void pushUserOnDB(String username, String role, String password) throws SQLException {
        MessageDigest md = null;

        /* Génération d'un nombre aléatoire en 1 et 999999999. */
        Random rand = new Random();
        int salt = rand.nextInt(999999999 - 1 + 1) + 1;
        password += salt;

        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        md.update(password.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        System.out.println("Hex format : " + sb.toString());
        System.out.println("Salt : " + salt);

        String sql = "INSERT INTO user " +
                "(username, role, password, salt)" +
                " VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = _con.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, role);
        preparedStatement.setString(3, sb.toString());
        preparedStatement.setInt(4, salt);
        preparedStatement.executeUpdate();
    }
}
