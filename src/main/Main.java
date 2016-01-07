package main;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

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
        System.out.println("Hello lol!");
        Connection con = utils.ConnectDB.startConnection();

        File file = new File("/Users/josetarsitano/Documents/Work/Development/Eclipse/ComparateurPC/src/db/ldlc.json");
        utils.JsonParse.reader(file, con);
    }
}
