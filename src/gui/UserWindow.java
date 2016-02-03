/**
 * 
 */
package gui;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.xml.stream.events.Characters;

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
    private JPanel _formPanel;
    private JPanel _subPanel;
    private JLabel _msgAlert;

    private String _password;

    public UserWindow() {
        setSize(300, 170);
        setResizable(false);
        _formPanel = new JPanel(new GridLayout(2, 2, 2, 2));
        _subPanel = new JPanel(new GridLayout(2, 2, 2, 2));
        _usernameField = new JTextField(10);
        _passwordField = new JPasswordField(10);
        _connexion = new JButton("Connexion");

        _msgAlert = new JLabel("");
        _msgAlert.setVisible(false);
        _msgAlert.setForeground(Color.RED);

        _connexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (_passwordField.getPassword().length != 0) {
                    _password = String.valueOf(_passwordField.getPassword());
                    System.out.println(_password);
                } else {
                    _msgAlert.setText("Nom d'utilisateur ET/OU Mot de passe vide");
                    _msgAlert.setVisible(true);
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

        _formPanel.add(_usernameLabel);
        _formPanel.add(_usernameField);
        _formPanel.add(_passwordLabel);
        _formPanel.add(_passwordField);

        _subPanel.add(_msgAlert, BorderLayout.NORTH);
        _subPanel.add(_connexion, BorderLayout.SOUTH);

        _mainPanel = new JPanel();
        _mainPanel.add(_formPanel, BorderLayout.NORTH);
        _mainPanel.add(_subPanel, BorderLayout.SOUTH);

        _mainPanel.setBorder(BorderFactory.createTitledBorder("Connexion"));

        add(_mainPanel, BorderLayout.CENTER);

        setVisible(true);
	}
}
