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
public abstract class Klient {
        private int iloscRezerwacji;
        private static Date dataRejestracji;
        
        //gettery
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
