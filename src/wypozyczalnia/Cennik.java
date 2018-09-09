package wypozyczalnia;

public class Cennik{
	static int[] cena = new int[5];
	public static void inicjalizacjaCennika() {
	cena[SegmentSamochodu.A.getValue()]=90;
	cena[SegmentSamochodu.B.getValue()]=125;
	cena[SegmentSamochodu.C.getValue()]=150;
	cena[SegmentSamochodu.D.getValue()]=190;
	cena[SegmentSamochodu.E.getValue()]=250;
	}

}

enum SegmentSamochodu {
	A(0),
	B(1),
	C(2),
	D(3),
	E(4);
	
	int value;
	SegmentSamochodu(int value){
		this.value=value;
	}
	int getValue() {
		return value;
	}
}





