package gui;

import data.Computer;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;

/**
 * Created by olivier on 07/01/2016.
 */
public class CenterPanel extends JPanel {

    private JLabel _wishedLab;
    private Computer _wishedPC;
    private String _mode;

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


    public CenterPanel(Computer wishedPC){
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        _wishedPC = wishedPC;

        _wishedLab = new JLabel(wishedPC.toString());

        add(_wishedLab, BorderLayout.SOUTH);

        _mode = "Simple";
        displayTableComputer(_mode);
    }

    private void displayTableComputer(String mode){

        String[] columnName = null;
        int maxBound = 0;

        if(mode == "Simple"){
            columnName = columnNameSimple;
            maxBound = 7;
        }
        else if(mode == "Expert"){
            columnName = columnNameExpert;
            maxBound = 18;
        }

        JPanel computerGrid = new JPanel();
        computerGrid.setLayout(new GridLayout(2, 18));

        for(int i = 0 ; i < maxBound ; i++){
            JLabel ligneNameLab = new JLabel();

            ligneNameLab.setText(columnName[i]);
            ligneNameLab.setBorder(BorderFactory.createLineBorder(Color.black));

            computerGrid.add(ligneNameLab);
        }

        for(int i = 0 ; i < maxBound ; i++){
            JLabel dataLab = new JLabel();

            try {
                Class  aClass = _wishedPC.getClass();
                Field field = aClass.getField('_' + columnName[i]);

                Object value = field.get(_wishedPC);
                if(value == null)
                    value = "";
                dataLab.setText(value.toString());

            } catch(Exception e) {
                e.printStackTrace();
            }



            dataLab.setBorder(BorderFactory.createLineBorder(Color.black));

            computerGrid.add(dataLab);
        }
        add(computerGrid, BorderLayout.NORTH);
    }

    public void setWishedPC(Computer wishedPC) {
        this._wishedPC = wishedPC;
    }

    public void setMode(String mode) {
        this._mode = mode;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        _wishedLab.setText(_wishedPC.toString());
        displayTableComputer(_mode);
    }
}
