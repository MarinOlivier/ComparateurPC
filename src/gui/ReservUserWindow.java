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
	ArrayList<String[]> _arrReserv;
	private int _selectedRow;
    private static AbstractTableModel _dataReservUser;
    private static JTable _reservUserTable;

    public ReservUserWindow(ArrayList<String[]> arrR) {
		setSize(new Dimension(450, 450));
		setTitle("Réservations de ");
		
		_arrReserv = arrR;
		String[] idComp = _arrReserv.get(0);
		String[] nameComp = _arrReserv.get(1);
		String[] dateComp = _arrReserv.get(2);
		_dataReservUser = new AbstractTableModel() {
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
                        System.out.println("idComp[_selectedRow] :" + idComp[_selectedRow]);
						tmp = utils.ConnectDB.getOneComputer(idComp[_selectedRow]);
                        System.out.println("ID :" + tmp.getId());
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

    /*public static void refreshTable() {
        _dataReservUser.fireTableDataChanged();
        _reservUserTable.repaint();
    }*/
}
