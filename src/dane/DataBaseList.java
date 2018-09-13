package dane;

import java.util.ArrayList;

import datacheck.StoreDriver;
import osoby.Klient;
import osoby.KlientFirma;
import osoby.KlientOsFizyczna;
import pojazdy.Motocykl;
import pojazdy.Pojazd;
import pojazdy.Rower;
import pojazdy.Samochod;
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

	@Override
	public boolean usunPojazd(Pojazd p) {
		// TODO Auto-generated method stub
		listaPojazd.remove(p);
		return false;
	}

	@Override
	public boolean usunKlienta(Klient k) {
		// TODO Auto-generated method stub
		listaKlient.remove(k);
		return false;
	}

	@Override
	public boolean czyJestTakiPojazd(String nrIdentyfikacyjny) {
		// TODO Auto-generated method stub
		for(Pojazd i : listaPojazd) {
			if(i instanceof Rower) {	
				Rower tmp = (Rower)i;
				if(tmp.getNrSeryjny().equalsIgnoreCase(nrIdentyfikacyjny)) {
					return true;
				}
			}
			if(i instanceof Samochod) {
				Samochod tmp = (Samochod)i;
				if(tmp.getVin().equalsIgnoreCase(nrIdentyfikacyjny)) {
					return true;
				}
			}
			if(i instanceof Motocykl) {
				Motocykl tmp = (Motocykl)i;
				if(tmp.getVin().equalsIgnoreCase(nrIdentyfikacyjny)) {
					return true;
				}
			}
			
		}
		return false;
	}

	@Override
	public boolean czyJestTakiKlient(String identyfikator) {
		// TODO Auto-generated method stub
		for(Klient i : listaKlient) {
			if(i instanceof KlientFirma) {
				KlientFirma tmp = (KlientFirma)i;
				if(tmp.getNipFirmy().equals(identyfikator)) {
					return true;
				}
			}
			if(i instanceof KlientOsFizyczna) {
				KlientOsFizyczna tmp = (KlientOsFizyczna)i;
				if(tmp.getNumerDowodu().equals(identyfikator)) {
					return true;
				}
			}
		}
		return false;
	}

}
