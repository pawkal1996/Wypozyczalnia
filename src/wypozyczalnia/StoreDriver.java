package wypozyczalnia;

import java.time.LocalDate;
import java.util.ArrayList;

public interface StoreDriver {
	public ArrayList<Rezerwacja> getRezerwacja(Pojazd pojazdSprawdzany);
}
