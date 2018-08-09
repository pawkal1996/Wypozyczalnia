package wypozyczalnia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataStore{
	private static DataBaseList db = new DataBaseList();
	public static void storeKlientFirma(KlientFirma k) {
		if(sprawdzKlientaFirma(k.imie, k.nazwisko, k.getDataUrodzenia(), k.adres,
				k.tel, k.getNazwaFirmy(), k.getNipFirmy(), k.getAdresFirmy())) {
			db.zapiszKlienta(k);
		}
	}
	
	
	
	public static boolean sprawdzKlientaFirma(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
             String tel, String nazwaFirmy, String nipFirmy, String adresFirmy){
  
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
		 if(!nipFirmy.matches("[0-9]{10}")) {
			 System.out.println("Bledny NIP!");
			 return false;
		 }
		 return true;
	 }

	 public static boolean dodajKlientaFirma(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
			 String tel, String nazwaFirmy, String nipFirmy, String adresFirmy) {
		 if(sprawdzKlientaFirma(imie,nazwisko,dataUrodzenia,adres,tel,nazwaFirmy,nipFirmy,adresFirmy)) {
			 KlientFirma klient = new KlientFirma(imie,nazwisko,dataUrodzenia,adres,
               tel, nazwaFirmy, nipFirmy, adresFirmy);
	     db.zapiszKlienta(klient);
		 System.out.println("Dodano klienta-firme o nazwie "+klient.getNazwaFirmy()+" oraz id klienta "+klient.getIdKlienta());
		 return true;
	}
	else return false;
	
}


}
