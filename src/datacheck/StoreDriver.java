package datacheck;

import java.util.ArrayList;

import osoby.Klient;
import pojazdy.Pojazd;
import rezerwacje.Rezerwacja;

public interface StoreDriver {
	public ArrayList<Rezerwacja> getListaRezerwacji(Pojazd pojazdSprawdzany);
	public boolean zapiszKlienta(Klient klient);
	public boolean zapiszPojazd(Pojazd pojazd);
	public boolean zapiszRezerwacje(Rezerwacja r);
	public boolean czyIstniejeKlient(Klient k);
	public boolean czyIstniejePojazd(Pojazd p);
	public boolean usunPojazd(Pojazd p);
	public boolean usunKlienta(Klient k);
}
