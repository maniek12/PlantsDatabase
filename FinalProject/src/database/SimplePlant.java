package database;

import java.util.ArrayList;

import javafx.scene.control.*;
import javafx.scene.control.cell.*;

public class SimplePlant {

	String polishName;
	String latineName;
	
	int id;

	public SimplePlant(int plantId, String polishName, String latineName) {
		super();
		
		this.id = plantId;
		this.polishName = polishName;
		this.latineName = latineName;
	}

	public String getPolishName() {
		return polishName;
	}

	public String getLatineName() {
		return latineName;
	}

	public void setPolishName(String polishName) {
		this.polishName = polishName;
	}

	public void setLatineName(String latineName) {
		this.latineName = latineName;
	}
	
	public int getId() {
		return this.id;
	}

	public static ArrayList<TableColumn<SimplePlant, ?>> getColumn(TableView<?> table) {

		int i;

		ArrayList<TableColumn<SimplePlant, ?>> columns = new ArrayList<TableColumn<SimplePlant, ?>>();

		String[] columnNames = { "Nazwa polska", "Nazwa ³aciñska" };
		String[] variableNames = { "polishName", "latineName" };
		Integer[] columnWidth = { 50, 50 };

		i = 0;
		TableColumn<SimplePlant, String> polishNameCol = new TableColumn<SimplePlant, String>(
				columnNames[i++]);
		TableColumn<SimplePlant, String> latineNameCol = new TableColumn<SimplePlant, String>(
				columnNames[i++]);

		i = 0;
		polishNameCol.prefWidthProperty().bind(
				table.widthProperty().divide(100 / columnWidth[i++]));
		latineNameCol.prefWidthProperty().bind(
				table.widthProperty().divide(100 / columnWidth[i++]));

		i = 0;
		polishNameCol
				.setCellValueFactory(new PropertyValueFactory<SimplePlant, String>(
						variableNames[i++]));
		latineNameCol
				.setCellValueFactory(new PropertyValueFactory<SimplePlant, String>(
						variableNames[i++]));

		columns.add(polishNameCol);
		columns.add(latineNameCol);

		return columns;

	}
}