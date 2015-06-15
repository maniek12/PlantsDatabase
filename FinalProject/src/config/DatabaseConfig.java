package config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DatabaseConfig {
	
	
	String driver;
	String databaseUrl;
	//--Singleton--------------
	
	private static DatabaseConfig config;
	
	private DatabaseConfig() {
		
		loadConfig();
	}
	
	public DatabaseConfig getInstance() {
		
		if(config == null)
			config = new DatabaseConfig();
		return config;
	}
	//-------------------------
	
	private void loadConfig() {

		try {
			File file = new File("tables.conf");
			Scanner in = new Scanner(file);

			loadDatabaseParameters(in);
			
			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("Plik konfiguracyjny nie zosta³ znaleziony");
		}
	}
	
	/**
	 * Metoda zwraca kolejny wiersz z pliku, który nie rozpoczyna sie znakiem
	 * ' '.
	 * 
	 * @param in
	 * @return String z kolejnym wierszem pliku.
	 */
	private String getNextLine(Scanner in) {

		String line = " ";
		while (line.startsWith(" ") || line.equals(""))
			line = in.nextLine();

		return line;
	}
	
	private void loadDatabaseParameters(Scanner in) {
		
		driver = getNextLine(in);
		databaseUrl = getNextLine(in);
	}
	
	private void loadTablesNames() {
		
	}
}