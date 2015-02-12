package pathfindercharactergenerator;

import java.awt.*;
import javax.swing.*;


public class CharCreatUI extends myJPanel
{
    JButton b1,b2;
    
    CharCreatUI()
    {
        setBackground(Color.blue);
        b1 = new JButton("bitches");
        b2 = new JButton("hoes");
        add(b1);
        add(b2);
                
    }
}
