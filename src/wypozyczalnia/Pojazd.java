package wypozyczalnia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class Pojazd {
    private int id;
    private String marka;
    private String model;
    private int rokProdukcji;
    private int iloscMiejsc;

    static int licznikIdPoj=0;
    public Pojazd(String marka, String model, int rokProdukcji, int iloscMiejsc){
        this.id=licznikIdPoj;
        this.marka=marka;
        this.model=model;
        this.rokProdukcji=rokProdukcji;
        this.iloscMiejsc=iloscMiejsc;
    }
    
    	
    
    public static int zwiekszId() {
    	return ++licznikIdPoj;
    }   

    
    
    //gettery
    public int getId(){
        return id;
    }    
    public String getMarka(){
        return marka;
    }    
    public String getModel(){
        return model;
    }    
    public int getRokProdukcji(){
        return rokProdukcji;
    }
    public int getIloscMiejsc(){
        return iloscMiejsc;
    }

    //settery
    public void setId(int id){
        this.id=id;
    }
    public void setMarka(String marka){
        this.marka=marka;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setRokProdukcji(int rokProdukcji){
        this.rokProdukcji=rokProdukcji;
    }
    public void setIloscMiejsc(int iloscMiejsc){
        this.iloscMiejsc=iloscMiejsc;
    }  
        
}
