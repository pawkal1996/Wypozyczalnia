/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

/**
 *
 * @author majko
 */
public class DataStore {
    private static  StoreDriver db;
    private DataStore(){}
    
    static boolean initStore(){
        //Tworzenie bazy, czy tam kolejek czy czegoś
        if((new ListDataBase()) instanceof StoreDriver){
             db = new ListDataBase();
             db.init();
             return true;
        }
        return false;
    }
    
    static boolean storeVehicle(Pojazd p){
        //może tu jakaś walidacja?
        db.saveVehicle(p);
        return false;
    }
    static boolean storePerson(Osoba p){
        
        return false;
    }
    
    static Pojazd loadPojazd(){
        return null;
    }
    static Pojazd loadVehicle(int id){
        return null;
    }
    static Pojazd loadPerson(int id){
        return null;
    }
    
}
