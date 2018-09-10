/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoby;

import java.time.LocalDate;

import wypozyczalnia.DataStore;

/**
 *
 * @author Paweł K
 */
public class KlientFirma extends Klient {
    private String nazwaFirmy;
    private String nipFirmy;
    private String adresFirmy;
    
    
    public KlientFirma(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
                       String tel,
                       String nazwaFirmy, String nipFirmy, String adresFirmy){
        super(imie, nazwisko, dataUrodzenia, adres, tel);
        
        this.nazwaFirmy=nazwaFirmy;
        this.nipFirmy=nipFirmy;
        this.adresFirmy=adresFirmy;
        DataStore.storeKlientFirma(this);
    }
    
	public boolean zmienKlientaFirma(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
			String tel, String nazwaFirmy, String nipFirmy, String adresFirmy) {
		if(DataStore.sprawdzKlientaFirma(imie,nazwisko,dataUrodzenia,adres,tel,nazwaFirmy,nipFirmy,adresFirmy)) {
			this.setImie(imie);
			this.setNazwisko(nazwisko);
			this.setDataUrodzenia(dataUrodzenia);
			this.setAdres(adres);
			this.setTel(tel);
			this.setNazwaFirmy(nazwaFirmy);
			this.setNipFirmy(nipFirmy);
			this.setAdresFirmy(adresFirmy);

	    	return true;
		}
		else return false;
	}
    
    
   
    	
    public String getNazwaFirmy(){
        return nazwaFirmy;
    }
    
    public String getNipFirmy(){
        return nipFirmy;
    }
    
    public String getAdresFirmy(){
        return adresFirmy;
    }
    
    
    public void setNazwaFirmy(String nazwaFirmy){
        this.nazwaFirmy=nazwaFirmy;
    }
    
    public void setNipFirmy(String nipFirmy){
        this.nipFirmy=nipFirmy;
    }
    
    public void setAdresFirmy(String adresFirmy){
        this.adresFirmy=adresFirmy;
    }
    
}
