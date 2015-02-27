package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CharCreatCntl 
{
    MenuCntl menuCntl;
    CharCreatUI charCreateUI;
    AbilityScoreUI abilityScoreUI;
    InGameClassUI inGameClassUI;
    Character character;
    Dice dice;
    
    CharCreatCntl(MenuCntl menuCntl)
    {
        
        //Declaring classes **************************************************
        this.menuCntl = menuCntl;
        charCreateUI = new CharCreatUI();
        abilityScoreUI = new AbilityScoreUI();
        inGameClassUI = new InGameClassUI();
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
        inGameClassUI.getSelectBard().addActionListener(new ButtonListener());
        inGameClassUI.getSelectBarbarian().addActionListener(new ButtonListener());
        inGameClassUI.getSelectCleric().addActionListener(new ButtonListener());
        inGameClassUI.getSelectDruid().addActionListener(new ButtonListener());
        inGameClassUI.getSelectFighter().addActionListener(new ButtonListener());
        inGameClassUI.getSelectMonk().addActionListener(new ButtonListener());
        inGameClassUI.getSelectPaladin().addActionListener(new ButtonListener());
        inGameClassUI.getSelectRanger().addActionListener(new ButtonListener());
        inGameClassUI.getSelectRogue().addActionListener(new ButtonListener());
        inGameClassUI.getSelectSorceror().addActionListener(new ButtonListener());
        inGameClassUI.getSelectWizard().addActionListener(new ButtonListener());
        inGameClassUI.getSelectAlchemist().addActionListener(new ButtonListener());
        inGameClassUI.getSelectCavalier().addActionListener(new ButtonListener());
        inGameClassUI.getSelectInquisitor().addActionListener(new ButtonListener());
        inGameClassUI.getSelectMagus().addActionListener(new ButtonListener());
        inGameClassUI.getSelectOracle().addActionListener(new ButtonListener());
        inGameClassUI.getSelectSummoner().addActionListener(new ButtonListener());
        inGameClassUI.getSelectWitch().addActionListener(new ButtonListener());
        inGameClassUI.getSelectCustom().addActionListener(new ButtonListener());
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
            //AbilityScoreRollers**********************************************
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
        //HandlesTheInGameClassUI*******************************************
            if(select == inGameClassUI.getSelectCustom())
            {
                inGameClassUI.setClassChosen(0);
            }
            if(select == inGameClassUI.getSelectBard())
            {
                inGameClassUI.setClassChosen(2);
            }
            if(select == inGameClassUI.getSelectBarbarian())
            {
                inGameClassUI.setClassChosen(1);
            }
            if(select == inGameClassUI.getSelectCleric())
            {
                inGameClassUI.setClassChosen(3);
            }
            if(select == inGameClassUI.getSelectDruid())
            {
                inGameClassUI.setClassChosen(4);
            }
            if (select == inGameClassUI.getSelectFighter())
            {
                inGameClassUI.setClassChosen(5);
            }
            if(select ==  inGameClassUI.getSelectMonk())
            {
                inGameClassUI.setClassChosen(6);
            }
            if (select == inGameClassUI.getSelectPaladin())
            {
                inGameClassUI.setClassChosen(7);
            }
            if (select == inGameClassUI.getSelectRanger())
            {
                inGameClassUI.setClassChosen(8);
            }
            if (select ==  inGameClassUI.getSelectRogue())
            {
                inGameClassUI.setClassChosen(9);
            }
            if( select == inGameClassUI.getSelectSorceror())
            {
                inGameClassUI.setClassChosen(10);
            }
            if (select == inGameClassUI.getSelectWizard())
            {
                inGameClassUI.setClassChosen(11);
            }
            if (select == inGameClassUI.getSelectAlchemist())
            {
                inGameClassUI.setClassChosen(12);
            }
            if(select == inGameClassUI.getSelectCavalier())
            {
                inGameClassUI.setClassChosen(13);
            }
            if(select == inGameClassUI.getSelectInquisitor())
            {
                inGameClassUI.setClassChosen(14);
            }
            if(select == inGameClassUI.getSelectMagus())
            {
                inGameClassUI.setClassChosen(15);
            }
            if (select == inGameClassUI.getSelectOracle())
            {
                inGameClassUI.setClassChosen(16);
            }
            if (select == inGameClassUI.getSelectSummoner())
            {
                inGameClassUI.setClassChosen(17);
            }
            if (select == inGameClassUI.getSelectWitch())
            {
                inGameClassUI.setClassChosen(18);
            }


        }
    }
}
