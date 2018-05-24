
package wypozyczalnia;

import javax.swing.JFrame;

public class Okno extends JFrame{
        
    Przycisk p = new Przycisk();
    
        public Okno(){
            setSize(500,350);
            setTitle("Formularz");
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            p.getOkno(this);
            
            
    }
    
 


}
