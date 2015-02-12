package pathfindercharactergenerator;

import javax.swing.*;
import static javax.swing.JFrame.*;
public class myJFrame extends JFrame
{

    int frameWidth = 1005  , frameHeight = 730;
            
    public myJFrame ()
    {
            super ("Pathfinder");
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setSize (frameWidth, frameHeight);
            setVisible(true);
    }
}
