package main;

import java.io.File;

/**
 * @TODO Creation BDD
 * @TODO Connexion BDD / Appli
 * @TODO Algo Comparaison souple
 * @TODO Algo Comparaison strict
 * @TODO IHM test
 * @TODO Implementation design pattern Decorator (facultatif)
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello lol!");
        utils.ConnectDB.startConnection();

        File file = new File("/Users/josetarsitano/Documents/Work/Development/Eclipse/ComparateurPC/src/db/ldlc.json");
        utils.JsonParse.reader(file);
    }
}
