package pathfindercharactergenerator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CharCreatUI extends myJPanel
{
    JComboBox raceBox, inGameClassBox, genderBox, alignmentBox;
    JTextField name, age, height, weight;
    JButton back;
    String[] race = {"-RACE-","Human" , "Elf" , "Orc", "Halfling"};
    String[] gender = {"-GENDER-","Male", "Female", "Both", "Neither", "Not Applicable"};
    String[] alignment = {"-ALIGNMENT-","Lawful Good","Neutral Good", "Chaotic Good", "Lawful Neutral"," True Neutral", "Chaotic Neutral","Lawful Evil","Neutral Evil","Chaotic Evil"};
    String[] inGameClass = {"-CLASS-","Barbarian","Bard","Cleric","Druid","Fighter","Monk","Paladin","Ranger","Rogue","Sorceror","Wizard"};
    
    
    CharCreatUI()
    {
        setBackground(Color.blue);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        raceBox = new JComboBox(race);
        raceBox.addActionListener(new BoxListener());
        inGameClassBox = new JComboBox(inGameClass);
        inGameClassBox.setEnabled(false); ;
         inGameClassBox.addActionListener(new BoxListener());
        genderBox = new JComboBox(gender);
        genderBox.setEnabled(false); 
        genderBox.addActionListener(new BoxListener());
        alignmentBox = new JComboBox(alignment);
        alignmentBox.setEnabled(false); 
        alignmentBox.addActionListener(new BoxListener());
        back = new JButton("Back");
        name = new JTextField("Name Here");
        age = new JTextField("Age Here");
        height = new JTextField("Height in Inches here");
        weight = new JTextField("Weight in Pounds here");
        add(name);
        add(age);
        add(height);
        add(weight);
        add(raceBox);
        add(inGameClassBox);
        add(genderBox);
        add(alignmentBox);
        add(back);
    }
    
    class BoxListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
           Object select = e.getSource();
           if (select== raceBox)
            {
                inGameClassBox.setEnabled(true);
            }
            if(select == inGameClassBox)
            {
                genderBox.setEnabled(true);
            }
            if (select == genderBox)
            {
                alignmentBox.setEnabled(true);
            }
           
        }
        
    }
}
