/**
 * 
 */
package gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import data.Computer;

/**
 * @author josetarsitano
 *
 */
public class ComputerWindow extends JFrame {
	private Computer _comp;
	private MyButton reserv;
	private ArrayList<String> _component;
	private String[] _nameComponent = {"Nom", "Marque", "Carte Mère", "CPU", "Fréquence CPU", "RAM", "Fréquence RAM", "GPU", "Fréquence GPU",
		"RAM GPU", "Disque Dur", "Système d'exploitation", "Alimentation", "Carte Son", "E/S", "Boitier", "Refroidissement", 
		 "Prix"};
	
	public ComputerWindow(Computer p) {
		_comp = p;
		_component = new ArrayList<>();
		for (String i : _nameComponent) {
			if (i != null) {
				_component.add(i);
			} else
				_component.add("-");
		}
			
		
		setSize(new Dimension(450, 680));
		JPanel mainPanel = new JPanel();
		reserv = new MyButton("Réserver");
		
		/* On vérifie si l'utilsateur n'a pas déjà réservé
		 * cet ordinateur, si c'est le cas on disable 
		 * le bouton Réserver
		 */
		try {
			if (utils.ConnectDB.verifReserv(243, _comp.getId())) {
				reserv.setText("Annuler Réservation");
				repaint();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		BufferedImage img = null;
		JLabel label = null;
		
		try {
			label = new JLabel();
			label.setBounds(0, 0, 300, 300);
            
			img = ImageIO.read(new URL(_comp.getPict()));
		    Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
		            Image.SCALE_DEFAULT);
		    
		    ImageIcon realImg = new ImageIcon(dimg);
		    
		    label.setIcon(realImg);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		
        TableModel dataComputer = new AbstractTableModel() {
        	private final String[] _head = {"Composant", "Description"};
        	
        	@Override
			public int getRowCount() {
				return 18;
			}

			@Override
			public String getColumnName(int columnIndex) {
				return _head[columnIndex];
			}
			
			@Override
			public int getColumnCount() {
				return 2;
			}

			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				if (columnIndex == 0)
					return _component.get(rowIndex);
				
				switch (rowIndex) {
					case 0:
						return _comp.getName();
						
					case 1:
						return _comp.getBrand();
						
					case 2:
						return _comp.getMotherBoard();
				
					case 3:
						return _comp.getCPU();
						
					case 4:
						return _comp.getCPU_freq();
					
					case 5:
						return _comp.getRAM();
						
					case 6:
						return _comp.getRAM_freq();
					
					case 7:
						return _comp.getGPU();
						
					case 8:
						return _comp.getGPU_freq();
						
					case 9:
						return _comp.getGPU_RAM();
						
					case 10:
						return _comp.getROM();
						
					case 11:
						return _comp.getOS();
						
					case 12:
						return _comp.getPowerSupply();
						
					case 13:
						return _comp.getSoundCard();
						
					case 14:
						return _comp.getE_S();
						
					case 15:
						return _comp.getCase_PC();
						
					case 16:
						return _comp.getAiring();
						
					case 17:
						return _comp.getPrice();
				}
				return null;
			}
		};
		
	    JTable computerTable = new JTable(dataComputer);
	    
	    mainPanel.setBackground(Color.WHITE);
	    mainPanel.add(label);
	    add(mainPanel, BorderLayout.NORTH);
	    add(computerTable);
	    add(new JScrollPane(computerTable));
	    add(reserv, BorderLayout.SOUTH);

		setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });
	}

	class MyButton extends JButton {
		public MyButton(String txt) {
			super(txt);
            setRolloverEnabled(true);
            addMouseListener(new MouseAdapter() {
            	public void mouseReleased(MouseEvent e) {
            		try {
						if (reserv.getText() == "Réserver") {
							utils.ConnectDB.pushReservOnDB(243, _comp.getId(), _comp.getName(), _comp.getPrice());
							reserv.setText("Annuler Réservation");
						} else {
							utils.ConnectDB.removeReservOnDB(243, _comp.getId());
							reserv.setText("Réserver");
						}
						gui.ReservUserWindow.setArrReserv(utils.ConnectDB.getReservation());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
            	}
            });
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			if (reserv.getText() == "Réserver")
				g2.setColor(new Color(9, 194, 9));
			else
				g2.setColor(Color.RED);
			Rectangle2D rect = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
			g2.fill(rect);

			g2.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
			FontMetrics fm = g2.getFontMetrics();
			int stringWidth = fm.stringWidth(getText());
			int stringAccent = fm.getAscent();
			// get the position of the leftmost character in the baseline
			int x = getWidth() / 2 - stringWidth / 2;
			int y = getHeight() / 2 + stringAccent / 2;
			g2.setPaint(Color.WHITE);
			g2.drawString(getText(), x, y);


            if (getModel().isRollover()) {
                g2.setColor(new Color(9, 151, 9));
                g2.fill(rect);
                g2.setPaint(Color.WHITE);
                g2.drawString(getText(), x, y);

                if(getModel().isPressed()) {
                    g2.setColor(new Color(7, 84, 7));
                    g2.fill(rect);
                    g2.setPaint(Color.WHITE);
                    g2.drawString(getText(), x, y);
                }
            }
		}

        @Override
        public Insets getMargin() {
            return new Insets(5, 10, 10, 10);
        }
    }
}
