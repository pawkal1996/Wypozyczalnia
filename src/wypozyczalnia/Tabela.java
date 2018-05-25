
package wypozyczalnia;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Tabela {
    
    
    private String[] kolSamochody = {"Nr rej","Marka"};
    private Object[][] daneSamochody={
        {"WMA12333","Opel"},
        {"WZ9094U","Volvo"}
    };
    private JTable tabSamochody = new JTable(daneSamochody, kolSamochody);
    public Tabela(){
        tabSamochody.setLayout(new FlowLayout());
    }
    
    
    public void getPanel(JPanel e){
        e.add(tabSamochody);
    }
}
