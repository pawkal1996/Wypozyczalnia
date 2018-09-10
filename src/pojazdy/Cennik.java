package pojazdy;

public class Cennik{
	public static int[] cenaSamochodu = new int[5];
	public static int[] cenaMotocykla = new int[3];
	public static int[] cenaRoweru = new int[6];

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