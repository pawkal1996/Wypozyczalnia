package wypozyczalnia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;




public class Wypozyczalnia {
    
    
    
    public static void main(String[] args) {
         
        DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");
        
        Samochod mot1 = new Samochod(1, "Opel", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot2 = new Samochod(1, "Nissan", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot3 = new Samochod(1, "Ferrari", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot4 = new Samochod(1, "Fiat", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot5 = new Samochod(1, "Kamaz", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Motocykl mot6 = new Motocykl(1,"Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Motocykl mot7 = new Motocykl(1,"Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Motocykl mot8 = new Motocykl(1,"Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Rower rower = new Rower(1,"Romet","Wigry",2009,2,TypRoweru.MIEJSKI);
        
        KlientFirma klient=new KlientFirma("Pawel‚", "Nowak", LocalDate.parse("1996 07 12",formatDaty), "Lowicka 23","789100081",
                    "Kaszanki3", "0920385520", "Dzika 812"); 
        /*KlientOsFizyczna.dodajKlientaOsFizyczna("Igor", "Kowalski", LocalDate.parse("1996 07 25",formatDaty), "Niepodleglosci 8",
        			"834123234", "AYY235125");*/
        
        /*KlientOsFizyczna klient = new KlientOsFizyczna("Igor", "Kowalski", LocalDate.parse("1996 07 25",formatDaty), "Niepodleglosci 8",
    			"834123234", "AYY235125");*/
        /*klient.zmienKlientaFirma("Pawel", "Nowak", LocalDate.parse("1996 07 12",formatDaty), "Lowicka 23","789100081",
                    "Kaszanki3", "0920385520", "Dzika 812");
        System.out.println(klient.imie);*/
        
        /*klient.zmienKlientaOsFizyczna("Pawel", "Kowalski", LocalDate.parse("1996 07 25",formatDaty), "Niepodleglosci 8",
    			"834123234", "AYY235125");*/
        
        /*klient.zmienKlientaFirma("Zbigniew", "Nowak", LocalDate.parse("1996 07 12",formatDaty), "Lowicka 23","789100081",
                    "Kaszanki3", "0920385520", "Dzika 812");
        System.out.println(klient.imie);*/
        
        //Pojazd.dodajPojazd(rower);
        //Pojazd.wyswietl();
       
        
        
        
    }
    
     
        

        
}
