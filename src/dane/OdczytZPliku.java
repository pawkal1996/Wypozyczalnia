package dane;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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

public class OdczytZPliku {
	public static void wczytajDane() throws FileNotFoundException {
		DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		File pojazdy = new File("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\pojazdy.txt");
		File klienci = new File("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\klienci.txt");
		File rezerwacje = new File("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\rezerwacje.txt");
		Scanner sc = new Scanner(pojazdy);
		Scanner sc1 = new Scanner(klienci);
		Scanner sc2 = new Scanner(rezerwacje);

		String line[] = null;
		while(sc.hasNext()) {
			line=sc.nextLine().split(";");
			if(line[0].equals("S")) {
				String marka = line[2];
				String model = line[3];
				Integer rokProd = Integer.parseInt(line[4]);
				Integer iloscMiejsc = Integer.parseInt(line[5]);
				String nrRej = line[6];
				String vin = line[7];
				Integer moc = Integer.parseInt(line[8]);
				Integer pojemnoscSilnika = Integer.parseInt(line[9]);
				String typNadwozia = line[10];
				Integer iloscDrzwi = Integer.parseInt(line[11]);
				String segmentSamochodu = line[12];

				Samochod mot = new Samochod(marka, model, rokProd, iloscMiejsc, nrRej, vin, moc, pojemnoscSilnika,
						TypNadwozia.valueOf(typNadwozia), iloscDrzwi, SegmentSamochodu.valueOf(segmentSamochodu));
			}
			if(line[0].equals("M")) {
				String marka = line[2];
				String model = line[3];
				Integer rokProd = Integer.parseInt(line[4]);
				Integer iloscMiejsc = Integer.parseInt(line[5]);
				String nrRej = line[6];
				String vin = line[7];
				Integer moc = Integer.parseInt(line[8]);
				Integer pojemnoscSilnika = Integer.parseInt(line[9]);
				String typMotocykla = line[10];
				String napedMotocykla = line[11];

				Motocykl mot = new Motocykl(marka, model, rokProd, iloscMiejsc, nrRej, vin, moc, pojemnoscSilnika,
						TypMotocykla.valueOf(typMotocykla), NapedMotocykla.valueOf(napedMotocykla));
			}
			if(line[0].equals("R")) {
				//new Rower("Ro met","Wigry",2009,2,TypRoweru.MIEJSKI);
				String marka = line[2];
				String model = line[3];
				Integer rokProd = Integer.parseInt(line[4]);
				Integer iloscMiejsc = Integer.parseInt(line[5]);
				String typRoweru = line[6];

				Rower mot = new Rower(marka, model, rokProd, iloscMiejsc, TypRoweru.valueOf(typRoweru));
			}

		}
		sc.close();

		while(sc1.hasNext()) {
			line=sc1.nextLine().split(";");
			if(line[0].equals("F")) {

				String imie = line[2];
				String nazwisko = line[3];
				String dataUr = line[4];
				String adres = line[5];
				String tel = line[6];
				String nazwaFirmy = line[7];
				String nip = line[8];
				String adresFirmy = line[9];

				KlientFirma klient = new KlientFirma(imie, nazwisko, LocalDate.parse(dataUr, formatDaty), adres, tel, 
						nazwaFirmy, nip, adresFirmy);
			}
			if(line[0].equals("O")) {
				String imie = line[2];
				String nazwisko = line[3];
				String dataUr = line[4];
				String adres = line[5];
				String tel = line[6];
				String nrDowodu = line[7];
				KlientOsFizyczna klient = new KlientOsFizyczna(imie, nazwisko, LocalDate.parse(dataUr, formatDaty),
						adres, tel, nrDowodu);
			}
		}
		sc1.close();

		while(sc2.hasNext()) {

			line=sc2.nextLine().split(";");
			String dataStartu = line[1];
			String dataKonca = line[2];
			Integer klientId = Integer.parseInt(line[3]);
			Integer pojazdId = Integer.parseInt(line[4]);
			String statusRezerwacji = line[5];
			Pojazd pojazd = null;
			Klient klient = null;
			for(Klient i : DataBaseList.listaKlient) {
				if(i.getIdKlienta()==klientId) {
					klient = i;
				}
			}

			for(Pojazd i : DataBaseList.listaPojazd) {
				if(i.getId()==pojazdId){
					pojazd = i;
				}
			}

			Rezerwacja rez = new Rezerwacja(LocalDate.parse(dataStartu, formatDaty), LocalDate.parse(dataKonca, formatDaty),
					klient, pojazd, StatusRezerwacji.valueOf(statusRezerwacji));
		}
	}
}
