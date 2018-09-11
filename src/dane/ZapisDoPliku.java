package dane;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import pojazdy.Motocykl;
import pojazdy.Pojazd;
import pojazdy.Rower;
import pojazdy.Samochod;



public class ZapisDoPliku {
	public static void aktualizujDane() {	
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\pojazdy.txt");
			for(Pojazd i : DataBaseList.listaPojazd) {
				if(i instanceof Samochod) {
					Samochod autoTmp = (Samochod)i;
					pw.println(autoTmp.getId()+" "+autoTmp.getMarka()+" "+autoTmp.getModel()+" "+autoTmp.getRokProdukcji()+
							" "+autoTmp.getIloscMiejsc()+" "+autoTmp.getNrRej()+" "+autoTmp.getVin()+" "+autoTmp.getMoc()+
							" "+autoTmp.getPojemnoscSilnika()+" "+autoTmp.getTypNadwozia()+" "+autoTmp.getIloscDrzwi()+
							" "+autoTmp.getSegmentSamochodu());
				}
				if(i instanceof Motocykl) {
					Motocykl motoTmp = (Motocykl)i;
					pw.println(motoTmp.getId()+" "+motoTmp.getMarka()+" "+motoTmp.getModel()+" "+motoTmp.getRokProdukcji()+
							" "+motoTmp.getIloscMiejsc()+" "+motoTmp.getNrRej()+" "+motoTmp.getVin()+" "+motoTmp.getMoc()+
							" "+motoTmp.getPojemnoscSilnika()+" "+motoTmp.getTypMotocykla()+" "+motoTmp.getNapedMotocykla());
				}
				if(i instanceof Rower) {
					Rower rowerTmp = (Rower)i;
					pw.println(rowerTmp.getId()+" "+rowerTmp.getMarka()+" "+rowerTmp.getModel()+" "+rowerTmp.getRokProdukcji()+
							" "+rowerTmp.getIloscMiejsc()+" "+rowerTmp.getTypRoweru());
				}

			}
			pw.close();

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} 
	}

}
