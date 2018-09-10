
package wypozyczalnia;

import pojazdy.PojazdSpalinowy;
import pojazdy.TypMotocykla;

public class Motocykl extends PojazdSpalinowy {
    
    private TypMotocykla typMotocykla;
    private NapedMotocykla napedMotocykla;
    public Motocykl(String marka, String model, int rokProdukcji, int iloscMiejsc, 
                    String nrRej, String vin, int moc, int pojemnoscSilnika, 
                    TypMotocykla typMotocykla, NapedMotocykla napedMotocykla) {
        super(marka, model, rokProdukcji, iloscMiejsc, nrRej, vin, moc, pojemnoscSilnika);
        this.typMotocykla=typMotocykla;
        this.napedMotocykla=napedMotocykla;
        
        DataStore.storeMotocykl(this);
    }
    
    public boolean zmienMotocykl(String marka, String model, int rokProdukcji, int iloscMiejsc, 
            String nrRej, String vin, int moc, int pojemnoscSilnika, 
            TypMotocykla typMotocykla, NapedMotocykla napedMotocykla) {
    	
    	if(DataStore.sprawdzMotocykl(marka,model,rokProdukcji,iloscMiejsc, 
                nrRej, vin, moc, pojemnoscSilnika,typMotocykla,napedMotocykla)) {
    		this.setMarka(marka);
    		this.setModel(model);
    		this.setRokProdukcji(rokProdukcji);
    		this.setNrRej(nrRej);
    		this.setVin(vin);
    		this.setPojemnoscSilnika(pojemnoscSilnika);
    		this.setTypMotocykla(typMotocykla);
    		this.setNapedMotocykla(napedMotocykla);
    		return true;
		}
    	return false;
    }

    //gettery
    public TypMotocykla getTypMotocykla(){
        return typMotocykla;
    }
    public NapedMotocykla getNapedMotocykla(){
        return napedMotocykla;
    }
    //settery
    public void setTypMotocykla(TypMotocykla typMotocykla){
        this.typMotocykla=typMotocykla;
    }
    public void setNapedMotocykla(NapedMotocykla napedMotocykla){
        this.napedMotocykla=napedMotocykla;
    }
    
    
}
