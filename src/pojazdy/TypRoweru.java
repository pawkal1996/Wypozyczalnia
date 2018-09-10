package pojazdy;

public enum TypRoweru {
    GORSKI(0),
    MIEJSKI(1),
    SPORTOWY(2),
    DZIECIECY(3),
    SKLADANY(4),
    TREKKINGOWY(5);
	 
	int value;
	TypRoweru(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
    
}
