package wypozyczalnia;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;




public class Wypozyczalnia {
    
    
    
    public static void main(String[] args) {
         
        
        
        Samochod mot1 = new Samochod(1, "Opel", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot2 = new Samochod(1, "Nissan", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot3 = new Samochod(1, "Ferrari", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot4 = new Samochod(1, "Fiat", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot5 = new Samochod(1, "Kamaz", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Motocykl mot6 = new Motocykl(1,"Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Motocykl mot7 = new Motocykl(1,"Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Motocykl mot8 = new Motocykl(1,"Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Rower rower = new Rower(1,"Romet","Wigry",2009,2,TypRoweru.MIEJSKI);
        Date data1 = new Date(2018,8,23);
        Date data2 = new Date(2015,2,21);
        KlientFirma klient1 = new KlientFirma("Pawel", "Kalasiewicz", "2012 01 12", "Lowicka 12",
                       "568892332", 4, "2010 01 12",
                       "MoreLiny", "734857832", "Kaszubska 123");
        System.out.println(klient1.getNazwaFirmy());
        
        //Pojazd.dodajPojazd(rower);
        //Pojazd.wyswietl();
       
        
        
        
    }
    
     
        

        
}
