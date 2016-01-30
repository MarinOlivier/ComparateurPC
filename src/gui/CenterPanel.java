package gui;

import data.Computer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.util.ArrayList;

/**
 * Created by olivier on 07/01/2016.
 */
public class CenterPanel extends JPanel {
    private Computer _wishedPC;
    private String _mode;
    private String[] elts = new String[100];
    private JPanel gridPane;
    
    // Données du JTable.
    private AbstractTableModel _dataTable;
    // Ligne sélectionnée dans la JTable.
    private int _selectedRow;
    // ArrayList contenant tous les Computer en fonction de la recherche.
    private ArrayList<Computer> _hsCmp = null;
    // Taille de l'ArrayList.
    private int _hsCmplength;
    // Computer propre à la ligne sélectionnée.
    private Computer _comp;
    
    String[] columnNameExpert = {
            "name",
            "motherBoard",
            "CPU",
            "RAM",
            "GPU",
            "ROM",
            "powerSupply",
            "price",
            "RAM_freq",
            "CPU_freq",
            "GPU_freq",
            "GPU_RAM",
            "E_S",
            "case_PC",
            "airing",
            "OS",
            "brand",
            "soundCard"
    };

    String[] columnNameSimple = {
            "CPU",
            "RAM",
            "ROM",
            "price",
            "E_S",
            "OS",
            "brand"
    };

    public CenterPanel() {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        _wishedPC = new Computer();

        _mode = "Simple";
        for(int i = 0; i < 100; i++) {
            elts[i] = String.valueOf(i);
        }
        
        Connection c = utils.ConnectDB.startConnection();
        try {
			_hsCmp = utils.ConnectDB.getAllComputerOnDB(c);
			 setHsCmpLength(_hsCmp.size());
		} catch (Exception e) {
			e.printStackTrace();
		}

		_dataTable = new AbstractTableModel() {
        	private final String[] _head = { "#", "Nom", "Marque", "Description", "Prix", "Match"};
        	
        	@Override
			public int getRowCount() {
				return _hsCmplength;
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
				_comp = _hsCmp.get(rowIndex);
				
				switch (columnIndex) {
					case 0:
						return rowIndex+1;
						
					case 1:
						return _comp.getName();
						
					case 2:
						return _comp.getBrand();
						
					case 3:
						return _comp.getCPU() + ", " + _comp.getRAM() + ", " + _comp.getROM();
				
					case 4:
						return _comp.getPrice();
						
					case 5:
						return 100 + "%";
				}
				return null;
			}
		};
		
		setLayout(new BorderLayout());
	    JTable t = new JTable(_dataTable);
	    
	    ListSelectionModel cellSelectionModel = t.getSelectionModel();
	    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	    cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
	    	@Override
	    	public void valueChanged(ListSelectionEvent e) {
	    		if (e.getValueIsAdjusting())
	                return;
	    		
	            ListSelectionModel lsm = (ListSelectionModel)e.getSource();
	            if (!lsm.isSelectionEmpty())
	                _selectedRow = lsm.getMinSelectionIndex();
	      }

	    });
	    
	    t.addMouseListener(new MouseAdapter() {
	    	public void mouseClicked(MouseEvent e) {
	    		if (e.getClickCount() == 2) {
		    		new ComputerWindow(_hsCmp.get(_selectedRow));
	    		}
	    	}
	    });
	    
	    t.getColumnModel().getColumn(0).setPreferredWidth(10);
	    t.getColumnModel().getColumn(1).setPreferredWidth(150);
	    t.getColumnModel().getColumn(2).setPreferredWidth(0);
	    t.getColumnModel().getColumn(3).setPreferredWidth(150);
	    t.getColumnModel().getColumn(4).setPreferredWidth(20);
	    t.getColumnModel().getColumn(5).setPreferredWidth(0);
	    add(new JScrollPane(t));
    }

    private void displayTableComputer(String mode){
        gridPane.add(new JLabel(mode.toString()));
        System.out.println("Display table");
    }
    
    public void setHsCmpLength(int size) {
		_hsCmplength = size;
	}

    public void setWishedPC(Computer wishedPC) {
        this._wishedPC = wishedPC;
    }

    public Computer getWishedPC() {
        return _wishedPC;
    }

    public void setMode(String mode) {
        this._mode = mode;
    }
    
    public void refreshTable(ArrayList<Computer> c) {
        _hsCmp = c;
        setHsCmpLength(_hsCmp.size());
        _dataTable.fireTableDataChanged();
    }

   /* @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        displayTableComputer(_mode);
        System.out.println("paintComponant");
    }*/
}
