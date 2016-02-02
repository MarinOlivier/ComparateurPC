/**
 * 
 */
package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @author josetarsitano
 *
 */
public class UserWindow extends JFrame {
    private JTextField _username;
    private JPasswordField _password;
    private JPanel _mainPanel;

	public UserWindow() {
		setSize(300, 300);
        _mainPanel = new JPanel(new GridLayout(2, 2));
        _username = new JTextField("");
        _password = new JPasswordField();

        _username.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        _password.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				
				
			}
		});

        _mainPanel.add(new JLabel("Nom d'utilisateur :"));
        _mainPanel.add(_username);
        _mainPanel.add(new JLabel("Mot de passe :"));
        _mainPanel.add(_password);
        add(_mainPanel, BorderLayout.CENTER);

        setVisible(true);
	}
}
