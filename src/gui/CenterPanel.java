package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by olivier on 07/01/2016.
 */
public class CenterPanel extends JPanel {

    private JComboBox _motherBoardIn;
    private String[] _motherBList = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };


    public CenterPanel(){
        setBackground(Color.red);
        _motherBoardIn = new JComboBox(_motherBList);
        add(_motherBoardIn);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
