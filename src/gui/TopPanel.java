package gui;

import data.Computer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Field;

import static gui.MyWindow.*;

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

    private String[] _motherBoardList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _CPUList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _RAMList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _GPUList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _ROMList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _powerSupplyList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _priceList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _RAM_freqList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _GPU_freqList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _CPU_freqList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _GPU_RAMList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _E_SList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _case_PCList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _airingList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _OSList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _brandList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _soundCardList = { "null", "Bird", "Cat", "Dog", "Rabbit", "Pig" };


    public TopPanel(MyWindow window){

        _window = window;

        setBackground(Color.gray);
        setLayout(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();

        JButton ExpertMod = new JButton("Expert");
        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 0;
        add(ExpertMod, grid);

        ExpertMod.addActionListener(e -> {
            String label = ExpertMod.getText();
            removeAll();

            grid.fill = GridBagConstraints.HORIZONTAL;
            grid.weightx = 0.5;
            grid.gridx = 2;
            grid.gridy = 0;
            add(ExpertMod, grid);

            if(label == "Expert") {
                ExpertMod.setText("Simple");
                _window.getCenterPanel().setMode("Expert");
                displayExpert(grid);
            } else {
                ExpertMod.setText("Expert");
                _window.getCenterPanel().setMode("Simple");
                displaySimple(grid);
            }
            _window.getCenterPanel().repaint();
        });

        displaySimple(grid);
    }

    private void displaySimple(GridBagConstraints grid) {
        _CPUIn = new JComboBox<>(_CPUList);
        _RAMIn = new JComboBox<>(_RAMList);
        _ROMIn = new JComboBox<>(_ROMList);
        _priceIn = new JComboBox<>(_priceList);
        _E_SIn = new JComboBox<>(_E_SList);
        _OSIn = new JComboBox<>(_OSList);
        _brandIn = new JComboBox<>(_brandList);

        _CPUIn.addItemListener(new ComboBoxListener("CPU"));
        _RAMIn.addItemListener(new ComboBoxListener("RAM"));
        _ROMIn.addItemListener(new ComboBoxListener("ROM"));
        _priceIn.addItemListener(new ComboBoxListener("price"));
        _E_SIn.addItemListener(new ComboBoxListener("E_S"));
        _OSIn.addItemListener(new ComboBoxListener("OS"));
        _brandIn.addItemListener(new ComboBoxListener("brand"));


        grid.insets = new Insets(3,3,3,3);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 1;
        add(new JLabel("CPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 1;
        add(_CPUIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 1;
        add(new JLabel("RAM ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 1;
        add(_RAMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 1;
        add(new JLabel("ROM ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 1;
        add(_ROMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 2;
        add(new JLabel("Price ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 2;
        add(_priceIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 2;
        add(new JLabel("E/S ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 2;
        add(_E_SIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 2;
        add(new JLabel("OS ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 2;
        add(_OSIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 3;
        add(new JLabel("Brand ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 3;
        add(_brandIn, grid);

        JButton submit = new JButton("Submit");
        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 3;
        add(submit, grid);
    }

    private void displayExpert(GridBagConstraints grid){

        _motherBoardIn = new JComboBox<>(_motherBoardList);
        _CPUIn = new JComboBox<>(_CPUList);
        _RAMIn = new JComboBox<>(_RAMList);
        _GPUIn = new JComboBox<>(_GPUList);
        _ROMIn = new JComboBox<>(_ROMList);
        _powerSupplyIn = new JComboBox<>(_powerSupplyList);
        _priceIn = new JComboBox<>(_priceList);
        _RAM_freqIn = new JComboBox<>(_RAM_freqList);
        _GPU_freqIn = new JComboBox<>(_GPU_freqList);
        _CPU_freqIn = new JComboBox<>(_CPU_freqList);
        _GPU_RAMIn = new JComboBox<>(_GPU_RAMList);
        _E_SIn = new JComboBox<>(_E_SList);
        _case_PCIn = new JComboBox<>(_case_PCList);
        _airingIn = new JComboBox<>(_airingList);
        _OSIn = new JComboBox<>(_OSList);
        _brandIn = new JComboBox<>(_brandList);
        _soundCardIn = new JComboBox<>(_soundCardList);

        _motherBoardIn.addItemListener(new ComboBoxListener("motherBoard"));
        _CPUIn.addItemListener(new ComboBoxListener("CPU"));
        _RAMIn.addItemListener(new ComboBoxListener("RAM"));
        _GPUIn.addItemListener(new ComboBoxListener("GPU"));
        _ROMIn.addItemListener(new ComboBoxListener("ROM"));
        _powerSupplyIn.addItemListener(new ComboBoxListener("powerSupply"));
        _priceIn.addItemListener(new ComboBoxListener("price"));
        _RAM_freqIn.addItemListener(new ComboBoxListener("RAM_freq"));
        _GPU_freqIn.addItemListener(new ComboBoxListener("GPU_freq"));
        _CPU_freqIn.addItemListener(new ComboBoxListener("CPU_freq"));
        _GPU_RAMIn.addItemListener(new ComboBoxListener("GPU_RAM"));
        _E_SIn.addItemListener(new ComboBoxListener("E_S"));
        _case_PCIn.addItemListener(new ComboBoxListener("case_PC"));
        _airingIn.addItemListener(new ComboBoxListener("airing"));
        _OSIn.addItemListener(new ComboBoxListener("OS"));
        _brandIn.addItemListener(new ComboBoxListener("brand"));
        _soundCardIn.addItemListener(new ComboBoxListener("soundCard"));

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 1;
        add(new JLabel("Mother Board" , SwingConstants.RIGHT),grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 1;
        add(_motherBoardIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 1;
        add(new JLabel("CPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 1;
        add(_CPUIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 1;
        add(new JLabel("RAM ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 1;
        add(_RAMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 2;
        add(new JLabel("GPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 2;
        add(_GPUIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 2;
        add(new JLabel("ROM ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 2;
        add(_ROMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 2;
        add(new JLabel("Power Supply ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 2;
        add(_powerSupplyIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 3;
        add(new JLabel("Price ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 3;
        add(_priceIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 3;
        add(new JLabel("Frequence RAM ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 3;
        add(_RAM_freqIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 3;
        add(new JLabel("Frequence GPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 3;
        add(_GPU_freqIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 4;
        add(new JLabel("Frequence CPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 4;
        add(_CPU_freqIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 4;
        add(new JLabel("RAM GPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 4;
        add(_GPU_RAMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 4;
        add(new JLabel("E/S ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 4;
        add(_E_SIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 5;
        add(new JLabel("Case ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 5;
        add(_case_PCIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 5;
        add(new JLabel("Airing ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 5;
        add(_airingIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 5;
        add(new JLabel("OS ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 5;
        add(_OSIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 6;
        add(new JLabel("Brand ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 6;
        add(_brandIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 6;
        add(new JLabel("Sound Card ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 6;
        add(_soundCardIn, grid);

        JButton submit = new JButton("Submit");
        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 6;
        add(submit, grid);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
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
                    Field field = _window.getWishedComputer().getClass().getDeclaredField("_" + _criteria);
                    field.set(_window.getWishedComputer(), item.toString());

                    _window.getCenterPanel().setWishedPC(_window.getWishedComputer());
                    _window.getCenterPanel().repaint();

                } catch(Exception Exc){
                    Exc.printStackTrace();
                }
            }
        }
    }
}
