/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        
    }
    
 
    
    
    public static boolean dodajKlienta(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
                       String tel, String nazwaFirmy, String nipFirmy, String adresFirmy){
            
        DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");           
        LocalDate teraz = LocalDate.now();
        
        if(teraz.minusYears(18).isBefore(dataUrodzenia)) {
            System.out.println("Klient niepełnoletni!");
            return false;               
        }
        
        if(!tel.matches("[0-9]{9}")) {
            System.out.println("Błędny numer telefonu!");
            return false;
        }
        if(!nipFirmy.matches("[0-9]{10}")) {
            System.out.println("Błędny NIP!");
            return false;
        }
            KlientFirma klient = new KlientFirma(imie,nazwisko,dataUrodzenia,adres,
                       tel, nazwaFirmy, nipFirmy, adresFirmy);
            System.out.println("Dodane klienta-firmę o nazwie "+klient.getNazwaFirmy());
            return true;
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
