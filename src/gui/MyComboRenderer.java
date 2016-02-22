/**
 * Copyright (c) 2016.
 * gui.MyComboRenderer
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */

package gui;

import javax.swing.*;
import java.awt.*;

/**
 * The type My combo renderer.
 */
public class MyComboRenderer extends JLabel implements ListCellRenderer {

    /**
     * Instantiates a new My combo renderer.
     */
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
