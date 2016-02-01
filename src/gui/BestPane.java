package gui;

import data.Computer;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by olivier on 31/01/2016.
 */
public class BestPane extends JPanel {

    private float _parentWidth;
    private ArrayList<Computer> _hsBest;

    public BestPane(float parentWidth, ArrayList<Computer> hsBest) {

        _parentWidth = parentWidth;
        _hsBest = hsBest;

        setLayout(new GridLayout(1, 3));
        JPanel first = new JPanel(new BorderLayout());
        JPanel second = new JPanel(new BorderLayout());
        JPanel third = new JPanel(new BorderLayout());
       
        JLabel firstLabel = new JLabel("", SwingConstants.CENTER);
        JLabel secondLabel = new JLabel("", SwingConstants.CENTER);
        JLabel thirdLabel = new JLabel("", SwingConstants.CENTER);
        
        addMiniPanel(first, firstLabel, 0);
        addMiniPanel(second, secondLabel, 1);
        addMiniPanel(third, thirdLabel, 2);

        add(first);
        add(second);
        add(third);

        setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        setBackground(Color.WHITE);
    }
    
    public void addMiniPanel(JPanel p, JLabel l, int index) {
    	BufferedImage img = null;
		try {
			l.setBounds(0, 0, 200, 200);
			img = ImageIO.read(new URL(_hsBest.get(index).getPict()));
			Image dimg = img.getScaledInstance(l.getWidth(), l.getHeight(),
		            Image.SCALE_DEFAULT);
			ImageIcon realImg = new ImageIcon(dimg);
			l.setIcon(realImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		p.add(new JLabel(_hsBest.get(index).getName(), SwingConstants.CENTER), BorderLayout.NORTH);
        p.add(l, BorderLayout.CENTER);
        p.add(new JLabel(_hsBest.get(index).getPrice(), SwingConstants.CENTER), BorderLayout.SOUTH);
        
        p.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.WHITE, 10),
                BorderFactory.createLineBorder(Color.black)));
        
        p.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		if (e.getClickCount() == 2)
        			new ComputerWindow(_hsBest.get(index));
        	}
		});
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension((int)_parentWidth, 300);
    }
}
