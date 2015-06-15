package database;

import java.sql.*;

import application.AppData;
import javafx.collections.*;

public class Database {

	public static ObservableList<SimplePlant> getPlantsList() {

		ObservableList<SimplePlant> list = FXCollections.observableArrayList();

		Connection connection = AppData.getInstance().getConnection();

		try {

			Statement stat = connection.createStatement();

			ResultSet result = stat
					.executeQuery("SELECT id_rosliny, gatunek_pol, gatunek_lac FROM roslina");

			String gatunek_pol, gatunek_lac;
			int id_rosliny;
			while (result.next()) {
				id_rosliny = result.getInt("id_rosliny");
				gatunek_pol = result.getString("gatunek_pol");
				gatunek_lac = result.getString("gatunek_lac");

				list.add(new SimplePlant(id_rosliny, gatunek_pol, gatunek_lac));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return list;
	}

	public static Plant getPlant(int plantId) {

		Plant plant = new Plant();

		Connection connection = AppData.getInstance().getConnection();

		try {

			PreparedStatement prepStatement = connection
					.prepareStatement("SELECT kategoria, rzad_lac, rzad_pol, rodzina_lac, "
							+ "rodzina_pol, rodzaj_lac, rodzaj_pol, gatunek_lac, gatunek_pol, "
							+ "odmiana, wysokosc_min, wysokosc_max, szerokosc, rozstawa_x, "
							+ "rozstawa_y, pokroj, zimozielonosc, mrozoodpornosc, rodzaj_gleby, "
							+ "odczyn_gleby, stanowisko_swiatlo, stanowisko_wiatr, wilgotnosc, "
							+ "liscie, barwa_lisci, kwiaty, barwa_kwiatow, pora_kwitnienia, zapach, "
							+ "owoce, przebarwianie, formowanie, bukiety, rozmnazanie, walory, "
							+ "uwagi FROM roslina WHERE id_rosliny = ?");

			prepStatement.setString(1, Integer.toString(plantId));
			ResultSet result = prepStatement.executeQuery();

			plant.setId(plantId);
			
			while (result.next()) {
				plant.setKategoria(result.getString("kategoria"));
				plant.setRzadLac(result.getString("rzad_lac"));
				plant.setRzadPol(result.getString("rzad_pol"));
				plant.setRodzinaLac(result.getString("rodzina_lac"));
				plant.setRodzinaPol(result.getString("rodzina_pol"));
				plant.setRodzajLac(result.getString("rodzaj_lac"));
				plant.setRodzajPol(result.getString("rodzaj_pol"));
				plant.setGatunekLac(result.getString("gatunek_lac"));
				plant.setGatunekPol(result.getString("gatunek_pol"));
				plant.setOdmiana(result.getString("odmiana"));
				plant.setWysokoscMin(result.getInt("wysokosc_min"));
				plant.setWysokoscMax(result.getInt("wysokosc_max"));
				plant.setSzerokosc(result.getInt("szerokosc"));
				plant.setRozstawaX(result.getInt("rozstawa_x"));
				plant.setRozstawaY(result.getInt("rozstawa_y"));
				plant.setPokroj(result.getString("pokroj"));
				plant.setZimozielonosc(result.getString("zimozielonosc"));
				plant.setMrozoodpornosc(result.getString("mrozoodpornosc"));
				plant.setRodzajGleby(result.getString("rodzaj_gleby"));
				plant.setOdczynGleby(result.getString("odczyn_gleby"));
				plant.setStanowiskoSwiatlo(result.getString("stanowisko_swiatlo"));
				plant.setStanowiskoWiatr(result.getString("stanowisko_wiatr"));
				plant.setWilgotnosc(result.getString("wilgotnosc"));
				plant.setLiscie(result.getString("liscie"));
				plant.setBarwaLisci(result.getString("barwa_lisci"));
				plant.setKwiaty(result.getString("kwiaty"));
				plant.setBarwaKwiatow(result.getString("barwa_kwiatow"));
				plant.setPoraKwitnienia(result.getInt("pora_kwitnienia"));
				plant.setZapach(result.getString("zapach"));
				plant.setOwoce(result.getString("owoce"));
				plant.setPrzebarwianie(result.getString("przebarwianie"));
				plant.setFormowanie(result.getString("formowanie"));
				plant.setBukiety(result.getString("bukiety"));
				plant.setRozmnazanie(result.getString("rozmnazanie"));
				plant.setWalory(result.getString("walory"));
				plant.setUwagi(result.getString("uwagi"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return plant;
	}

	public static ObservableList<String> getDecision() {

		return getDatabaseOptions("decyzja", "decyzja");
	}

	public static ObservableList<String> getClassification() {

		return getDatabaseOptions("kategoria", "kategoria");
	}

	public static ObservableList<String> getFrostResistance() {

		return getDatabaseOptions("mrozoodpornosc", "mrozoodpornosc");
	}

	public static ObservableList<String> getPositionWind() {

		return getDatabaseOptions("stanowisko_wiatr", "stanowisko");
	}

	public static ObservableList<String> getPositionLight() {

		return getDatabaseOptions("stanowisko_swiatlo", "stanowisko");
	}

	public static ObservableList<String> getHabit() {

		return getDatabaseOptions("pokroj", "pokroj");
	}

	public static ObservableList<String> getSoilType() {

		return getDatabaseOptions("rodzaj_gleby", "rodzaj_gleby");
	}

	public static ObservableList<String> getSoilReaction() {

		return getDatabaseOptions("odczyn_gleby", "odczyn_gleby");
	}

	public static ObservableList<String> getReproduction() {

		return getDatabaseOptions("rozmnazanie", "rozmnazanie");
	}

	public static ObservableList<String> getHumidity() {

		return getDatabaseOptions("wilgotnosc", "wilgotnosc");
	}

	/**
	 * Uniwersalna metoda pomocnicza zwracaj¹ca listê wszystkich wierszy
	 * pojedynczej kolumny tabeli z bazy danych.
	 * 
	 * @param tableName
	 *            String z nazw¹ kolumny tabeli
	 * @param columnName
	 *            String z nazw¹ tabeli
	 * @return ObservableList z list¹ obiektów String z wierszami jednej kolumny
	 */
	private static ObservableList<String> getDatabaseOptions(String tableName,
			String columnName) {

		ObservableList<String> list = FXCollections.observableArrayList();

		Connection connection = AppData.getInstance().getConnection();

		list.add("");

		try {

			Statement stat = connection.createStatement();

			ResultSet result = stat.executeQuery("SELECT " + columnName
					+ " FROM " + tableName);

			String singleOption;
			while (result.next()) {
				singleOption = result.getString(columnName);

				list.add(singleOption);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return list;
	}
}