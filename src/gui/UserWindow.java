/**
 * 
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;

/**
 * @author josetarsitano
 *
 */
public class UserWindow extends JFrame {
    private JTextField _usernameField;
    private JLabel _usernameLabel;
    private JPasswordField _passwordField;
    private JLabel _passwordLabel;
    private JPanel _mainPanel;
    private JButton _connexion;
    private JButton _addUser;
    private JLabel _msgAlert;

    private String _password;

    public UserWindow() {
        setSize(300, 180);
        setResizable(false);
        _usernameField = new JTextField(10);
        _passwordField = new JPasswordField(10);
        _connexion = new JButton("Connexion");
        _addUser = new JButton("Ajouter utilisateur");

        _msgAlert = new JLabel("");
        _msgAlert.setSize(50, 10);
        _msgAlert.setForeground(Color.RED);

        _connexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (_passwordField.getPassword().length != 0) {
                    _password = String.valueOf(_passwordField.getPassword());
                    try {
                        System.out.println("LOL: " + utils.ConnectDB.checkUser(_usernameField.getText(), _password));
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    _msgAlert.setText("Mot de passe incorrect");
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
        gbc.gridx = 1;
        gbc.gridy = 2;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 0;
        gbc.gridy = 3;
        _mainPanel.add(_connexion, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        //_mainPanel.add(_addUser, gbc);

        _mainPanel.setBorder(BorderFactory.createTitledBorder("Connexion"));

        add(_mainPanel, BorderLayout.CENTER);

        setVisible(true);
	}
}
