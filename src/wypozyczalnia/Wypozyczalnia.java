package wypozyczalnia;

import java.util.ArrayList;




public class Wypozyczalnia {
    
    private static ArrayList<Pojazd> listaPojazdow = new ArrayList<Pojazd>();

    public static void main(String[] args) {
        Samochod mot1 = new Samochod(1, "Opel", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypSamochodu.HATCHBACK, 5);
        Samochod mot2 = new Samochod(1, "Nissan", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypSamochodu.HATCHBACK, 5);
        Samochod mot3 = new Samochod(1, "Ferrari", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypSamochodu.HATCHBACK, 5);
        Samochod mot4 = new Samochod(1, "Fiat", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypSamochodu.HATCHBACK, 5);
        Samochod mot5 = new Samochod(1, "Kamaz", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypSamochodu.HATCHBACK, 5);
            
        Okno ramka = new Okno();
        listaPojazdow.add(mot1);
        listaPojazdow.add(mot2);
        listaPojazdow.add(mot3);
        listaPojazdow.add(mot4);
        listaPojazdow.add(mot5);
        wyswietl();
       
        
        
    }
    
     
        
    public static void wyswietl(){
        
            for (Pojazd i : listaPojazdow) {
                System.out.println(i.getMarka());
            } 
        }
        
}
