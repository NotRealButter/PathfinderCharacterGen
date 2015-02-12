package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenuUI extends myJPanel implements ActionListener
{
     JButton b1,b2;
     JLabel welcome = new JLabel();
     
    public MainMenuUI()
    {
            setLayout(new GridLayout(3,3));
            setBackground(Color.white);
            welcome.setText("Welcome to the Pathfinder Character Generator");
            welcome.setForeground(Color.red);
            add(welcome);
            b1 = new JButton("Create a New Character");
            add(b1);
            b2 = new JButton("View an Existing Character");
            add(b2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}