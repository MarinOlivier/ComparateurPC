/**
 * Copyright (c) 2016.
 * main.Main
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */

package main;

import data.User;
import gui.MyWindow;
import gui.UserWindow;
import utils.*;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import gui.MyWindow;


/**
 * The type Main.
 */
public class Main {
    /**
     * The constant user.
     */
    public static User user;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws SQLException the sql exception
     */
    public static void main(String[] args) throws SQLException {
        UserWindow uw = new UserWindow();
    }
}