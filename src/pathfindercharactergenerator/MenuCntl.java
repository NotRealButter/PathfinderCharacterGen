package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class MenuCntl implements ActionListener
{
    MyJFrame frame;
    MainMenuUI mainMenu = new MainMenuUI();
    CharCreatUI charCreatUI = new CharCreatUI();
    CharCreatCntl charCreatCntl;
    int panelStatus = 1;
    
    
    public MenuCntl(MyJFrame frame)
    {
        this.frame = frame;
        this.frame.add(mainMenu);
        mainMenu.b1.addActionListener(this);
        charCreatUI.back.addActionListener(this);
        charCreatCntl = new CharCreatCntl(this);
    }
    
    public void removePanels()
    {
        frame.remove(mainMenu);
        frame.remove(charCreatUI);
    }
    public void switchPanel(JPanel p1, JPanel p2)
    {
        frame.remove(p1);
        frame.add(p2);
        frame.revalidate();
        frame.repaint();
    }
       
      @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object select = e.getSource();
        if(select == mainMenu.b1)
        {
           switchPanel(mainMenu, charCreatUI);
        }
        if(select == charCreatUI.back)
        {
            switchPanel(charCreatUI, mainMenu);
        }
             
        
                
                
    }

   

}


    
     

