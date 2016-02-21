package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class User {
	private int _userId;
    private String _username;
    private String _password;
    private int _salt;
    private String _role;

    public  User() {}

    public User(int id, String username, String role) {
        _userId = id;
        _username = username;
        _role = role;
    }

    public int getUserId() {
        return _userId;
    }

    public void setUserId(int userId) {
        _userId = userId;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String username) {
        _username = username;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String password) {
        _password = password;
    }

    public String getRole() {
        return _role;
    }

    public void setRole(String role) {
        _role = role;
    }

    public int getSalt() {
        return _salt;
    }

    public void setSalt(int salt) {
        _salt = salt;
    }
}
