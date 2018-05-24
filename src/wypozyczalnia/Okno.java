
package wypozyczalnia;

import java.awt.Color;
import javax.swing.JFrame;

public class Okno extends JFrame{
        
    Przycisk p = new Przycisk();
    
        public Okno(){
            setSize(800,500);
            setTitle("Wypożyczalnia 1.0");
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            p.getOkno(this);
            
            
    }
    
 


}
