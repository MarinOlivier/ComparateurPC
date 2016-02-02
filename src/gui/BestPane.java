package gui;

import data.Computer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by olivier on 31/01/2016.
 */
public class BestPane extends JPanel {

    private float _parentWidth;
    private ArrayList<Computer> _hsBest;

    private JPanel first;
    private JPanel second;
    private JPanel third;

    private JLabel firstLabel;
    private JLabel secondLabel;
    private JLabel thirdLabel;

    private ArrayList<JLabel> title = new ArrayList<>();
    private ArrayList<JLabel> image = new ArrayList<>();
    private ArrayList<JLabel> price = new ArrayList<>();

    public BestPane(float parentWidth, ArrayList<Computer> hsBest) {

        _parentWidth = parentWidth;
        _hsBest = hsBest;

        setLayout(new GridLayout(1, 3));

        first = new JPanel(new BorderLayout());
        second = new JPanel(new BorderLayout());
        third = new JPanel(new BorderLayout());

        for(int i = 0 ; i < 3 ; i++) {
            title.add(i, new JLabel("", SwingConstants.CENTER));
            image.add(i, new JLabel("", SwingConstants.CENTER));
            price.add(i, new JLabel("", SwingConstants.CENTER));
        }

        addMiniPanel(0, first);
        addMiniPanel(1, second);
        addMiniPanel(2, third);

        first.addMouseListener(new BestMouseListener(0));
        second.addMouseListener(new BestMouseListener(1));
        third.addMouseListener(new BestMouseListener(2));

        add(first);
        add(second);
        add(third);

        setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        setBackground(Color.WHITE);
    }

    public void setHsBest(ArrayList<Computer> arc) {
        _hsBest = arc;
    }

    public void addMiniPanel(int index, JPanel p) {

    	BufferedImage img = null;
        if(index < _hsBest.size()) {
            try {
                image.get(index).setBounds(0, 0, 200, 200);
                img = ImageIO.read(new URL(_hsBest.get(index).getPict()));
                Image dimg = img.getScaledInstance(image.get(index).getWidth(), image.get(index).getHeight(),
                        Image.SCALE_DEFAULT);
                ImageIcon realImg = new ImageIcon(dimg);
                image.get(index).setIcon(realImg);
            } catch(IOException e) {
                e.printStackTrace();
            }


            title.get(index).setText(_hsBest.get(index).getName());
            p.add(title.get(index), BorderLayout.NORTH);

            p.add(image.get(index), BorderLayout.CENTER);

            price.get(index).setText(_hsBest.get(index).getPrice());
            p.add(price.get(index), BorderLayout.SOUTH);
        }
        
        p.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.WHITE, 10),
                BorderFactory.createLineBorder(Color.black)));
    }

    public void paintComponent(Graphics g) {

    }

    //TODO
    public void refreshBestPanel(ArrayList<Computer> alc) {

        for(int i = 0 ; i < 3 ; i++) {
            title.get(i).setText(null);
            image.get(i).setIcon(null);
            price.get(i).setText(null);
        }

        setHsBest(alc);
        addMiniPanel(0, first);
        addMiniPanel(1, second);
        addMiniPanel(2, third);
        repaint();

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension((int)_parentWidth, 300);
    }

    class BestMouseListener extends MouseAdapter {

        private int _index;

        public BestMouseListener(int index) {
            _index = index;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2)
                new ComputerWindow(_hsBest.get(_index));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("BestMouseListener.mouseEntered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("BestMouseListener.mouseExited");
        }
    }
}
