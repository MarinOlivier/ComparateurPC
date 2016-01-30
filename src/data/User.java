package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by olivier on 16/12/2015.
 */
public class User {

    private String _username;
    private String _password;
    private String _role;
    private boolean _expert;

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

    public boolean is_expert() {
        return _expert;
    }

    public void set_expert(boolean _expert) {
        this._expert = _expert;
    }
}
