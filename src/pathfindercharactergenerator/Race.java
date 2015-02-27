package pathfindercharactergenerator;

/**
 *
 * @author Stephen Hite
 */
public class Race 
{
    String name;
    int raceID;
    int strMod;
    int dexMod;
    int conMod;
    int wisMod;
    int chaMod;
    int intMod;
    Race dwarf,elf,gnome,halfElf,halfOrc,halfling,human;
    InGameClass recommendedClass;
    
    Race(String name, int raceID,int strMod,int dexMod,int conMod, int wisMod, int chaMod, int intMod)
    {
        initRaces();
        this.name = name;
        this.raceID = raceID;
        this.strMod = strMod;
        this.dexMod = dexMod;
        this.conMod = conMod;
        this.intMod = intMod;
    }
    
    public void initRaces()
    {
        dwarf = new Race("dwarf", 1, 0,0,2,2,-2,0);
        elf = new Race("elf",2,0,2,-2,0,0,2);
        gnome = new Race ("gnome",3,-2,0,2,0,2,0);
        halfElf = new Race ("half-elf",4,0,0,0,0,0,0);
        halfOrc = new Race ("half-Orc",5,0,0,0,0,0,0);
        halfling = new Race ("half-Orc", 6, -2,2,0,0,2,0);
        human = new Race("human", 7,0,0,0,0,0,0);
    }
}
