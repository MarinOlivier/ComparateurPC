package main;

import gui.MyWindow;
import utils.*;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import gui.MyWindow;


/**
 * @TODO Creation BDD
 * @TODO Connexion BDD / Appli
 * @TODO Algo Comparaison souple
 * @TODO Algo Comparaison strict
 * @TODO IHM test
 * @TODO Implementation design pattern Decorator (facultatif)
 */

public class Main {

    public static void main(String[] args) throws SQLException {
        //MyWindow w = new MyWindow();
        Test test = new Test();
        test.run();
    }
}