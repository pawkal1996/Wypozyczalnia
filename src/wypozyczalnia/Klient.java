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
public abstract class Klient extends Osoba {
        private static int idKlienta;
        private int iloscRezerwacji;
        private static Date dataRejestracji;
        
        static int licznikIdKlienta;
        
        public Klient(String imie, String nazwisko, Date dataUrodzenia, String adres,
                      String tel, int idKlienta, int iloscRezerwacji, Date dataRejestracji){
            super(imie, nazwisko, dataUrodzenia, adres, tel);
            this.idKlienta=licznikIdKlienta;
            ++licznikIdKlienta;
            this.iloscRezerwacji=iloscRezerwacji;
            this.dataRejestracji=dataRejestracji;
            
        }
        //gettery
        public int getIdKlienta(){
            return idKlienta;
        }
        public int getIloscRezerwacji(){
            return iloscRezerwacji;
        }
        public Date getDataRejestracji(){
            return dataRejestracji;
        }
        
        //settery
        public void setIloscRezerwacji(int iloscRezerwacji){
            this.iloscRezerwacji=iloscRezerwacji;
        }
}
