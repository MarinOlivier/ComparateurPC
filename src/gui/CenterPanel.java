package gui;

import data.Computer;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;
import java.sql.SQLException;
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


    public CenterPanel(){
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        _wishedPC = new Computer();

        _mode = "Simple";
        for(int i = 0; i < 100; i++) {
            elts[i] = String.valueOf(i);
        }

        gridPane = new JPanel(new GridLayout(2, 18));

        //_list = new JList<>(elts);
        //_list.setCellRenderer(getRenderer());
        //add(new JScrollPane(_list), BorderLayout.CENTER);

        //displayTableComputer(_mode);
        add(gridPane);


    }

    private ListCellRenderer<? super String> getRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel listCellRendererComponent = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected,cellHasFocus);
                listCellRendererComponent.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,Color.BLACK));
                return listCellRendererComponent;
            }

            @Override
            public Dimension getPreferredSize() {
                double width = super.getPreferredSize().getWidth();
                double height = 50;
                return new Dimension((int)width, (int)height);
            }
        };
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
