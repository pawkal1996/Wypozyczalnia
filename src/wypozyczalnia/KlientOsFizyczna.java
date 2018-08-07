/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.time.LocalDate;
import java.util.Date;


/**
 *
 * @author Paweł K
 */
public class KlientOsFizyczna extends Klient {
    private String numerDowodu;
    
    public KlientOsFizyczna(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
                      String tel, int idKlienta, int iloscRezerwacji, String dataRejestracji,
                      String numerDowodu){
        super(imie, nazwisko, dataUrodzenia, adres, tel);
        this.numerDowodu=numerDowodu;
    }
    
    public String getNumerDowodu(){
        return numerDowodu;
    }    
    public void setNumerDowodu(String numerDowodu){
        this.numerDowodu=numerDowodu;
    }
    
}

