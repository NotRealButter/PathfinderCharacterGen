package pathfindercharactergenerator;

/**
 *
 * @author Stephen Hite
 */
public class AbilityScore 
{
    private String name;
    private int value =0;
    
    AbilityScore()
    {
        
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getValue() 
    {
        return value;
    }

    public void setValue(int value) 
    {
        this.value = value;
    }
    
}
