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
    private InGameClass inGameClass;

    
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classButtonGroup = new javax.swing.ButtonGroup();
        label1 = new java.awt.Label();
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

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        label1.setMaximumSize(new java.awt.Dimension(700, 500));
        label1.setMinimumSize(new java.awt.Dimension(700, 500));
        label1.setText("picture here");

        descriptionLabel.setColumns(20);
        descriptionLabel.setRows(5);
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
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.setMaximumSize(new java.awt.Dimension(100, 100));
        back.setMinimumSize(new java.awt.Dimension(100, 100));
        back.setPreferredSize(new java.awt.Dimension(100, 100));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

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
                .addGap(79, 79, 79)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(descriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectBardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBardActionPerformed

    private void selectClericActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectClericActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectClericActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton back;
    private javax.swing.ButtonGroup classButtonGroup;
    private javax.swing.JTextArea descriptionLabel;
    private javax.swing.JScrollPane descriptionPane;
    private java.awt.Label label1;
    public javax.swing.JButton next;
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

   
    public void classDescriptor()
    {
        if (getClassChosen() == 0)
        {
            getDescriptionLabel().setText("Choose a class from the list on the left \n Select a class to get a description of each class, then select save at the bottom to choose your class.");
        }
        if(getClassChosen() == 1)
        {
            
            getDescriptionLabel().setText("Barbarian \n\n For some, there is only rage. In the ways of their people, in the fury of their passion, in the howl of battle, conflict is all these brutal souls know. Savages, hired muscle, masters of vicious martial techniques, they are not soldiers or professional warriors—they are the battle possessed, creatures of slaughter and spirits of war. Known as barbarians, these warmongers know little of training, preparation, or the rules of warfare; for them, only the moment exists, with the foes that stand before them and the knowledge that the next moment might hold their death. They possess a sixth sense in regard to danger and the endurance to weather all that might entail. These brutal warriors might rise from all walks of life, both civilized and savage, though whole societies embracing such philosophies roam the wild places of the world. Within barbarians storms the primal spirit of battle, and woe to those who face their rage.\n" +
                "\n" +
                "Role: Barbarians excel in combat, possessing the martial prowess and fortitude to take on foes seemingly far superior to themselves. With rage granting them boldness and daring beyond that of most other warriors, barbarians charge furiously into battle and ruin all who would stand in their way.\n" +
                "\n" +
                "Alignment: Any non-lawful\n" +
                "\n" +
                "Hit Die: d12");
        }
        if(getClassChosen() == 2)
        {
            getDescriptionLabel().setText(" Bard \n\n Untold wonders and secrets exist for those skillful enough to discover them. Through cleverness, talent, and magic, these cunning few unravel the wiles of the world, becoming adept in the arts of persuasion, manipulation, and inspiration. Typically masters of one or many forms of artistry, bards possess an uncanny ability to know more than they should and use what they learn to keep themselves and their allies ever one step ahead of danger. Bards are quick-witted and captivating, and their skills might lead them down many paths, be they gamblers or jacks-of-all-trades, scholars or performers, leaders or scoundrels, or even all of the above. For bards, every day brings its own opportunities, adventures, and challenges, and only by bucking the odds, knowing the most, and being the best might they claim the treasures of each.\n" +
                "\n" +
                "Role: Bards capably confuse and confound their foes while inspiring their allies to ever-greater daring. While accomplished with both weapons and magic, the true strength of bards lies outside melee, where they can support their companions and undermine their foes without fear of interruptions to their performances.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d8");
        }
        if(getClassChosen() == 3)
        {
            getDescriptionLabel().setText(" Cleric\n\n" +
                "In faith and the miracles of the divine, many find a greater purpose. Called to serve powers beyond most mortal understanding, all priests preach wonders and provide for the spiritual needs of their people. Clerics are more than mere priests, though; these emissaries of the divine work the will of their deities through strength of arms and the magic of their gods. Devoted to the tenets of the religions and philosophies that inspire them, these ecclesiastics quest to spread the knowledge and influence of their faith. Yet while they might share similar abilities, clerics prove as different from one another as the divinities they serve, with some offering healing and redemption, others judging law and truth, and still others spreading conflict and corruption. The ways of the cleric are varied, yet all who tread these paths walk with the mightiest of allies and bear the arms of the gods themselves.\n" +
                "\n" +
                "Role: More than capable of upholding the honor of their deities in battle, clerics often prove stalwart and capable combatants. Their true strength lies in their capability to draw upon the power of their deities, whether to increase their own and their allies' prowess in battle, to vex their foes with divine magic, or to lend healing to companions in need. As their powers are influenced by their faith, all clerics must focus their worship upon a divine source. While the vast majority of clerics revere a specific deity, a small number dedicate themselves to a divine concept worthy of devotion—such as battle, death, justice, or knowledge—free of a deific abstraction. (Work with your GM if you prefer this path to selecting a specific deity.)\n" +
                "\n" +
                "Alignment: A cleric's alignment must be within one step of her deity's, along either the law/chaos axis or the good/evil axis.\n" +
                "\n" +
                "Hit Die: d8    ");
        }
        if(getClassChosen() == 4)
        {
            getDescriptionLabel().setText(" Druid\n\n" +
                "Within the purity of the elements and the order of the wilds lingers a power beyond the marvels of civilization. Furtive yet undeniable, these primal magics are guarded over by servants of philosophical balance known as druids. Allies to beasts and manipulators of nature, these often misunderstood protectors of the wild strive to shield their lands from all who would threaten them and prove the might of the wilds to those who lock themselves behind city walls. Rewarded for their devotion with incredible powers, druids gain unparalleled shape-shifting abilities, the companionship of mighty beasts, and the power to call upon nature's wrath. The mightiest temper powers akin to storms, earthquakes, and volcanoes with primeval wisdom long abandoned and forgotten by civilization.\n" +
                "\n" +
                "Role: While some druids might keep to the fringe of battle, allowing companions and summoned creatures to fight while they confound foes with the powers of nature, others transform into deadly beasts and savagely wade into combat. Druids worship personifications of elemental forces, natural powers, or nature itself. Typically this means devotion to a nature deity, though druids are just as likely to revere vague spirits, animalistic demigods, or even specific awe-inspiring natural wonders.\n" +
                "\n" +
                "Alignment: Any neutral\n" +
                "\n" +
                "Hit Die: d8    ");
        }
        if(getClassChosen() == 5)
        {
            getDescriptionLabel().setText(" Fighter\n\n"
                + "Some take up arms for glory, wealth, or revenge. Others do battle to prove themselves, to protect others, or because they know nothing else. Still others learn the ways of weaponcraft to hone their bodies in battle and prove their mettle in the forge of war. Lords of the battlefield, fighters are a disparate lot, training with many weapons or just one, perfecting the uses of armor, learning the fighting techniques of exotic masters, and studying the art of combat, all to shape themselves into living weapons. Far more than mere thugs, these skilled warriors reveal the true deadliness of their weapons, turning hunks of metal into arms capable of taming kingdoms, slaughtering monsters, and rousing the hearts of armies. Soldiers, knights, hunters, and artists of war, fighters are unparalleled champions, and woe to those who dare stand against them.\n" +
                "\n" +
                "Role: Fighters excel at combat—defeating their enemies, controlling the flow of battle, and surviving such sorties themselves. While their specific weapons and methods grant them a wide variety of tactics, few can match fighters for sheer battle prowess.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d10    ");
        }
        if(getClassChosen() == 6)
        {
            getDescriptionLabel().setText(" Monk\n\n"+
                "For the truly exemplary, martial skill transcends the battlefield—it is a lifestyle, a doctrine, a state of mind. These warrior-artists search out methods of battle beyond swords and shields, finding weapons within themselves just as capable of crippling or killing as any blade. These monks (so called since they adhere to ancient philosophies and strict martial disciplines) elevate their bodies to become weapons of war, from battle-minded ascetics to self-taught brawlers. Monks tread the path of discipline, and those with the will to endure that path discover within themselves not what they are, but what they are meant to be.\n" +
                "\n" +
                "Role: Monks excel at overcoming even the most daunting perils, striking where it's least expected, and taking advantage of enemy vulnerabilities. Fleet of foot and skilled in combat, monks can navigate any battlefield with ease, aiding allies wherever they are needed most.\n" +
                "\n" +
                "Alignment: Any lawful\n" +
                "\n" +
                "Hit Die: d8    ");
        }
        if(getClassChosen() == 7)
        {
            getDescriptionLabel().setText(" Paladin\n" + "\n" +
                "Through a select, worthy few shines the power of the divine. Called paladins, these noble souls dedicate their swords and lives to the battle against evil. Knights, crusaders, and law-bringers, paladins seek not just to spread divine justice but to embody the teachings of the virtuous deities they serve. In pursuit of their lofty goals, they adhere to ironclad laws of morality and discipline. As reward for their righteousness, these holy champions are blessed with boons to aid them in their quests: powers to banish evil, heal the innocent, and inspire the faithful. Although their convictions might lead them into conflict with the very souls they would save, paladins weather endless challenges of faith and dark temptations, risking their lives to do right and fighting to bring about a brighter future.\n" +
                "\n" +
                "Role: Paladins serve as beacons for their allies within the chaos of battle. While deadly opponents of evil, they can also empower goodly souls to aid in their crusades. Their magic and martial skills also make them well suited to defending others and blessing the fallen with the strength to continue fighting.\n" +
                "\n" +
                "Alignment: Lawful good\n" +
                "\n" +
                "Hit Die: d10    ");
        }
        if(getClassChosen() == 8)
        {
            getDescriptionLabel().setText(" Ranger\n\n" +
                "For those who relish the thrill of the hunt, there are only predators and prey. Be they scouts, trackers, or bounty hunters, rangers share much in common: unique mastery of specialized weapons, skill at stalking even the most elusive game, and the expertise to defeat a wide range of quarries. Knowledgeable, patient, and skilled hunters, these rangers hound man, beast, and monster alike, gaining insight into the way of the predator, skill in varied environments, and ever more lethal martial prowess. While some track man-eating creatures to protect the frontier, others pursue more cunning game—even fugitives among their own people.\n" +
                "\n" +
                "Role: Ranger are deft skirmishers, either in melee or at range, capable of skillfully dancing in and out of battle. Their abilities allow them to deal significant harm to specific types of foes, but their skills are valuable against all manner of enemies.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d10    ");
        }
        if(getClassChosen() == 9)
        {
            getDescriptionLabel().setText(" Rogue\n" +"\n" +
                "Life is an endless adventure for those who live by their wits. Ever just one step ahead of danger, rogues bank on their cunning, skill, and charm to bend fate to their favor. Never knowing what to expect, they prepare for everything, becoming masters of a wide variety of skills, training themselves to be adept manipulators, agile acrobats, shadowy stalkers, or masters of any of dozens of other professions or talents. Thieves and gamblers, fast talkers and diplomats, bandits and bounty hunters, and explorers and investigators all might be considered rogues, as well as countless other professions that rely upon wits, prowess, or luck. Although many rogues favor cities and the innumerable opportunities of civilization, some embrace lives on the road, journeying far, meeting exotic people, and facing fantastic danger in pursuit of equally fantastic riches. In the end, any who desire to shape their fates and live life on their own terms might come to be called rogues.\n" +
                "\n" +
                "Role: Rogues excel at moving about unseen and catching foes unaware, and tend to avoid head-to-head combat. Their varied skills and abilities allow them to be highly versatile, with great variations in expertise existing between different rogues. Most, however, excel in overcoming hindrances of all types, from unlocking doors and disarming traps to outwitting magical hazards and conning dull-witted opponents.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d8    ");
        }
        if(getClassChosen() == 10)
        {
            getDescriptionLabel().setText("  Sorcerer\n" +
                "\n" +
                "Scions of innately magical bloodlines, the chosen of deities, the spawn of monsters, pawns of fate and destiny, or simply flukes of fickle magic, sorcerers look within themselves for arcane prowess and draw forth might few mortals can imagine. Emboldened by lives ever threatening to be consumed by their innate powers, these magic-touched souls endlessly indulge in and refine their mysterious abilities, gradually learning how to harness their birthright and coax forth ever greater arcane feats. Just as varied as these innately powerful spellcasters' abilities and inspirations are the ways in which they choose to utilize their gifts. While some seek to control their abilities through meditation and discipline, becoming masters of their fantastic birthright, others give in to their magic, letting it rule their lives with often explosive results. Regardless, sorcerers live and breathe that which other spellcasters devote their lives to mastering, and for them magic is more than a boon or a field of study; it is life itself.\n" +
                "\n" +
                "Role: Sorcerers excel at casting a selection of favored spells frequently, making them powerful battle mages. As they become familiar with a specific and ever-widening set of spells, sorcerers often discover new and versatile ways of making use of magics other spellcasters might overlook. Their bloodlines also grant them additional abilities, assuring that no two sorcerers are ever quite alike.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d6   ");
        }
        if(getClassChosen() == 11)
        {
            getDescriptionLabel().setText(" Wizard\n" +
                "\n" +
                "Beyond the veil of the mundane hide the secrets of absolute power. The works of beings beyond mortals, the legends of realms where gods and spirits tread, the lore of creations both wondrous and terrible—such mysteries call to those with the ambition and the intellect to rise above the common folk to grasp true might. Such is the path of the wizard. These shrewd magic-users seek, collect, and covet esoteric knowledge, drawing on cultic arts to work wonders beyond the abilities of mere mortals. While some might choose a particular field of magical study and become masters of such powers, others embrace versatility, reveling in the unbounded wonders of all magic. In either case, wizards prove a cunning and potent lot, capable of smiting their foes, empowering their allies, and shaping the world to their every desire.\n" +
                "\n" +
                "Role: While universalist wizards might study to prepare themselves for any manner of danger, specialist wizards research schools of magic that make them exceptionally skilled within a specific focus. Yet no matter their specialty, all wizards are masters of the impossible and can aid their allies in overcoming any danger.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d6    ");
        }
        if(getClassChosen() == 12)
        {
            getDescriptionLabel().setText("Alchemist\n" +
                "\n" +
                "Whether secreted away in a smoky basement laboratory or gleefully experimenting in a well-respected school of magic, the alchemist is often regarded as being just as unstable, unpredictable, and dangerous as the concoctions he brews. While some creators of alchemical items content themselves with sedentary lives as merchants, providing tindertwigs and smokesticks, the true alchemist answers a deeper calling. Rather than cast magic like a spellcaster, the alchemist captures his own magic potential within liquids and extracts he creates, infusing his chemicals with virulent power to grant him impressive skill with poisons, explosives, and all manner of self-transformative magic.\n" +
                "\n" +
                "Role: The alchemist's reputation is not softened by his exuberance (some would say dangerous recklessness) in perfecting his magical extracts and potion-like creations, infusing these substances with magic siphoned from his aura and using his own body as experimental stock. Nor is it mollified by the alchemist's almost gleeful passion for building explosive bombs and discovering strange new poisons and methods for their use. These traits, while making him a liability and risk for most civilized organizations and institutions of higher learning, seem to fit quite well with most adventuring groups.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d8.    ");
        }
        if(getClassChosen() == 13)
        {
            getDescriptionLabel().setText("Cavalier\n" +
                "\n" +
                "While many warriors strive to perfect their art, spending all of their time honing their skill at martial arms, others spend as much effort dedicating themselves to a cause. These warriors, known as cavaliers, swear themselves to a purpose, serving it above all else. Cavaliers are skilled at fighting from horseback, and are often found charging across a battlefield, with the symbol of their order trailing on a long, fluttering banner. The cavalier's true power comes from the conviction of his ideals, the oaths that he swears, and the challenges he makes.\n" +
                "\n" +
                "Role: Cavaliers tend to marshal forces on the battlefield, using their mounted talents and challenges to control the flow of the fight. Outside of battle, cavaliers can be found advancing their cause through diplomacy and, if needed, subterfuge. The cavalier is no stranger to courtly intrigue and can hold his own in even the most delicate of social situations.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Dice: d10.   ");
        }
        if(getClassChosen() == 14)
        {
            getDescriptionLabel().setText("Gunslinger\n" +
                "\n" +
                "For a renegade few, battle sounds different than it does for the typical fighter. The clash of steel and the sizzle of spell energy are drowned out by the thunderous rhythm of gunfire—the pounding beat of the gunslinger.\n" +
                "\n" +
                "Gunslingers are a bold and mysterious lot. While many treat the secrets of black powder with the same care and reverence that a wizard typically reserves for his spellbook, most gunslingers know that firearms are a secret that cannot remain concealed forever. While current firearms are simple, often imprecise, and even dangerous devices, they are a technology on the move, and one that will become even more powerful when it is fully fused with magic.\n" +
                "\n" +
                "Role: Gunslingers are thunderous artillery, often found where the fighting is fiercest. Brave, clever, and frequently foolhardy, many gunslingers push to position themselves at close range, barrels blazing, to take down their foes and demoralize their enemies. Other gunslingers are masters of distant death, picking off enemies from afar with their strange and wondrous weapons.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d10.   ");
        }
        if(getClassChosen() == 15)
        {
            getDescriptionLabel().setText("Inquisitor\n" +
                "\n" +
                "Grim and determined, the inquisitor roots out enemies of the faith, using trickery and guile when righteousness and purity is not enough. Although inquisitors are dedicated to a deity, they are above many of the normal rules and conventions of the church. They answer to their deity and their own sense of justice alone, and are willing to take extreme measures to meet their goals.\n" +
                "\n" +
                "Role: Inquisitors tend to move from place to place, chasing down enemies and researching emerging threats. As a result, they often travel with others, if for no other reason than to mask their presence. Inquisitors work with members of their faith whenever possible, but even such allies are not above suspicion.\n" +
                "\n" +
                "Alignment: An inquisitor’s alignment must be within one step of her deity’s, along either the law/chaos axis or the good/evil axis.\n" +
                "\n" +
                "Hit Dice: d8.   ");
        }
        if(getClassChosen() == 16)
        {
            getDescriptionLabel().setText("Magus\n" +
                "\n" +
                "There are those who spend their lives poring over ancient tomes and texts, unlocking the power of magic, and there are those who spend their time perfecting the use of individual weapons, becoming masters without equal. The magus is at once a student of both philosophies, blending magical ability and martial prowess into something entirely unique, a discipline in which both spell and steel are used to devastating effect. As he grows in power, the magus unlocks powerful forms of arcana that allow him to merge his talents further, and at the pinnacle of his art, the magus becomes a blur of steel and magic, a force that few foes would dare to stand against.\n" +
                "\n" +
                "Role: Magi spend much of their time traveling the world, learning whatever martial or arcane secrets they can find. They might spend months learning a new sword-fighting style from a master warrior, while simultaneously moonlighting in the local library, poring through tomes of ancient lore. Most who take this path dabble in all sorts of lore, picking up anything that might aid them in their search for perfection.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d8.    ");
        }
        if(getClassChosen() == 17)
        {
            getDescriptionLabel().setText("Oracle\n" +
                "\n" +
                "Although the gods work through many agents, perhaps none is more mysterious than the oracle. These divine vessels are granted power without their choice, selected by providence to wield powers that even they do not fully understand. Unlike a cleric, who draws her magic through devotion to a deity, oracles garner strength and power from many sources, namely those patron deities who support their ideals. Instead of worshiping a single source, oracles tend to venerate all of the gods that share their beliefs. While some see the powers of the oracle as a gift, others view them as a curse, changing the life of the chosen in unforeseen ways.\n" +
                "\n" +
                "Role: Oracles do not usually associate with any one church or temple, instead preferring to strike out on their own, or with a small group of like-minded individuals. Oracles typically use their spells and revelations to further their understanding of their mystery, be it through fighting mighty battles or tending to the poor and sick.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Dice: d8.    ");
        }
        if(getClassChosen() == 18)
        {
            getDescriptionLabel().setText("Summoner\n" +
                "\n" +
                "While many who dabble in the arcane become adept at beckoning monsters from the farthest reaches of the planes, none are more skilled at it than the summoner. This practitioner of the arcane arts forms a close bond with one particular outsider, known as an eidolon, who gains power as the summoner becomes more proficient at his summoning. Over time, the two become linked, eventually even sharing a shard of the same soul. But this power comes with a price: the summoner’s spells and abilities are limited due to his time spent enhancing the power and exploring the nature of his eidolon.\n" +
                "\n" +
                "Role: Summoners spend much of their time exploring the arcane arts alongside their eidolons. While their power comes from within, they rely heavily on their eidolon companions in dangerous situations. While a summoner and his eidolon function as individuals, their true power lies in what they can accomplish together.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d8.    ");
        }
        if(getClassChosen() == 19)
        {
            getDescriptionLabel().setText("Witch\n" +
                "\n" +
                "Some gain power through study, some through devotion, others through blood, but the witch gains power from her communion with the unknown. Generally feared and misunderstood, the witch draws her magic from a pact made with an otherworldly power. Communing with that source, using her familiar as a conduit, the witch gains not only a host of spells, but a number of strange abilities known as hexes. As a witch grows in power, she might learn about the source of her magic, but some remain blissfully unaware. Some are even afraid of that source, fearful of what it might be or where its true purposes lie.\n" +
                "\n" +
                "Role: While many witches are recluses, living on the edge of civilization, some live within society, openly or in hiding. The blend of witches' spells makes them adept at filling a number of different roles, from seer to healer, and their hexes grant them a number of abilities that are useful in a fight. Some witches travel about, seeking greater knowledge and better understanding of the mysterious powers that guide them.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d6.    ");
        }
        else
        {
            getDescriptionLabel().setText("Please make a choice");
        }
    } 

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
     * @return the label1
     */
    public java.awt.Label getLabel1() {
        return label1;
    }

    /**
     * @param label1 the label1 to set
     */
    public void setLabel1(java.awt.Label label1) {
        this.label1 = label1;
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
}