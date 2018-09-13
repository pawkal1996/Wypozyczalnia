package pojazdy;

import datacheck.DataStore;

public class Rower extends Pojazd {
	private TypRoweru typRoweru;
	private String nrSeryjny;

	public Rower(String marka, String model, int rokProdukcji, int iloscMiejsc,
			TypRoweru typRoweru, String nrSeryjny) {
		super(marka, model, rokProdukcji, iloscMiejsc);
		this.typRoweru=typRoweru; 
		this.nrSeryjny=nrSeryjny;
		DataStore.storeRower(this);
	}

	public boolean zmienRower(String marka, String model, int rokProdukcji, int iloscMiejsc,
			TypRoweru typRoweru, String nrSeryjny) {
		if(DataStore.sprawdzRower(marka, model, rokProdukcji, iloscMiejsc, typRoweru, nrSeryjny)) {
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
	
	public String getNrSeryjny() {
		return nrSeryjny;
	}

	//settery
	public void setTypRoweru(TypRoweru typRoweru){
		this.typRoweru=typRoweru;
	}
	
	public void setNrSeryjny(String nrSeryjny) {
		this.nrSeryjny=nrSeryjny;
	}


}
