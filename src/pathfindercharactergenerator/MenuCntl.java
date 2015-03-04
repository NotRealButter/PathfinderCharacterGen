package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class MenuCntl implements ActionListener
{
    MyJFrame frame;
    MainMenuUI mainMenu = new MainMenuUI();
    CharCreatCntl charCreateCntl;
    CharViewCntl charViewCntl;
    int panelStatus = 1;
    
    
    public MenuCntl(MyJFrame frame)
    {
        this.frame = frame;
        this.frame.add(mainMenu);       
        charCreateCntl = new CharCreatCntl(this);
        charViewCntl = new CharViewCntl();
        
        mainMenu.charCreateButton.addActionListener(this);
        charCreateCntl.charInfoUI.back.addActionListener(this);
        charCreateCntl.charInfoUI.next.addActionListener(this);
        charCreateCntl.abilityScoreUI.getBack().addActionListener(this);
        charCreateCntl.inGameClassUI.getBack().addActionListener(this);
        charCreateCntl.inGameClassUI.getNext().addActionListener(this);
        charCreateCntl.raceUI.getNext().addActionListener(this);
        charCreateCntl.raceUI.getBack().addActionListener(this);
    }
    
    public void removePanels()
    {
        frame.remove(mainMenu);
        frame.remove(charCreateCntl.charInfoUI);
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
        
    //Handles controls from the main menu**************************************
        if(select == mainMenu.charCreateButton)
        {
           switchPanel(mainMenu, charCreateCntl.charInfoUI);
        }
        if (select== mainMenu.viewCharacterButton)
        {
            switchPanel(mainMenu, charViewCntl.charViewUI);
        }
        if(select == charCreateCntl.charInfoUI.next)
        {
            switchPanel(charCreateCntl.charInfoUI, charCreateCntl.raceUI);
        }
        if (select == charCreateCntl.raceUI.next)
        {
            switchPanel(charCreateCntl.raceUI,charCreateCntl.inGameClassUI);
        }
        if(select == charCreateCntl.raceUI.back)
        {
            switchPanel(charCreateCntl.raceUI,charCreateCntl.charInfoUI);
        }
        if(select == charCreateCntl.charInfoUI.back)
        {
            switchPanel(charCreateCntl.charInfoUI, mainMenu);
        }
        if(select == charCreateCntl.abilityScoreUI.getBack())
        {
            switchPanel(charCreateCntl.abilityScoreUI, charCreateCntl.inGameClassUI);
        }
        if (select == charCreateCntl.abilityScoreUI.getNext())
        {
            switchPanel(charCreateCntl.abilityScoreUI, charCreateCntl.charInfoUI);
        }
        if (select == charCreateCntl.inGameClassUI.next)
        {
            switchPanel(charCreateCntl.inGameClassUI, charCreateCntl.abilityScoreUI);
        }
        if (select == charCreateCntl.inGameClassUI.back)
        {
            switchPanel(charCreateCntl.inGameClassUI, charCreateCntl.raceUI);
        }   
    }

   

}


    
     

