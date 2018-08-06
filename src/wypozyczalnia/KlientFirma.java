/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.util.Date;

/**
 *
 * @author Paweł K
 */
public class KlientFirma extends Klient {
    private String nazwaFirmy;
    private String nipFirmy;
    private String adresFirmy;
    
    public KlientFirma(String imie, String nazwisko, String dataUrodzenia, String adres,
                       String tel, int iloscRezerwacji, String dataRejestracji,
                       String nazwaFirmy, String nipFirmy, String adresFirmy){
        super(imie, nazwisko, dataUrodzenia, adres, tel, iloscRezerwacji, dataRejestracji);
        this.nazwaFirmy=nazwaFirmy;
        this.nipFirmy=nipFirmy;
        this.adresFirmy=adresFirmy;
    }
    
    public void dodajKlienta(){
        
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
