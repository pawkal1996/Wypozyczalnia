
package wypozyczalnia;

public class Motocykl extends PojazdSpalinowy {
    
    private TypMotocykla typMotocykla;
    private NapedMotocykla napedMotocykla;
    public Motocykl(int id, String marka, String model, int rokProdukcji, int iloscMiejsc, String nrRej, String vin, int moc, int pojemnoscSilnika, TypMotocykla typMotocykla, NapedMotocykla napedMotocykla) {
        super(id, marka, model, rokProdukcji, iloscMiejsc, nrRej, vin, moc, pojemnoscSilnika);
        this.typMotocykla=typMotocykla;
        this.napedMotocykla=napedMotocykla;
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
