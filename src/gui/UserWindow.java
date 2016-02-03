/**
 * 
 */
package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @author josetarsitano
 *
 */
public class UserWindow extends JFrame {
    private JTextField _usernameField;
    private JPasswordField _passwordField;
    private JPanel _mainPanel;
    private JButton _connexion;

    private String _username;
    private String _password;

	public UserWindow() {
		setSize(300, 300);
        _mainPanel = new JPanel(new GridLayout(2, 2));
        _usernameField = new JTextField("");
        _passwordField = new JPasswordField();
        _connexion = new JButton("Connexion");

        _connexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _username = _usernameField.getText();
                _password = String.copyValueOf(_passwordField.getPassword());
                System.out.println(_username + _password);
                utils.ConnectDB.pushUserOnDB(_username, _password);
            }
        });

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				
				
			}
		});
        // LOL
        _mainPanel.add(new JLabel("Nom d'utilisateur :"));
        _mainPanel.add(_usernameField);
        _mainPanel.add(new JLabel("Mot de passe :"));
        _mainPanel.add(_passwordField);
        _mainPanel.add(_connexion);
        add(_mainPanel, BorderLayout.CENTER);

        setVisible(true);
	}
}
