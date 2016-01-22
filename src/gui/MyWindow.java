package gui;

import data.Computer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by olivier on 16/12/2015.
 */
public class MyWindow extends JFrame {

    private Computer _wishedComputer;
    private TopPanel _topPanel;
    private CenterPanel _centerPanel;
    private BottomPanel _bottomPanel;

    public MyWindow(){
        this.setTitle("Comparateur Computer");
        setSize(500, 500);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        _wishedComputer = new Computer();

        _topPanel = new TopPanel(this);
        _centerPanel = new CenterPanel(_wishedComputer);
        _bottomPanel = new BottomPanel();

        add(_topPanel, BorderLayout.NORTH);
        add(_centerPanel, BorderLayout.CENTER);
        add(_bottomPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public Computer getWishedComputer() {
        return _wishedComputer;
    }

    public void setWishedComputer(Computer wishedComputer) {
        this._wishedComputer = wishedComputer;
    }

    public TopPanel getTopPanel() {
        return _topPanel;
    }

    public void setTopPanel(TopPanel topPanel) {
        this._topPanel = topPanel;
    }

    public CenterPanel getCenterPanel() {
        return _centerPanel;
    }

    public void setCenterPanel(CenterPanel centerPanel) {
        this._centerPanel = centerPanel;
    }

    public BottomPanel getBottomPanel() {
        return _bottomPanel;
    }

    public void setBottomPanel(BottomPanel bottomPanel) {
        this._bottomPanel = bottomPanel;
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}
