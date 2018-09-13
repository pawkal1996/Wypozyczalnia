/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoby;

import java.time.LocalDate;
import java.util.ArrayList;

import datacheck.DataStore;



/**
 *
 * @author Paweł K
 */
public class KlientOsFizyczna extends Klient {
	private String numerDowodu;
	private String pesel;

	public KlientOsFizyczna(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
			String tel, String numerDowodu, String pesel){
		super(imie, nazwisko, dataUrodzenia, adres, tel);
		this.numerDowodu=numerDowodu;
		this.pesel=pesel;
		DataStore.storeKlientOsFizyczna(this);
	}





	public boolean zmienKlientaOsFizyczna(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
			String tel, String numerDowodu, String pesel) {
		if(DataStore.sprawdzKlientaOsFizyczna(imie,nazwisko,dataUrodzenia,adres,tel,numerDowodu,pesel)) {
			this.setImie(imie);
			this.setNazwisko(nazwisko);
			this.setDataUrodzenia(dataUrodzenia);
			this.setAdres(adres);
			this.setTel(tel);
			this.setPesel(pesel);

			return true;
		}
		else return false;
	}


	public String getNumerDowodu(){
		return numerDowodu;
	}    
	public String getPesel() {
		return pesel;
	}
	public void setNumerDowodu(String numerDowodu){
		this.numerDowodu=numerDowodu;
	}
	public void setPesel(String pesel) {
		this.pesel=pesel;
	}

}

