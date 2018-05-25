
package wypozyczalnia;

import com.sun.org.apache.bcel.internal.Constants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class Zakladki extends JFrame implements Constants{
    private JPanel panelRodzic = new JPanel();
    private JPanel panelSamochody = new JPanel();
    private JPanel panelKlienci = new JPanel();
    private JTabbedPane zakladki = new JTabbedPane();
    
    public Zakladki(){
        panelRodzic.setBounds(10,100,100,100);
        zakladki.add("Samochody",panelSamochody);
        zakladki.add("Klienci",panelKlienci);
        panelRodzic.add(zakladki);
    }
    
    public void getOkno(JFrame o){
        o.add(panelRodzic);
    }
    
    
    
}
