package wypozyczalnia;

import java.util.ArrayList;

public class DataBaseList {
	private static ArrayList<Klient> listaKlient = new ArrayList<Klient>();
	
	public boolean zapiszKlienta(Klient klient) {
		listaKlient.add(klient);
		System.out.println("Dodano klienta o id "+klient.getIdKlienta());
		return true;
	}
}
