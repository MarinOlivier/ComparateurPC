package gui;

import javax.swing.*;
import java.awt.*;

public class MyComboRenderer extends JLabel implements ListCellRenderer {

    public MyComboRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.toString());
        if(isSelected)
            setBackground(new Color(0, 117, 233));
        else
            setBackground(Color.WHITE);
        return this;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150, 20);
    }
}
