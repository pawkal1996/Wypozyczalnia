package wypozyczalnia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DataStore{
	private static DataBaseList db = new DataBaseList();
	
	public static void storeKlientFirma(KlientFirma k) {
		if(sprawdzKlientaFirma(k.imie, k.nazwisko, k.getDataUrodzenia(), k.adres,
				k.tel, k.getNazwaFirmy(), k.getNipFirmy(), k.getAdresFirmy())) {
			Klient.zwiekszIdKlienta();
			db.zapiszKlienta(k);
		}
	}
	public static void storeKlientOsFizyczna(KlientOsFizyczna k) {
		if(sprawdzKlientaOsFizyczna(k.imie,k.nazwisko,k.getDataUrodzenia(),k.adres,k.tel,k.getNumerDowodu())){
			Klient.zwiekszIdKlienta();
			db.zapiszKlienta(k);
		}
	}

	public static void storeSamochod(Samochod p) {
		if(sprawdzSamochod(p.getMarka(),p.getModel(),p.getRokProdukcji(), p.getIloscMiejsc(), 
                p.getNrRej(), p.getVin(), p.getMoc(), p.getPojemnoscSilnika(), 
                p.getTypNadwozia(), p.getIloscDrzwi())){
			Pojazd.zwiekszId();
			db.zapiszPojazd(p);
		}
	}
	
	public static void storeMotocykl(Motocykl p) {
		if(sprawdzMotocykl(p.getMarka(),p.getModel(),p.getRokProdukcji(), p.getIloscMiejsc(), 
                p.getNrRej(), p.getVin(), p.getMoc(), p.getPojemnoscSilnika(),p.getTypMotocykla(),
                p.getNapedMotocykla())) {
			Pojazd.zwiekszId();
			db.zapiszPojazd(p);
		}
	}
	
	public static void storeRower(Rower p) {
		if(sprawdzRower(p.getMarka(),p.getModel(),p.getRokProdukcji(), p.getIloscMiejsc(), p.getTypRoweru())) {
			Pojazd.zwiekszId();
			db.zapiszPojazd(p);
		}
	}
	
	public static void storeRezerwacja(Rezerwacja r) {
		if(sprawdzRezerwacje(r.getIdRezerwacji(), r.getDataStartu(), r.getDataKonca(), r.getKlient(), r.getPojazd(),
				r.getKosztRezerwacji(), r.getStatusRezerwacji())) {
			r.getKlient().setIloscRezerwacji(r.getKlient().getIloscRezerwacji()+1);
			Rezerwacja.zwiekszIdRezerwacji();
			db.zapiszRezerwacje(r);
		}
		
	
	}
	
	public static boolean sprawdzRezerwacje(int idRezerwacji, LocalDate dataStartu, LocalDate dataKonca, Klient klient,
            Pojazd pojazd, int kosztRezerwacji, StatusRezerwacji statusRezerwacji){
        /*if(!czyIstniejeKlient(klient)) {
        	return false;
        }
        
        if(!czyIstniejePojazd(pojazd)) {
        	return false;
        }
        
		if(dataStartu.isAfter(dataKonca)){
            return false;
        }
		*/
		ArrayList<Rezerwacja> tmpList = db.getListaRezerwacji(pojazd);
		
		for(Rezerwacja i : tmpList) {	
			if(!i.czyPojazdWolny(dataStartu, dataKonca)) {
				return false;
			} 
		}
        return true;
    }
	
	public static boolean sprawdzRower(String marka, String model, int rokProdukcji, int iloscMiejsc,
                TypRoweru typRoweru) {
			LocalDate teraz = LocalDate.now();
			if(rokProdukcji>teraz.getYear()||(rokProdukcji<1970)) {
				return false;
			}
			return true;
	}
	
	public static boolean sprawdzMotocykl(String marka, String model, int rokProdukcji, int iloscMiejsc, 
            String nrRej, String vin, int moc, int pojemnoscSilnika, 
            TypMotocykla typMotocykla, NapedMotocykla napedMotocykla) {
			LocalDate teraz = LocalDate.now();
			if(rokProdukcji>teraz.getYear()||(rokProdukcji<1970)) {
				return false;
			}
			if(!nrRej.matches("[A-Z]{2,3}[A-Z0-9]{4,5}")) {
				return false;
			}
			
			if(!vin.matches("[A-Z0-9]{17}")) {
				return false;
			}

			if(iloscMiejsc<0) {
				return false;
			}
			// tu kolejne walidacje motocykla
			return true;

	}
	
	public static boolean sprawdzSamochod(String marka, String model, int rokProdukcji, int iloscMiejsc, 
                    String nrRej, String vin, int moc, int pojemnoscSilnika, 
                    TypNadwozia typNadwozia, int iloscDrzwi) {
		LocalDate teraz = LocalDate.now();
		if(rokProdukcji>teraz.getYear()||(rokProdukcji<1970)) {
			return false;
		}
		if(!nrRej.matches("[A-Z]{2,3}[A-Z0-9]{4,5}")) {
			return false;
		}
		if(!vin.matches("[A-Z0-9]{17}")) {
			return false;
		}
		if(iloscMiejsc<0) {
			return false;
		}
		return true;
		
	}
	
	public static boolean sprawdzKlientaFirma(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
             String tel, String nazwaFirmy, String nipFirmy, String adresFirmy){
  
		 DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");           
		 LocalDate teraz = LocalDate.now();

		 if(teraz.minusYears(18).isBefore(dataUrodzenia)) {
			 return false;               
		 }

		 if(!tel.matches("[0-9]{9}")) {
			 return false;
		 }
		 if(!nipFirmy.matches("[0-9]{10}")) {
			 return false;
		 }
		 return true;
	 }

	 public static boolean sprawdzKlientaOsFizyczna(String imie, String nazwisko, LocalDate dataUrodzenia, String adres,
	            String tel, String numerDowodu){
	 
	    	DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");           
	    	LocalDate teraz = LocalDate.now();

	    	if(teraz.minusYears(18).isBefore(dataUrodzenia)) {
	    		return false;               
	    	}

	    	if(!tel.matches("[0-9]{9}")) {
	    		return false;
	    	}
	    	
	    	if(!numerDowodu.matches("[A-Z]{3}[0-9]{6}")) {
	    		return false;
	    	}
	    	
	    	return true;
	 }
	 

}
