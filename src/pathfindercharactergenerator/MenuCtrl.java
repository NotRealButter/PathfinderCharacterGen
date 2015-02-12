package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;


public class MenuCtrl implements ActionListener
{
    myJFrame frame = new myJFrame();
    MainMenuUI mainMenu = new MainMenuUI();
    CharCreatUI charCreat = new CharCreatUI();
    int panelStatus = 1;
    
    
    public MenuCtrl()
    {
        frame = new myJFrame();
        frame.add(mainMenu);
        mainMenu.b1.addActionListener(this);
        charCreat.b1.addActionListener(this);
    }
    
    public void removePanels()
    {
        frame.remove(mainMenu);
        frame.remove(charCreat);
    }

       
      @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object select = e.getSource();
        if(select == mainMenu.b1)
        {
           panelStatus = 2;
        }
        if(select == charCreat.b1)
        {
            panelStatus = 1;
        }
        
        
        
        
        
        
        switch (panelStatus)
        {
            case 1:
                removePanels();
                frame.add(mainMenu);
                frame.revalidate();
                frame.repaint();
                break;
            case 2:
                removePanels();
                frame.add(charCreat);
                frame.revalidate();
                frame.repaint();
                break;
        }
                
                
    }

   

}


    
     

