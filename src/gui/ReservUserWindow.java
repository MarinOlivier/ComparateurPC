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
 *
 */
public class ReservUserWindow extends JFrame {
	private static ArrayList<String[]> _arrReserv;
	private int _selectedRow;

    private static AbstractTableModel _dataReservUser;
    private static JTable _reservUserTable;

    public ReservUserWindow(ArrayList<String[]> arrR) {
		setSize(new Dimension(750, 200));
		setTitle("Réservations de ");
		
		_arrReserv = arrR;
		_dataReservUser = new AbstractTableModel() {
        	private final String[] _head = {"#", "Ordinateur", "Date", "Prix"};
        	
        	@Override
			public int getRowCount() {
				return _arrReserv.get(0).length;
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
					return _arrReserv.get(0)[rowIndex];
				if (columnIndex == 1)
					return _arrReserv.get(1)[rowIndex];
				if (columnIndex == 2)
					return _arrReserv.get(2)[rowIndex];
				if (columnIndex == 3)
					return _arrReserv.get(3)[rowIndex];
				
				return null;
			}
		};
		
	    _reservUserTable = new JTable(_dataReservUser);
	    _reservUserTable.getColumnModel().getColumn(0).setPreferredWidth(0);
	    _reservUserTable.getColumnModel().getColumn(1).setPreferredWidth(100);
	    add(new JScrollPane(_reservUserTable));
	    setVisible(true);
	    
	    _reservUserTable.addMouseListener(new MouseAdapter() {
	    	public void mouseReleased(MouseEvent e) {
	    		if (e.getClickCount() == 2) {
	    			Computer tmp = new Computer();
					try {
						tmp = utils.ConnectDB.getOneComputer(_arrReserv.get(0)[_selectedRow]);
						new ComputerWindow(tmp);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
        			
	    		}
	    	}
		});

		ListSelectionModel cellSelectionModel = _reservUserTable.getSelectionModel();
		cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		cellSelectionModel.addListSelectionListener(e -> {
			if (e.getValueIsAdjusting())
				return;

			ListSelectionModel lsm = (ListSelectionModel)e.getSource();
			if (!lsm.isSelectionEmpty())
				_selectedRow = lsm.getMinSelectionIndex();
		});
	}

    public static void setArrReserv(ArrayList<String[]> a) {
        _arrReserv = a;
        _dataReservUser.fireTableDataChanged();
    }
}
