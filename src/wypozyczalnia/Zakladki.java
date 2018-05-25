
package wypozyczalnia;

import com.sun.org.apache.bcel.internal.Constants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import static javax.swing.SwingConstants.TOP;


public class Zakladki extends JFrame implements Constants{
    private JPanel panelRodzic = new JPanel();
    private JPanel panelSamochody = new JPanel();
    private JPanel panelKlienci = new JPanel();
    private JTabbedPane zakladki = new JTabbedPane();
    
    public Zakladki(){
        panelRodzic.setBounds(10,100,600,300);
        zakladki.add("Pojazdy",panelSamochody);
        zakladki.add("Klienci",panelKlienci);
        zakladki.setTabPlacement(TOP);
        panelRodzic.setLayout(new GridLayout());
        panelRodzic.add(zakladki);
    }
    
    public void getOkno(JFrame o){
        o.add(panelRodzic);
    }
    
    
    
}
