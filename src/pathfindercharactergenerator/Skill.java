package pathfindercharactergenerator;

public class Skill
{
    String name;
    private int skillID;
    private int value;
    private int abilityModifer;
    private Boolean trained;
    
    Skill(String name, int skillID)
    {
        
    }

    /**
     * @return the skillID
     */
    public int getSkillID() {
        return skillID;
    }

    /**
     * @param skillID the skillID to set
     */
    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the abilityModifer
     */
    public int getAbilityModifer() {
        return abilityModifer;
    }

    /**
     * @param abilityModifer the abilityModifer to set
     */
    public void setAbilityModifer(int abilityModifer) {
        this.abilityModifer = abilityModifer;
    }

    /**
     * @return the trained
     */
    public Boolean getTrained() {
        return trained;
    }

    /**
     * @param trained the trained to set
     */
    public void setTrained(Boolean trained) {
        this.trained = trained;
    }
    }
