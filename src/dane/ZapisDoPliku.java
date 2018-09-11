package dane;

import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class ZapisDoPliku {
	public static void aktualizujDane() {	
		PrintWriter pw = null;
			try {
				pw = new PrintWriter("C:\\Users\\Pawe³ K\\Documents\\NetBeansProjects\\Wypozyczalnia\\src\\dane\\pojazdy.txt");
				pw.println("To jest druga linijka w pliku");
				pw.close();

			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			} 
	}

}
