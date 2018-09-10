/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoby;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Paweł K
 */
public abstract class Klient extends Osoba {
	private static int idKlienta;
	private int iloscRezerwacji=0;
	private LocalDate dataRejestracji;

	static int licznikIdKlienta;
	DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");

	public Klient(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
			String tel){
		super(imie, nazwisko, dataUrodzenia, adres, tel);

		Klient.idKlienta=licznikIdKlienta;
		this.dataRejestracji = LocalDate.now();

	}

	public static int zwiekszIdKlienta() {
		return ++licznikIdKlienta;
	}




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
