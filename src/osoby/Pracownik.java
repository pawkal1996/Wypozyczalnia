package osoby;

import java.time.LocalDate;

import datacheck.DataStore;

public class Pracownik extends KlientOsFizyczna {
	private static int licznikIdPracownika=0;
	private int id;
	private LocalDate dataZatrudnienia;
	private int pensja;
	
	public Pracownik(String imie, String nazwisko, LocalDate dataUrodzenia, String adres, String tel,
			String numerDowodu, String pesel, LocalDate dataZatrudnienia, int pensja) {
		super(imie, nazwisko, dataUrodzenia, adres, tel, numerDowodu, pesel);
		this.dataZatrudnienia=dataZatrudnienia;
		this.pensja=pensja;
		this.id=licznikIdPracownika;
		licznikIdPracownika++;
		
		DataStore.storePracownik(this);
	}

	public static int zwiekszIdPracownika() {
		return ++licznikIdPracownika;
	}
	
	public LocalDate getDataZatrudnienia() {
		return dataZatrudnienia;
	}
	public void setDataZatrudnienia(LocalDate dataZatrudnienia) {
		this.dataZatrudnienia = dataZatrudnienia;
	}
	public int getPensja() {
		return pensja;
	}
	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

	public boolean zmienPracownika(String imie, String nazwisko, LocalDate dataUrodzenia, String adres, String tel,
			String numerDowodu, String pesel, LocalDate dataZatrudnienia, int pensja) {
		if(DataStore.sprawdzKlientaOsFizyczna(imie,nazwisko,dataUrodzenia,adres,tel,numerDowodu,pesel)) {
			this.setImie(imie);
			this.setNazwisko(nazwisko);
			this.setDataUrodzenia(dataUrodzenia);
			this.setAdres(adres);
			this.setTel(tel);
			this.setDataZatrudnienia(dataZatrudnienia);
			this.setPensja(pensja);

			return true;
		}
		else return false;
	}


}
