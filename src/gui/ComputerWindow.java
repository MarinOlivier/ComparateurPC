/**
 * 
 */
package gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import data.Computer;

/**
 * @author josetarsitano
 *
 */
public class ComputerWindow extends JFrame {
	public ComputerWindow(Computer p) {
		setSize(new Dimension(700, 600));
		
		BufferedImage img = null;
		try {
			JLabel label = new JLabel();
			label.setBounds(getWidth()/2, 50, 150, 150);
			
			img = ImageIO.read(new URL("http://media.ldlc.com/ld/products/00/02/99/86/LD0002998698_2.jpg"));
		    Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
		            Image.SCALE_SMOOTH);
		    
		    ImageIcon realImg = new ImageIcon(dimg);
		    
		    label.setIcon(realImg);
		    
			add(label);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		
		
		
		
		
		
		setVisible(true);
	}
}
