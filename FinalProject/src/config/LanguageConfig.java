package config;

import java.io.*;
import java.util.*;

public class LanguageConfig {

	// ---Konfiguracja----------------
	private String file;
	private String open;
	private String save;
	private String close;

	private String mode;
	private String previewMode;
	private String editMode;
	private String advancedMode;

	private String help;
	private String about;
	private String using;
	
	private String classification;
	private String orderPol;
	private String orderLat;
	private String familyPol;
	private String familyLat;
	private String subfamilyPol;
	private String subfamilyLat;
	private String genusPol;
	private String genusLat;
	private String variety;
	private String height;
	private String spacing;
	private String habit;
	private String hardiness;
	private String frostResistance;
	private String soilType;
	private String soilReaction;
	private String positionLight;
	private String positionWind;
	private String humidity;
	private String leaves;
	private String leavesColour;	
	private String flowers;
	private String flowersColour;
	private String florescenceTime;
	private String smell;
	private String fruits;
	private String discolouration;
	private String forming;
	private String bouqets;
	private String reproduction;
	private String values;
	private String comments;
	
	private String filtersModeSimpleButton;
	private String filtersModeAdvancedButton;
	private String clearFiltersButton;
	private String filterButton;

	// ----Singleton------------------
	private static LanguageConfig config;

	private LanguageConfig() {

		loadConfig();
	}

	public static LanguageConfig getInstance() {

		if (config == null)
			config = new LanguageConfig();
		return config;
	}

	// --------------------------------
	private void loadConfig() {

		try {
			File languageFile = new File("language.conf");
			Scanner in = new Scanner(languageFile, "UTF-8");

			loadMenuBar(in);
			loadParamsNames(in);
			loadButtonsNames(in);

			in.close();

		} catch (FileNotFoundException e) {
			// TODO okno dialogowe (OK, zamkniêcie aplikacji)
			System.out.println("Plik jêzyka nie zosta³ znaleziony");
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

	/**
	 * Metoda ³aduje napisy do paska menu.
	 * 
	 * @param in
	 *            skaner strumienia pliku jêzyka
	 */
	private void loadMenuBar(Scanner in) {

		file = getNextLine(in);
		open = getNextLine(in);
		save = getNextLine(in);
		close = getNextLine(in);

		mode = getNextLine(in);
		previewMode = getNextLine(in);
		editMode = getNextLine(in);
		advancedMode = getNextLine(in);

		help = getNextLine(in);
		about = getNextLine(in);
		using = getNextLine(in);
	}
	
	private void loadParamsNames(Scanner in) {
		
		classification = getNextLine(in); // kategoria
		orderPol = getNextLine(in);
		orderLat = getNextLine(in);
		familyPol = getNextLine(in);
		familyLat = getNextLine(in);
		subfamilyPol = getNextLine(in);
		subfamilyLat = getNextLine(in);
		genusPol = getNextLine(in);
		genusLat = getNextLine(in);
		variety = getNextLine(in); //odmiana
		height = getNextLine(in);
		spacing = getNextLine(in); //rozstawa
		habit = getNextLine(in); //pokrój
		hardiness = getNextLine(in); //zimozielonoœæ
		frostResistance = getNextLine(in); //mrozoodpornoœæ
		soilType = getNextLine(in);
		soilReaction = getNextLine(in);
		positionLight = getNextLine(in);
		positionWind = getNextLine(in);
		humidity = getNextLine(in); //wilgotnoœæ
		leaves = getNextLine(in);
		leavesColour = getNextLine(in);	
		flowers = getNextLine(in);
		flowersColour = getNextLine(in);
		florescenceTime = getNextLine(in);
		smell = getNextLine(in);
		fruits = getNextLine(in);
		discolouration = getNextLine(in); //przebarwianie
		forming = getNextLine(in);
		bouqets = getNextLine(in);
		reproduction = getNextLine(in);
		values = getNextLine(in);
		comments = getNextLine(in);
	}
	
	private void loadButtonsNames(Scanner in) {
		
		filtersModeSimpleButton = getNextLine(in);
		filtersModeAdvancedButton = getNextLine(in);
		clearFiltersButton = getNextLine(in);
		filterButton = getNextLine(in);
	}

	// --GETTER-------------------------
	public String getFile() {
		return file;
	}

	public String getOpen() {
		return open;
	}

	public String getSave() {
		return save;
	}

	public String getClose() {
		return close;
	}

	public String getMode() {
		return mode;
	}

	public String getPreviewMode() {
		return previewMode;
	}

	public String getEditMode() {
		return editMode;
	}

	public String getAdvancedMode() {
		return advancedMode;
	}

	public String getHelp() {
		return help;
	}

	public String getAbout() {
		return about;
	}

	public String getUsing() {
		return using;
	}

	public String getClassification() {
		return classification;
	}

	public String getOrderPol() {
		return orderPol;
	}

	public String getOrderLat() {
		return orderLat;
	}

	public String getFamilyPol() {
		return familyPol;
	}

	public String getFamilyLat() {
		return familyLat;
	}

	public String getSubfamilyPol() {
		return subfamilyPol;
	}

	public String getSubfamilyLat() {
		return subfamilyLat;
	}

	public String getGenusPol() {
		return genusPol;
	}

	public String getGenusLat() {
		return genusLat;
	}

	public String getVariety() {
		return variety;
	}

	public String getHeight() {
		return height;
	}

	public String getSpacing() {
		return spacing;
	}

	public String getHabit() {
		return habit;
	}

	public String getHardiness() {
		return hardiness;
	}

	public String getFrostResistance() {
		return frostResistance;
	}

	public String getSoilType() {
		return soilType;
	}

	public String getSoilReaction() {
		return soilReaction;
	}

	public String getPositionLight() {
		return positionLight;
	}

	public String getPositionWind() {
		return positionWind;
	}

	public String getHumidity() {
		return humidity;
	}

	public String getLeaves() {
		return leaves;
	}

	public String getLeavesColour() {
		return leavesColour;
	}

	public String getFlowers() {
		return flowers;
	}

	public String getFlowersColour() {
		return flowersColour;
	}

	public String getFlorescenceTime() {
		return florescenceTime;
	}

	public String getSmell() {
		return smell;
	}

	public String getFruits() {
		return fruits;
	}

	public String getDiscolouration() {
		return discolouration;
	}

	public String getForming() {
		return forming;
	}

	public String getBouqets() {
		return bouqets;
	}

	public String getReproduction() {
		return reproduction;
	}

	public String getValues() {
		return values;
	}

	public String getComments() {
		return comments;
	}

	public String getFiltersModeSimpleButton() {
		return filtersModeSimpleButton;
	}

	public String getFiltersModeAdvancedButton() {
		return filtersModeAdvancedButton;
	}

	public String getClearFiltersButton() {
		return clearFiltersButton;
	}

	public String getFilterButton() {
		return filterButton;
	}
	
	

}