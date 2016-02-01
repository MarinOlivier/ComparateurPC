package gui;

import data.Computer;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by olivier on 31/01/2016.
 */
public class BestPane extends JPanel {

    private float _parentWidth;
    private ArrayList<Computer> _hsBest;

    public BestPane(float parentWidth, ArrayList<Computer> hsBest) {

        _parentWidth = parentWidth;
        _hsBest = hsBest;

        setLayout(new GridLayout(1, 3));
        JPanel first = new JPanel();
        JPanel second = new JPanel();
        JPanel third = new JPanel();

        first.add(new JLabel(_hsBest.get(0).getName(), SwingConstants.CENTER));
        first.add(new JLabel(_hsBest.get(0).getPrice(), SwingConstants.CENTER));

        second.add(new JLabel(_hsBest.get(1).getName(), SwingConstants.CENTER));
        second.add(new JLabel(_hsBest.get(1).getPrice(), SwingConstants.CENTER));

        third.add(new JLabel(_hsBest.get(2).getName(), SwingConstants.CENTER));
        third.add(new JLabel(_hsBest.get(2).getPrice(), SwingConstants.CENTER));

        first.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.WHITE, 10),
                                                           BorderFactory.createLineBorder(Color.black)));

        second.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.WHITE, 10),
                                                            BorderFactory.createLineBorder(Color.black)));

        third.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.WHITE, 10),
                                                           BorderFactory.createLineBorder(Color.black)));

        add(first);
        add(second);
        add(third);

        setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        setBackground(Color.WHITE);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension((int)_parentWidth, 100);
    }
}
