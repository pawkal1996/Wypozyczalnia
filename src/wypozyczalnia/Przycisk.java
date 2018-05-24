
package wypozyczalnia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
    
    

public class Przycisk extends JFrame implements ActionListener {
        
    private JButton bDodajSamochod = new JButton("Dodaj samochód");
    
    public Przycisk(){
        bDodajSamochod.setBounds(50,50,170,20);
        bDodajSamochod.setVisible(true);
        bDodajSamochod.addActionListener(this);
    }
    
    public void getOkno(JFrame o){
        o.add(bDodajSamochod);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bDodajSamochod){
            System.out.println("Dziala button!");
        }
    }
    
    
}