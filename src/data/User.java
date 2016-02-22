/**
 * Copyright (c) 2016.
 * data.User
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */
package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

/**
 * The type User.
 */
public class User {
    /**
     * The User id.
     */
    private int _userId;
    /**
     * The Username.
     */
    private String _username;
    /**
     * The Password.
     */
    private String _password;
    /**
     * The Salt.
     */
    private int _salt;
    /**
     * The Role.
     */
    private String _role;

    /**
     * Instantiates a new User.
     */
    public  User() {}

    /**
     * Instantiates a new User.
     *
     * @param id       the id
     * @param username the username
     * @param role     the role
     */
    public User(int id, String username, String role) {
        _userId = id;
        _username = username;
        _role = role;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public int getUserId() {
        return _userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(int userId) {
        _userId = userId;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return _username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        _username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return _password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        _password = password;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
        return _role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
        _role = role;
    }

    /**
     * Gets salt.
     *
     * @return the salt
     */
    public int getSalt() {
        return _salt;
    }

    /**
     * Sets salt.
     *
     * @param salt the salt
     */
    public void setSalt(int salt) {
        _salt = salt;
    }
}
