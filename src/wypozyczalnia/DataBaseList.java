package wypozyczalnia;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataBaseList implements StoreDriver{
	private static ArrayList<Klient> listaKlient = new ArrayList<Klient>();
	private static ArrayList<Pojazd> listaPojazd = new ArrayList<Pojazd>();
	private static ArrayList<Rezerwacja> listaRezerwacja = new ArrayList<Rezerwacja>();
	
	public boolean zapiszKlienta(Klient klient) {
		listaKlient.add(klient);
		System.out.println("Dodano klienta: "+klient.getIdKlienta()+" "+klient.getImie()+" "+klient.getNazwisko());
		return true;
	}
	
	public boolean zapiszPojazd(Pojazd pojazd) {
		listaPojazd.add(pojazd);
		System.out.println("Dodano pojazd "+pojazd.getId()+" "+pojazd.getMarka()+" "+pojazd.getModel());
		return true;
	}
	
	public boolean zapiszRezerwacje(Rezerwacja r) {
		listaRezerwacja.add(r);
		System.out.println("Dodano rezerwacje nr "+r.getIdRezerwacji());
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
	 
	 
	
	
	
	
	
	
	public static void wyswietlKlientow() {
		
		for (Klient i : listaKlient) {
	 		if(i instanceof KlientOsFizyczna) {
	 			KlientOsFizyczna klientTmp = (KlientOsFizyczna) i;
	 			System.out.println(i.getIdKlienta()+" "+i.getImie()+" "+i.getNazwisko()+" "+i.getDataUrodzenia()+" " +i.getAdres()
	 					+i.getTel()+" "+klientTmp.getNumerDowodu());
	 		}
	 		else {
	 			KlientFirma klientTmp = (KlientFirma) i;
	 			System.out.println("Tutaj to co chcemy wiedziec o firmach");
	 		}
	 	}
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
