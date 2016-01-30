/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * @author josetarsitano
 *
 */
public class ReservUserWindow extends JFrame {
	public ReservUserWindow() {
		setSize(new Dimension(450, 450));
		setTitle("Réservations de ");
		TableModel dataReservUser = new AbstractTableModel() {
        	private final String[] _head = {"#", "Ordinateur"};
        	
        	@Override
			public int getRowCount() {
				return 5;
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

				return null;
			}
		};
		
	    JTable reservUserTable = new JTable(dataReservUser);
	    reservUserTable.getColumnModel().getColumn(0).setPreferredWidth(0);
	    reservUserTable.getColumnModel().getColumn(1).setPreferredWidth(150);
	    add(new JScrollPane(reservUserTable));
	    setVisible(true);
	    
	}
}
