package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CharCreatCntl 
{
    MenuCntl menuCntl;
    CharCreatUI charCreatUI;
    String[] race = {"-RACE-","Human" , "Elf" , "Orc", "Halfling"};
    String[] gender = {"-GENDER-","Male", "Female", "Both", "Neither", "Not Applicable"};
    String[] alignment = {"-ALIGNMENT-","Lawful Good","Neutral Good", "Chaotic Good", "Lawful Neutral"," True Neutral", "Chaotic Neutral","Lawful Evil","Neutral Evil","Chaotic Evil"};
    String[] inGameClass = {"-CLASS-","Barbarian","Bard","Cleric","Druid","Fighter","Monk","Paladin","Ranger","Rogue","Sorceror","Wizard"};
   
    CharCreatCntl(MenuCntl menuCntl)
    {
        this.menuCntl = menuCntl;
        charCreatUI = new CharCreatUI();
        charCreatUI.inGameClassBox.add(race);
        charCreatUI.inGameClassBox.addActionListener(new BoxListener());
    
        charCreatUI.raceBox.addActionListener(new BoxListener());
        charCreatUI.genderBox.addActionListener(new BoxListener());
        charCreatUI.alignmentBox.addActionListener(new BoxListener());
        charCreatUI.genderBox.setEnabled(false); 
        charCreatUI.alignmentBox.setEnabled(false); 
        charCreatUI.inGameClassBox.setEnabled(false); 

      
    }
    
    
 class BoxListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
           Object select = e.getSource();
           if (select== charCreatUI.raceBox)
            {
                charCreatUI.inGameClassBox.setEnabled(true);
            }
            if(select == charCreatUI.inGameClassBox)
            {
                charCreatUI.genderBox.setEnabled(true);
            }
            if (select == charCreatUI.genderBox)
            {
                charCreatUI.alignmentBox.setEnabled(true);
            }
           
        }
        
    }
}
