package gui;

import data.Computer;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import java.awt.*;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/**
 * Created by olivier on 07/01/2016.
 */
public class CenterPanel extends JPanel {

    private JLabel _wishedLab;
    private Computer _wishedPC;
    private String _mode;
    private JList _list;
    private String[] elts = new String[100];
    private JPanel gridPane;

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

        TableModel data = new AbstractTableModel() {
        	
        	private final String[] _head = { "#", "Nom", "Description", "Prix", "Match", "Réserver" };
        	private int _length;
        	ArrayList<Computer> hstmp = null;
        	Connection c = utils.ConnectDB.startConnection();
        	
        	@Override
			public int getRowCount() {
        		try {
					 hstmp = utils.ConnectDB.getAllComputerOnDB(c);
					 setLength(hstmp.size());
					
				} catch (Exception e) {
					e.printStackTrace();
				}
        		
				return _length;
			}

			@Override
			public String getColumnName(int columnIndex) {
				return _head[columnIndex];
			}
			
			@Override
			public int getColumnCount() {
				return 6;
			}
			
			public void setLength(int size) {
				_length = size;
			}

			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				if (columnIndex == 0)
					return rowIndex+1;
				
				if (columnIndex == 1)
					return hstmp.get(rowIndex).getName();
				
				if (columnIndex == 4)
					return 100;
				
				if (columnIndex == 6)
					return 0;
				
				
				
				return 0;
			}
			
		};
		
		setLayout(new BorderLayout());
	    JTable t = new JTable(data);
	    add(new JScrollPane(t));
    }

    private void displayTableComputer(String mode){
        gridPane.add(new JLabel(mode.toString()));
        System.out.println("Display table");
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        displayTableComputer(_mode);
        System.out.println("paintComponant");
    }
}
