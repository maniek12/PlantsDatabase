package config;

import java.io.*;
import java.util.*;

public class AppConfig {

	private int sceneWidth;
	private int sceneHeight;
	

	private static AppConfig config;

	private AppConfig() {

		loadConfig();
	}

	public static AppConfig getInstance() {

		if (config == null)
			config = new AppConfig();
		return config;
	}

	private void loadConfig() {

		try {
			File file = new File("configuration.conf");
			Scanner in = new Scanner(file);

			loadSceneSize(in);

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

	private void loadSceneSize(Scanner in) {
		
		sceneHeight = Integer.parseInt(getNextLine(in));
		sceneWidth = Integer.parseInt(getNextLine(in));
	}

	//----GETTERS--------------------
	public int getSceneWidth() {
		return sceneWidth;
	}

	public int getSceneHeight() {
		return sceneHeight;
	}
	
	
}