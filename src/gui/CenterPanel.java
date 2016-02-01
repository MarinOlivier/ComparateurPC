package gui;

import data.Computer;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
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
    private JPanel gridPane;
    
    // Données du JTable.
    private AbstractTableModel _dataTable;
    // Ligne sélectionnée dans la JTable.
    private int _selectedRow;
    // ArrayList contenant tous les Computer en fonction de la recherche.
    private ArrayList<Computer> _hsCmp = null;
    private ArrayList<Computer> _hsBest = null;
    // Taille de l'ArrayList.
    private int _hsCmplength;
    // Computer propre à la ligne sélectionnée.
    private Computer _comp;


    public CenterPanel() {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        _wishedPC = new Computer();

        _mode = "Simple";
        
        Connection c = utils.ConnectDB.startConnection();
        try {
			_hsCmp = utils.ConnectDB.getAllComputerOnDB();
			 setHsCmpLength(_hsCmp.size());
		} catch (Exception e) {
			e.printStackTrace();
		}


        _hsBest = new ArrayList<>(_hsCmp.subList(0, 3));
        _hsCmp= new ArrayList<>(_hsCmp.subList(3, _hsCmp.size()));


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
                        if(rowIndex == 0)
						    return 100 + "%";
                        else if(rowIndex == 1)
                            return 80 + "%";
                        else
                            return 40 + "%";
				}
				return null;
			}
		};
		
		setLayout(new BorderLayout());
	    JTable t = new JTable(_dataTable);

		t.setDefaultRenderer(Object.class, new TableCellRenderer() {
			private DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
				Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                /*if (row % 2 == 0) {
                    c.setBackground(Color.WHITE);
                    c.setForeground(Color.BLACK);

                } else {
                    c.setBackground(Color.LIGHT_GRAY);
                    c.setForeground(Color.BLACK);
                }*/

                /*if(column == 1) {
                    JLabel label = null;
                    JPanel pane = new JPanel();
                    try {
                        BufferedImage img = null;
                        label = new JLabel();
                        label.setBounds(0, 0, 80, 80);

                        img = ImageIO.read(new URL(_comp.getPict()));
                        Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
                                Image.SCALE_DEFAULT);

                        ImageIcon realImg = new ImageIcon(dimg);

                        label.setIcon(realImg);
                        pane.add(label);

                        if(row%2 == 0)
                            pane.setBackground(Color.WHITE);
                        else
                            pane.setBackground(Color.LIGHT_GRAY);

                    } catch(Exception e) {
                        e.printStackTrace();
                    }

                    return pane;
                } else if(column == 6) {*/
                if(column == 5) {
                    JLabel label = new JLabel(value.toString(), SwingConstants.CENTER);
                    JPanel pane = new JPanel(new BorderLayout());
                    if(Integer.parseInt(value.toString().replace(value.toString().substring(value.toString().length()-1), "")) >= 90){
                        label.setForeground(Color.GREEN);
                    } else if(Integer.parseInt(value.toString().replace(value.toString().substring(value.toString().length()-1), "")) < 90
                            && Integer.parseInt(value.toString().replace(value.toString().substring(value.toString().length()-1), "")) >= 70){
                        label.setForeground(new Color(255, 132, 38));
                    } else if(Integer.parseInt(value.toString().replace(value.toString().substring(value.toString().length()-1), "")) < 70){
                        label.setForeground(new Color(255, 34, 23));
                    }

                    label.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));

                    pane.add(label, BorderLayout.CENTER);

                    pane.setBackground(Color.WHITE);
                    /*if(row%2 == 0)
                        pane.setBackground(Color.WHITE);
                    else
                        pane.setBackground(Color.LIGHT_GRAY);*/

                    return pane;
                }
                else
                    return c;
			}
		});

        //t.setRowHeight(100);

	    ListSelectionModel cellSelectionModel = t.getSelectionModel();
	    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	    cellSelectionModel.addListSelectionListener(e -> {
            if (e.getValueIsAdjusting())
                return;

            ListSelectionModel lsm = (ListSelectionModel)e.getSource();
            if (!lsm.isSelectionEmpty())
                _selectedRow = lsm.getMinSelectionIndex();
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

        add(new BestPane(getWidth(), _hsBest), BorderLayout.NORTH);
	    add(new JScrollPane(t), BorderLayout.CENTER);
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
}
