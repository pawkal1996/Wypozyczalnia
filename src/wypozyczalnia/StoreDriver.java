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
public interface StoreDriver {
    public boolean init();
    public boolean saveVehicle(Pojazd p);
    public boolean savePerson(Osoba p);
    public Osoba getPerson(int id);
    public Osoba getVehicle(int id);
}
