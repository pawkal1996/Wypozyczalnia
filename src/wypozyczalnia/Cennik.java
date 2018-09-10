package wypozyczalnia;

public class Cennik{
	static int[] cenaSamochodu = new int[5];
	static int[] cenaMotocykla = new int[3];
	static int[] cenaRoweru = new int[6];
	
	public static void inicjalizacjaCennika() {
		cenaSamochodu[SegmentSamochodu.A.getValue()]=90;
		cenaSamochodu[SegmentSamochodu.B.getValue()]=125;
		cenaSamochodu[SegmentSamochodu.C.getValue()]=150;
		cenaSamochodu[SegmentSamochodu.D.getValue()]=190;
		cenaSamochodu[SegmentSamochodu.E.getValue()]=250;
		
		cenaMotocykla[TypMotocykla.SZOSOWY.getValue()]=170;
		cenaMotocykla[TypMotocykla.TURYSTYCZNY.getValue()]=190;
		cenaMotocykla[TypMotocykla.SPORTOWY.getValue()]=290;
		
		cenaRoweru[TypRoweru.GORSKI.getValue()]=25;
		cenaRoweru[TypRoweru.MIEJSKI.getValue()]=20;
		cenaRoweru[TypRoweru.SPORTOWY.getValue()]=30;
		cenaRoweru[TypRoweru.DZIECIECY.getValue()]=10;
		cenaRoweru[TypRoweru.SKLADANY.getValue()]=29;
		cenaRoweru[TypRoweru.TREKKINGOWY.getValue()]=33;
				
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

enum TypMotocykla {
    SZOSOWY(0),
    TURYSTYCZNY(1),
    SPORTOWY(2);
	
	int value;
	TypMotocykla(int value){
		this.value=value;
	}
	int getValue() {
		return value;
	}
}	
 enum TypRoweru {
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
	int getValue() {
		return value;
	}
    
}






