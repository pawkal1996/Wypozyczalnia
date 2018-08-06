/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Paweł K
 */
public class Kierowca extends Osoba{
    private LocalDate dataZatrudnienia;
    private LocalDate dataZwolnienia;
    private int pensja;
    public static ArrayList<Kierowca> listaKierowcow = new ArrayList<Kierowca>();
    DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");
    
    public Kierowca(String imie, String nazwisko, String dataUrodzenia, String adres, 
                    String tel, String dataZatrudnienia, String dataZwolnienia, int pensja){
        super(imie, nazwisko, dataUrodzenia, adres, tel);
        this.dataZatrudnienia=LocalDate.parse(dataZatrudnienia,formatDaty);
        this.dataZwolnienia=LocalDate.parse(dataZwolnienia,formatDaty);
        this.pensja=pensja;
    }
    
    public LocalDate getDataZatrudnienia(){
        return dataZatrudnienia;
    }
    public LocalDate getDataZwolnienia(){
        return dataZwolnienia;
    }
    public int getPensja(){
        return pensja;
    }
    
    public void setDataZatrudnienia(String dataZatrudnienia){
        this.dataZatrudnienia=LocalDate.parse(dataZatrudnienia,formatDaty);
    }
    public void setDataZwolnienia(String dataZwolnienia){
        this.dataZwolnienia=LocalDate.parse(dataZwolnienia,formatDaty);
    }
    public void setPensja(int pensja){
        this.pensja=pensja;
    }
}
