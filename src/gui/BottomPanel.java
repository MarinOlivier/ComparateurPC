package gui;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;

public class BottomPanel extends JPanel {
	JLabel _statusLabel;
    public BottomPanel(){
    	setBorder(new BevelBorder(BevelBorder.LOWERED));
    	
    	setPreferredSize(new Dimension(getWidth(), 16));
    	setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    	_statusLabel = new JLabel("STANDARD Mode");
    	_statusLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    	add(_statusLabel);
    }
    
    public void setStatut(String s) {
    	_statusLabel.setText(s);
    }
}
