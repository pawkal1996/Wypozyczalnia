package wypozyczalnia;



public class Samochod extends PojazdSpalinowy {
    
    int iloscDrzwi;
    TypSamochodu typSamochodu;
    

    
    public Samochod(int id, String marka, String model, int rokProdukcji, int iloscMiejsc, String nrRej, String vin, int moc, int pojemnoscSilnika, TypSamochodu typSamochodu, int iloscDrzwi) {
        super(id, marka, model, rokProdukcji, iloscMiejsc, nrRej, vin, moc, pojemnoscSilnika);
        this.typSamochodu=typSamochodu;
        this.iloscDrzwi=iloscDrzwi;
    }
    
    //gettery
    public TypSamochodu getTyp(){
        return typSamochodu;
    }
    public int getIloscDrzwi(){
        return iloscDrzwi;
    }
    //settery
    public void setTypSamochodu(TypSamochodu typSamochodu){
        this.typSamochodu=typSamochodu;
    }
    public void setIloscDrzwi(int iloscDrzwi){
        this.iloscDrzwi=iloscDrzwi;
    }



    





}
