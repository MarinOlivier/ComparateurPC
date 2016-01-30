package gui;

import data.Computer;
import sun.awt.Graphics2Delegate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by olivier on 16/12/2015.
 */
public class MyWindow extends JFrame {

    //private Computer _wishedComputer;
	private JMenuBar _mb;
    private TopPanel _topPanel;
    private CenterPanel _centerPanel;
    private BottomPanel _bottomPanel;
    
    private GridBagConstraints _gridTmp; 
    private JMenuItem expert;
    
    private boolean _mode;

    public MyWindow(){
        this.setTitle("Comparateur Computer");
        setSize(1000, 1000);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setBounds(10,10, 900, 600);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        _mb = new JMenuBar();
        JMenu mode = new JMenu("Mode");
        expert = new JMenuItem("Expert");
        expert.addActionListener(new ItemListener());
        mode.add(expert);
        _mb.add(mode);
        setJMenuBar(_mb);
        
        _topPanel = new TopPanel(this);
        _centerPanel = new CenterPanel();
        _bottomPanel = new BottomPanel();
        
        _mode = false;
        _gridTmp = new GridBagConstraints();
        
        
        add(_topPanel, BorderLayout.NORTH);
        add(_centerPanel, BorderLayout.CENTER);
        add(_bottomPanel, BorderLayout.SOUTH);
        
        
        setVisible(true);
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
    
    public boolean getMode() {
    	return _mode;
    }
    
    class ItemListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String label = expert.getText();
			_topPanel.removeAll();
            if (label == "Expert") {
            	expert.setText("Standard");
                //_centerPanel.setMode("Expert");
                _topPanel.displayExpert();
                _bottomPanel.setStatut("EXPERT mode");
            } else {
            	expert.setText("Expert");
            	//_centerPanel.setMode("Standard");
            	_topPanel.displaySimple();
            	_bottomPanel.setStatut("STANDARD mode");
            }
            _topPanel.revalidate();
            _topPanel.repaint();
		}
	}
}
