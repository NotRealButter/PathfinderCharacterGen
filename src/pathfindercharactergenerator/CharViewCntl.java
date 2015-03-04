package pathfindercharactergenerator;

public class CharViewCntl 
{
    CharViewUI charViewUI;
    Character character;
   CharViewCntl(Character character)
   {
       charViewUI = new CharViewUI();
       this.character = character;
       updateView();
       
   }
   
   public void updateView()
   {
       charViewUI.getNameBox().setText(character.getName());
       charViewUI.getClassBox().setText(character.getClass1().getName());
   }
}
