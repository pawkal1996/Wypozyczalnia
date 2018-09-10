package wypozyczalnia;

import java.util.ArrayList;

import osoby.Klient;
import pojazdy.Pojazd;

public interface StoreDriver {
	public ArrayList<Rezerwacja> getListaRezerwacji(Pojazd pojazdSprawdzany);
	public boolean zapiszKlienta(Klient klient);
	public boolean zapiszPojazd(Pojazd pojazd);
	public boolean zapiszRezerwacje(Rezerwacja r);
	public boolean czyIstniejeKlient(Klient k);
	public boolean czyIstniejePojazd(Pojazd p);
}
