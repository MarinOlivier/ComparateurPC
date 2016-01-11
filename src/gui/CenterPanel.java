package gui;

import data.Computer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by olivier on 07/01/2016.
 */
public class CenterPanel extends JPanel {

    MyWindow _window;
    JLabel _computer;

    public CenterPanel(MyWindow window){
        setBackground(Color.WHITE);
        _window = window;
        setLayout(new BorderLayout(3, 3));

        Computer wishedComputer = _window.getWishedComputer();
        _computer = new JLabel("<html>" + wishedComputer.toString() + "</html>");
        add(_computer, BorderLayout.PAGE_START);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Computer wishedComputer = _window.getWishedComputer();
        _computer.setText("<html>" + wishedComputer.toString() + "</html>");
    }
}
