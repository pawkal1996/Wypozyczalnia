package pojazdy;

public enum SegmentSamochodu {
	A(0),
	B(1),
	C(2),
	D(3),
	E(4);

	int value;
	SegmentSamochodu(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}
