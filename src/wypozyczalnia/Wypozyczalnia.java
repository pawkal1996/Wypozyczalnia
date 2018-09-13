package wypozyczalnia;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dane.DataBaseList;
import dane.OdczytZPliku;
import dane.ZapisDoPliku;
import datacheck.DataStore;
import osoby.KlientFirma;
import osoby.KlientOsFizyczna;
import pojazdy.Cennik;
import pojazdy.Motocykl;
import pojazdy.NapedMotocykla;
import pojazdy.Rower;
import pojazdy.Samochod;
import pojazdy.SegmentSamochodu;
import pojazdy.TypMotocykla;
import pojazdy.TypNadwozia;
import pojazdy.TypRoweru;
import rezerwacje.Rezerwacja;
import rezerwacje.StatusRezerwacji;





public class Wypozyczalnia {



	public static void main(String[] args) {

		Cennik.inicjalizacjaCennika();
		DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");
		try {
			OdczytZPliku.wczytajDane();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Samochod mot1 = new Samochod("Opel", "Astra", 2005, 5, "DW485WP", "ASDQWEASDQWE32190", 125, 1788, TypNadwozia.HATCHBACK, 5, SegmentSamochodu.A);
		Samochod mot2 = new Samochod("Land rover", "Discovery", 2005, 5, "DW485WP", "ASDQWEASDQWE32191", 125, 1788, TypNadwozia.HATCHBACK, 5, SegmentSamochodu.A);
		Samochod mot3 = new Samochod("Ferrari", "Testarosa", 2005, 5, "DW485WP", "ASDQWEASDQWE32192", 125, 1788, TypNadwozia.HATCHBACK, 5, SegmentSamochodu.C);
		Samochod mot4 = new Samochod("Fiat", "Panda", 1995, 5, "DW485WP", "ASDQWEASDQWE32193", 125, 1788, TypNadwozia.HATCHBACK, 5, SegmentSamochodu.A);
		Samochod mot5 = new Samochod("Kamaz", "U300", 2005, 5, "DW485WP", "ASDQWEASDQWE32194", 125, 1788, TypNadwozia.HATCHBACK, 5, SegmentSamochodu.A);

		Motocykl mot6 = new Motocykl("Kawasaki","Ninja",2005,2,"WR1231","ASDQWEASDQWE32195",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
		Motocykl mot7 = new Motocykl("Kaw asaki","Ninja",2005,2,"WR1231","ASDQWEASDQWE32196",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
		Motocykl mot8 = new Motocykl("Kawasaki","Ninja",2005,2,"WR1231","ASDQWEASDQWE32197",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);

		Rower rower = new Rower("Ro met","Wigry",2009,2,TypRoweru.MIEJSKI, "ASFRFDSE33"); 
		Rower rower2 = new Rower("Tadziu","Badziu",2009,2,TypRoweru.DZIECIECY, "SDFEE3242123"); 

		
		KlientFirma klient = new KlientFirma("Pawel", "Nowak", LocalDate.parse("2000 07 12",formatDaty), "Lowicka 23","789100081",
				"Kaszanki3", "0920389520", "Dzika 812"); 

		KlientOsFizyczna klient1 = new KlientOsFizyczna("Kamil", "Kowalski", LocalDate.parse("1999 10 11", formatDaty),
				"Dzika 12","384294123", "AXZ123345", "96072509887");


		Rezerwacja rez1  =new Rezerwacja(LocalDate.parse("2018 07 14",formatDaty), LocalDate.parse("2018 07 15",formatDaty), klient,
				rower, StatusRezerwacji.PLANOWANA);
		Rezerwacja rez2  =new Rezerwacja(LocalDate.parse("2018 07 19",formatDaty), LocalDate.parse("2018 07 21",formatDaty), klient1,
				mot3, StatusRezerwacji.PLANOWANA);

		 

		ZapisDoPliku.aktualizujDane();
	}        
}
