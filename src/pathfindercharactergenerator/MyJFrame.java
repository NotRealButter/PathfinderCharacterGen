package pathfindercharactergenerator;

import javax.swing.*;
import static javax.swing.JFrame.*;
public class MyJFrame extends JFrame
{

    int frameWidth = 1005  , frameHeight = 730;
    MenuCntl mainMenu;
    CharCreatCntl charCreatCntl;

   
    public MyJFrame ()
    {
            super ("Pathfinder");
            
            mainMenu = new MenuCntl(this);
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setSize (frameWidth, frameHeight);
            setVisible(true);
    }
}
