package dane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import pojazdy.Motocykl;
import pojazdy.NapedMotocykla;
import pojazdy.Rower;
import pojazdy.Samochod;
import pojazdy.SegmentSamochodu;
import pojazdy.TypMotocykla;
import pojazdy.TypNadwozia;
import pojazdy.TypRoweru;

public class OdczytZPliku {
	public static void wczytajDane() throws FileNotFoundException {
		File pojazdy = new File("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\pojazdy.txt");
		Scanner sc = new Scanner(pojazdy);
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
	}
}
