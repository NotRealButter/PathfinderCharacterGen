package pathfindercharactergenerator;

import java.awt.*;

/**
 *
 * @author Stephen Hite
 */
public class InGameClass 
{
    private Image alchemistImg = Toolkit.getDefaultToolkit().getImage("images/classes/alchemist.png");
    private Image bardImg = Toolkit.getDefaultToolkit().getImage("images/classes/bard.png");
    private Image barbarianImg = Toolkit.getDefaultToolkit().getImage("images/classes/barbarian.png");
    private Image cavalierImg = Toolkit.getDefaultToolkit().getImage("images/classes/cavalier.png");
    private Image clericImg = Toolkit.getDefaultToolkit().getImage("images/classes/cleric.png");
    private Image druidImg = Toolkit.getDefaultToolkit().getImage("images/classes/druid.png");
    private Image fighterImg = Toolkit.getDefaultToolkit().getImage("images/classes/fighter.png");
    private Image gunslingerImg = Toolkit.getDefaultToolkit().getImage("images/classes/gunslinger.png"); 
    private Image inquisitorImg = Toolkit.getDefaultToolkit().getImage("images/classes/inquisitor.png");
    private Image magusImg = Toolkit.getDefaultToolkit().getImage("images/classes/magus.png"); 
    private Image monkImg = Toolkit.getDefaultToolkit().getImage("images/classes/monk.png");
    private Image oracleImg = Toolkit.getDefaultToolkit().getImage("images/classes/oracle.png");
    private Image paladinImg = Toolkit.getDefaultToolkit().getImage("images/classes/paladin.png");
    private Image rangerImg = Toolkit.getDefaultToolkit().getImage("images/classes/ranger.png");
    private Image rogueImg = Toolkit.getDefaultToolkit().getImage("images/classes/rogue.png");
    private Image sorcerorImg = Toolkit.getDefaultToolkit().getImage("images/classes/sorceror.png");
    private Image summonerImg = Toolkit.getDefaultToolkit().getImage("images/classes/summoner.png");
    private Image witchImg = Toolkit.getDefaultToolkit().getImage("images/classes/witch.png");
    private Image wizardImg = Toolkit.getDefaultToolkit().getImage("images/classes/wizard.png");
    Image characterIcon;
    
    private String name;
    private int classID;
    private Skill trainedSkills;
    private Dice hitDie;
    String description;
    
    
    String alchemistText;
    String barbarianText;
    String bardText;
    String cavalierText;
    String clericText;
    String druidText;
    String fighterText;
    String gunslingerText;
    String inquisitorText;
    String magusText;
    String monkText;
    String oracleText;
    String paladinText;
    String rangerText;
    String rogueText;
    String sorcerorText;
    String summonerText;
    String wizardText;
    String witchText;
    
    InGameClass alchemist, barbarian,bard,cavalier,cleric,druid,fighter,gunslinger,inquisitor,magus,monk,oracle,paladin,ranger,rogue,sorceror,summoner,wizard,witch;
    
    InGameClass()
    {
               initStrings();
               
    }
    InGameClass(String name, int classID, String description, Image icon)
    {
        this.name = name;
        this.classID = classID;
        this.description = description;
        this.characterIcon = icon;
        
        initStrings();
    }
    
    public void initStrings()
    {
        setAlchemistText("Alchemist\n" +
                "\n" +
                "Whether secreted away in a smoky basement laboratory or gleefully experimenting in a well-respected school of magic, the alchemist is often regarded as being just as unstable, unpredictable, and dangerous as the concoctions he brews. While some creators of alchemical items content themselves with sedentary lives as merchants, providing tindertwigs and smokesticks, the true alchemist answers a deeper calling. Rather than cast magic like a spellcaster, the alchemist captures his own magic potential within liquids and extracts he creates, infusing his chemicals with virulent power to grant him impressive skill with poisons, explosives, and all manner of self-transformative magic.\n" +
                "\n" +
                "Role: The alchemist's reputation is not softened by his exuberance (some would say dangerous recklessness) in perfecting his magical extracts and potion-like creations, infusing these substances with magic siphoned from his aura and using his own body as experimental stock. Nor is it mollified by the alchemist's almost gleeful passion for building explosive bombs and discovering strange new poisons and methods for their use. These traits, while making him a liability and risk for most civilized organizations and institutions of higher learning, seem to fit quite well with most adventuring groups.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d8.    ");
        setBardText("Bard "
                + ""
                + "\n\n Untold wonders and secrets exist for those skillful enough to discover them. Through cleverness, talent, and magic, these cunning few unravel the wiles of the world, becoming adept in the arts of persuasion, manipulation, and inspiration. Typically masters of one or many forms of artistry, bards possess an uncanny ability to know more than they should and use what they learn to keep themselves and their allies ever one step ahead of danger. Bards are quick-witted and captivating, and their skills might lead them down many paths, be they gamblers or jacks-of-all-trades, scholars or performers, leaders or scoundrels, or even all of the above. For bards, every day brings its own opportunities, adventures, and challenges, and only by bucking the odds, knowing the most, and being the best might they claim the treasures of each.\n" +
                "\n\n" +
                "Role: Bards capably confuse and confound their foes while inspiring their allies to ever-greater daring. While accomplished with both weapons and magic, the true strength of bards lies outside melee, where they can support their companions and undermine their foes without fear of interruptions to their performances." +
                "\n \n" +
                "Alignment: Any" +
                "\n Hit Die: d8");
        setBarbarianText("Barbarian \n\n For some, there is only rage. In the ways of their people, in the fury of their passion, in the howl of battle, conflict is all these brutal souls know. Savages, hired muscle, masters of vicious martial techniques, they are not soldiers or professional warriors—they are the battle possessed, creatures of slaughter and spirits of war. Known as barbarians, these warmongers know little of training, preparation, or the rules of warfare; for them, only the moment exists, with the foes that stand before them and the knowledge that the next moment might hold their death. They possess a sixth sense in regard to danger and the endurance to weather all that might entail. These brutal warriors might rise from all walks of life, both civilized and savage, though whole societies embracing such philosophies roam the wild places of the world. Within barbarians storms the primal spirit of battle, and woe to those who face their rage.\n" +
                "\n" +
                "Role: Barbarians excel in combat, possessing the martial prowess and fortitude to take on foes seemingly far superior to themselves. With rage granting them boldness and daring beyond that of most other warriors, barbarians charge furiously into battle and ruin all who would stand in their way.\n" +
                "\n" +
                "Alignment: Any non-lawful\n" +
                "\n" +
                "Hit Die: d12");
        setCavalierText("Cavalier\n" +
                "\n" +
                "While many warriors strive to perfect their art, spending all of their time honing their skill at martial arms, others spend as much effort dedicating themselves to a cause. These warriors, known as cavaliers, swear themselves to a purpose, serving it above all else. Cavaliers are skilled at fighting from horseback, and are often found charging across a battlefield, with the symbol of their order trailing on a long, fluttering banner. The cavalier's true power comes from the conviction of his ideals, the oaths that he swears, and the challenges he makes.\n" +
                "\n" +
                "Role: Cavaliers tend to marshal forces on the battlefield, using their mounted talents and challenges to control the flow of the fight. Outside of battle, cavaliers can be found advancing their cause through diplomacy and, if needed, subterfuge. The cavalier is no stranger to courtly intrigue and can hold his own in even the most delicate of social situations.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Dice: d10.   ");
        setClericText("Cleric\n\n" +
                "In faith and the miracles of the divine, many find a greater purpose. Called to serve powers beyond most mortal understanding, all priests preach wonders and provide for the spiritual needs of their people. Clerics are more than mere priests, though; these emissaries of the divine work the will of their deities through strength of arms and the magic of their gods. Devoted to the tenets of the religions and philosophies that inspire them, these ecclesiastics quest to spread the knowledge and influence of their faith. Yet while they might share similar abilities, clerics prove as different from one another as the divinities they serve, with some offering healing and redemption, others judging law and truth, and still others spreading conflict and corruption. The ways of the cleric are varied, yet all who tread these paths walk with the mightiest of allies and bear the arms of the gods themselves.\n" +
                "\n" +
                "Role: More than capable of upholding the honor of their deities in battle, clerics often prove stalwart and capable combatants. Their true strength lies in their capability to draw upon the power of their deities, whether to increase their own and their allies' prowess in battle, to vex their foes with divine magic, or to lend healing to companions in need. As their powers are influenced by their faith, all clerics must focus their worship upon a divine source. While the vast majority of clerics revere a specific deity, a small number dedicate themselves to a divine concept worthy of devotion—such as battle, death, justice, or knowledge—free of a deific abstraction. (Work with your GM if you prefer this path to selecting a specific deity.)\n" +
                "\n" +
                "Alignment: A cleric's alignment must be within one step of her deity's, along either the law/chaos axis or the good/evil axis.\n" +
                "\n" +
                "Hit Die: d8    ");
        setDruidText("Druid\n\n" +
                "Within the purity of the elements and the order of the wilds lingers a power beyond the marvels of civilization. Furtive yet undeniable, these primal magics are guarded over by servants of philosophical balance known as druids. Allies to beasts and manipulators of nature, these often misunderstood protectors of the wild strive to shield their lands from all who would threaten them and prove the might of the wilds to those who lock themselves behind city walls. Rewarded for their devotion with incredible powers, druids gain unparalleled shape-shifting abilities, the companionship of mighty beasts, and the power to call upon nature's wrath. The mightiest temper powers akin to storms, earthquakes, and volcanoes with primeval wisdom long abandoned and forgotten by civilization.\n" +
                "\n" +
                "Role: While some druids might keep to the fringe of battle, allowing companions and summoned creatures to fight while they confound foes with the powers of nature, others transform into deadly beasts and savagely wade into combat. Druids worship personifications of elemental forces, natural powers, or nature itself. Typically this means devotion to a nature deity, though druids are just as likely to revere vague spirits, animalistic demigods, or even specific awe-inspiring natural wonders.\n" +
                "\n" +
                "Alignment: Any neutral\n" +
                "\n" +
                "Hit Die: d8    ");
        setFighterText("Fighter\n\n"
                + "Some take up arms for glory, wealth, or revenge. Others do battle to prove themselves, to protect others, or because they know nothing else. Still others learn the ways of weaponcraft to hone their bodies in battle and prove their mettle in the forge of war. Lords of the battlefield, fighters are a disparate lot, training with many weapons or just one, perfecting the uses of armor, learning the fighting techniques of exotic masters, and studying the art of combat, all to shape themselves into living weapons. Far more than mere thugs, these skilled warriors reveal the true deadliness of their weapons, turning hunks of metal into arms capable of taming kingdoms, slaughtering monsters, and rousing the hearts of armies. Soldiers, knights, hunters, and artists of war, fighters are unparalleled champions, and woe to those who dare stand against them.\n" +
                "\n" +
                "Role: Fighters excel at combat—defeating their enemies, controlling the flow of battle, and surviving such sorties themselves. While their specific weapons and methods grant them a wide variety of tactics, few can match fighters for sheer battle prowess.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d10    ");

        setInquisitorText("Inquisitor\n" +
                "\n" +
                "Grim and determined, the inquisitor roots out enemies of the faith, using trickery and guile when righteousness and purity is not enough. Although inquisitors are dedicated to a deity, they are above many of the normal rules and conventions of the church. They answer to their deity and their own sense of justice alone, and are willing to take extreme measures to meet their goals.\n" +
                "\n" +
                "Role: Inquisitors tend to move from place to place, chasing down enemies and researching emerging threats. As a result, they often travel with others, if for no other reason than to mask their presence. Inquisitors work with members of their faith whenever possible, but even such allies are not above suspicion.\n" +
                "\n" +
                "Alignment: An inquisitor’s alignment must be within one step of her deity’s, along either the law/chaos axis or the good/evil axis.\n" +
                "\n" +
                "Hit Dice: d8.   ");
        setMagusText("Magus\n" +
                "\n" +
                "There are those who spend their lives poring over ancient tomes and texts, unlocking the power of magic, and there are those who spend their time perfecting the use of individual weapons, becoming masters without equal. The magus is at once a student of both philosophies, blending magical ability and martial prowess into something entirely unique, a discipline in which both spell and steel are used to devastating effect. As he grows in power, the magus unlocks powerful forms of arcana that allow him to merge his talents further, and at the pinnacle of his art, the magus becomes a blur of steel and magic, a force that few foes would dare to stand against.\n" +
                "\n" +
                "Role: Magi spend much of their time traveling the world, learning whatever martial or arcane secrets they can find. They might spend months learning a new sword-fighting style from a master warrior, while simultaneously moonlighting in the local library, poring through tomes of ancient lore. Most who take this path dabble in all sorts of lore, picking up anything that might aid them in their search for perfection.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d8.    ");
        setMonkText("Monk\n\n"+
                "For the truly exemplary, martial skill transcends the battlefield—it is a lifestyle, a doctrine, a state of mind. These warrior-artists search out methods of battle beyond swords and shields, finding weapons within themselves just as capable of crippling or killing as any blade. These monks (so called since they adhere to ancient philosophies and strict martial disciplines) elevate their bodies to become weapons of war, from battle-minded ascetics to self-taught brawlers. Monks tread the path of discipline, and those with the will to endure that path discover within themselves not what they are, but what they are meant to be.\n" +
                "\n" +
                "Role: Monks excel at overcoming even the most daunting perils, striking where it's least expected, and taking advantage of enemy vulnerabilities. Fleet of foot and skilled in combat, monks can navigate any battlefield with ease, aiding allies wherever they are needed most.\n" +
                "\n" +
                "Alignment: Any lawful\n" +
                "\n" +
                "Hit Die: d8    ");
        setOracleText("Oracle\n" +
                "\n" +
                "Although the gods work through many agents, perhaps none is more mysterious than the oracle. These divine vessels are granted power without their choice, selected by providence to wield powers that even they do not fully understand. Unlike a cleric, who draws her magic through devotion to a deity, oracles garner strength and power from many sources, namely those patron deities who support their ideals. Instead of worshiping a single source, oracles tend to venerate all of the gods that share their beliefs. While some see the powers of the oracle as a gift, others view them as a curse, changing the life of the chosen in unforeseen ways.\n" +
                "\n" +
                "Role: Oracles do not usually associate with any one church or temple, instead preferring to strike out on their own, or with a small group of like-minded individuals. Oracles typically use their spells and revelations to further their understanding of their mystery, be it through fighting mighty battles or tending to the poor and sick.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Dice: d8.    ");
        setPaladinText("Paladin\n" + "\n" +
                "Through a select, worthy few shines the power of the divine. Called paladins, these noble souls dedicate their swords and lives to the battle against evil. Knights, crusaders, and law-bringers, paladins seek not just to spread divine justice but to embody the teachings of the virtuous deities they serve. In pursuit of their lofty goals, they adhere to ironclad laws of morality and discipline. As reward for their righteousness, these holy champions are blessed with boons to aid them in their quests: powers to banish evil, heal the innocent, and inspire the faithful. Although their convictions might lead them into conflict with the very souls they would save, paladins weather endless challenges of faith and dark temptations, risking their lives to do right and fighting to bring about a brighter future.\n" +
                "\n" +
                "Role: Paladins serve as beacons for their allies within the chaos of battle. While deadly opponents of evil, they can also empower goodly souls to aid in their crusades. Their magic and martial skills also make them well suited to defending others and blessing the fallen with the strength to continue fighting.\n" +
                "\n" +
                "Alignment: Lawful good\n" +
                "\n" +
                "Hit Die: d10    ");
        setRangerText("Ranger\n\n" +
                "For those who relish the thrill of the hunt, there are only predators and prey. Be they scouts, trackers, or bounty hunters, rangers share much in common: unique mastery of specialized weapons, skill at stalking even the most elusive game, and the expertise to defeat a wide range of quarries. Knowledgeable, patient, and skilled hunters, these rangers hound man, beast, and monster alike, gaining insight into the way of the predator, skill in varied environments, and ever more lethal martial prowess. While some track man-eating creatures to protect the frontier, others pursue more cunning game—even fugitives among their own people.\n" +
                "\n" +
                "Role: Ranger are deft skirmishers, either in melee or at range, capable of skillfully dancing in and out of battle. Their abilities allow them to deal significant harm to specific types of foes, but their skills are valuable against all manner of enemies.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d10    ");
        setRogueText("Rogue\n" +"\n" +
                "Life is an endless adventure for those who live by their wits. Ever just one step ahead of danger, rogues bank on their cunning, skill, and charm to bend fate to their favor. Never knowing what to expect, they prepare for everything, becoming masters of a wide variety of skills, training themselves to be adept manipulators, agile acrobats, shadowy stalkers, or masters of any of dozens of other professions or talents. Thieves and gamblers, fast talkers and diplomats, bandits and bounty hunters, and explorers and investigators all might be considered rogues, as well as countless other professions that rely upon wits, prowess, or luck. Although many rogues favor cities and the innumerable opportunities of civilization, some embrace lives on the road, journeying far, meeting exotic people, and facing fantastic danger in pursuit of equally fantastic riches. In the end, any who desire to shape their fates and live life on their own terms might come to be called rogues.\n" +
                "\n" +
                "Role: Rogues excel at moving about unseen and catching foes unaware, and tend to avoid head-to-head combat. Their varied skills and abilities allow them to be highly versatile, with great variations in expertise existing between different rogues. Most, however, excel in overcoming hindrances of all types, from unlocking doors and disarming traps to outwitting magical hazards and conning dull-witted opponents.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d8    ");
        setSorcerorText("Sorcerer\n" +
                "\n" +
                "Scions of innately magical bloodlines, the chosen of deities, the spawn of monsters, pawns of fate and destiny, or simply flukes of fickle magic, sorcerers look within themselves for arcane prowess and draw forth might few mortals can imagine. Emboldened by lives ever threatening to be consumed by their innate powers, these magic-touched souls endlessly indulge in and refine their mysterious abilities, gradually learning how to harness their birthright and coax forth ever greater arcane feats. Just as varied as these innately powerful spellcasters' abilities and inspirations are the ways in which they choose to utilize their gifts. While some seek to control their abilities through meditation and discipline, becoming masters of their fantastic birthright, others give in to their magic, letting it rule their lives with often explosive results. Regardless, sorcerers live and breathe that which other spellcasters devote their lives to mastering, and for them magic is more than a boon or a field of study; it is life itself.\n" +
                "\n" +
                "Role: Sorcerers excel at casting a selection of favored spells frequently, making them powerful battle mages. As they become familiar with a specific and ever-widening set of spells, sorcerers often discover new and versatile ways of making use of magics other spellcasters might overlook. Their bloodlines also grant them additional abilities, assuring that no two sorcerers are ever quite alike.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d6   ");
        setSummonerText("Summoner\n" +
                "\n" +
                "While many who dabble in the arcane become adept at beckoning monsters from the farthest reaches of the planes, none are more skilled at it than the summoner. This practitioner of the arcane arts forms a close bond with one particular outsider, known as an eidolon, who gains power as the summoner becomes more proficient at his summoning. Over time, the two become linked, eventually even sharing a shard of the same soul. But this power comes with a price: the summoner’s spells and abilities are limited due to his time spent enhancing the power and exploring the nature of his eidolon.\n" +
                "\n" +
                "Role: Summoners spend much of their time exploring the arcane arts alongside their eidolons. While their power comes from within, they rely heavily on their eidolon companions in dangerous situations. While a summoner and his eidolon function as individuals, their true power lies in what they can accomplish together.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n" +
                "Hit Die: d8.    ");
        setWitchText("Witch\n" +
                "\n" +
                "Some gain power through study, some through devotion, others through blood, but the witch gains power from her communion with the unknown. Generally feared and misunderstood, the witch draws her magic from a pact made with an otherworldly power. Communing with that source, using her familiar as a conduit, the witch gains not only a host of spells, but a number of strange abilities known as hexes. As a witch grows in power, she might learn about the source of her magic, but some remain blissfully unaware. Some are even afraid of that source, fearful of what it might be or where its true purposes lie.\n" +
                "\n" +
                "Role: While many witches are recluses, living on the edge of civilization, some live within society, openly or in hiding. The blend of witches' spells makes them adept at filling a number of different roles, from seer to healer, and their hexes grant them a number of abilities that are useful in a fight. Some witches travel about, seeking greater knowledge and better understanding of the mysterious powers that guide them.\n" +
                "\n" +
                "Alignment: Any.\n" +
                "\n Hit Die: d6.    ");
        setWizardText("Wizard\n" +
                "\n" +
                "Beyond the veil of the mundane hide the secrets of absolute power. The works of beings beyond mortals, the legends of realms where gods and spirits tread, the lore of creations both wondrous and terrible—such mysteries call to those with the ambition and the intellect to rise above the common folk to grasp true might. Such is the path of the wizard. These shrewd magic-users seek, collect, and covet esoteric knowledge, drawing on cultic arts to work wonders beyond the abilities of mere mortals. While some might choose a particular field of magical study and become masters of such powers, others embrace versatility, reveling in the unbounded wonders of all magic. In either case, wizards prove a cunning and potent lot, capable of smiting their foes, empowering their allies, and shaping the world to their every desire.\n" +
                "\n" +
                "Role: While universalist wizards might study to prepare themselves for any manner of danger, specialist wizards research schools of magic that make them exceptionally skilled within a specific focus. Yet no matter their specialty, all wizards are masters of the impossible and can aid their allies in overcoming any danger.\n" +
                "\n" +
                "Alignment: Any\n" +
                "\n" +
                "Hit Die: d6    ");  
        setGunslingerText("Gunslinger\n" +
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

    /**
     * @return the alchemistImg
     */
    
    public void initClasses()
    {
        barbarian = new InGameClass("Barbarian",1,barbarianText,barbarianImg);
        bard = new InGameClass("Bard",2,bardText,bardImg);
        cleric = new InGameClass("Cleric", 3,clericText,clericImg);
        druid  = new InGameClass("Druid", 4,druidText,druidImg);
        fighter = new InGameClass("Fighter",5,fighterText,fighterImg);
        monk  = new InGameClass("Monk",6,monkText,monkImg);
        paladin = new InGameClass("Paladin",7,paladinText,paladinImg);
        ranger  = new InGameClass("Ranger",8,rangerText,rangerImg);
        rogue = new InGameClass("Rogue",9,rogueText,rogueImg);
        sorceror = new InGameClass("Sorceror",10,sorcerorText,sorcerorImg);
        wizard = new InGameClass("Wizard",11,wizardText,wizardImg);
        alchemist = new InGameClass("Alchemist",12,alchemistText,alchemistImg);
        cavalier = new InGameClass("Cavalier",13,cavalierText,cavalierImg);
        inquisitor = new InGameClass("Inquisitor",14,inquisitorText,inquisitorImg);
        gunslinger = new InGameClass("Gunslinger",15,gunslingerText,gunslingerImg);
        magus = new InGameClass("Magus",16,magusText,magusImg);
        oracle = new InGameClass("Oracle",17,oracleText,oracleImg);
        summoner = new InGameClass("Summoner",18,summonerText,summonerImg);
        witch = new InGameClass("Witch",19,witchText,witchImg);        
    }
    
    public InGameClass getSelectedClass(int classChosen)
    {
        int selector = classChosen;
        switch (selector)
        {
            case 1: return barbarian;
            case 2: return bard;
            case 3: return cleric;
            case 4: return druid;
            case 5: return fighter;
            case 6: return monk;
            case 7: return paladin;
            case 8: return ranger;
            case 9: return rogue;
            case 10: return sorceror;
            case 11: return wizard;
            case 12: return alchemist;
            case 13: return cavalier;
            case 14: return inquisitor;
            case 15: return gunslinger;
            case 16: return magus;
            case 17: return oracle;
            case 18: return summoner;
            case 19: return witch;  
            default: return null;
        }
            
    }
    
    public Image getAlchemist() {
        return alchemistImg;
    }

    /**
     * @param alchemist the alchemistImg to set
     */
    public void setAlchemist(Image alchemist) {
        this.alchemistImg = alchemist;
    }

    /**
     * @return the bardImg
     */
    public Image getBard() {
        return bardImg;
    }

    /**
     * @param bard the bardImg to set
     */
    public void setBard(Image bard) {
        this.bardImg = bard;
    }

    /**
     * @return the barbarianImg
     */
    public Image getBarbarian() {
        return barbarianImg;
    }

    /**
     * @param barbarian the barbarianImg to set
     */
    public void setBarbarian(Image barbarian) {
        this.barbarianImg = barbarian;
    }

    /**
     * @return the cavalierImg
     */
    public Image getCavalier() {
        return cavalierImg;
    }

    /**
     * @param cavalier the cavalierImg to set
     */
    public void setCavalier(Image cavalier) {
        this.cavalierImg = cavalier;
    }

    /**
     * @return the clericImg
     */
    public Image getCleric() {
        return clericImg;
    }

    /**
     * @param cleric the clericImg to set
     */
    public void setCleric(Image cleric) {
        this.clericImg = cleric;
    }

    /**
     * @return the druidImg
     */
    public Image getDruid() {
        return druidImg;
    }

    /**
     * @param druid the druidImg to set
     */
    public void setDruid(Image druid) {
        this.druidImg = druid;
    }

    /**
     * @return the fighterImg
     */
    public Image getFighter() {
        return fighterImg;
    }

    /**
     * @param fighter the fighterImg to set
     */
    public void setFighter(Image fighter) {
        this.fighterImg = fighter;
    }

    /**
     * @return the gunslingerImg
     */
    public Image getGunslinger() {
        return gunslingerImg;
    }

    /**
     * @param gunslinger the gunslingerImg to set
     */
    public void setGunslinger(Image gunslinger) {
        this.gunslingerImg = gunslinger;
    }

    /**
     * @return the inquisitorImg
     */
    public Image getInquisitor() {
        return inquisitorImg;
    }

    /**
     * @param inquisitor the inquisitorImg to set
     */
    public void setInquisitor(Image inquisitor) {
        this.inquisitorImg = inquisitor;
    }

    /**
     * @return the magusImg
     */
    public Image getMagus() {
        return magusImg;
    }

    /**
     * @param magus the magusImg to set
     */
    public void setMagus(Image magus) {
        this.magusImg = magus;
    }

    /**
     * @return the monkImg
     */
    public Image getMonk() {
        return monkImg;
    }

    /**
     * @param monk the monkImg to set
     */
    public void setMonk(Image monk) {
        this.monkImg = monk;
    }

    /**
     * @return the oracleImg
     */
    public Image getOracle() {
        return oracleImg;
    }

    /**
     * @param oracle the oracleImg to set
     */
    public void setOracle(Image oracle) {
        this.oracleImg = oracle;
    }

    /**
     * @return the paladinImg
     */
    public Image getPaladin() {
        return paladinImg;
    }

    /**
     * @param paladin the paladinImg to set
     */
    public void setPaladin(Image paladin) {
        this.paladinImg = paladin;
    }

    /**
     * @return the rangerImg
     */
    public Image getRanger() {
        return rangerImg;
    }

    /**
     * @param ranger the rangerImg to set
     */
    public void setRanger(Image ranger) {
        this.rangerImg = ranger;
    }

    /**
     * @return the rogueImg
     */
    public Image getRogue() {
        return rogueImg;
    }

    /**
     * @param rogue the rogueImg to set
     */
    public void setRogue(Image rogue) {
        this.rogueImg = rogue;
    }

    /**
     * @return the sorcerorImg
     */
    public Image getSorceror() {
        return sorcerorImg;
    }

    /**
     * @param sorceror the sorcerorImg to set
     */
    public void setSorceror(Image sorceror) {
        this.sorcerorImg = sorceror;
    }

    /**
     * @return the summonerImg
     */
    public Image getSummoner() {
        return summonerImg;
    }

    /**
     * @param summoner the summonerImg to set
     */
    public void setSummoner(Image summoner) {
        this.summonerImg = summoner;
    }

    /**
     * @return the witchImg
     */
    public Image getWitch() {
        return witchImg;
    }

    /**
     * @param witch the witchImg to set
     */
    public void setWitch(Image witch) {
        this.witchImg = witch;
    }

    /**
     * @return the wizardImg
     */
    public Image getWizard() {
        return wizardImg;
    }

    /**
     * @param wizard the wizardImg to set
     */
    public void setWizard(Image wizard) {
        this.wizardImg = wizard;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the classID
     */
    public int getClassID() {
        return classID;
    }

    /**
     * @param classID the classID to set
     */
    public void setClassID(int classID) {
        this.classID = classID;
    }

    /**
     * @return the trainedSkills
     */
    public Skill getTrainedSkills() {
        return trainedSkills;
    }

    /**
     * @param trainedSkills the trainedSkills to set
     */
    public void setTrainedSkills(Skill trainedSkills) {
        this.trainedSkills = trainedSkills;
    }

    /**
     * @return the hitDie
     */
    public Dice getHitDie() {
        return hitDie;
    }

    /**
     * @param hitDie the hitDie to set
     */
    public void setHitDie(Dice hitDie) {
        this.hitDie = hitDie;
    }

    /**
     * @return the alchemistText
     */
    public String getAlchemistText() {
        return alchemistText;
    }

    /**
     * @param alchemistText the alchemistText to set
     */
    public void setAlchemistText(String alchemistText) {
        this.alchemistText = alchemistText;
    }

    /**
     * @return the barbarianText
     */
    public String getBarbarianText() {
        return barbarianText;
    }

    /**
     * @param barbarianText the barbarianText to set
     */
    public void setBarbarianText(String barbarianText) {
        this.barbarianText = barbarianText;
    }

    /**
     * @return the bardText
     */
    public String getBardText() {
        return bardText;
    }

    /**
     * @param bardText the bardText to set
     */
    public void setBardText(String bardText) {
        this.bardText = bardText;
    }

    /**
     * @return the cavalierText
     */
    public String getCavalierText() {
        return cavalierText;
    }

    /**
     * @param cavalierText the cavalierText to set
     */
    public void setCavalierText(String cavalierText) {
        this.cavalierText = cavalierText;
    }

    /**
     * @return the clericText
     */
    public String getClericText() {
        return clericText;
    }

    /**
     * @param clericText the clericText to set
     */
    public void setClericText(String clericText) {
        this.clericText = clericText;
    }

    /**
     * @return the druidText
     */
    public String getDruidText() {
        return druidText;
    }

    /**
     * @param druidText the druidText to set
     */
    public void setDruidText(String druidText) {
        this.druidText = druidText;
    }

    /**
     * @return the fighterText
     */
    public String getFighterText() {
        return fighterText;
    }

    /**
     * @param fighterText the fighterText to set
     */
    public void setFighterText(String fighterText) {
        this.fighterText = fighterText;
    }

    /**
     * @return the gunslingerText
     */
    public String getGunslingerText() {
        return gunslingerText;
    }

    /**
     * @param gunslingerText the gunslingerText to set
     */
    public void setGunslingerText(String gunslingerText) {
        this.gunslingerText = gunslingerText;
    }

    /**
     * @return the inquisitorText
     */
    public String getInquisitorText() {
        return inquisitorText;
    }

    /**
     * @param inquisitorText the inquisitorText to set
     */
    public void setInquisitorText(String inquisitorText) {
        this.inquisitorText = inquisitorText;
    }

    /**
     * @return the magusText
     */
    public String getMagusText() {
        return magusText;
    }

    /**
     * @param magusText the magusText to set
     */
    public void setMagusText(String magusText) {
        this.magusText = magusText;
    }

    /**
     * @return the monkText
     */
    public String getMonkText() {
        return monkText;
    }

    /**
     * @param monkText the monkText to set
     */
    public void setMonkText(String monkText) {
        this.monkText = monkText;
    }

    /**
     * @return the oracleText
     */
    public String getOracleText() {
        return oracleText;
    }

    /**
     * @param oracleText the oracleText to set
     */
    public void setOracleText(String oracleText) {
        this.oracleText = oracleText;
    }

    /**
     * @return the paladinText
     */
    public String getPaladinText() {
        return paladinText;
    }

    /**
     * @param paladinText the paladinText to set
     */
    public void setPaladinText(String paladinText) {
        this.paladinText = paladinText;
    }

    /**
     * @return the rangerText
     */
    public String getRangerText() {
        return rangerText;
    }

    /**
     * @param rangerText the rangerText to set
     */
    public void setRangerText(String rangerText) {
        this.rangerText = rangerText;
    }

    /**
     * @return the rogueText
     */
    public String getRogueText() {
        return rogueText;
    }

    /**
     * @param rogueText the rogueText to set
     */
    public void setRogueText(String rogueText) {
        this.rogueText = rogueText;
    }

    /**
     * @return the sorcerorText
     */
    public String getSorcerorText() {
        return sorcerorText;
    }

    /**
     * @param sorcerorText the sorcerorText to set
     */
    public void setSorcerorText(String sorcerorText) {
        this.sorcerorText = sorcerorText;
    }

    /**
     * @return the summonerText
     */
    public String getSummonerText() {
        return summonerText;
    }

    /**
     * @param summonerText the summonerText to set
     */
    public void setSummonerText(String summonerText) {
        this.summonerText = summonerText;
    }

    /**
     * @return the wizardText
     */
    public String getWizardText() {
        return wizardText;
    }

    /**
     * @param wizardText the wizardText to set
     */
    public void setWizardText(String wizardText) {
        this.wizardText = wizardText;
    }

    /**
     * @return the witchText
     */
    public String getWitchText() {
        return witchText;
    }

    /**
     * @param witchText the witchText to set
     */
    public void setWitchText(String witchText) {
        this.witchText = witchText;
    }
 }
    

