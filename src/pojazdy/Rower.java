package pojazdy;

import datacheck.DataStore;

public class Rower extends Pojazd {
	private TypRoweru typRoweru;

	public Rower(String marka, String model, int rokProdukcji, int iloscMiejsc,
			TypRoweru typRoweru) {
		super(marka, model, rokProdukcji, iloscMiejsc);
		this.typRoweru=typRoweru; 
		DataStore.storeRower(this);
	}

	public boolean zmienRower(String marka, String model, int rokProdukcji, int iloscMiejsc,
			TypRoweru typRoweru) {
		if(DataStore.sprawdzRower(marka, model, rokProdukcji, iloscMiejsc, typRoweru)) {
			this.setMarka(marka);
			this.setModel(model);
			this.setRokProdukcji(rokProdukcji);
			this.setIloscMiejsc(iloscMiejsc);
			this.setTypRoweru(typRoweru);
			return true;
		}
		return false;
	}

	//gettery
	public TypRoweru getTypRoweru(){
		return typRoweru;
	}

	//settery
	public void setTypRoweru(TypRoweru typRoweru){
		this.typRoweru=typRoweru;
	}


}
