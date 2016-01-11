package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by olivier on 07/01/2016.
 */
public class TopPanel extends JPanel {

    private JComboBox _motherBoardIn;
    private JComboBox _CPUIn;
    private JComboBox _RAMIn;
    private JComboBox _GPUIn;
    private JComboBox _ROMIn;
    private JComboBox _powerSupplyIn;
    private JComboBox _priceIn;
    private JComboBox _RAM_freqIn;
    private JComboBox _GPU_freqIn;
    private JComboBox _CPU_freqIn;
    private JComboBox _GPU_RAMIn;
    private JComboBox _E_SIn;
    private JComboBox _case_PCIn;
    private JComboBox _airingIn;
    private JComboBox _OSIn;
    private JComboBox _brandIn;
    private JComboBox _soundCardIn;

    private String[] _motherBoardList = { "null", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _CPUList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _RAMList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _GPUList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _ROMList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _powerSupplyList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _priceList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _RAM_freqList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _GPU_freqList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _CPU_freqList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _GPU_RAMList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _E_SList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _case_PCList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _airingList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _OSList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _brandList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    private String[] _soundCardList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };


    public TopPanel(MyWindow window){

        setBackground(Color.gray);
        setLayout(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();

        JButton ExpertMod = new JButton("Expert");
        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 0;
        add(ExpertMod, grid);

        ExpertMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String label = ExpertMod.getText();
                removeAll();

                grid.fill = GridBagConstraints.HORIZONTAL;
                grid.weightx = 0.5;
                grid.gridx = 2;
                grid.gridy = 0;
                add(ExpertMod, grid);

                if(label == "Expert") {
                    ExpertMod.setText("Simple");
                    displayExpert(grid);
                }
                else {
                    ExpertMod.setText("Expert");
                    displaySimple(grid);
                }
            }
        });

        displaySimple(grid);
    }

    public void displaySimple(GridBagConstraints grid) {
        _CPUIn = new JComboBox(_CPUList);
        _RAMIn = new JComboBox(_RAMList);
        _ROMIn = new JComboBox(_ROMList);
        _priceIn = new JComboBox(_priceList);
        _E_SIn = new JComboBox(_E_SList);
        _OSIn = new JComboBox(_OSList);
        _brandIn = new JComboBox(_brandList);

        _CPUIn.addActionListener(new ComboBoxListner());


        grid.insets = new Insets(3,3,3,3);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 1;
        add(new JLabel("CPU "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 1;
        add(_CPUIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 1;
        add(new JLabel("RAM "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 1;
        add(_RAMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 1;
        add(new JLabel("ROM "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 1;
        add(_ROMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 2;
        add(new JLabel("Price "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 2;
        add(_priceIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 2;
        add(new JLabel("E/S "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 2;
        add(_E_SIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 2;
        add(new JLabel("OS "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 2;
        add(_OSIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 3;
        add(new JLabel("Brand "), grid);

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

    public void displayExpert(GridBagConstraints grid){

        _motherBoardIn = new JComboBox(_motherBoardList);
        _CPUIn = new JComboBox(_CPUList);
        _RAMIn = new JComboBox(_RAMList);
        _GPUIn = new JComboBox(_GPUList);
        _ROMIn = new JComboBox(_ROMList);
        _powerSupplyIn = new JComboBox(_powerSupplyList);
        _priceIn = new JComboBox(_priceList);
        _RAM_freqIn = new JComboBox(_RAM_freqList);
        _GPU_freqIn = new JComboBox(_GPU_freqList);
        _CPU_freqIn = new JComboBox(_CPU_freqList);
        _GPU_RAMIn = new JComboBox(_GPU_RAMList);
        _E_SIn = new JComboBox(_E_SList);
        _case_PCIn = new JComboBox(_case_PCList);
        _airingIn = new JComboBox(_airingList);
        _OSIn = new JComboBox(_OSList);
        _brandIn = new JComboBox(_brandList);
        _soundCardIn = new JComboBox(_soundCardList);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 1;
        add(new JLabel("Mother Board "),grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 1;
        add(_motherBoardIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 1;
        add(new JLabel("CPU "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 1;
        add(_CPUIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 1;
        add(new JLabel("RAM "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 1;
        add(_RAMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 2;
        add(new JLabel("GPU "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 2;
        add(_GPUIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 2;
        add(new JLabel("ROM "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 2;
        add(_ROMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 2;
        add(new JLabel("Power Supply "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 2;
        add(_powerSupplyIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 3;
        add(new JLabel("Price "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 3;
        add(_priceIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 3;
        add(new JLabel("Frequence RAM "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 3;
        add(_RAM_freqIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 3;
        add(new JLabel("Frequence GPU "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 3;
        add(_GPU_freqIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 4;
        add(new JLabel("Frequence CPU "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 4;
        add(_CPU_freqIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 4;
        add(new JLabel("RAM GPU "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 4;
        add(_GPU_RAMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 4;
        add(new JLabel("E/S "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 4;
        add(_E_SIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 5;
        add(new JLabel("Case "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 5;
        add(_case_PCIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 5;
        add(new JLabel("Airing "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 5;
        add(_airingIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 5;
        add(new JLabel("OS "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 5;
        add(_OSIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 6;
        add(new JLabel("Brand "), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 6;
        add(_brandIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 6;
        add(new JLabel("Sound Card "), grid);

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

    class ComboBoxListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.printf("lol");
            System.out.println(e.getSource());
        }
    }
}
