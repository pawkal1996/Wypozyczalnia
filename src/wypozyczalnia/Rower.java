package wypozyczalnia;

public class Rower extends Pojazd {
    private TypRoweru typRoweru;
    
    public Rower(int id, String marka, String model, int rokProdukcji, int iloscMiejsc,
                TypRoweru typRoweru) {
        super(id, marka, model, rokProdukcji, iloscMiejsc);
        this.typRoweru=typRoweru;      
    }
    
    public static boolean dodajRower(String marka, String model, int rokProdukcji,
    		int iloscMiejsc, TypRoweru typRoweru) {
    	int a=2;
    	if(a>3) {
    		return true;
    	}
    	return false;
    }
    
    //gettery
    public TypRoweru getTypRoweru(){
        return typRoweru;
    }
    
    //settery
    public void setTypRoweru(TypRoweru typRoweru){
        this.typRoweru=typRoweru;
    }

       
}
