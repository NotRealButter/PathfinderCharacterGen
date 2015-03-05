package pathfindercharactergenerator;

import java.awt.*;

/**
 *
 * @author Stephen
 */
public class RaceUI extends javax.swing.JPanel 
{
    private int raceChosen = 0;
    public Race race;
    public Image preparedImage;
    public Image defaultImage = Toolkit.getDefaultToolkit().getImage("images/races/default.png");
    
    public RaceUI()
    {
        initComponents();
        race = new Race("sample", 7,0,0,0,0,0,0);
        raceButtonGroup.add(selectElf);
        raceButtonGroup.add(selectHuman);
        raceButtonGroup.add(selectDwarf);
        raceButtonGroup.add(selectHalfling);
        raceButtonGroup.add(selectHalfElf);
        raceButtonGroup.add(selectHalfOrc);
        raceButtonGroup.add(selectGnome);
        next.setEnabled(false);
        back.setEnabled(false);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (getRaceChosen() == 0)
        {
            getDescriptionLabel().setText("Choose a class from the list on the left \n Select a class to get a description of each class, then select save at the bottom to choose your class.");
            preparedImage = defaultImage;
        }
        if(getRaceChosen() == 1)
        {
            preparedImage = race.getHumanImg();
            getDescriptionLabel().setText(race.getHumanText());
            repaint();
        }
        if(getRaceChosen() == 2)
        {
            preparedImage = race.getElfImg();
            repaint();
        }
        if(getRaceChosen() == 3)
        {
             preparedImage = race.getDwarfImg();
            repaint();
        }
        if(getRaceChosen() == 4)
        {
            preparedImage = race.getHalflingImg();   
            repaint();
        }
        if(getRaceChosen() == 5)
        {
            preparedImage = race.getHalfElfImg();
            repaint();
        }
        if(getRaceChosen() == 6)
        {
            preparedImage = race.getHalfOrcImg();
            repaint();
        }
        if(getRaceChosen() == 7)
        {
            preparedImage = race.getGnomeImg();
            repaint();
        }
        g.drawImage(preparedImage, 200, 100, this);
        repaint();
        revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        raceButtonGroup = new javax.swing.ButtonGroup();
        descriptionPane = new javax.swing.JScrollPane();
        descriptionLabel = new javax.swing.JTextArea();
        selectHuman = new javax.swing.JRadioButton();
        selectElf = new javax.swing.JRadioButton();
        selectDwarf = new javax.swing.JRadioButton();
        selectHalfling = new javax.swing.JRadioButton();
        selectHalfElf = new javax.swing.JRadioButton();
        selectHalfOrc = new javax.swing.JRadioButton();
        selectGnome = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        descriptionLabel.setColumns(20);
        descriptionLabel.setLineWrap(true);
        descriptionLabel.setRows(5);
        descriptionLabel.setWrapStyleWord(true);
        descriptionPane.setViewportView(descriptionLabel);

        selectHuman.setText("Human");
        selectHuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectHumanActionPerformed(evt);
            }
        });

        selectElf.setText("Elf");
        selectElf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectElfActionPerformed(evt);
            }
        });

        selectDwarf.setText("Dwarf");
        selectDwarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDwarfActionPerformed(evt);
            }
        });

        selectHalfling.setText("Halfling");

        selectHalfElf.setText("Half-Elf");

        selectHalfOrc.setText("Half-Orc");

        selectGnome.setText("Gnome");

        next.setText("Next");
        next.setMaximumSize(new java.awt.Dimension(100, 100));
        next.setMinimumSize(new java.awt.Dimension(100, 100));
        next.setPreferredSize(new java.awt.Dimension(100, 100));

        back.setText("Back");
        back.setMaximumSize(new java.awt.Dimension(100, 100));
        back.setMinimumSize(new java.awt.Dimension(100, 100));
        back.setPreferredSize(new java.awt.Dimension(100, 100));

        save.setText("Save");
        save.setMaximumSize(new java.awt.Dimension(100, 100));
        save.setMinimumSize(new java.awt.Dimension(100, 100));
        save.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectHuman)
                    .addComponent(selectElf)
                    .addComponent(selectDwarf)
                    .addComponent(selectHalfling)
                    .addComponent(selectHalfElf)
                    .addComponent(selectHalfOrc)
                    .addComponent(selectGnome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                .addComponent(descriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(descriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(selectHuman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectElf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectDwarf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectHalfling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectHalfElf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectHalfOrc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectGnome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectElfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectElfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectElfActionPerformed

    private void selectDwarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDwarfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectDwarfActionPerformed

    private void selectHumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectHumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectHumanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton back;
    private javax.swing.JTextArea descriptionLabel;
    private javax.swing.JScrollPane descriptionPane;
    public javax.swing.JButton next;
    private javax.swing.ButtonGroup raceButtonGroup;
    private javax.swing.JButton save;
    private javax.swing.JRadioButton selectDwarf;
    private javax.swing.JRadioButton selectElf;
    private javax.swing.JRadioButton selectGnome;
    private javax.swing.JRadioButton selectHalfElf;
    private javax.swing.JRadioButton selectHalfOrc;
    private javax.swing.JRadioButton selectHalfling;
    private javax.swing.JRadioButton selectHuman;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the back
     */
    public javax.swing.JButton getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(javax.swing.JButton back) {
        this.back = back;
    }

    /**
     * @return the descriptionLabel
     */
    public javax.swing.JTextArea getDescriptionLabel() {
        return descriptionLabel;
    }

    /**
     * @param descriptionLabel the descriptionLabel to set
     */
    public void setDescriptionLabel(javax.swing.JTextArea descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    /**
     * @return the descriptionPane
     */
    public javax.swing.JScrollPane getDescriptionPane() {
        return descriptionPane;
    }

    /**
     * @param descriptionPane the descriptionPane to set
     */
    public void setDescriptionPane(javax.swing.JScrollPane descriptionPane) {
        this.descriptionPane = descriptionPane;
    }

    /**
     * @return the next
     */
    public javax.swing.JButton getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(javax.swing.JButton next) {
        this.next = next;
    }

    /**
     * @return the raceButtonGroup
     */
    public javax.swing.ButtonGroup getRaceButtonGroup() {
        return raceButtonGroup;
    }

    /**
     * @param raceButtonGroup the raceButtonGroup to set
     */
    public void setRaceButtonGroup(javax.swing.ButtonGroup raceButtonGroup) {
        this.raceButtonGroup = raceButtonGroup;
    }

    /**
     * @return the save
     */
    public javax.swing.JButton getSave() {
        return save;
    }

    /**
     * @param save the save to set
     */
    public void setSave(javax.swing.JButton save) {
        this.save = save;
    }



    /**
     * @return the raceChosen
     */
    public int getRaceChosen() {
        return raceChosen;
    }

    /**
     * @param raceChosen the raceChosen to set
     */
    public void setRaceChosen(int raceChosen) {
        this.raceChosen = raceChosen;
    }

    /**
     * @return the selectDwarf
     */
    public javax.swing.JRadioButton getSelectDwarf() {
        return selectDwarf;
    }

    /**
     * @param selectDwarf the selectDwarf to set
     */
    public void setSelectDwarf(javax.swing.JRadioButton selectDwarf) {
        this.selectDwarf = selectDwarf;
    }

    /**
     * @return the selectElf
     */
    public javax.swing.JRadioButton getSelectElf() {
        return selectElf;
    }

    /**
     * @param selectElf the selectElf to set
     */
    public void setSelectElf(javax.swing.JRadioButton selectElf) {
        this.selectElf = selectElf;
    }

    /**
     * @return the selectGnome
     */
    public javax.swing.JRadioButton getSelectGnome() {
        return selectGnome;
    }

    /**
     * @param selectGnome the selectGnome to set
     */
    public void setSelectGnome(javax.swing.JRadioButton selectGnome) {
        this.selectGnome = selectGnome;
    }

    /**
     * @return the selectHalfElf
     */
    public javax.swing.JRadioButton getSelectHalfElf() {
        return selectHalfElf;
    }

    /**
     * @param selectHalfElf the selectHalfElf to set
     */
    public void setSelectHalfElf(javax.swing.JRadioButton selectHalfElf) {
        this.selectHalfElf = selectHalfElf;
    }

    /**
     * @return the selectHalfOrc
     */
    public javax.swing.JRadioButton getSelectHalfOrc() {
        return selectHalfOrc;
    }

    /**
     * @param selectHalfOrc the selectHalfOrc to set
     */
    public void setSelectHalfOrc(javax.swing.JRadioButton selectHalfOrc) {
        this.selectHalfOrc = selectHalfOrc;
    }

    /**
     * @return the selectHalfling
     */
    public javax.swing.JRadioButton getSelectHalfling() {
        return selectHalfling;
    }

    /**
     * @param selectHalfling the selectHalfling to set
     */
    public void setSelectHalfling(javax.swing.JRadioButton selectHalfling) {
        this.selectHalfling = selectHalfling;
    }

    /**
     * @return the selectHuman
     */
    public javax.swing.JRadioButton getSelectHuman() {
        return selectHuman;
    }

    /**
     * @param selectHuman the selectHuman to set
     */
    public void setSelectHuman(javax.swing.JRadioButton selectHuman) {
        this.selectHuman = selectHuman;
    }

   
        

}