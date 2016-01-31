package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

/**
 * Created by olivier on 16/12/2015.
 */
public class User {
	private int _userId;
    private String _username;
    private String _password;
    private String _role;
    private Reserve[] _listReserv;
    
    public User(String username, String password, String role) {
    	/* Génération d'un nombre aléatoire en 1 et 10000. */
    	Random rand = new Random();
    	_userId = rand.nextInt(10000 - 1 + 1) + 1;
    	_username = username;
    	_password = password;
    	_role = role;
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_role() {
        return _role;
    }

    public void set_role(String _role) {
        this._role = _role;
    }
}
