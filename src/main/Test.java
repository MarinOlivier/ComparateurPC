package main;

import data.Computer;
import utils.ComparePC;
import utils.ConnectDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by olivier on 13/02/2016.
 */
public class Test {

    public void run() {
        ArrayList<Computer> comp = null;
        try {
            comp = ConnectDB.getAllComputerOnDB();
        } catch(SQLException e) {
            e.printStackTrace();
        }

        Computer wished = comp.get(0); // Prend le premier comme réf
        wished.compareTo(comp.get(19));
    }
}
