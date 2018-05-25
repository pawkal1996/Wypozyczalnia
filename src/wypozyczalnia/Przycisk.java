
package wypozyczalnia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
    
    

public class Przycisk extends JFrame implements ActionListener {
        
    private JButton bNowaRezerwacja = new JButton("Nowa rezerwacja");
    private JButton bDodajSamochod = new JButton("Dodaj samochód");
    private JButton bEdytujSamochod = new JButton("Zmień");
    
    public Przycisk(){
        bNowaRezerwacja.setBounds(50,50,150,50);
        bNowaRezerwacja.addActionListener(this);
        
        bDodajSamochod.setBounds(220,50,130,20);
        bDodajSamochod.addActionListener(this);
        
        bEdytujSamochod.setBounds(220,80,130,20);
        bEdytujSamochod.addActionListener(this);
        
    }
    
    public void getOkno(JFrame o){
        o.add(bNowaRezerwacja);
        o.add(bDodajSamochod);
        o.add(bEdytujSamochod);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bDodajSamochod){
            System.out.println("Dziala button!");
        }
        if(e.getSource()==bEdytujSamochod){
            System.out.println("Teraz edytujesz samochod");
        }
    }
    
    
}