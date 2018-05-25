
package wypozyczalnia;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Tabela {
    
    private JTable tabSamochody = new JTable();
    
    Object[][] dane = { {"Kowalski", "Jan", new Integer(30), new Boolean(true) },
                    { "Jankowski", "Jan", new Integer(20), new Boolean(false) },
                    
                  };
    Object[] nazwyKolumn = {"Nazwisko", "Imię", "Wiek", "Urlop wykorzystany?" };

    JTable tab = new JTable(dane, nazwyKolumn);
    JScrollPane sp = new JScrollPane(tab);
    
    public void getPanel(JPanel e){
        e.add(tab);
    }
}
