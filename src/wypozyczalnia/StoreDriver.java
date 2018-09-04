package wypozyczalnia;

import java.time.LocalDate;

public interface StoreDriver {
	public boolean czyPojazdWolny(Pojazd p, LocalDate dataStartu, LocalDate dataKonca);
}
