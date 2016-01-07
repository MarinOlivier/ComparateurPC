package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by olivier on 16/12/2015.
 */
public class MyWindow extends JFrame {

    public MyWindow(){
        this.setTitle("Comparateur PC");
        this.setBounds(50, 50, 750, 500);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        TopPanel topPanel = new TopPanel();
        CenterPanel centerPanel = new CenterPanel();
        BottomPanel bottomPanel = new BottomPanel();

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);


        setVisible(true);
    }


}
