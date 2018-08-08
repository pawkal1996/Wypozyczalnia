/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Paweł K
 */
public abstract class Klient extends Osoba {
        private static int idKlienta;
        private int iloscRezerwacji;
        private static LocalDate dataRejestracji;
        
        static int licznikIdKlienta;
        DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");
        
        public Klient(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
                      String tel){
            super(imie, nazwisko, dataUrodzenia, adres, tel);
                
            this.idKlienta=licznikIdKlienta;
            ++licznikIdKlienta;
            this.iloscRezerwacji=iloscRezerwacji;
            this.dataRejestracji = LocalDate.now();
                      
        }

        
        
        
        //public abstract void dodajKlienta();
        
        //gettery
        public int getIdKlienta(){
            return idKlienta;
        }
        public int getIloscRezerwacji(){
            return iloscRezerwacji;
        }
        public LocalDate getDataRejestracji(){
            return dataRejestracji;
        }
        
        //settery
        public void setIloscRezerwacji(int iloscRezerwacji){
            this.iloscRezerwacji=iloscRezerwacji;
        }
}
