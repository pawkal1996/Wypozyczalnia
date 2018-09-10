
package pojazdy;

public abstract class PojazdSpalinowy extends Pojazd {

	private String nrRej;
	private String vin;
	private int moc;
	private int pojemnoscSilnika;

	public PojazdSpalinowy(String marka, String model, int rokProdukcji, int iloscMiejsc, String nrRej, String vin, int moc, int pojemnoscSilnika) {
		super(marka, model, rokProdukcji, iloscMiejsc);
		this.nrRej=nrRej;
		this.vin=vin;
		this.moc=moc;
		this.pojemnoscSilnika=pojemnoscSilnika;
	}

	//gettery
	public String getNrRej(){
		return nrRej;
	}
	public String getVin(){
		return vin;
	}
	public int getMoc(){
		return moc;
	}
	public int getPojemnoscSilnika(){
		return pojemnoscSilnika;
	}
	//settery
	public void setNrRej (String nrRej){
		this.nrRej=nrRej;
	}
	public void setVin(String vin){
		this.vin=vin;
	}
	public void setMoc(int moc){
		this.moc=moc;
	}
	public void setPojemnoscSilnika(int pojemnoscSilnika){
		this.pojemnoscSilnika=pojemnoscSilnika;
	}


}
