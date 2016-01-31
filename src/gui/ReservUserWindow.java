/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * @author josetarsitano
 * @param <T>
 *
 */
public class ReservUserWindow<T> extends JFrame {
	ArrayList<String[]> _arrReserv;
	
	public ReservUserWindow(ArrayList<String[]> arrR) {
		setSize(new Dimension(450, 450));
		setTitle("Réservations de ");
		
		_arrReserv = arrR;
		String[] nameComp = _arrReserv.get(0);
		String[] dateComp = _arrReserv.get(1);
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
					return rowIndex+1;
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
	    
	}
}
