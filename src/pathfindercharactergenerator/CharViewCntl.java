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
        charViewUI.getRaceBox().setText(character.getRace().getName());
        charViewUI.getAlignmentBox().setText(character.getAlignment());
        charViewUI.getHeightBox().setText(character.getHeight() + "");
        charViewUI.getWeightBox().setText(character.getWeight()+"");
        charViewUI.getStrValBox().setText(character.getStrVal().getValue() + "");
        charViewUI.getDexValBox().setText(character.getDexVal().getValue() + "");
        charViewUI.getConValBox().setText(character.getConVal().getValue() + "");
        charViewUI.getWisValBox().setText(character.getWisVal().getValue() + "");
        charViewUI.getIntValBox().setText(character.getIntVal().getValue() + "");
        charViewUI.getChaValBox().setText(character.getChaVal().getValue() + "");
        charViewUI.getStrModBox().setText(character.getStrVal().getModifier() + "");
        charViewUI.getDexModBox().setText(character.getDexVal().getModifier() + "");
        charViewUI.getConModBox().setText(character.getConVal().getModifier() + "");
        charViewUI.getWisModBox().setText(character.getWisVal().getModifier() + "");
        charViewUI.getIntModBox().setText(character.getIntVal().getModifier() + "");
        charViewUI.getChaModBox().setText(character.getChaVal().getModifier() + "");

   }
}
