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


    public TopPanel(MyWindow window){

        _window = window;

        Connection con = utils.ConnectDB.startConnection();

        try {
            _motherBoardList = utils.ConnectDB.getCriteria(con, "motherBoard");
            _CPUList = utils.ConnectDB.getCriteria(con, "CPU");
            _RAMList = utils.ConnectDB.getCriteria(con, "RAM");
            _GPUList = utils.ConnectDB.getCriteria(con, "GPU");
            _ROMList = utils.ConnectDB.getCriteria(con, "ROM");
            _powerSupplyList = utils.ConnectDB.getCriteria(con, "powerSupply");
            _priceList = utils.ConnectDB.getCriteria(con, "price");
            _RAM_freqList = utils.ConnectDB.getCriteria(con, "RAM_freq");
            _GPU_freqList = utils.ConnectDB.getCriteria(con, "GPU_freq");
            _CPU_freqList = utils.ConnectDB.getCriteria(con, "CPU_freq");
            _GPU_RAMList = utils.ConnectDB.getCriteria(con, "GPU_RAM");
            _E_SList = utils.ConnectDB.getCriteria(con, "E_S");
            _case_PCList = utils.ConnectDB.getCriteria(con, "case_PC");
            _airingList = utils.ConnectDB.getCriteria(con, "airing");
            _OSList = utils.ConnectDB.getCriteria(con, "OS");
            _brandList = utils.ConnectDB.getCriteria(con, "brand");
            _soundCardList = utils.ConnectDB.getCriteria(con, "soundCard");

        } catch(Exception e){
            e.printStackTrace();
        }


        //setBackground(Color.gray);
        setLayout(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();

        JButton ExpertMod = new JButton("Expert");
        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 0;
        add(ExpertMod, grid);

        ExpertMod.addActionListener(e -> {
            String label = ExpertMod.getText();
            removeAll();

            grid.fill = GridBagConstraints.HORIZONTAL;
            grid.weightx = 0.5;
            grid.gridx = 5;
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
        _OSIn = new JComboBox<>(_OSList);
        _brandIn = new JComboBox<>(_brandList);
        //_E_SIn = new JComboBox<>(_E_SList);

        _CPUIn.setRenderer(new MyComboRenderer());
        _RAMIn.setRenderer(new MyComboRenderer());
        _ROMIn.setRenderer(new MyComboRenderer());
        _priceIn.setRenderer(new MyComboRenderer());
        _OSIn.setRenderer(new MyComboRenderer());
        _brandIn.setRenderer(new MyComboRenderer());
        //_E_SIn.setRenderer(new MyComboRenderer());

        _CPUIn.addItemListener(new ComboBoxListener("CPU"));
        _RAMIn.addItemListener(new ComboBoxListener("RAM"));
        _ROMIn.addItemListener(new ComboBoxListener("ROM"));
        _priceIn.addItemListener(new ComboBoxListener("price"));
        _OSIn.addItemListener(new ComboBoxListener("OS"));
        _brandIn.addItemListener(new ComboBoxListener("brand"));
        //_E_SIn.addItemListener(new ComboBoxListener("E_S"));


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
        add(new JLabel("OS ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 2;
        add(_OSIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 2;
        add(new JLabel("Brand ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 2;
        add(_brandIn, grid);

        /*grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 2;
        add(new JLabel("E/S ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 2;
        add(_E_SIn, grid);*/

        JButton submit = new JButton("Submit");
        submit.addActionListener(new SubmitListener());

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 3;
        add(submit, grid);
    }

    private void displayExpert(GridBagConstraints grid) {
        _motherBoardIn = new JComboBox<>(_motherBoardList);
        _CPUIn = new JComboBox<>(_CPUList);
        _RAMIn = new JComboBox<>(_RAMList);
        _GPUIn = new JComboBox<>(_GPUList);
        _ROMIn = new JComboBox<>(_ROMList);
        _powerSupplyIn = new JComboBox<>(_powerSupplyList);
        _priceIn = new JComboBox<>(_priceList);
        _RAM_freqIn = new JComboBox<>(_RAM_freqList);
        _CPU_freqIn = new JComboBox<>(_CPU_freqList);
        _GPU_RAMIn = new JComboBox<>(_GPU_RAMList);
        _case_PCIn = new JComboBox<>(_case_PCList);
        _OSIn = new JComboBox<>(_OSList);
        _brandIn = new JComboBox<>(_brandList);
        //_GPU_freqIn = new JComboBox<>(_GPU_freqList);
        //_E_SIn = new JComboBox<>(_E_SList);
        //_airingIn = new JComboBox<>(_airingList);
        //_soundCardIn = new JComboBox<>(_soundCardList);


        _motherBoardIn.setRenderer(new MyComboRenderer());
        _CPUIn.setRenderer(new MyComboRenderer());
        _RAMIn.setRenderer(new MyComboRenderer());
        _GPUIn.setRenderer(new MyComboRenderer());
        _ROMIn.setRenderer(new MyComboRenderer());
        _powerSupplyIn.setRenderer(new MyComboRenderer());
        _priceIn.setRenderer(new MyComboRenderer());
        _RAM_freqIn.setRenderer(new MyComboRenderer());
        _CPU_freqIn.setRenderer(new MyComboRenderer());
        _GPU_RAMIn.setRenderer(new MyComboRenderer());
        _case_PCIn.setRenderer(new MyComboRenderer());
        _OSIn.setRenderer(new MyComboRenderer());
        _brandIn.setRenderer(new MyComboRenderer());
        //_GPU_freqIn.setRenderer(new MyComboRenderer());
        //_E_SIn.setRenderer(new MyComboRenderer());
        //_airingIn.setRenderer(new MyComboRenderer());
        //_soundCardIn.setRenderer(new MyComboRenderer());


        _motherBoardIn.addItemListener(new ComboBoxListener("motherBoard"));
        _CPUIn.addItemListener(new ComboBoxListener("CPU"));
        _RAMIn.addItemListener(new ComboBoxListener("RAM"));
        _GPUIn.addItemListener(new ComboBoxListener("GPU"));
        _ROMIn.addItemListener(new ComboBoxListener("ROM"));
        _powerSupplyIn.addItemListener(new ComboBoxListener("powerSupply"));
        _priceIn.addItemListener(new ComboBoxListener("price"));
        _RAM_freqIn.addItemListener(new ComboBoxListener("RAM_freq"));
        _CPU_freqIn.addItemListener(new ComboBoxListener("CPU_freq"));
        _GPU_RAMIn.addItemListener(new ComboBoxListener("GPU_RAM"));
        _case_PCIn.addItemListener(new ComboBoxListener("case_PC"));
        _OSIn.addItemListener(new ComboBoxListener("OS"));
        _brandIn.addItemListener(new ComboBoxListener("brand"));
        //_GPU_freqIn.addItemListener(new ComboBoxListener("GPU_freq"));
        //_E_SIn.addItemListener(new ComboBoxListener("E_S"));
        //_airingIn.addItemListener(new ComboBoxListener("airing"));
        //_soundCardIn.addItemListener(new ComboBoxListener("soundCard"));

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
        add(new JLabel("Frequence CPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 3;
        add(_CPU_freqIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 4;
        add(new JLabel("RAM GPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 4;
        add(_GPU_RAMIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 4;
        add(new JLabel("Case ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 4;
        add(_case_PCIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 4;
        add(new JLabel("OS ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 4;
        add(_OSIn, grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 5;
        add(new JLabel("Brand ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 5;
        add(_brandIn, grid);

         /*grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 5;
        add(new JLabel("Frequence GPU ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 5;
        add(_GPU_freqIn, grid);*/

        /*grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 0;
        grid.gridy = 6;
        add(new JLabel("E/S ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 1;
        grid.gridy = 6;
        add(_E_SIn, grid);*/

        /*grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 2;
        grid.gridy = 6;
        add(new JLabel("Airing ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 3;
        grid.gridy = 6;
        add(_airingIn, grid);*/

        /*grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 4;
        grid.gridy = 6;
        add(new JLabel("Sound Card ", SwingConstants.RIGHT), grid);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 6;
        add(_soundCardIn, grid);*/

        JButton submit = new JButton("Submit");
        submit.addActionListener(new SubmitListener());

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.weightx = 0.5;
        grid.gridx = 5;
        grid.gridy = 7;
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
                compList = utils.ConnectDB.getComputerOnDB(con, _window.getCenterPanel().getWishedPC());
            } catch(Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("compList = " + compList);
            _window.getCenterPanel().refreshTable(compList);

        }
    }
}
