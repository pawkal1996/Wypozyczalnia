
package wypozyczalnia;

import com.sun.org.apache.bcel.internal.Constants;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import static javax.swing.SwingConstants.TOP;


public class Zakladki {
    private JPanel panelRodzic = new JPanel();
    private JPanel panelSamochody = new JPanel();
    private JPanel panelKlienci = new JPanel();
    private JTabbedPane zakladki = new JTabbedPane();

    
    Tabela tab1=new Tabela();
    
    public Zakladki(){
        panelRodzic.setBounds(10,100,600,300);

        
        zakladki.add("Pojazdy",panelSamochody);
        zakladki.add("Klienci",panelKlienci);
        zakladki.setTabPlacement(TOP);
        panelRodzic.setLayout(new GridLayout());
        panelRodzic.add(zakladki);
        panelSamochody.setLayout(new BorderLayout());
        tab1.getPanel(panelSamochody);
    }
    
    public void getOkno(JFrame o){
        o.add(panelRodzic);
    }
    
    
    
}
