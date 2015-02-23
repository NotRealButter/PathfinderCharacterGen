package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class MenuCntl implements ActionListener
{
    MyJFrame frame;
    MainMenuUI mainMenu = new MainMenuUI();
    CharCreatCntl charCreateCntl;
    int panelStatus = 1;
    
    
    public MenuCntl(MyJFrame frame)
    {
        this.frame = frame;
        this.frame.add(mainMenu);       
        charCreateCntl = new CharCreatCntl(this);
        mainMenu.charCreateButton.addActionListener(this);
        charCreateCntl.charCreateUI.back.addActionListener(this);
        charCreateCntl.charCreateUI.next.addActionListener(this);
        charCreateCntl.abilityScoreUI.getBack().addActionListener(this);

    }
    
    public void removePanels()
    {
        frame.remove(mainMenu);
        frame.remove(charCreateCntl.charCreateUI);
        frame.remove(charCreateCntl.abilityScoreUI);
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
        if(select == mainMenu.charCreateButton)
        {
           switchPanel(mainMenu, charCreateCntl.charCreateUI);
        }
        if(select == charCreateCntl.charCreateUI.back)
        {
            switchPanel(charCreateCntl.charCreateUI, mainMenu);
        }
        if(select == charCreateCntl.abilityScoreUI.getBack())
        {
            switchPanel(charCreateCntl.abilityScoreUI, charCreateCntl.charCreateUI);
        }
        if(select == charCreateCntl.charCreateUI.next)
        {
            switchPanel(charCreateCntl.charCreateUI, charCreateCntl.abilityScoreUI);
        }
        if (select == charCreateCntl.abilityScoreUI.chaRoll)
        {
            switchPanel(charCreateCntl.abilityScoreUI, charCreateCntl.charCreateUI);

        }
             
    }

   

}


    
     

