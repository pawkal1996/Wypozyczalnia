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
public abstract class Osoba {
    protected String imie;
    protected String nazwisko;
    private LocalDate dataUrodzenia;
    protected String adres;
    protected String tel;
    DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");
    
    
    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia, String adres, String tel){
            
            this.imie=imie;
            this.nazwisko=nazwisko;
            this.dataUrodzenia=dataUrodzenia;
            this.adres=adres;
            this.tel=tel;
    }
    //gettery
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }
    public String getAdres(){
        return adres;
    }
    public String getTel(){
        return tel;
    }
    //settery
    public void setImie(String imie){
        this.imie=imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    public void setDataUrodzenia(LocalDate dataUrodzenia){
        this.dataUrodzenia=dataUrodzenia;
    }
    public void setAdres(String adres){
        this.adres=adres;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
}
