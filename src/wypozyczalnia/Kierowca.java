/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Paweł K
 */
public class Kierowca extends Osoba{
    private Date dataZatrudnienia;
    private Date dataZwolnienia;
    private int pensja;
    public static ArrayList<Kierowca> listaKierowcow = new ArrayList<Kierowca>();
    
    public Kierowca(String imie, String nazwisko, Date dataUrodzenia, String adres, 
                    String tel, Date dataZatrudnienia, Date dataZwolnienia, int pensja){
        super(imie, nazwisko, dataUrodzenia, adres, tel);
        this.dataZatrudnienia=dataZatrudnienia;
        this.dataZwolnienia=dataZwolnienia;
        this.pensja=pensja;
    }
    
    public Date getDataZatrudnienia(){
        return dataZatrudnienia;
    }
    public Date getDataZwolnienia(){
        return dataZwolnienia;
    }
    public int getPensja(){
        return pensja;
    }
    
    public void setDataZatrudnienia(Date dataZatrudnienia){
        this.dataZatrudnienia=dataZatrudnienia;
    }
    public void setDataZwolnienia(Date dataZwolnienia){
        this.dataZwolnienia=dataZwolnienia;
    }
    public void setPensja(int pensja){
        this.pensja=pensja;
    }
}
