/**
 * Copyright (c) 2016.
 * gui.MyWindow
 *
 * @author: José Tarsitano
 * @author: Olivier Marin
 */

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

/**
 * The type My window.
 */
public class MyWindow extends JFrame {

    /**
     * The Menu bar.
     */
	private JMenuBar _mb;
    /**
     * The Top panel.
     */
    private TopPanel _topPanel;
    /**
     * The Center panel.
     */
    private CenterPanel _centerPanel;
    /**
     * The Bottom panel.
     */
    private BottomPanel _bottomPanel;

    /**
     * The Expert.
     */
    private JMenuItem expert;
    /**
     * The Change user.
     */
    private JMenuItem changeUser;
    /**
     * The Reservation list.
     */
    private JMenuItem reservList;

    /**
     * Instantiates a new My window.
     */
    public MyWindow(){
        this.setTitle("Comparateur d'ordinateurs");
        setSize(1000, 1000);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        _mb = new JMenuBar();
        JMenu user = new JMenu(Main.user.getUsername());

        reservList = new JMenuItem("Liste des souhaits");
        reservList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ReservUserWindow(utils.ConnectDB.getReservation(Main.user.getUserId()));
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

    /**
     * Gets top panel.
     *
     * @return the top panel
     */
    public TopPanel getTopPanel() {
        return _topPanel;
    }

    /**
     * Sets top panel.
     *
     * @param topPanel the top panel
     */
    public void setTopPanel(TopPanel topPanel) {
        this._topPanel = topPanel;
    }

    /**
     * Gets center panel.
     *
     * @return the center panel
     */
    public CenterPanel getCenterPanel() {
        return _centerPanel;
    }

    /**
     * Sets center panel.
     *
     * @param centerPanel the center panel
     */
    public void setCenterPanel(CenterPanel centerPanel) {
        this._centerPanel = centerPanel;
    }

    /**
     * Gets bottom panel.
     *
     * @return the bottom panel
     */
    public BottomPanel getBottomPanel() {
        return _bottomPanel;
    }

    /**
     * Sets bottom panel.
     *
     * @param bottomPanel the bottom panel
     */
    public void setBottomPanel(BottomPanel bottomPanel) {
        this._bottomPanel = bottomPanel;
    }
}
