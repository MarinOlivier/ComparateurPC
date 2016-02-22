/**
 * Copyright (c) 2016.
 * gui.UserWindow
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */

package gui;

import data.User;
import main.Main;
import utils.ConnectDB;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.lang.reflect.Field;
import java.util.Arrays;

import javax.swing.*;

/**
 * The type User window.
 */
public class UserWindow extends JFrame {

    /**
     * The Username field.
     */
    private JTextField _usernameField;

    /**
     * The Username label.
     */
    private JLabel _usernameLabel;

    /**
     * The Password field.
     */
    private JPasswordField _passwordField;

    /**
     * The Password label.
     */
    private JLabel _passwordLabel;

    /**
     * The Main panel.
     */
    private JPanel _mainPanel;

    /**
     * The Connexion.
     */
    private JButton _connexion;

    /**
     * The Msg alert.
     */
    private JLabel _msgAlert;

    /**
     * The Add user.
     */
    private JButton _addUser;

    /**
     * The Add user panel.
     */
    private JPanel _addUserPanel;

    /**
     * The Form is display.
     */
    private boolean _formIsDisplay;

    /**
     * The Password.
     */
    private String _password;

    /**
     * Instantiates a new User window.
     */
    public UserWindow() {
        setSize(320, 170);
        setResizable(false);
        _formIsDisplay = false;
        _usernameField = new JTextField(10);
        _passwordField = new JPasswordField(10);
        _connexion = new JButton("Connexion");

        _msgAlert = new JLabel("");
        _msgAlert.setForeground(Color.RED);

        _addUser = new JButton("Créer utilisateur");
        _addUserPanel = new AddUserPanel();

        _connexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (_passwordField.getPassword().length != 0) {
                    _password = String.valueOf(_passwordField.getPassword());
                    try {
                        /* Connexion */
                        if (utils.ConnectDB.checkUser(_usernameField.getText(), _password)) {
                            Main.user = utils.ConnectDB.getUserOnDB(_usernameField.getText(), _password);
                            MyWindow w = new MyWindow();
                            dispose();
                        }
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    _msgAlert.setText("Mot de passe incorrect");
                }
            }
        });

        _addUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!_formIsDisplay) {
                    add(_addUserPanel);
                    setLayout(new GridLayout(2, 1));
                    setSize(320, 340);
                    setVisible(true);
                    _formIsDisplay = true;
                } else {
                    remove(_addUserPanel);
                    setLayout(new GridLayout(1, 1));
                    setSize(320, 170);
                    setVisible(true);
                    _formIsDisplay = false;
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {


            }
        });

        _usernameLabel = new JLabel("Nom d'utilisateur :");
        _usernameLabel.setLabelFor(_usernameField);
        _passwordLabel = new JLabel("Mot de passe :");
        _passwordLabel.setLabelFor(_passwordField);

        _mainPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridheight = 1;
        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 0;
        _mainPanel.add(_usernameLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        _mainPanel.add(_usernameField, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        gbc.gridx = 0;
        gbc.gridy = 1;
        _mainPanel.add(_passwordLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        _mainPanel.add(_passwordField, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        gbc.gridx = 0;
        gbc.gridy = 2;
        _mainPanel.add(_msgAlert, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        gbc.gridx = 0;
        gbc.gridy = 3;
        _mainPanel.add(_connexion, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 0;
        gbc.gridy = 5;
        _mainPanel.add(_addUser, gbc);

        _mainPanel.setBorder(BorderFactory.createTitledBorder("Connexion"));


        setLayout(new GridLayout(1, 1));
        add(_mainPanel);

        setVisible(true);
	}

    /**
     * The type Add user panel.
     */
    class AddUserPanel extends JPanel {

        /**
         * The Username label.
         */
        private JLabel _usernameLabel;

        /**
         * The Password label.
         */
        private JLabel _passwordLabel;

        /**
         * The Comfirm pass label.
         */
        private JLabel _comfirmPassLabel;

        /**
         * The Username field.
         */
        private JTextField _usernameField;

        /**
         * The Password field.
         */
        private JPasswordField _passwordField;

        /**
         * The Comfirm field.
         */
        private JPasswordField _comfirmField;

        /**
         * The Create button.
         */
        private JButton _createButton;

        /**
         * The Msg alert.
         */
        private JLabel _msgAlert;

        /**
         * Instantiates a new Add user panel.
         */
        public AddUserPanel(){
            _usernameLabel = new JLabel("Nom d'utilisateur :");
            _passwordLabel = new JLabel("Mot de passe :");
            _comfirmPassLabel = new JLabel("Comfirmer :");

            _usernameField = new JTextField(10);
            _passwordField = new JPasswordField(10);
            _comfirmField = new JPasswordField(10);

            _usernameLabel.setLabelFor(_usernameField);
            _passwordLabel.setLabelFor(_passwordField);
            _comfirmPassLabel.setLabelFor(_comfirmField);

            _msgAlert = new JLabel("");
            _msgAlert.setForeground(Color.RED);

            _createButton = new JButton("Création");

            _createButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (_passwordField.getPassword().length == 0 || _comfirmField.getPassword().length == 0 || _usernameField.getText().length() == 0) {
                        _msgAlert.setText("Veuillez remplir tous les champs.");
                        System.out.println(_password);
                    } else if (!(Arrays.equals(_passwordField.getPassword(), _comfirmField.getPassword()))){
                        _msgAlert.setText("Les mots de passe sont différents");
                    } else {
                        try {
                            if (!(ConnectDB.isUserExist(_usernameField.getText()))) {
                                ConnectDB.pushUserOnDB(_usernameField.getText(), "user", String.valueOf(_passwordField.getPassword()));
                                setSize(320, 170);
                            } else
                                _msgAlert.setText("Nom d'utilisateur déjà utilisé.");
                        } catch(SQLException e1) {
                            e1.printStackTrace();
                        }

                    }
                }
            });

            setBorder(BorderFactory.createTitledBorder("Création utilisateur"));

            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();

            gbc.gridheight = 1;
            gbc.gridwidth = 1;

            gbc.gridx = 0;
            gbc.gridy = 0;
            add(_usernameLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            add(_usernameField, gbc);
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.gridwidth = GridBagConstraints.REMAINDER;

            gbc.gridx = 0;
            gbc.gridy = 1;
            add(_passwordLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            add(_passwordField, gbc);
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.gridwidth = GridBagConstraints.REMAINDER;

            gbc.gridx = 0;
            gbc.gridy = 2;
            add(_comfirmPassLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 2;
            add(_comfirmField, gbc);
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.gridwidth = GridBagConstraints.REMAINDER;

            gbc.gridx = 0;
            gbc.gridy = 3;
            add(_msgAlert, gbc);

            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.gridx = 0;
            gbc.gridy = 4;
            add(_createButton, gbc);
        }
    }
}
