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
    Character character;
    
    
    public MenuCntl(MyJFrame frame)
    {
        this.frame = frame;
        this.frame.add(mainMenu);       
        charCreateCntl = new CharCreatCntl();

        charViewCntl = new CharViewCntl(charCreateCntl.character);
        
        mainMenu.charCreateButton.addActionListener(this);
        mainMenu.charViewButton.addActionListener(this);
        charCreateCntl.charInfoUI.back.addActionListener(this);
        charCreateCntl.charInfoUI.next.addActionListener(this);
        charCreateCntl.abilityScoreUI.getBack().addActionListener(this);
        charCreateCntl.inGameClassUI.getBack().addActionListener(this);
        charCreateCntl.inGameClassUI.getNext().addActionListener(this);
        charCreateCntl.raceUI.getNext().addActionListener(this);
        charCreateCntl.raceUI.getBack().addActionListener(this);
        charCreateCntl.abilityScoreUI.getNext().addActionListener(this);
        charViewCntl.charViewUI.getNext().addActionListener(this);
        charViewCntl.charViewUI.getBack().addActionListener(this);

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
        charViewCntl.updateView();
    //Handles controls from the main menu**************************************
        if(select == mainMenu.charCreateButton)
        {
            switchPanel(mainMenu, charCreateCntl.charInfoUI);
        }
        if (select== mainMenu.charViewButton)
        {
            switchPanel(mainMenu, charViewCntl.charViewUI);
        }
        if(select == charCreateCntl.charInfoUI.next)
        {
            switchPanel(charCreateCntl.charInfoUI, charCreateCntl.raceUI);
            charCreateCntl.onCreateNextClick();
        }
        if (select == charCreateCntl.raceUI.next)
        {
            switchPanel(charCreateCntl.raceUI,charCreateCntl.inGameClassUI);
                    charCreateCntl.onRaceSaveClick();

        }
        if(select == charCreateCntl.raceUI.back)
        {
            switchPanel(charCreateCntl.raceUI,charCreateCntl.charInfoUI);
                    charCreateCntl.onRaceSaveClick();

        }
        if(select == charCreateCntl.charInfoUI.back)
        {
            switchPanel(charCreateCntl.charInfoUI, mainMenu);
            charCreateCntl.onCreateNextClick();
        }
        if(select == charCreateCntl.abilityScoreUI.getBack())
        {
            switchPanel(charCreateCntl.abilityScoreUI, charCreateCntl.inGameClassUI);
        }
        if (select == charCreateCntl.abilityScoreUI.getNext())
        {
            switchPanel(charCreateCntl.abilityScoreUI, charViewCntl.charViewUI);
        }
        if (select == charCreateCntl.inGameClassUI.next)
        {   
            charCreateCntl.onClassSaveClick();
            switchPanel(charCreateCntl.inGameClassUI, charCreateCntl.abilityScoreUI);
        }
        if (select == charCreateCntl.inGameClassUI.back)
        {
            charCreateCntl.onClassSaveClick();
            switchPanel(charCreateCntl.inGameClassUI, charCreateCntl.raceUI);
        }   
        if(select==charViewCntl.charViewUI.getNext())
        {
            charViewCntl.charViewUI.getNext().setText("Not Yet Functional, sorry");
        }
        if(select==charViewCntl.charViewUI.getBack())
        {
            switchPanel(charViewCntl.charViewUI, mainMenu);
        }

    }

   

}


    
     

