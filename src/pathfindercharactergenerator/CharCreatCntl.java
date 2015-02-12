package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;


public class CharCreatCntl 
{
        MenuCntl menuCntl;
    CharCreatCntl(MenuCntl menuCntl)
    {
        this.menuCntl = menuCntl;
        RaceListener raceListen = new RaceListener();
        this.menuCntl.charCreatUI.raceBox.addActionListener(raceListen);
        
    }
    
    
        class RaceListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            menuCntl.charCreatUI.setBackground(Color.red);
        }
        
    }
}
