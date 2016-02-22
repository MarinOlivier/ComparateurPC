/**
 * Copyright (c) 2016.
 * data.Reserve
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */

package data;

/**
 * The type Reserve.
 */
public class Reserve {
    /**
     * The Id user.
     */
    private int _idUser;
    /**
     * The Id comp.
     */
    private int _idComp;

    /**
     * Gets username.
     *
     * @return the username
     */
    public int get_username() {
        return _idUser;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(int user) {
        _idUser = user;
    }

    /**
     * Gets id comp.
     *
     * @return the id comp
     */
    public int getIdComp() {
        return _idComp;
    }

    /**
     * Sets id comp.
     *
     * @param idComp the id comp
     */
    public void setIdComp(int idComp) {
        _idComp = idComp;
    }
}