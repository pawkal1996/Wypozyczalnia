package wypozyczalnia;

import java.util.ArrayList;

public class DataBaseList {
	private static ArrayList<Klient> listaKlient = new ArrayList<Klient>();
	private static ArrayList<Pojazd> listaPojazd = new ArrayList<Pojazd>();
	
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
}
