/**
 * Copyright (c) 2016.
 * gui.TopPanel
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */

package gui;

import data.Computer;
import utils.ConnectDB;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * The type Top panel.
 */
public class TopPanel extends JPanel {

    /**
     * The Window.
     */
    MyWindow _window;

    /**
     * The Mother board in.
     */
    private JComboBox<String> _motherBoardIn;
    /**
     * The Cpu in.
     */
    private JComboBox<String> _CPUIn;
    /**
     * The Ram in.
     */
    private JComboBox<String> _RAMIn;
    /**
     * The Gpu in.
     */
    private JComboBox<String> _GPUIn;
    /**
     * The Rom in.
     */
    private JComboBox<String> _ROMIn;
    /**
     * The Power supply in.
     */
    private JComboBox<String> _powerSupplyIn;
    /**
     * The Price in.
     */
    private JComboBox<String> _priceIn;
    /**
     * The Ram freq in.
     */
    private JComboBox<String> _RAM_freqIn;
    /**
     * The Gpu freq in.
     */
    private JComboBox<String> _GPU_freqIn;
    /**
     * The Cpu freq in.
     */
    private JComboBox<String> _CPU_freqIn;
    /**
     * The Gpu ram in.
     */
    private JComboBox<String> _GPU_RAMIn;
    /**
     * The E s in.
     */
    private JComboBox<String> _E_SIn;
    /**
     * The Case pc in.
     */
    private JComboBox<String> _case_PCIn;
    /**
     * The Airing in.
     */
    private JComboBox<String> _airingIn;
    /**
     * The Os in.
     */
    private JComboBox<String> _OSIn;
    /**
     * The Brand in.
     */
    private JComboBox<String> _brandIn;
    /**
     * The Sound card in.
     */
    private JComboBox<String> _soundCardIn;

    /**
     * The Mother board list.
     */
    private String[] _motherBoardList;
    /**
     * The Cpu list.
     */
    private String[] _CPUList;
    /**
     * The Ram list.
     */
    private String[] _RAMList;
    /**
     * The Gpu list.
     */
    private String[] _GPUList;
    /**
     * The Rom list.
     */
    private String[] _ROMList;
    /**
     * The Power supply list.
     */
    private String[] _powerSupplyList;
    /**
     * The Price list.
     */
    private String[] _priceList;
    /**
     * The Ram freq list.
     */
    private String[] _RAM_freqList;
    /**
     * The Gpu freq list.
     */
    private String[] _GPU_freqList;
    /**
     * The Cpu freq list.
     */
    private String[] _CPU_freqList;
    /**
     * The Gpu ram list.
     */
    private String[] _GPU_RAMList;
    /**
     * The E s list.
     */
    private String[] _E_SList;
    /**
     * The Case pc list.
     */
    private String[] _case_PCList;
    /**
     * The Airing list.
     */
    private String[] _airingList;
    /**
     * The Os list.
     */
    private String[] _OSList;
    /**
     * The Brand list.
     */
    private String[] _brandList;
    /**
     * The Sound card list.
     */
    private String[] _soundCardList;

    /**
     * JComboBox Grid
     */
    private GridBagConstraints _grid;

    /**
     * Components table
     */
    private String[] component;

    /**
     * Components table well formatted for reflection
     */
    private String[] componentAdaptedToRequest;

    /**
     * JComboBox table
     */
    ArrayList<JComboBox<?>> arrComboBox;

    /**
     * The Submit.
     */
    JButton submit;

    /**
     * Instantiates a new Top panel.
     *
     * @param window the window
     */
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
        
        component = new String[]{"CPU", "RAM", "Disque dur", "Système d'exploitation", "Marque", "Boitier", "Prix",
                                "Carte Mère", "Fréquence CPU", "Fréquence RAM", "Carte graphique", "RAM GPU", "Alimentation"};
        componentAdaptedToRequest = new String[]{"CPU", "RAM", "ROM", "OS", "brand", "case_PC", "price", "motherBoard", "CPU_freq", "RAM_freq", "GPU", "GPU_RAM", "powerSupply"};
        arrComboBox = new ArrayList<>();

        /* STANDARD MODE */
        _CPUIn = new JComboBox<>(_CPUList);
        _RAMIn = new JComboBox<>(_RAMList);
        _ROMIn = new JComboBox<>(_ROMList);
        _priceIn = new JComboBox<>(_priceList);
        _OSIn = new JComboBox<>(_OSList);
        _brandIn = new JComboBox<>(_brandList);
        _case_PCIn = new JComboBox<>(_case_PCList);

        /*EXPERT MODE*/
        _motherBoardIn = new JComboBox<>(_motherBoardList);
        _powerSupplyIn = new JComboBox<>(_powerSupplyList);
        _RAM_freqIn = new JComboBox<>(_RAM_freqList);
        _CPU_freqIn = new JComboBox<>(_CPU_freqList);
        _GPUIn = new JComboBox<>(_GPUList);
        _GPU_RAMIn = new JComboBox<>(_GPU_RAMList);

        
        /* Ajout des JComboBox dans le tableau */
        arrComboBox.add(_CPUIn);
        arrComboBox.add(_RAMIn);
        arrComboBox.add(_ROMIn);
        arrComboBox.add(_OSIn);
        arrComboBox.add(_brandIn);
        arrComboBox.add(_case_PCIn);
        arrComboBox.add(_priceIn);

        arrComboBox.add(_motherBoardIn);
        arrComboBox.add(_CPU_freqIn);
        arrComboBox.add(_RAM_freqIn);
        arrComboBox.add(_GPUIn);
        arrComboBox.add(_GPU_RAMIn);
        arrComboBox.add(_powerSupplyIn);

        
        for (int l = 0; l < arrComboBox.size(); l++) {
        	arrComboBox.get(l).setRenderer(new MyComboRenderer());
        	arrComboBox.get(l).addItemListener(new ComboBoxListener(componentAdaptedToRequest[l]));
        }

        setLayout(new GridBagLayout());
        _grid = new GridBagConstraints();
        
        submit = new JButton("Rechercher");
        submit.addActionListener(new SubmitListener());
        
        displaySimple();
    }

    /**
     * Display simple.
     */
    public void displaySimple() {
        _grid.insets = new Insets(3,3,3,3);
        
        int k = 0;
        for (int i = 1; i <= 3; i++) {
        	for (int j = 0; j <= 5; j++) {
                if (i == 3 && j == 2)
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
        _grid.gridy = 4;
        add(submit, _grid);
    }

    /**
     * Display expert.
     */
    public void displayExpert() {
    	int k = 0;
        for (int i = 1; i <= 5; i++) {
        	for (int j = 0; j <= 5; j++) {
        		if (i == 5 && j == 2)
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

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    /**
     * Gets grid.
     *
     * @return the grid
     */
    public GridBagConstraints getGrid() {
    	return _grid;
    }

    /**
     * The type Combo box listener.
     */
    class ComboBoxListener implements ItemListener {

        /**
         * The modified criteria
         */
        String _criteria;

        /**
         * Instantiates a new ComboBoxListener
         *
         * @param criteria
         */
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

                } catch (Exception Exc){
                    Exc.printStackTrace();
                }
            }
        }
    }

    /**
     * The type Submit listener.
     */
    class SubmitListener implements ActionListener {
        /**
         * The list of computer to be printed
         */
        ArrayList<Computer> compList = new ArrayList<>();

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                compList = ConnectDB.getAllComputerOnDB();
                //compList = utils.ConnectDB.getComputerOnDB(_window.getCenterPanel().getWishedPC());
                Computer current = _window.getCenterPanel().getWishedPC();
                for (int i = 0; i < compList.size(); i++) {
                    Computer wished = compList.get(i);
                    wished.comparison(current);
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }

            /* Tri */
            utils.ComparePC.sort(compList);

            ArrayList<Computer> hsBest;
            ArrayList<Computer> hsCmp;
            if(compList.size() > 3) {
                hsBest = new ArrayList<>(compList.subList(0, 3));
                hsCmp = new ArrayList<>(compList.subList(3, compList.size()));
            } else {
                hsBest = compList;
                hsCmp = new ArrayList<>();
            }

            _window.getCenterPanel().refreshTable(hsCmp);
            _window.getCenterPanel().getBestPanel().refreshBestPanel(hsBest);

        }
    }
}
