package wypozyczalnia;

import java.time.LocalDate;

public class Samochod extends PojazdSpalinowy {
    
    int iloscDrzwi;
    TypNadwozia typNadwozia;
    int cenaZaDobe;
    SegmentSamochodu segmentSamochodu;
    
    public Samochod(String marka, String model, int rokProdukcji, int iloscMiejsc, 
                    String nrRej, String vin, int moc, int pojemnoscSilnika, 
                    TypNadwozia typNadwozia, int iloscDrzwi, SegmentSamochodu segmentSamochodu) {
        super(marka, model, rokProdukcji, iloscMiejsc, nrRej, vin, moc, pojemnoscSilnika);
        this.typNadwozia=typNadwozia;
        this.iloscDrzwi=iloscDrzwi;
        this.segmentSamochodu=segmentSamochodu;
        
        DataStore.storeSamochod(this);
    }
    
    public boolean zmienSamochod(String marka, String model, int rokProdukcji, int iloscMiejsc, 
            String nrRej, String vin, int moc, int pojemnoscSilnika, 
            TypNadwozia typNadwozia, int iloscDrzwi) {
    	if(DataStore.sprawdzSamochod(marka, model, rokProdukcji, iloscMiejsc, nrRej, vin, moc, pojemnoscSilnika,
    			typNadwozia, iloscDrzwi, segmentSamochodu)) {
    		this.setMarka(marka);
    		this.setModel(model);
    		this.setRokProdukcji(rokProdukcji);
    		this.setNrRej(nrRej);
    		this.setVin(vin);
    		this.setPojemnoscSilnika(pojemnoscSilnika);
    		this.setTypNadwozia(typNadwozia);
    		this.setIloscDrzwi(iloscDrzwi);
    		
    		return true;
    	}
    	
    	return false;
    }
    
  
    
    //gettery
    public TypNadwozia getTypNadwozia(){
        return typNadwozia;
    }
    public int getIloscDrzwi(){
        return iloscDrzwi;
    }
    public SegmentSamochodu getSegmentSamochodu() {
    	return segmentSamochodu;
    }
    //settery
    public void setTypNadwozia(TypNadwozia typNadwozia){
        this.typNadwozia=typNadwozia;
    }
    public void setIloscDrzwi(int iloscDrzwi){
        this.iloscDrzwi=iloscDrzwi;
    }
    public void setSegmentSamochodu(SegmentSamochodu segmentSamochodu) {
    	this.segmentSamochodu=segmentSamochodu;
    }

	


    





}
