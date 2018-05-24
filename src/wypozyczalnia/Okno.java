
package wypozyczalnia;

import javax.swing.JFrame;

public class Okno extends JFrame{
    Przycisk p = new Przycisk();
    public Okno(){
        super("Wypożyczalnia 1.0");
        JFrame okno = new JFrame();
        okno.setSize(800,500);
        okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
        okno.setVisible(true);
        p.getOkno(this);
    }
    
 


}
