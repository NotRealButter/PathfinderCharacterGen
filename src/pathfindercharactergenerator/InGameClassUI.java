/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfindercharactergenerator;

import java.awt.*;

/**
 *
 * @author Stephen
 */
public class InGameClassUI extends javax.swing.JPanel 
{
    private int classChosen = 0;
    public InGameClass inGameClass;
    public Image preparedImage;
    public Image defaultImage = Toolkit.getDefaultToolkit().getImage("default.png");
    
    public InGameClassUI()
    {
        initComponents();
        inGameClass = new InGameClass();
        classButtonGroup.add(selectBard);
        classButtonGroup.add(selectBarbarian);
        classButtonGroup.add(selectCleric);
        classButtonGroup.add(selectDruid);
        classButtonGroup.add(selectFighter);
        classButtonGroup.add(selectMonk);
        classButtonGroup.add(selectPaladin);
        classButtonGroup.add(selectRanger);
        classButtonGroup.add(selectRogue);
        classButtonGroup.add(selectSorceror);
        classButtonGroup.add(selectSummoner);
        classButtonGroup.add(selectWitch);
        classButtonGroup.add(selectOracle);
        classButtonGroup.add(selectGunslinger);
        classButtonGroup.add(selectInquisitor);
        classButtonGroup.add(selectAlchemist);
        classButtonGroup.add(selectCavalier);
        classButtonGroup.add(selectCustom);
        classButtonGroup.add(selectMagus);
        classButtonGroup.add(selectWizard);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (getClassChosen() == 0)
        {
            getDescriptionLabel().setText("Choose a class from the list on the left \n Select a class to get a description of each class, then select save at the bottom to choose your class.");
            preparedImage = defaultImage;
        }
        if(getClassChosen() == 1)
        {
            preparedImage = inGameClass.getBarbarian();
            descriptionLabel.setText(inGameClass.barbarianText);
            repaint();
        }
        if(getClassChosen() == 2)
        {
            preparedImage = inGameClass.getBard();
            repaint();
        }
        if(getClassChosen() == 3)
        {
            preparedImage = inGameClass.getCleric();
            repaint();
        }
        if(getClassChosen() == 4)
        {
            preparedImage = inGameClass.getDruid();
            repaint();
        }
        if(getClassChosen() == 5)
        {
            preparedImage = inGameClass.getFighter();
            repaint();
        }
        if(getClassChosen() == 6)
        {
            preparedImage = inGameClass.getMonk();
            repaint();
        }
        if(getClassChosen() == 7)
        {
            preparedImage = inGameClass.getPaladin();
            repaint();
        }
        if(getClassChosen() == 8)
        {
            preparedImage = inGameClass.getRanger();
            repaint();
        }
        if(getClassChosen() == 9)
        {
            preparedImage = inGameClass.getRogue();
            repaint();
        }
        if(getClassChosen() == 10)
        {
            preparedImage = inGameClass.getSorceror();
            repaint();
        }
        if(getClassChosen() == 11)
        {
            preparedImage = inGameClass.getWizard();
            repaint();
        }
        if(getClassChosen() == 12)
        {
            preparedImage = inGameClass.getAlchemist();
            repaint();
        }
        if(getClassChosen() == 13)
        {
            preparedImage = inGameClass.getCavalier();
            repaint();
        }
        if(getClassChosen() == 14)
        {
            preparedImage = inGameClass.getGunslinger();
            repaint();
        }
        if(getClassChosen() == 15)
        {
            preparedImage = inGameClass.getInquisitor();
            repaint();
        }
        if(getClassChosen() == 16)
        {
            preparedImage = inGameClass.getMagus();
            repaint();
        }
        if(getClassChosen() == 17)
        {
            preparedImage = inGameClass.getOracle();
            repaint();
        }
        if(getClassChosen() == 18)
        {
            preparedImage = inGameClass.getSummoner();
            repaint();
        }
        if(getClassChosen() == 19)
        {
            preparedImage = inGameClass.getWitch();
            repaint();
        }
        g.drawImage(preparedImage, 200, 100, this);
        repaint();
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classButtonGroup = new javax.swing.ButtonGroup();
        descriptionPane = new javax.swing.JScrollPane();
        descriptionLabel = new javax.swing.JTextArea();
        selectBarbarian = new javax.swing.JRadioButton();
        selectBard = new javax.swing.JRadioButton();
        selectCleric = new javax.swing.JRadioButton();
        selectDruid = new javax.swing.JRadioButton();
        selectFighter = new javax.swing.JRadioButton();
        selectMonk = new javax.swing.JRadioButton();
        selectPaladin = new javax.swing.JRadioButton();
        selectRanger = new javax.swing.JRadioButton();
        selectRogue = new javax.swing.JRadioButton();
        selectSorceror = new javax.swing.JRadioButton();
        selectWizard = new javax.swing.JRadioButton();
        selectAlchemist = new javax.swing.JRadioButton();
        selectCavalier = new javax.swing.JRadioButton();
        selectInquisitor = new javax.swing.JRadioButton();
        selectMagus = new javax.swing.JRadioButton();
        selectOracle = new javax.swing.JRadioButton();
        selectSummoner = new javax.swing.JRadioButton();
        selectWitch = new javax.swing.JRadioButton();
        selectCustom = new javax.swing.JRadioButton();
        selectGunslinger = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        descriptionLabel.setColumns(20);
        descriptionLabel.setLineWrap(true);
        descriptionLabel.setRows(5);
        descriptionLabel.setWrapStyleWord(true);
        descriptionPane.setViewportView(descriptionLabel);

        selectBarbarian.setText("Barbarian");

        selectBard.setText("Bard");
        selectBard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBardActionPerformed(evt);
            }
        });

        selectCleric.setText("Cleric");
        selectCleric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectClericActionPerformed(evt);
            }
        });

        selectDruid.setText("Druid");

        selectFighter.setText("Fighter");

        selectMonk.setText("Monk");

        selectPaladin.setText("Paladin");

        selectRanger.setText("Ranger");

        selectRogue.setText("Rogue");

        selectSorceror.setText("Sorceror");

        selectWizard.setText("Wizard");

        selectAlchemist.setText("Alchemist");

        selectCavalier.setText("Cavalier");

        selectInquisitor.setText("Gunslinger");

        selectMagus.setText("Magus");

        selectOracle.setText("Oracle");

        selectSummoner.setText("Summoner");

        selectWitch.setText("Witch");

        selectCustom.setText("Custom");

        selectGunslinger.setText("Inquisitor");

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
                    .addComponent(selectBarbarian)
                    .addComponent(selectBard)
                    .addComponent(selectCleric)
                    .addComponent(selectDruid)
                    .addComponent(selectFighter)
                    .addComponent(selectMonk)
                    .addComponent(selectPaladin)
                    .addComponent(selectRanger)
                    .addComponent(selectRogue)
                    .addComponent(selectSorceror)
                    .addComponent(selectWizard)
                    .addComponent(selectAlchemist)
                    .addComponent(selectCavalier)
                    .addComponent(selectInquisitor)
                    .addComponent(selectSummoner)
                    .addComponent(selectWitch)
                    .addComponent(selectCustom)
                    .addComponent(selectGunslinger)
                    .addComponent(selectMagus)
                    .addComponent(selectOracle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 676, Short.MAX_VALUE)
                .addComponent(descriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(descriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(selectBarbarian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectBard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectCleric)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectDruid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectFighter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectMonk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectPaladin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectRanger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectRogue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectSorceror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectWizard)
                .addGap(18, 18, 18)
                .addComponent(selectAlchemist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectCavalier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectInquisitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectGunslinger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectMagus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectOracle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectSummoner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectWitch)
                .addGap(18, 18, 18)
                .addComponent(selectCustom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectBardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBardActionPerformed

    private void selectClericActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectClericActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectClericActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton back;
    private javax.swing.ButtonGroup classButtonGroup;
    private javax.swing.JTextArea descriptionLabel;
    private javax.swing.JScrollPane descriptionPane;
    public javax.swing.JButton next;
    private javax.swing.JButton save;
    private javax.swing.JRadioButton selectAlchemist;
    private javax.swing.JRadioButton selectBarbarian;
    private javax.swing.JRadioButton selectBard;
    private javax.swing.JRadioButton selectCavalier;
    private javax.swing.JRadioButton selectCleric;
    private javax.swing.JRadioButton selectCustom;
    private javax.swing.JRadioButton selectDruid;
    private javax.swing.JRadioButton selectFighter;
    private javax.swing.JRadioButton selectGunslinger;
    private javax.swing.JRadioButton selectInquisitor;
    private javax.swing.JRadioButton selectMagus;
    private javax.swing.JRadioButton selectMonk;
    private javax.swing.JRadioButton selectOracle;
    private javax.swing.JRadioButton selectPaladin;
    private javax.swing.JRadioButton selectRanger;
    private javax.swing.JRadioButton selectRogue;
    private javax.swing.JRadioButton selectSorceror;
    private javax.swing.JRadioButton selectSummoner;
    private javax.swing.JRadioButton selectWitch;
    private javax.swing.JRadioButton selectWizard;
    // End of variables declaration//GEN-END:variables

   
        

    /**
     * @return the classChosen
     */
    public int getClassChosen() {
        return classChosen;
    }

    /**
     * @param classChosen the classChosen to set
     */
    public void setClassChosen(int classChosen) {
        this.classChosen = classChosen;
    }

    /**
     * @return the inGameClass
     */
    public InGameClass getInGameClass() {
        return inGameClass;
    }

    /**
     * @param inGameClass the inGameClass to set
     */
    public void setInGameClass(InGameClass inGameClass) {
        this.inGameClass = inGameClass;
    }

    /**
     * @return the classButtonGroup
     */
    public javax.swing.ButtonGroup getClassButtonGroup() {
        return classButtonGroup;
    }

    /**
     * @param classButtonGroup the classButtonGroup to set
     */
    public void setClassButtonGroup(javax.swing.ButtonGroup classButtonGroup) {
        this.classButtonGroup = classButtonGroup;
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
     * @return the selectAlchemist
     */
    public javax.swing.JRadioButton getSelectAlchemist() {
        return selectAlchemist;
    }

    /**
     * @param selectAlchemist the selectAlchemist to set
     */
    public void setSelectAlchemist(javax.swing.JRadioButton selectAlchemist) {
        this.selectAlchemist = selectAlchemist;
    }

    /**
     * @return the selectBarbarian
     */
    public javax.swing.JRadioButton getSelectBarbarian() {
        return selectBarbarian;
    }

    /**
     * @param selectBarbarian the selectBarbarian to set
     */
    public void setSelectBarbarian(javax.swing.JRadioButton selectBarbarian) {
        this.selectBarbarian = selectBarbarian;
    }

    /**
     * @return the selectBard
     */
    public javax.swing.JRadioButton getSelectBard() {
        return selectBard;
    }

    /**
     * @param selectBard the selectBard to set
     */
    public void setSelectBard(javax.swing.JRadioButton selectBard) {
        this.selectBard = selectBard;
    }

    /**
     * @return the selectCavalier
     */
    public javax.swing.JRadioButton getSelectCavalier() {
        return selectCavalier;
    }

    /**
     * @param selectCavalier the selectCavalier to set
     */
    public void setSelectCavalier(javax.swing.JRadioButton selectCavalier) {
        this.selectCavalier = selectCavalier;
    }

    /**
     * @return the selectCleric
     */
    public javax.swing.JRadioButton getSelectCleric() {
        return selectCleric;
    }

    /**
     * @param selectCleric the selectCleric to set
     */
    public void setSelectCleric(javax.swing.JRadioButton selectCleric) {
        this.selectCleric = selectCleric;
    }

    /**
     * @return the selectCustom
     */
    public javax.swing.JRadioButton getSelectCustom() {
        return selectCustom;
    }

    /**
     * @param selectCustom the selectCustom to set
     */
    public void setSelectCustom(javax.swing.JRadioButton selectCustom) {
        this.selectCustom = selectCustom;
    }

    /**
     * @return the selectDruid
     */
    public javax.swing.JRadioButton getSelectDruid() {
        return selectDruid;
    }

    /**
     * @param selectDruid the selectDruid to set
     */
    public void setSelectDruid(javax.swing.JRadioButton selectDruid) {
        this.selectDruid = selectDruid;
    }

    /**
     * @return the selectFighter
     */
    public javax.swing.JRadioButton getSelectFighter() {
        return selectFighter;
    }

    /**
     * @param selectFighter the selectFighter to set
     */
    public void setSelectFighter(javax.swing.JRadioButton selectFighter) {
        this.selectFighter = selectFighter;
    }

    /**
     * @return the selectGunslinger
     */
    public javax.swing.JRadioButton getSelectGunslinger() {
        return selectGunslinger;
    }

    /**
     * @param selectGunslinger the selectGunslinger to set
     */
    public void setSelectGunslinger(javax.swing.JRadioButton selectGunslinger) {
        this.selectGunslinger = selectGunslinger;
    }

    /**
     * @return the selectInquisitor
     */
    public javax.swing.JRadioButton getSelectInquisitor() {
        return selectInquisitor;
    }

    /**
     * @param selectInquisitor the selectInquisitor to set
     */
    public void setSelectInquisitor(javax.swing.JRadioButton selectInquisitor) {
        this.selectInquisitor = selectInquisitor;
    }

    /**
     * @return the selectMagus
     */
    public javax.swing.JRadioButton getSelectMagus() {
        return selectMagus;
    }

    /**
     * @param selectMagus the selectMagus to set
     */
    public void setSelectMagus(javax.swing.JRadioButton selectMagus) {
        this.selectMagus = selectMagus;
    }

    /**
     * @return the selectMonk
     */
    public javax.swing.JRadioButton getSelectMonk() {
        return selectMonk;
    }

    /**
     * @param selectMonk the selectMonk to set
     */
    public void setSelectMonk(javax.swing.JRadioButton selectMonk) {
        this.selectMonk = selectMonk;
    }

    /**
     * @return the selectOracle
     */
    public javax.swing.JRadioButton getSelectOracle() {
        return selectOracle;
    }

    /**
     * @param selectOracle the selectOracle to set
     */
    public void setSelectOracle(javax.swing.JRadioButton selectOracle) {
        this.selectOracle = selectOracle;
    }

    /**
     * @return the selectPaladin
     */
    public javax.swing.JRadioButton getSelectPaladin() {
        return selectPaladin;
    }

    /**
     * @param selectPaladin the selectPaladin to set
     */
    public void setSelectPaladin(javax.swing.JRadioButton selectPaladin) {
        this.selectPaladin = selectPaladin;
    }

    /**
     * @return the selectRanger
     */
    public javax.swing.JRadioButton getSelectRanger() {
        return selectRanger;
    }

    /**
     * @param selectRanger the selectRanger to set
     */
    public void setSelectRanger(javax.swing.JRadioButton selectRanger) {
        this.selectRanger = selectRanger;
    }

    /**
     * @return the selectRogue
     */
    public javax.swing.JRadioButton getSelectRogue() {
        return selectRogue;
    }

    /**
     * @param selectRogue the selectRogue to set
     */
    public void setSelectRogue(javax.swing.JRadioButton selectRogue) {
        this.selectRogue = selectRogue;
    }

    /**
     * @return the selectSorceror
     */
    public javax.swing.JRadioButton getSelectSorceror() {
        return selectSorceror;
    }

    /**
     * @param selectSorceror the selectSorceror to set
     */
    public void setSelectSorceror(javax.swing.JRadioButton selectSorceror) {
        this.selectSorceror = selectSorceror;
    }

    /**
     * @return the selectSummoner
     */
    public javax.swing.JRadioButton getSelectSummoner() {
        return selectSummoner;
    }

    /**
     * @param selectSummoner the selectSummoner to set
     */
    public void setSelectSummoner(javax.swing.JRadioButton selectSummoner) {
        this.selectSummoner = selectSummoner;
    }

    /**
     * @return the selectWitch
     */
    public javax.swing.JRadioButton getSelectWitch() {
        return selectWitch;
    }

    /**
     * @param selectWitch the selectWitch to set
     */
    public void setSelectWitch(javax.swing.JRadioButton selectWitch) {
        this.selectWitch = selectWitch;
    }

    /**
     * @return the selectWizard
     */
    public javax.swing.JRadioButton getSelectWizard() {
        return selectWizard;
    }

    /**
     * @param selectWizard the selectWizard to set
     */
    public void setSelectWizard(javax.swing.JRadioButton selectWizard) {
        this.selectWizard = selectWizard;
    }

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
}