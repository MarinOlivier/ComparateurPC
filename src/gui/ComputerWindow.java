/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
				System.out.println(i);
			} else
				_component.add("-");
		}
			
		
		setSize(new Dimension(700, 600));
		JPanel mainPanel = new JPanel();
		
		BufferedImage img = null;
		JLabel label = null;
		
		/*try {
			label = new JLabel();
			label.setBounds(0, 0, 300, 300);
			
			System.out.println(_comp.getPict());
			img = ImageIO.read(new URL(_comp.getPict()));
		    Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
		            Image.SCALE_DEFAULT);
		    
		    ImageIcon realImg = new ImageIcon(dimg);
		    
		    label.setIcon(realImg);
		} catch (Exception e) {
		    e.printStackTrace();
		}*/
		
		
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
		
		//setLayout(new BorderLayout());
	    JTable computerTable = new JTable(dataComputer);
	    
	    
		
		
	    //mainPanel.add(label, BorderLayout.WEST);
	    mainPanel.add(computerTable, BorderLayout.EAST);
	    mainPanel.add(new JScrollPane(computerTable));
		add(mainPanel, BorderLayout.CENTER);
		
		
		setVisible(true);
	}
}
