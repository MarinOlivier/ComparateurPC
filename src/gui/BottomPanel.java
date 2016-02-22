/**
 * Copyright (c) 2016.
 * gui.BottomPanel
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */

package gui;

import data.User;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;

/**
 * The type Bottom panel.
 */
public class BottomPanel extends JPanel {
	/**
	 * The Status label.
	 */
	JLabel _statusLabel;

	/**
	 * Instantiates a new Bottom panel.
	 */
	public BottomPanel(){
    	setBorder(new BevelBorder(BevelBorder.LOWERED));
    	
    	setPreferredSize(new Dimension(getWidth(), 16));
    	setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    	_statusLabel = new JLabel("STANDARD Mode");
    	_statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		_statusLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

    	add(_statusLabel);
    }

	/**
	 * Sets statut.
	 *
	 * @param s the s
	 */
	public void setStatut(String s) {
    	_statusLabel.setText(s);
    }
}
