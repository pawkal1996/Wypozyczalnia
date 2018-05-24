package wypozyczalnia;

public class Rower extends Pojazd {
    private TypRoweru typRoweru;
    
    public Rower(int id, String marka, String model, int rokProdukcji, int iloscMiejsc, TypRoweru typRoweru) {
        super(id, marka, model, rokProdukcji, iloscMiejsc);
        this.typRoweru=typRoweru;      
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
