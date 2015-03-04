package pathfindercharactergenerator;

/**
 *
 * @author Stephen Hite
 */
public class Dice
{
    String name;
    int numOfSides;
    int diceValue;
    
    Dice()
    {
        
    }
    
    
    public int rollDice(int numOfSides)
    {
        diceValue = (int)(Math.random()*numOfSides+1);
        return diceValue;
        
    }
    
    public int abilityScoreRoll()
    {
        int firstDie = 0;
        int secondDie = 0;
        int thirdDie = 0;
        int fourthDie = 0;
        int total = 0;
        
        firstDie = rollDice(6);
        secondDie = rollDice(6);
        thirdDie = rollDice(6);
        fourthDie = rollDice(6);
        
        total = firstDie + secondDie + thirdDie + fourthDie; 
//                - Math.min(Math.min(firstDie,secondDie), Math.min(thirdDie, fourthDie));
        return total;
    }
}
