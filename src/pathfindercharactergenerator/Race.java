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
        
    private String name;
    private String humanText;
    private String halfElfText;
    private String halfOrcText;
    private String halflingText;
    private String gnomeText;
    private String elfText;
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
        setHumanText("Humans possess exceptional drive and a great capacity to endure and expand, and as such are currently the dominant race in the world. Their empires and nations are vast, sprawling things, and the citizens of these societies carve names for themselves with the strength of their sword arms and the power of their spells. Humanity is best characterized by its tumultuousness and diversity, and human cultures run the gamut from savage but honorable tribes to decadent, devil-worshiping noble families in the most cosmopolitan cities. Humans' curiosity and ambition often triumph over their predilection for a sedentary lifestyle, and many leave their homes to explore the innumerable forgotten corners of the world or lead mighty armies to conquer their neighbors, simply because they can.");
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

}