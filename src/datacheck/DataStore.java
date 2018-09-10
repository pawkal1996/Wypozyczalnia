package datacheck;

import java.time.LocalDate;
import java.util.ArrayList;

import dane.DataBaseList;
import osoby.Klient;
import osoby.KlientFirma;
import osoby.KlientOsFizyczna;
import pojazdy.Motocykl;
import pojazdy.NapedMotocykla;
import pojazdy.Pojazd;
import pojazdy.Rower;
import pojazdy.Samochod;
import pojazdy.SegmentSamochodu;
import pojazdy.TypMotocykla;
import pojazdy.TypNadwozia;
import pojazdy.TypRoweru;
import rezerwacje.Rezerwacja;
import rezerwacje.StatusRezerwacji;



public class DataStore{
	private static DataBaseList db = new DataBaseList();
	
	public static void storeKlientFirma(KlientFirma k) {
		if(sprawdzKlientaFirma(k.getImie(), k.getNazwisko(), k.getDataUrodzenia(), k.getAdres(),
				k.getTel(), k.getNazwaFirmy(), k.getNipFirmy(), k.getAdresFirmy())) {
			Klient.zwiekszIdKlienta();
			db.zapiszKlienta(k);
		}
	}
	public static void storeKlientOsFizyczna(KlientOsFizyczna k) {
		if(sprawdzKlientaOsFizyczna(k.getImie(),k.getNazwisko(),k.getDataUrodzenia(),k.getAdres(),k.getTel(),k.getNumerDowodu())){
			Klient.zwiekszIdKlienta();
			db.zapiszKlienta(k);
		}
	}

	public static void storeSamochod(Samochod p) {
		if(sprawdzSamochod(p.getMarka(),p.getModel(),p.getRokProdukcji(), p.getIloscMiejsc(), 
                p.getNrRej(), p.getVin(), p.getMoc(), p.getPojemnoscSilnika(), 
                p.getTypNadwozia(), p.getIloscDrzwi(), p.getSegmentSamochodu())){
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
        if(!db.czyIstniejeKlient(klient)) {
        	return false;
        }
        
        if(!db.czyIstniejePojazd(pojazd)) {
        	return false;
        }
        
		if(dataStartu.isAfter(dataKonca)){
            return false;
        }
		
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
                    TypNadwozia typNadwozia, int iloscDrzwi, SegmentSamochodu segment) {
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
