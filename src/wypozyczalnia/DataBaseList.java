package wypozyczalnia;

import java.util.ArrayList;

public class DataBaseList {
	private static ArrayList<Klient> listaKlient = new ArrayList<Klient>();
	
	public static boolean zapiszKlienta(Klient klient) {
		listaKlient.add(klient);
		return true;
	}
}
