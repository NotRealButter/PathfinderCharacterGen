package pathfindercharactergenerator;

public class Character
{
    private String name;
    private int health;
    private InGameClass class1;
    private InGameClass class2;
    private int age;
    private String gender;
    private String alignment;
    private Race race;
    private int height;
    private int weight;
    private Feat feat;
    private AbilityScore strVal;
    private AbilityScore dexVal;
    private AbilityScore conVal;
    private AbilityScore wisVal;
    private AbilityScore chaVal;
    private AbilityScore intVal;
    private SkillSet skillSet;
    private int armorClass;
    private int touchArmorClass;
    private int flatArmorClass;
    private int initiative;
    private BaseAttackBonus bab1;
    private BaseAttackBonus bab2;
    private BaseAttackBonus bab3;
    private int speed;
    private SavingThrow willSave;
    private SavingThrow fortSave;
    private SavingThrow refSave;
    
    Character normalDefault,defBard,defBarbarian,defFighter,defRogue,defWizard,defSorceror,defPaladin, defRanger;
    
    Character (String name,int health,InGameClass firstClass, String gender, String alignment, Race race, int height, int weight)
    {
        this.name = name;
        this.health=health;
        this.class1=firstClass;
        this.gender = gender;
        this.alignment=alignment;
        this.race=race;
        this.height=height;
        this.weight=weight;    
        strVal = new AbilityScore();
        dexVal = new AbilityScore();
        conVal = new AbilityScore();
        wisVal = new AbilityScore();
        chaVal = new AbilityScore();
        intVal = new AbilityScore();
    }

    
    public void initDefaultChar()
    {
        normalDefault = new Character("Bland Blanderson",12,class1.fighter,"Male","Lawful Neutral", race.getHuman(),72,180);
        defBard = new Character("Elsbeth Tamarie", 9, class1.bard,"Female","True Neutral", race.getHalfElf(),75,100);      
        defBarbarian = new Character("Tsadok of Grthor", 14, class1.barbarian, "Male","Chaotic Neutral", race.getHalfOrc(),82,220);
        defFighter = new Character("Lothar Stormfury",14,class1.fighter,"Male","Lawful Neutral", race.getHuman(),72,180);
        defRogue = new Character("Tristana Yamyrin", 8,class1.rogue,"Female","Chaotic Neutral", race.getHalfling(), 42, 75);
        defWizard = new Character("Balor the Red", 10, class1.wizard,"Male","Neutral Good", race.getHuman(),65,140);
        defSorceror = new Character("Kaszagal Whiteclaw",10,class1.sorceror,"Female","Chaotic Evil", race.getDwarf(),45,145);
        defPaladin = new Character("Iacobus Silverheart", 12,class1.paladin,"Male","Lawful Good", race.getHuman(),72,170);
        defRanger = new Character("Eledin Theoren", 12,class1.ranger,"Female","Chaotic Good", race.getElf(),75,140);
    }
     /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the class1
     */
    public InGameClass getClass1() {
        return class1;
    }

    /**
     * @param class1 the class1 to set
     */
    public void setClass1(InGameClass class1) {
        this.class1 = class1;
    }

    /**
     * @return the class2
     */
    public InGameClass getClass2() {
        return class2;
    }

    /**
     * @param class2 the class2 to set
     */
    public void setClass2(InGameClass class2) {
        this.class2 = class2;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the alignment
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * @param alignment the alignment to set
     */
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * @return the race
     */
    public Race getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(Race race) {
        this.race = race;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the feat
     */
    public Feat getFeat() {
        return feat;
    }

    /**
     * @param feat the feat to set
     */
    public void setFeat(Feat feat) {
        this.feat = feat;
    }

    /**
     * @return the strVal
     */
    public AbilityScore getStrVal() {
        return strVal;
    }

    /**
     * @param strVal the strVal to set
     */
    public void setStrVal(AbilityScore strVal) {
        this.strVal = strVal;
    }

    /**
     * @return the dexVal
     */
    public AbilityScore getDexVal() {
        return dexVal;
    }

    /**
     * @param dexVal the dexVal to set
     */
    public void setDexVal(AbilityScore dexVal) {
        this.dexVal = dexVal;
    }

    /**
     * @return the conVal
     */
    public AbilityScore getConVal() {
        return conVal;
    }

    /**
     * @param conVal the conVal to set
     */
    public void setConVal(AbilityScore conVal) {
        this.conVal = conVal;
    }

    /**
     * @return the wisVal
     */
    public AbilityScore getWisVal() {
        return wisVal;
    }

    /**
     * @param wisVal the wisVal to set
     */
    public void setWisVal(AbilityScore wisVal) {
        this.wisVal = wisVal;
    }

    /**
     * @return the chaVal
     */
    public AbilityScore getChaVal() {
        return chaVal;
    }

    /**
     * @param chaVal the chaVal to set
     */
    public void setChaVal(AbilityScore chaVal) {
        this.chaVal = chaVal;
    }

    /**
     * @return the intVal
     */
    public AbilityScore getIntVal() {
        return intVal;
    }

    /**
     * @param intVal the intVal to set
     */
    public void setIntVal(AbilityScore intVal) {
        this.intVal = intVal;
    }

    /**
     * @return the skillSet
     */
    public SkillSet getSkillSet() {
        return skillSet;
    }

    /**
     * @param skillSet the skillSet to set
     */
    public void setSkillSet(SkillSet skillSet) {
        this.skillSet = skillSet;
    }

    /**
     * @return the armorClass
     */
    public int getArmorClass() {
        return armorClass;
    }

    /**
     * @param armorClass the armorClass to set
     */
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    /**
     * @return the touchArmorClass
     */
    public int getTouchArmorClass() {
        return touchArmorClass;
    }

    /**
     * @param touchArmorClass the touchArmorClass to set
     */
    public void setTouchArmorClass(int touchArmorClass) {
        this.touchArmorClass = touchArmorClass;
    }

    /**
     * @return the flatArmorClass
     */
    public int getFlatArmorClass() {
        return flatArmorClass;
    }

    /**
     * @param flatArmorClass the flatArmorClass to set
     */
    public void setFlatArmorClass(int flatArmorClass) {
        this.flatArmorClass = flatArmorClass;
    }

    /**
     * @return the initiative
     */
    public int getInitiative() {
        return initiative;
    }

    /**
     * @param initiative the initiative to set
     */
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    /**
     * @return the bab1
     */
    public BaseAttackBonus getBab1() {
        return bab1;
    }

    /**
     * @param bab1 the bab1 to set
     */
    public void setBab1(BaseAttackBonus bab1) {
        this.bab1 = bab1;
    }

    /**
     * @return the bab2
     */
    public BaseAttackBonus getBab2() {
        return bab2;
    }

    /**
     * @param bab2 the bab2 to set
     */
    public void setBab2(BaseAttackBonus bab2) {
        this.bab2 = bab2;
    }

    /**
     * @return the bab3
     */
    public BaseAttackBonus getBab3() {
        return bab3;
    }

    /**
     * @param bab3 the bab3 to set
     */
    public void setBab3(BaseAttackBonus bab3) {
        this.bab3 = bab3;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the willSave
     */
    public SavingThrow getWillSave() {
        return willSave;
    }

    /**
     * @param willSave the willSave to set
     */
    public void setWillSave(SavingThrow willSave) {
        this.willSave = willSave;
    }

    /**
     * @return the fortSave
     */
    public SavingThrow getFortSave() {
        return fortSave;
    }

    /**
     * @param fortSave the fortSave to set
     */
    public void setFortSave(SavingThrow fortSave) {
        this.fortSave = fortSave;
    }

    /**
     * @return the refSave
     */
    public SavingThrow getRefSave() {
        return refSave;
    }

    /**
     * @param refSave the refSave to set
     */
    public void setRefSave(SavingThrow refSave) {
        this.refSave = refSave;
    }
}