package gui;

import data.Computer;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.ArrayList;

/**
 * Created by olivier on 07/01/2016.
 */
public class TopPanel extends JPanel {

    MyWindow _window;

    private JComboBox<String> _motherBoardIn;
    private JComboBox<String> _CPUIn;
    private JComboBox<String> _RAMIn;
    private JComboBox<String> _GPUIn;
    private JComboBox<String> _ROMIn;
    private JComboBox<String> _powerSupplyIn;
    private JComboBox<String> _priceIn;
    private JComboBox<String> _RAM_freqIn;
    private JComboBox<String> _GPU_freqIn;
    private JComboBox<String> _CPU_freqIn;
    private JComboBox<String> _GPU_RAMIn;
    private JComboBox<String> _E_SIn;
    private JComboBox<String> _case_PCIn;
    private JComboBox<String> _airingIn;
    private JComboBox<String> _OSIn;
    private JComboBox<String> _brandIn;
    private JComboBox<String> _soundCardIn;

    private String[] _motherBoardList;
    private String[] _CPUList;
    private String[] _RAMList;
    private String[] _GPUList;
    private String[] _ROMList;
    private String[] _powerSupplyList;
    private String[] _priceList;
    private String[] _RAM_freqList;
    private String[] _GPU_freqList;
    private String[] _CPU_freqList;
    private String[] _GPU_RAMList;
    private String[] _E_SList;
    private String[] _case_PCList;
    private String[] _airingList;
    private String[] _OSList;
    private String[] _brandList;
    private String[] _soundCardList;

    // Grille des JComboBox.
    private GridBagConstraints _grid;
    // Tableau des composants
    private String[] component;
    private String[] crit;
    // Tableau des JComboxBox.
    ArrayList<JComboBox<?>> arrComboBox;
    JButton submit;
    
    public TopPanel(MyWindow window) {
        _window = window;
        try {
            _motherBoardList = utils.ConnectDB.getCriteria("motherBoard");
            _CPUList = utils.ConnectDB.getCriteria("CPU");
            _RAMList = utils.ConnectDB.getCriteria("RAM");
            _GPUList = utils.ConnectDB.getCriteria("GPU");
            _ROMList = utils.ConnectDB.getCriteria("ROM");
            _powerSupplyList = utils.ConnectDB.getCriteria("powerSupply");
            _priceList = utils.ConnectDB.getCriteria("price");
            _RAM_freqList = utils.ConnectDB.getCriteria("RAM_freq");
            _GPU_freqList = utils.ConnectDB.getCriteria("GPU_freq");
            _CPU_freqList = utils.ConnectDB.getCriteria("CPU_freq");
            _GPU_RAMList = utils.ConnectDB.getCriteria("GPU_RAM");
            _E_SList = utils.ConnectDB.getCriteria("E_S");
            _case_PCList = utils.ConnectDB.getCriteria("case_PC");
            _airingList = utils.ConnectDB.getCriteria("airing");
            _OSList = utils.ConnectDB.getCriteria("OS");
            _brandList = utils.ConnectDB.getCriteria("brand");
            _soundCardList = utils.ConnectDB.getCriteria("soundCard");
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        component = new String[]{"CPU", "RAM", "ROM", "Price", "OS", "Brand", "Carte Mère", "Alimentation", "Fréquence RAM", "CPU RAM", "GPU RAM", "Boitier"};
        arrComboBox = new ArrayList<>();

        /* STANDARD MODE */
        _CPUIn = new JComboBox<>(_CPUList);
        _RAMIn = new JComboBox<>(_RAMList);
        _ROMIn = new JComboBox<>(_ROMList);
        _priceIn = new JComboBox<>(_priceList);
        _OSIn = new JComboBox<>(_OSList);
        _brandIn = new JComboBox<>(_brandList);
        
        /*EXPERT MODE*/
        _motherBoardIn = new JComboBox<>(_motherBoardList);
        _powerSupplyIn = new JComboBox<>(_powerSupplyList);
        _RAM_freqIn = new JComboBox<>(_RAM_freqList);
        _CPU_freqIn = new JComboBox<>(_CPU_freqList);
        _GPU_RAMIn = new JComboBox<>(_GPU_RAMList);
        _case_PCIn = new JComboBox<>(_case_PCList);
        
        /* Ajout des JComboBox dans le tableau */
        arrComboBox.add(_CPUIn);
        arrComboBox.add(_RAMIn);
        arrComboBox.add(_ROMIn);
        arrComboBox.add(_priceIn);
        arrComboBox.add(_OSIn);
        arrComboBox.add(_brandIn);
        arrComboBox.add(_motherBoardIn);
        arrComboBox.add(_powerSupplyIn);
        arrComboBox.add(_RAM_freqIn);
        arrComboBox.add(_CPU_freqIn);
        arrComboBox.add(_GPU_RAMIn);
        arrComboBox.add(_case_PCIn);
        
        for (int l = 0; l < arrComboBox.size(); l++) {
        	arrComboBox.get(l).setRenderer(new MyComboRenderer());
        	arrComboBox.get(l).addItemListener(new ComboBoxListener(component[l]));
        }

        setLayout(new GridBagLayout());
        _grid = new GridBagConstraints();
        
        submit = new JButton("Submit");
        submit.addActionListener(new SubmitListener());
        
        displaySimple();
    }

    public void displaySimple() {
        _grid.insets = new Insets(3,3,3,3);
        
        int k = 0;
        for (int i = 1; i <= 2; i++) {
        	for (int j = 0; j <= 5; j++) {
        		_grid.fill = GridBagConstraints.HORIZONTAL;
                _grid.weightx = 0.5;
                _grid.gridx = j;
                _grid.gridy = i;                
                if (j%2 == 0) {
                	add(new JLabel(component[k], SwingConstants.RIGHT), _grid);
                } else {
                	add(arrComboBox.get(k-1), _grid);
                	k--;
                }
                k++;
        	}
		}

        /* Bouton Submit */
        _grid.fill = GridBagConstraints.HORIZONTAL;
        _grid.weightx = 0.5;
        _grid.gridx = 5;
        _grid.gridy = 3;
        add(submit, _grid);
    }

    public void displayExpert() {
    	int k = 0;
        for (int i = 1; i < 5; i++) {
        	for (int j = 0; j <= 5; j++) {
        		if (i == 5 && j == 1)
        			break;
        		_grid.fill = GridBagConstraints.HORIZONTAL;
                _grid.weightx = 0.5;
                _grid.gridx = j;
                _grid.gridy = i;
                if (j%2 == 0) {
                	add(new JLabel(component[k], SwingConstants.RIGHT), _grid);
                } else {
                	add(arrComboBox.get(k-1), _grid);
                	k--;
                }
                k++;
        	}
		}

        /* Bouton Submit */
        _grid.fill = GridBagConstraints.HORIZONTAL;
        _grid.weightx = 0.5;
        _grid.gridx = 5;
        _grid.gridy = 7;
        add(submit, _grid);
    }

    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    public GridBagConstraints getGrid() {
    	return _grid;
    }

    class ComboBoxListener implements ItemListener {
        String _criteria;

        public ComboBoxListener(String criteria){
            _criteria = criteria;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            // The item affected by the event.
            Object item = e.getItem();

            if (e.getStateChange() == ItemEvent.SELECTED) {
                try {
                    Field field = _window.getCenterPanel().getWishedPC().getClass().getDeclaredField("_" + _criteria);
                    field.set(_window.getCenterPanel().getWishedPC(), item.toString());
                    _window.getCenterPanel().setWishedPC(_window.getCenterPanel().getWishedPC());
                    _window.getCenterPanel().repaint();

                } catch(Exception Exc){
                    Exc.printStackTrace();
                }
            }
        }
    }

    class SubmitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Connection con = utils.ConnectDB.startConnection();
            ArrayList<Computer> compList = new ArrayList<>();
            try {
                compList = utils.ConnectDB.getComputerOnDB(_window.getCenterPanel().getWishedPC());
            } catch(Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("compList = " + compList);
            _window.getCenterPanel().refreshTable(compList);

        }
    }
}
