package wypozyczalnia;



public class Samochod extends PojazdSpalinowy {
    
    int iloscDrzwi;
    TypNadwozia typNadwozia;
    

    
    public Samochod(int id, String marka, String model, int rokProdukcji, int iloscMiejsc, String nrRej, String vin, int moc, int pojemnoscSilnika, TypNadwozia typNadwozia, int iloscDrzwi) {
        super(id, marka, model, rokProdukcji, iloscMiejsc, nrRej, vin, moc, pojemnoscSilnika);
        this.typNadwozia=typNadwozia;
        this.iloscDrzwi=iloscDrzwi;
    }
    
    //gettery
    public TypNadwozia getTyp(){
        return typNadwozia;
    }
    public int getIloscDrzwi(){
        return iloscDrzwi;
    }
    //settery
    public void setTypNadwozia(TypNadwozia typNadwozia){
        this.typNadwozia=typNadwozia;
    }
    public void setIloscDrzwi(int iloscDrzwi){
        this.iloscDrzwi=iloscDrzwi;
    }



    





}
