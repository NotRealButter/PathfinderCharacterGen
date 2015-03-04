package pathfindercharactergenerator;

import java.awt.*;

/**
 *
 * @author Stephen Hite
 */
public class Race 
{
    private Image humanImg = Toolkit.getDefaultToolkit().getImage("images/races/human.png");
    private Image gnomeImg = Toolkit.getDefaultToolkit().getImage("images/races/gnome.png");
    private Image halflingImg = Toolkit.getDefaultToolkit().getImage("images/races/halfling.png");
    private Image halfOrcImg = Toolkit.getDefaultToolkit().getImage("images/races/halforc.png");
    private Image halfElfImg = Toolkit.getDefaultToolkit().getImage("images/races/halfelf.png");
    private Image elfImg = Toolkit.getDefaultToolkit().getImage("images/races/elf.png");
    private Image dwarfImg = Toolkit.getDefaultToolkit().getImage("images/races/dwarf.png");
        
    String name;
    String humanText;
    String halfElfText;
    String halfOrcText;
    String halflingText;
    String gnomeText;
    String elfText;
    private String dwarfText;
    private int raceID;
    private int strMod;
    private int dexMod;
    private int conMod;
    private int wisMod;
    private int chaMod;
    private int intMod;
    private Race dwarf;
    private Race elf;
    private Race gnome;
    private Race halfElf;
    private Race halfOrc;
    private Race halfling;
    private Race human;
    InGameClass recommendedClass;
    
    
    
    Race(String name, int raceID,int strMod,int dexMod,int conMod, int wisMod, int chaMod, int intMod)
    {
//        initRaces();
        initRaceStrings();
        this.name = name;
        this.raceID = raceID;
        this.strMod = strMod;
        this.dexMod = dexMod;
        this.conMod = conMod;
        this.intMod = intMod;
    }
    public void initRaces()
    {
        setDwarf(new Race("dwarf", 1, 0,0,2,2,-2,0));
        setElf(new Race("elf",2,0,2,-2,0,0,2));
        setGnome(new Race ("gnome",3,-2,0,2,0,2,0));
        setHalfElf(new Race ("half-elf",4,0,0,0,0,0,0));
        setHalfOrc(new Race ("half-Orc",5,0,0,0,0,0,0));
        setHalfling(new Race ("half-Orc", 6, -2,2,0,0,2,0));
        setHuman(new Race("human", 7,0,0,0,0,0,0));
    }
    public void initRaceStrings()
    {
        setHumanText("Humans\n\n"+"  Humans possess exceptional drive and a great capacity to endure and expand, and as such are currently the dominant race in the world. Their empires and nations are vast, sprawling things, and the citizens of these societies carve names for themselves with the strength of their sword arms and the power of their spells. Humanity is best characterized by its tumultuousness and diversity, and human cultures run the gamut from savage but honorable tribes to decadent, devil-worshiping noble families in the most cosmopolitan cities. Humans' curiosity and ambition often triumph over their predilection for a sedentary lifestyle, and many leave their homes to explore the innumerable forgotten corners of the world or lead mighty armies to conquer their neighbors, simply because they can.");
        setElfText("Elves \n\n "+"The long-lived elves are children of the natural world, similar in many superficial ways to fey creatures, though with key differences. While fey are truly linked to the flora and fauna of their homes, existing as the nearly immortal voices and guardians of the wilderness, elves are instead mortals who are in tune with the natural world around them. Elves seek to live in balance with the wild and understand it better than most other mortals. Some of this understanding is mystical, but an equal part comes from the elves' long lifespans, which in turn gives them long-ranging outlooks. Elves can expect to remain active in the same locale for centuries. By necessity, they must learn to maintain sustainable lifestyles, and this is most easily done when they work with nature, rather than attempting to bend it to their will. However, their links to nature are not entirely driven by pragmatism. Elves' bodies slowly change over time, taking on a physical representation of their mental and spiritual states, and those who dwell in a region for a long period of time find themselves physically adapting to match their surroundings, most noticeably taking on coloration that reflects the local environment.");
        setGnomeText("Gnomes\n\n"+"Gnomes are distant relatives of the fey, and their history tells of a time when they lived in the fey's mysterious realm, a place where colors are brighter, the wildlands wilder, and emotions more primal. Unknown forces drove the ancient gnomes from that realm long ago, forcing them to seek refuge in this world; despite this, the gnomes have never completely abandoned their fey roots or adapted to mortal culture. Though gnomes are no longer truly fey, their fey heritage can be seen in their innate magic powers, their oft-capricious natures, and their outlooks on life and the world.\n" +
"\n" +
"Gnomes can have the same concerns and motivations as members of other races, but just as often they are driven by passions and desires that non-gnomes see as eccentric at best, and nonsensical at worst. A gnome may risk his life to taste the food at a giant's table, to reach the bottom of a pit just because it would be the lowest place he's ever been, or to tell jokes to a dragon—and to the gnome those goals are as worthy as researching a new spell, gaining vast wealth, or putting down a powerful evil force. While such apparently fickle and impulsive acts are not universal among gnomes, they are common enough for the race as a whole to have earned a reputation for being impetuous and at least a little mad.\n" +
"\n" +
"Combined with their diminutive sizes, vibrant coloration, and lack of concern for the opinions of others, these attitudes have caused gnomes to be widely regarded by the other races as alien and strange. Gnomes, in turn, are often amazed how alike other common, civilized races are. It seems stranger to a gnome that humans and elves share so many similarities than that the gnomes do not. Indeed, gnomes often confound their allies by treating everyone who is not a gnome as part of a single, vast non-gnome collective race.");
        setHalfElfText("Half-Elves \n\n" + "Elves have long drawn the covetous gazes of other races. Their generous lifespans, magical affinity, and inherent grace each contribute to the admiration or bitter envy of their neighbors. Of all their traits, however, none so entrance their human associates as their beauty. Since the two races first came into contact with each other, humans have held up elves as models of physical perfection, seeing in these fair folk idealized versions of themselves. For their part, many elves find humans attractive despite their comparatively barbaric ways, and are drawn to the passion and impetuosity with which members of the younger race play out their brief lives. Sometimes this mutual infatuation leads to romantic relationships. Though usually short-lived, even by human standards, such trysts may lead to the birth of half-elves, a race descended from two cultures yet inheritor of neither. Half-elves can breed with one another, but even these “pureblood” half-elves tend to be viewed as bastards by humans and elves alike. Caught between destiny and derision, half-elves often view themselves as the middle children of the world.");
        setHalfOrcText("Half-Orcs \n\n" + "As seen by civilized races, half-orcs are monstrosities, the result of perversion and violence—whether or not this is actually true. Half-orcs are rarely the result of loving unions, and as such are usually forced to grow up hard and fast, constantly fighting for protection or to make names for themselves. Half-orcs as a whole resent this treatment, and rather than play the part of the victim, they tend to lash out, unknowingly confirming the biases of those around them. A few feared, distrusted, and spat-upon half-orcs manage to surprise their detractors with great deeds and unexpected wisdom—though sometimes it's easier just to crack a few skulls. Some half-orcs spend their entire lives proving to full-blooded orcs that they are just as fierce. Others opt for trying to blend into human society, constantly demonstrating that they aren't monsters. Their need to always prove themselves worthy encourages half-orcs to strive for power and greatness within the society around them.");
        setHalflingText("Halflings \n\n Optimistic and cheerful by nature, blessed with uncanny luck, and driven by a powerful wanderlust, halflings make up for their short stature with an abundance of bravado and curiosity. At once excitable and easy-going, halflings like to keep an even temper and a steady eye on opportunity, and are not as prone to violent or emotional outbursts as some of the more volatile races. Even in the jaws of catastrophe, halflings almost never lose their sense of humor. Their ability to find humor in the absurd, no matter how dire the situation, often allows halflings to distance themselves ever so slightly from the dangers that surround them. This sense of detachment can also help shield them from terrors that might immobilize their allies.\n" +
"\n" +
"Halflings are inveterate opportunists. They firmly believe they can turn any situation to their advantage, and sometimes gleefully leap into trouble without any solid plan to extricate themselves if things go awry. Often unable to physically defend themselves from the rigors of the world, they know when to bend with the wind and when to hide away. Yet halflings' curiosity often overwhelms their good sense, leading to poor decisions and narrow escapes. While harsh experience sometimes teaches halflings a measure of caution, it rarely makes them completely lose faith in their luck or stop believing that the universe, in some strange way, exists for their entertainment and would never really allow them to come to harm. Though their curiosity drives them to seek out new places and experiences, halflings possess a strong sense of hearth and home, often spending above their means to enhance the comforts of domestic life. Without a doubt, halflings enjoy luxury and comfort, but they have equally strong reasons to make their homes a showcase. Halflings consider this urge to devote time, money, and energy toward improving their dwellings a sign of both respect for strangers and affection for their loved ones. Whether for their own blood kin, cherished friends, or honored guests, halflings make their homes beautiful in order to express their feelings toward those they welcome inside. Even traveling halflings typically decorate their wagons or carry a few cherished keepsakes to adorn their campsites.");
        setDwarfText("Dwarves \n\n Dwarves are a stoic but stern race, ensconced in cities carved from the hearts of mountains and fiercely determined to repel the depredations of savage races like orcs and goblins. More than any other race, dwarves have acquired a reputation as dour and humorless artisans of the earth. It could be said that their history shapes the dark disposition of many dwarves, for they reside in high mountains and dangerous realms below the earth, constantly at war with giants, goblins, and other such horrors.\n" +
"\n" +
"Dwarves are lovers of history and tradition, and their long lifespan leads to far less in the way of generational shifts in attitudes, styles, fashions, and trends than shorter-lived races exhibit. If a thing is not broken, they do not fix it or change it; and if it is broken, they fix it rather than replace it. Thrifty as a rule, dwarves are loath to discard anything unless it is truly ruined and unable to be fixed. At the same time, dwarves' meticulous, near-obsessive attention to detail and durability in their craftsmanship makes that a rare occurrence, as the things they make are built to last. As a result, buildings, artwork, tools, housewares, garments, weapons, and virtually everything else made by dwarves still sees regular use at an age when such items would be relegated to museum pieces, dusty antique shelves, or junkyard fodder by other races. Taken together, these traits create the impression that dwarves are a race frozen in time.\n" +
"\n" );
    }
    
        public Race getSelectedClass(int raceChosen)
    {
        int selector = raceChosen;
        switch (selector)
        {
            case 1: return human;
            case 2: return elf;
            case 3: return dwarf;
            case 4: return halfling;
            case 5: return halfElf;
            case 6: return halfOrc;
            case 7: return gnome;
           default: return null;
        }
            
    }

    /**
     * @return the humanImg
     */
    public Image getHumanImg() {
        return humanImg;
    }

    /**
     * @param humanImg the humanImg to set
     */
    public void setHumanImg(Image humanImg) {
        this.humanImg = humanImg;
    }

    /**
     * @return the gnomeImg
     */
    public Image getGnomeImg() {
        return gnomeImg;
    }

    /**
     * @param gnomeImg the gnomeImg to set
     */
    public void setGnomeImg(Image gnomeImg) {
        this.gnomeImg = gnomeImg;
    }

    /**
     * @return the halflingImg
     */
    public Image getHalflingImg() {
        return halflingImg;
    }

    /**
     * @param halflingImg the halflingImg to set
     */
    public void setHalflingImg(Image halflingImg) {
        this.halflingImg = halflingImg;
    }

    /**
     * @return the halfOrcImg
     */
    public Image getHalfOrcImg() {
        return halfOrcImg;
    }

    /**
     * @param halfOrcImg the halfOrcImg to set
     */
    public void setHalfOrcImg(Image halfOrcImg) {
        this.halfOrcImg = halfOrcImg;
    }

    /**
     * @return the halfElfImg
     */
    public Image getHalfElfImg() {
        return halfElfImg;
    }

    /**
     * @param halfElfImg the halfElfImg to set
     */
    public void setHalfElfImg(Image halfElfImg) {
        this.halfElfImg = halfElfImg;
    }

    /**
     * @return the elfImg
     */
    public Image getElfImg() {
        return elfImg;
    }

    /**
     * @param elfImg the elfImg to set
     */
    public void setElfImg(Image elfImg) {
        this.elfImg = elfImg;
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
     * @return the humanText
     */
    public String getHumanText() {
        return humanText;
    }

    /**
     * @param humanText the humanText to set
     */
    public void setHumanText(String humanText) {
        this.humanText = humanText;
    }

    /**
     * @return the halfElfText
     */
    public String getHalfElfText() {
        return halfElfText;
    }

    /**
     * @param halfElfText the halfElfText to set
     */
    public void setHalfElfText(String halfElfText) {
        this.halfElfText = halfElfText;
    }

    /**
     * @return the halfOrcText
     */
    public String getHalfOrcText() {
        return halfOrcText;
    }

    /**
     * @param halfOrcText the halfOrcText to set
     */
    public void setHalfOrcText(String halfOrcText) {
        this.halfOrcText = halfOrcText;
    }

    /**
     * @return the halflingText
     */
    public String getHalflingText() {
        return halflingText;
    }

    /**
     * @param halflingText the halflingText to set
     */
    public void setHalflingText(String halflingText) {
        this.halflingText = halflingText;
    }

    /**
     * @return the gnomeText
     */
    public String getGnomeText() {
        return gnomeText;
    }

    /**
     * @param gnomeText the gnomeText to set
     */
    public void setGnomeText(String gnomeText) {
        this.gnomeText = gnomeText;
    }

    /**
     * @return the elfText
     */
    public String getElfText() {
        return elfText;
    }

    /**
     * @param elfText the elfText to set
     */
    public void setElfText(String elfText) {
        this.elfText = elfText;
    }

    /**
     * @return the raceID
     */
    public int getRaceID() {
        return raceID;
    }

    /**
     * @param raceID the raceID to set
     */
    public void setRaceID(int raceID) {
        this.raceID = raceID;
    }

    /**
     * @return the strMod
     */
    public int getStrMod() {
        return strMod;
    }

    /**
     * @param strMod the strMod to set
     */
    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }

    /**
     * @return the dexMod
     */
    public int getDexMod() {
        return dexMod;
    }

    /**
     * @param dexMod the dexMod to set
     */
    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }

    /**
     * @return the conMod
     */
    public int getConMod() {
        return conMod;
    }

    /**
     * @param conMod the conMod to set
     */
    public void setConMod(int conMod) {
        this.conMod = conMod;
    }

    /**
     * @return the wisMod
     */
    public int getWisMod() {
        return wisMod;
    }

    /**
     * @param wisMod the wisMod to set
     */
    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }

    /**
     * @return the chaMod
     */
    public int getChaMod() {
        return chaMod;
    }

    /**
     * @param chaMod the chaMod to set
     */
    public void setChaMod(int chaMod) {
        this.chaMod = chaMod;
    }

    /**
     * @return the intMod
     */
    public int getIntMod() {
        return intMod;
    }

    /**
     * @param intMod the intMod to set
     */
    public void setIntMod(int intMod) {
        this.intMod = intMod;
    }

    /**
     * @return the dwarf
     */
    public Race getDwarf() {
        return dwarf;
    }

    /**
     * @param dwarf the dwarf to set
     */
    public void setDwarf(Race dwarf) {
        this.dwarf = dwarf;
    }

    /**
     * @return the elf
     */
    public Race getElf() {
        return elf;
    }

    /**
     * @param elf the elf to set
     */
    public void setElf(Race elf) {
        this.elf = elf;
    }

    /**
     * @return the gnome
     */
    public Race getGnome() {
        return gnome;
    }

    /**
     * @param gnome the gnome to set
     */
    public void setGnome(Race gnome) {
        this.gnome = gnome;
    }

    /**
     * @return the halfElf
     */
    public Race getHalfElf() {
        return halfElf;
    }

    /**
     * @param halfElf the halfElf to set
     */
    public void setHalfElf(Race halfElf) {
        this.halfElf = halfElf;
    }

    /**
     * @return the halfOrc
     */
    public Race getHalfOrc() {
        return halfOrc;
    }

    /**
     * @param halfOrc the halfOrc to set
     */
    public void setHalfOrc(Race halfOrc) {
        this.halfOrc = halfOrc;
    }

    /**
     * @return the halfling
     */
    public Race getHalfling() {
        return halfling;
    }

    /**
     * @param halfling the halfling to set
     */
    public void setHalfling(Race halfling) {
        this.halfling = halfling;
    }

    /**
     * @return the human
     */
    public Race getHuman() {
        return human;
    }

    /**
     * @param human the human to set
     */
    public void setHuman(Race human) {
        this.human = human;
    }

    /**
     * @return the dwarfImg
     */
    public Image getDwarfImg() {
        return dwarfImg;
    }

    /**
     * @param dwarfImg the dwarfImg to set
     */
    public void setDwarfImg(Image dwarfImg) {
        this.dwarfImg = dwarfImg;
    }

    /**
     * @return the dwarfText
     */
    public String getDwarfText() {
        return dwarfText;
    }

    /**
     * @param dwarfText the dwarfText to set
     */
    public void setDwarfText(String dwarfText) {
        this.dwarfText = dwarfText;
    }

}