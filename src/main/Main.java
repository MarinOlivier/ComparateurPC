package main;

import utils.JsonParse;

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

        String file = "/Users/olivier/Documents/Polytech/Cours 4a Moi/POO_Projet/src/ComparateurPCv2/src/db/ldlc.json";
        utils.JsonParse.reader(file);
    }
}
