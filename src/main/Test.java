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

        Computer current = comp.get(14);
        for (int i = 0; i < comp.size(); i++) {
            Computer wished = comp.get(i);
            System.out.print(i + ". " + comp.get(i).getCPU() + " " + comp.get(i).getGPU() + "                                                  ");
            wished.compareTo(current);
        }
    }
}
