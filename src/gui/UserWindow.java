/**
 * 
 */
package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * @author josetarsitano
 *
 */
public class UserWindow extends JFrame {
	public UserWindow() {
		setSize(200, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				
				
			}
		});
	}
}
