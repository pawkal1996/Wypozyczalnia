
package wypozyczalnia;

import javax.swing.JButton;
import javax.swing.JFrame;
    
    

public class Przycisk extends JFrame {
        
    private JButton bDodaj;
    
    public Przycisk(){
        bDodaj.setBounds(50,50,100,20);
    }
    
    public void getOkno(JFrame o){
        o.add(bDodaj);
    }
}