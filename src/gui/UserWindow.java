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
    private JPasswordField _passwordField;
    private JPanel _mainPanel;
    private JButton _connexion;

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
                if (_passwordField.getPassword().length != 0) {
                    _password = String.valueOf(_passwordField.getPassword());
                    System.out.println(_password);
                } else
                    System.out.println("Password vide.");
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
