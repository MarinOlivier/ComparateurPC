/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import data.Computer;

/**
 * @author josetarsitano
 * @param <T>
 *
 */
public class ReservUserWindow extends JFrame {
	ArrayList<String[]> _arrReserv;
	private int _selectedRow;
	public ReservUserWindow(ArrayList<String[]> arrR) {
		setSize(new Dimension(450, 450));
		setTitle("Réservations de ");
		
		_arrReserv = arrR;
		String[] idComp = _arrReserv.get(0);
		String[] nameComp = _arrReserv.get(1);
		String[] dateComp = _arrReserv.get(2);
		TableModel dataReservUser = new AbstractTableModel() {
        	private final String[] _head = {"#", "Ordinateur", "Date"};
        	
        	@Override
			public int getRowCount() {
				return nameComp.length;
			}

			@Override
			public String getColumnName(int columnIndex) {
				return _head[columnIndex];
			}
			
			@Override
			public int getColumnCount() {
				return _head.length;
			}

			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				if (columnIndex == 0)
					return idComp[rowIndex];
				if (columnIndex == 1)
					return nameComp[rowIndex];
				if (columnIndex == 2)
					return dateComp[rowIndex];
				
				return null;
			}
		};
		
	    JTable reservUserTable = new JTable(dataReservUser);
	    reservUserTable.getColumnModel().getColumn(0).setPreferredWidth(0);
	    reservUserTable.getColumnModel().getColumn(1).setPreferredWidth(100);
	    add(new JScrollPane(reservUserTable));
	    setVisible(true);
	    
	    reservUserTable.addMouseListener(new MouseAdapter() {
	    	public void mouseReleased(MouseEvent e) {
	    		if (e.getClickCount() == 2) {
	    			Computer tmp;
	    			
					try {
						//TODO
						tmp = utils.ConnectDB.getOneComputer(1);
						new ComputerWindow(tmp, 1);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			
	    		}
	    	}
		});
	}
}
