package dane;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


import osoby.Klient;
import osoby.KlientFirma;
import osoby.KlientOsFizyczna;
import pojazdy.Motocykl;
import pojazdy.Pojazd;
import pojazdy.Rower;
import pojazdy.Samochod;
import rezerwacje.Rezerwacja;



public class ZapisDoPliku {
	public static void aktualizujDane() {	
		PrintWriter pw = null;
		PrintWriter pw1 = null;
		PrintWriter pw2 = null;
		try {
			pw = new PrintWriter("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\pojazdy.txt");
			pw1 = new PrintWriter("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\klienci.txt");
			pw2 = new PrintWriter("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\rezerwacje.txt");
			for(Pojazd i : DataBaseList.listaPojazd) {
				if(i instanceof Samochod) {
					Samochod autoTmp = (Samochod)i;
					pw.println("S "+autoTmp.getId()+" "+autoTmp.getMarka()+" "+autoTmp.getModel()+" "+autoTmp.getRokProdukcji()+
							" "+autoTmp.getIloscMiejsc()+" "+autoTmp.getNrRej()+" "+autoTmp.getVin()+" "+autoTmp.getMoc()+
							" "+autoTmp.getPojemnoscSilnika()+" "+autoTmp.getTypNadwozia()+" "+autoTmp.getIloscDrzwi()+
							" "+autoTmp.getSegmentSamochodu());
				}
				if(i instanceof Motocykl) {
					Motocykl motoTmp = (Motocykl)i;
					pw.println("M "+motoTmp.getId()+" "+motoTmp.getMarka()+" "+motoTmp.getModel()+" "+motoTmp.getRokProdukcji()+
							" "+motoTmp.getIloscMiejsc()+" "+motoTmp.getNrRej()+" "+motoTmp.getVin()+" "+motoTmp.getMoc()+
							" "+motoTmp.getPojemnoscSilnika()+" "+motoTmp.getTypMotocykla()+" "+motoTmp.getNapedMotocykla());
				}
				if(i instanceof Rower) {
					Rower rowerTmp = (Rower)i;
					pw.println("R "+rowerTmp.getId()+" "+rowerTmp.getMarka()+" "+rowerTmp.getModel()+" "+rowerTmp.getRokProdukcji()+
							" "+rowerTmp.getIloscMiejsc()+" "+rowerTmp.getTypRoweru());
				}
			}
			pw.close();
			for(Klient i : DataBaseList.listaKlient) {
				if(i instanceof KlientFirma) {
					KlientFirma klientTmp = (KlientFirma)i;
					pw1.println("F "+klientTmp.getIdKlienta()+" "+klientTmp.getImie()+" "+klientTmp.getNazwisko()+
							" "+klientTmp.getDataUrodzenia()+" "+klientTmp.getAdres()+" "+klientTmp.getTel()+
							" "+klientTmp.getNazwaFirmy()+" "+klientTmp.getNipFirmy()+" "+klientTmp.getAdresFirmy());
				}
				if(i instanceof KlientOsFizyczna) {
					KlientOsFizyczna klientTmp = (KlientOsFizyczna)i;
					pw1.println("O "+klientTmp.getIdKlienta()+" "+klientTmp.getImie()+" "+klientTmp.getNazwisko()+
							" "+klientTmp.getDataUrodzenia()+" "+klientTmp.getAdres()+" "+klientTmp.getTel());
				}
				
			}
			pw1.close();
			for(Rezerwacja i : DataBaseList.listaRezerwacja) {
				pw2.println(i.getIdRezerwacji()+" "+i.getDataStartu()+" "+i.getDataKonca()+" "+i.getKlient().getIdKlienta()+
						" "+i.getPojazd().getId()+" "+i.getStatusRezerwacji());
			}
			pw2.close();

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} 
	}

}
