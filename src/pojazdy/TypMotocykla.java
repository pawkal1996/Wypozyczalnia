package pojazdy;

public enum TypMotocykla {
	SZOSOWY(0),
	TURYSTYCZNY(1),
	SPORTOWY(2);

	int value;
	TypMotocykla(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}
