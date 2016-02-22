/**
 * Copyright (c) 2016.
 * gui.ReservUserWindow
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */

/**
 * 
 */
package gui;

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

import data.Computer;
import main.Main;

/**
 * The type Reserv user window.
 */
public class ReservUserWindow extends JFrame {

    /**
     * The ArrayList containing the reservation.
     */
    private static ArrayList<String[]> _arrReserv;

    /**
     * The Selected row.
     */
    private int _selectedRow;

    /**
     * The constant dataReservUser.
     */
    private static AbstractTableModel _dataReservUser;

    /**
     * The constant reservUserTable.
     */
    private static JTable _reservUserTable;

    /**
     * Instantiates a new Reserv user window.
     *
     * @param arrR the array Reservation
     */
    public ReservUserWindow(ArrayList<String[]> arrR) {
		setSize(new Dimension(750, 200));
		setTitle("Réservations de " + Main.user.getUsername());
		
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
						if (tmp != null)
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

    /**
     * Sets arr reserv.
     *
     * @param a the a
     */
    public static void setArrReserv(ArrayList<String[]> a) {
        _arrReserv = a;
        _dataReservUser.fireTableDataChanged();
    }
}
