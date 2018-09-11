package dane;

import java.util.ArrayList;

import datacheck.StoreDriver;
import osoby.Klient;
import pojazdy.Pojazd;
import rezerwacje.Rezerwacja;

public class DataBaseList implements StoreDriver{
	static ArrayList<Klient> listaKlient = new ArrayList<Klient>();
	static ArrayList<Pojazd> listaPojazd = new ArrayList<Pojazd>();
	static ArrayList<Rezerwacja> listaRezerwacja = new ArrayList<Rezerwacja>();

	public boolean zapiszKlienta(Klient klient) {
		listaKlient.add(klient);
		return true;
	}

	public boolean zapiszPojazd(Pojazd pojazd) {
		listaPojazd.add(pojazd);
		return true;
	}

	public boolean zapiszRezerwacje(Rezerwacja r) {
		listaRezerwacja.add(r);
		return true;
	}

	public ArrayList<Rezerwacja> getListaRezerwacji(Pojazd p) {
		ArrayList<Rezerwacja> listaRez = new ArrayList<Rezerwacja>();
		for (Rezerwacja i : listaRezerwacja) {
			if(i.getPojazd().equals(p)) {
				listaRez.add(i);	
			}
		}
		return listaRez;
	}

	public boolean czyIstniejeKlient(Klient k) {
		for(Klient i : listaKlient) {
			if(i.equals(k)) {
				return true;
			}
		}
		return false;
	}

	public boolean czyIstniejePojazd(Pojazd p) {
		for(Pojazd i : listaPojazd) {
			if(i.equals(p)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Klient> getListaKlient(){
		return listaKlient;
	}

	public ArrayList<Pojazd> getListaPojazd(){
		return listaPojazd;
	}

	public ArrayList<Rezerwacja> getListaRezerwacja(){
		return listaRezerwacja;
	}

}
