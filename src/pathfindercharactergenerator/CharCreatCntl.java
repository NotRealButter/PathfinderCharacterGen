package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CharCreatCntl 
{
    MenuCntl menuCntl;
    CharInfoUI charInfoUI;
    AbilityScoreUI abilityScoreUI;
    RaceUI raceUI;
    InGameClassUI inGameClassUI;
    Character character;
    Dice dice;
    
    CharCreatCntl(MenuCntl menuCntl)
    {
    //Declaring classes **************************************************
        this.menuCntl = menuCntl;
        charInfoUI = new CharInfoUI();
        
        abilityScoreUI = new AbilityScoreUI();
        inGameClassUI = new InGameClassUI();
            inGameClassUI.inGameClass.initClasses();
        raceUI = new RaceUI();
            raceUI.race.initRaces();
        dice = new Dice();
        character = new Character("default",0, inGameClassUI.inGameClass.fighter, "Male", "True Neutral", raceUI.race.getHuman(), 0, 0);
        
    //Adding ActionListeners **********************************************
 
        charInfoUI.getGenderBox().addActionListener(new BoxListener());
        charInfoUI.getAlignmentBox().addActionListener(new BoxListener());
        charInfoUI.getGenderBox().setEnabled(true); 
        charInfoUI.getAlignmentBox().setEnabled(false); 

    //Initializing AbScore rollers*****************************************
        
        abilityScoreUI.chaRoll.addActionListener(new ButtonListener());
        abilityScoreUI.strRoll.addActionListener(new ButtonListener());
        abilityScoreUI.dexRoll.addActionListener(new ButtonListener());
        abilityScoreUI.intRoll.addActionListener(new ButtonListener());
        abilityScoreUI.conRoll.addActionListener(new ButtonListener());
        abilityScoreUI.wisRoll.addActionListener(new ButtonListener());
        
    //initializing class items*********************************************
        
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
        inGameClassUI.getSelectGunslinger().addActionListener(new ButtonListener());
        inGameClassUI.getSelectInquisitor().addActionListener(new ButtonListener());
        inGameClassUI.getSelectMagus().addActionListener(new ButtonListener());
        inGameClassUI.getSelectOracle().addActionListener(new ButtonListener());
        inGameClassUI.getSelectSummoner().addActionListener(new ButtonListener());
        inGameClassUI.getSelectWitch().addActionListener(new ButtonListener());
        inGameClassUI.getSelectCustom().addActionListener(new ButtonListener());
        inGameClassUI.getNext().addActionListener(new ButtonListener());
        
    //Initializing race items*************************************************
        
        raceUI.getSelectHuman().addActionListener(new ButtonListener());
        raceUI.getSelectHalfElf().addActionListener(new ButtonListener());
        raceUI.getSelectHalfOrc().addActionListener(new ButtonListener());
        raceUI.getSelectGnome().addActionListener(new ButtonListener());
        raceUI.getSelectDwarf().addActionListener(new ButtonListener());
        raceUI.getSelectHalfling().addActionListener(new ButtonListener());
        raceUI.getSelectElf().addActionListener(new ButtonListener());
    }
    
    public void onCreateNextClick()
    {
        character.setName(charInfoUI.name.getText());
        character.setAge((int)charInfoUI.age.getValue());
        character.setHeight((int)charInfoUI.height.getValue());
        character.setWeight((int)charInfoUI.weight.getValue());
    }
    
    class BoxListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
           Object select = e.getSource();
            if (select == charInfoUI.getGenderBox())
            {
                charInfoUI.getAlignmentBox().setEnabled(true);
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
                character.getChaVal().setValue(dice.abilityScoreRoll());
                abilityScoreUI.chaBox.setText(character.getChaVal().getValue() + "");
            }
            if (select == abilityScoreUI.dexRoll)
            {
                character.getDexVal().setValue(dice.abilityScoreRoll());
                abilityScoreUI.dexBox.setText(character.getDexVal().getValue() + "");
            }
            if (select == abilityScoreUI.intRoll)
            {
                character.getIntVal().setValue(dice.abilityScoreRoll());
                abilityScoreUI.intBox.setText(character.getIntVal().getValue() + "");
            }
            if (select == abilityScoreUI.wisRoll)
            {
                character.getWisVal().setValue(dice.abilityScoreRoll());
                abilityScoreUI.wisBox.setText(character.getWisVal().getValue() + "");
            }
            if (select == abilityScoreUI.strRoll)
            {
                character.getStrVal().setValue(dice.abilityScoreRoll());
                abilityScoreUI.strBox.setText(character.getStrVal().getValue() + "");
            }
            if (select == abilityScoreUI.conRoll)
            {
                character.getConVal().setValue(dice.abilityScoreRoll());
                abilityScoreUI.conBox.setText(character.getConVal().getValue() + "");
            }
        //HandlesTheInGameClassUI*******************************************
            if (select == inGameClassUI.getSave())
            {
                character.setClass1(inGameClassUI.inGameClass.getSelectedClass(inGameClassUI.getClassChosen()));
            }
            if(select == inGameClassUI.getSelectCustom())
            {
                inGameClassUI.setClassChosen(0);
                inGameClassUI.getDescriptionLabel().setText("Choose a class from the list on the left \n Select a class to get a description of each class, then select save at the bottom to choose your class.");
            }
            if(select == inGameClassUI.getSelectBard())
            {
                inGameClassUI.setClassChosen(2);            
//                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.bard.description);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getBardText());
            }
            if(select == inGameClassUI.getSelectBarbarian())
            {
                inGameClassUI.setClassChosen(1);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getBarbarianText());
            }
            if(select == inGameClassUI.getSelectCleric())
            {
                inGameClassUI.setClassChosen(3);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getClericText());
            }
            if(select == inGameClassUI.getSelectDruid())
            {
                inGameClassUI.setClassChosen(4);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getDruidText());
            }
            if (select == inGameClassUI.getSelectFighter())
            {
                inGameClassUI.setClassChosen(5);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getFighterText());
            }
            if(select ==  inGameClassUI.getSelectMonk())
            {
                inGameClassUI.setClassChosen(6);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getMonkText());
            }
            if (select == inGameClassUI.getSelectPaladin())
            {
                inGameClassUI.setClassChosen(7);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getPaladinText());
            }
            if (select == inGameClassUI.getSelectRanger())
            {
                inGameClassUI.setClassChosen(8);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getRangerText());
            }
            if (select ==  inGameClassUI.getSelectRogue())
            {
                inGameClassUI.setClassChosen(9);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getRogueText());
            }
            if( select == inGameClassUI.getSelectSorceror())
            {
                inGameClassUI.setClassChosen(10);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getSorcerorText());
            }
            if (select == inGameClassUI.getSelectWizard())
            {
                inGameClassUI.setClassChosen(11);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getWizardText());
            }
            if (select == inGameClassUI.getSelectAlchemist())
            {
                inGameClassUI.setClassChosen(12);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getAlchemistText());
            }
            if(select == inGameClassUI.getSelectCavalier())
            {
                inGameClassUI.setClassChosen(13);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getCavalierText());
            }  
            if(select == inGameClassUI.getSelectInquisitor())                
            {
                inGameClassUI.setClassChosen(14);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getInquisitorText());
            }
            if (select == inGameClassUI.getSelectGunslinger())
            {
                inGameClassUI.setClassChosen(15);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getGunslingerText());
            }    
            if(select == inGameClassUI.getSelectMagus())
            {
                inGameClassUI.setClassChosen(16);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getMagusText());
            }
            if (select == inGameClassUI.getSelectOracle())
            {
                inGameClassUI.setClassChosen(17);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getOracleText());
            }
            if (select == inGameClassUI.getSelectSummoner())
            {
                inGameClassUI.setClassChosen(18);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getSummonerText());
            }
            if (select == inGameClassUI.getSelectWitch())
            {
                inGameClassUI.setClassChosen(19);
                inGameClassUI.getDescriptionLabel().setText(inGameClassUI.inGameClass.getWitchText());
            }
        //Handles RaceUI controls***********************************************
            if (select==raceUI.getSelectHuman())
            {
                raceUI.setRaceChosen(1);
                raceUI.getDescriptionLabel().setText(raceUI.race.getHumanText());
            }
            if(select==raceUI.getSelectElf())
            {
                raceUI.setRaceChosen(2);
                raceUI.getDescriptionLabel().setText(raceUI.race.getElfText());
            }
            if (select == raceUI.getSelectDwarf())
            {
                raceUI.setRaceChosen(3);
                raceUI.getDescriptionLabel().setText(raceUI.race.getDwarfText());
            }
            if (select == raceUI.getSelectHalfling())
            {
                raceUI.setRaceChosen(4);
                raceUI.getDescriptionLabel().setText(raceUI.race.getHalflingText());
            }
            if(select==raceUI.getSelectHalfElf())
            {
                raceUI.setRaceChosen(5);
                raceUI.getDescriptionLabel().setText(raceUI.race.getHalfElfText());
            }
            if(select == raceUI.getSelectHalfOrc())
            {
                raceUI.setRaceChosen(6);
                raceUI.getDescriptionLabel().setText(raceUI.race.getHalfOrcText());
            }
            if(select== raceUI.getSelectGnome())
            {
                raceUI.setRaceChosen(7);
                raceUI.getDescriptionLabel().setText(raceUI.race.getGnomeText());
            }
        }
    }
}
