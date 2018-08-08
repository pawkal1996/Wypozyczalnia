/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 *
 * @author Paweł K
 */
public class KlientOsFizyczna extends Klient {
    private String numerDowodu;
    
    public KlientOsFizyczna(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
                      String tel, String numerDowodu){
        super(imie, nazwisko, dataUrodzenia, adres, tel);
        this.numerDowodu=numerDowodu;
    }
    
    public static boolean sprawdzKlientaOsFizyczna(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
            String tel, String numerDowodu){
 
    	DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");           
    	LocalDate teraz = LocalDate.now();

    	if(teraz.minusYears(18).isBefore(dataUrodzenia)) {
    		System.out.println("Klient niepelnoletni!");
    		return false;               
    	}

    	if(!tel.matches("[0-9]{9}")) {
    		System.out.println("Bledny numer telefonu!");
    		return false;
    	}
    	if(!numerDowodu.matches("[A-Z]{3}[0-9]{6}")) {
    		System.out.println("Bledny numer dowodu");
    		return false;
    	}
    	
    	return true;
    }
    
    public static boolean dodajKlientaOsFizyczna(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
            String tel, String numerDowodu) {
    	if(sprawdzKlientaOsFizyczna(imie,nazwisko,dataUrodzenia,adres,tel,numerDowodu)) {
    		KlientOsFizyczna klient = new KlientOsFizyczna(imie,nazwisko,dataUrodzenia,adres,
    	            tel,numerDowodu);
    	    	System.out.println("Dodano klienta-osobe o nazwisku "+klient.getNazwisko()+" oraz id klienta "+klient.getIdKlienta());
    	    	return true;
    	}
    	else return false;
    }
    
    
    public String getNumerDowodu(){
        return numerDowodu;
    }    
    public void setNumerDowodu(String numerDowodu){
        this.numerDowodu=numerDowodu;
    }
    
}

