package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CharCreatCntl 
{
    MenuCntl menuCntl;
    CharCreatUI charCreateUI;
    AbilityScoreUI abilityScoreUI;
    Character character;
    Dice dice;
    
    CharCreatCntl(MenuCntl menuCntl)
    {
        
        //Declaring classes **************************************************
        this.menuCntl = menuCntl;
        charCreateUI = new CharCreatUI();
        abilityScoreUI = new AbilityScoreUI();
        character = new Character();
        dice = new Dice();
        
        //Adding ActionListeners **********************************************
        charCreateUI.getInGameClassBox().addActionListener(new BoxListener());    
        charCreateUI.getRaceBox().addActionListener(new BoxListener());
        charCreateUI.getGenderBox().addActionListener(new BoxListener());
        charCreateUI.getAlignmentBox().addActionListener(new BoxListener());
        charCreateUI.getGenderBox().setEnabled(false); 
        charCreateUI.getAlignmentBox().setEnabled(false); 
        charCreateUI.getInGameClassBox().setEnabled(false); 
        abilityScoreUI.chaRoll.addActionListener(new ButtonListener());
        abilityScoreUI.strRoll.addActionListener(new ButtonListener());
        abilityScoreUI.dexRoll.addActionListener(new ButtonListener());
        abilityScoreUI.intRoll.addActionListener(new ButtonListener());
        abilityScoreUI.conRoll.addActionListener(new ButtonListener());
        abilityScoreUI.wisRoll.addActionListener(new ButtonListener());

        

      
    }
    
    public void onCreateNextClick()
    {
        character.setName(charCreateUI.name.getText());
        character.setAge((int)charCreateUI.age.getValue());
        character.setHeight((int)charCreateUI.height.getValue());
        character.setWeight((int)charCreateUI.weight.getValue());
    }
    
 class BoxListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
           Object select = e.getSource();
           if (select== charCreateUI.getRaceBox())
            {
                charCreateUI.getInGameClassBox().setEnabled(true);
            }
            if(select == charCreateUI.getInGameClassBox())
            {
                charCreateUI.getGenderBox().setEnabled(true);
            }
            if (select == charCreateUI.getGenderBox())
            {
                charCreateUI.getAlignmentBox().setEnabled(true);
            }
           
        }
        
    }
 class ButtonListener implements ActionListener
 {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object select = e.getSource();
            if (select == abilityScoreUI.chaRoll)
            {
                abilityScoreUI.chaBox.setText(""+dice.abilityScoreRoll());
            }
             if (select == abilityScoreUI.dexRoll)
            {
                abilityScoreUI.dexBox.setText(""+dice.abilityScoreRoll());
            }
              if (select == abilityScoreUI.intRoll)
            {
                abilityScoreUI.intBox.setText(""+dice.abilityScoreRoll());
            }
               if (select == abilityScoreUI.wisRoll)
            {
                abilityScoreUI.wisBox.setText(""+dice.abilityScoreRoll());
            }
                if (select == abilityScoreUI.strRoll)
            {
                abilityScoreUI.strBox.setText(""+dice.abilityScoreRoll());
            }
                 if (select == abilityScoreUI.conRoll)
            {
                abilityScoreUI.conBox.setText(""+dice.abilityScoreRoll());
            }
        }
     
 }
}
