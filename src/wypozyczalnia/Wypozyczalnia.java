package wypozyczalnia;

import java.util.ArrayList;




public class Wypozyczalnia {
    
    private static ArrayList<Pojazd> listaPojazdow = new ArrayList<Pojazd>();

    public static void main(String[] args) {
        Samochod mot1 = new Samochod(1, "Opel", "Astra", 2005, 5, "DW485WP", "SDFSDFS2323", 125, 1788, TypSamochodu.HATCHBACK, 5);
        
        Okno ramka = new Okno();
        
    
       

        
    }
    
     
        
    public static void wyswietl(){
        
            for (Pojazd i : listaPojazdow) {
                System.out.println(i.getMarka());
            } 
        }
        
}
