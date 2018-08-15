package wypozyczalnia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;




public class Wypozyczalnia {
    
    
    
    public static void main(String[] args) {
         
        DateTimeFormatter formatDaty = DateTimeFormatter.ofPattern("yyyy MM dd");
        
        Samochod mot1 = new Samochod("Opel", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot2 = new Samochod("Nissan", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot3 = new Samochod("Ferrari", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot4 = new Samochod("Fiat", "Astra", 25, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Samochod mot5 = new Samochod("Kamaz", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypNadwozia.HATCHBACK, 5);
        Motocykl mot6 = new Motocykl("Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Motocykl mot7 = new Motocykl("Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Motocykl mot8 = new Motocykl("Kawasaki","Ninja",2005,2,"WR1231","numervintujest",210,1989,TypMotocykla.SZOSOWY,NapedMotocykla.PAS);
        Rower rower = new Rower("Romet","Wigry",2009,2,TypRoweru.MIEJSKI);
        
        KlientFirma klient=new KlientFirma("Pawel", "Nowak", LocalDate.parse("1996 07 12",formatDaty), "Lowicka 23","789100081",
                    "Kaszanki3", "0920385520", "Dzika 812"); 
        KlientOsFizyczna klient1=new KlientOsFizyczna("Kamil", "Kowalski", LocalDate.parse("1999 10 11", formatDaty),
        				"Dzika 12","384294123", "AXZ123345");
        
        Rezerwacja rez1 = new Rezerwacja(LocalDate.parse("2018 07 12",formatDaty), LocalDate.parse("2018 07 13",formatDaty), klient1,
                mot4, 150, StatusRezerwacji.PLANOWANA);
       
        
        
        
    }
    
     
        

        
}
