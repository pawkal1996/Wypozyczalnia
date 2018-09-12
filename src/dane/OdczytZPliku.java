package dane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytZPliku {
	public static void wczytajDane() throws FileNotFoundException {
		File pojazdy = new File("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\pojazdy.txt");
		Scanner sc = new Scanner(pojazdy);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());	

		}
		sc.close();
	}
}
