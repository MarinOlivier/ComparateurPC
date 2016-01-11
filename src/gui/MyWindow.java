package gui;

import data.Computer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by olivier on 16/12/2015.
 */
public class MyWindow extends JFrame {

    private Computer _wishedComputer;

    public MyWindow(){
        this.setTitle("Comparateur Computer");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        TopPanel topPanel = new TopPanel(this);
        CenterPanel centerPanel = new CenterPanel(this);
        BottomPanel bottomPanel = new BottomPanel();

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public Computer getWishedPC() {
        return _wishedComputer;
    }

    public void setWishedPC(Computer wishedComputer) {
        this._wishedComputer = wishedComputer;
    }
}
