package gui;

import data.Computer;
import main.Main;
import sun.awt.Graphics2Delegate;

import javax.swing.*;

import com.apple.eawt.UserSessionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyWindow extends JFrame {

    //private Computer _wishedComputer;
	private JMenuBar _mb;
    private TopPanel _topPanel;
    private CenterPanel _centerPanel;
    private BottomPanel _bottomPanel;
    
    private JMenuItem expert;
    private JMenuItem changeUser;
    private JMenuItem reservList;

    public MyWindow(){
        this.setTitle("Comparateur d'ordinateurs");
        setSize(1000, 1000);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setBounds(10,10, 900, 600);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        _mb = new JMenuBar();
        JMenu user = new JMenu(Main.user.getUsername());

        reservList = new JMenuItem("Liste des souhaits");
        reservList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ReservUserWindow(utils.ConnectDB.getReservation());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
        user.add(reservList);
        changeUser = new JMenuItem("Changer d'utilisateur");
        changeUser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO Appeler fenêtre User.
				new UserWindow();
			}
        	
        });

        user.add(changeUser);
        
        JMenu mode = new JMenu("Mode");
        expert = new JMenuItem("Expert");
        expert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String label = expert.getText();
				_topPanel.removeAll();
	            if (label == "Expert") {
	            	expert.setText("Standard");
	                _topPanel.displayExpert();
	                _bottomPanel.setStatut("EXPERT mode");
	            } else {
	            	expert.setText("Expert");
	            	_topPanel.displaySimple();

	            	_bottomPanel.setStatut("STANDARD mode");
	            }
	            _topPanel.revalidate();
	            _topPanel.repaint();
			}
        	
        });
        mode.add(expert);


        _mb.add(user);
        _mb.add(mode);
        setJMenuBar(_mb);
        _topPanel = new TopPanel(this);
        _centerPanel = new CenterPanel();
        _bottomPanel = new BottomPanel();
        
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
}
