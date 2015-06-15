package gui;

import config.*;
import database.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

class FiltersPane extends FlowPane {

	public static final int SIMPLE = 0, ADVANCED = 1;

	private ComboBox<String> classification;
	private TextField orderPol;
	private TextField orderLat;
	private TextField familyPol;
	private TextField familyLat;
	private TextField subfamilyPol;
	private TextField subfamilyLat;
	private TextField genusPol;
	private TextField genusLat;
	private TextField variety;
	private TextField heightMin;
	private TextField heightMax;
	private TextField spacingX;
	private TextField spacingY;
	private ComboBox<String> habit;
	private ComboBox<String> hardiness;
	private ComboBox<String> frostResistance;
	private ComboBox<String> soilType;
	private ComboBox<String> soilReaction;
	private ComboBox<String> positionLight;
	private ComboBox<String> positionWind;
	private ComboBox<String> humidity;
	private TextField leaves;
	private TextField leavesColour;
	private TextField flowers;
	private TextField flowersColour;
	private TextField florescenceTime;
	private ComboBox<String> smell;
	private TextField fruits;
	private ComboBox<String> discolouration;
	private ComboBox<String> forming;
	private ComboBox<String> bouqets;
	private ComboBox<String> reproduction;
	private TextField values;

	ObservableList<SingleFilter> simpleFiltersList;
	ObservableList<SingleFilter> advancedFiltersList;

	private int mode = SIMPLE;

	public FiltersPane() {

		super();

		init();

		// mode = FiltersMode.SIMPLE;

		LanguageConfig language = LanguageConfig.getInstance();

		simpleFiltersList = FXCollections.observableArrayList();

		simpleFiltersList.addAll(new SingleFilter(language.getClassification(),
				classification), new SingleFilter(language.getGenusPol(),
				genusPol), new SingleFilter(language.getGenusLat(), genusLat));

		advancedFiltersList = FXCollections.observableArrayList();

		advancedFiltersList.addAll(simpleFiltersList);
		advancedFiltersList
				.addAll(new SingleFilter(language.getOrderPol(), orderPol),
						new SingleFilter(language.getOrderLat(), orderLat),
						new SingleFilter(language.getFamilyPol(), familyPol),
						new SingleFilter(language.getFamilyLat(), familyLat),
						new SingleFilter(language.getSubfamilyPol(),
								subfamilyPol),
						new SingleFilter(language.getSubfamilyLat(),
								subfamilyLat),

						new SingleFilter(language.getVariety(), variety),
						new SingleFilter(language.getHeight(), heightMin,
								heightMax),
						new SingleFilter(language.getSpacing(), spacingX,
								spacingY), new SingleFilter(
								language.getHabit(), habit), new SingleFilter(
								language.getHardiness(), hardiness),
						new SingleFilter(language.getFrostResistance(),
								frostResistance),
						new SingleFilter(language.getSoilType(), soilType),
						new SingleFilter(language.getSoilReaction(),
								soilReaction),
						new SingleFilter(language.getPositionLight(),
								positionLight),
						new SingleFilter(language.getPositionWind(),
								positionWind),
						new SingleFilter(language.getHumidity(), humidity),
						new SingleFilter(language.getLeaves(), leaves),
						new SingleFilter(language.getLeavesColour(),
								leavesColour),
						new SingleFilter(language.getFlowers(), flowers),
						new SingleFilter(language.getFlowersColour(),
								flowersColour),
						new SingleFilter(language.getFlorescenceTime(),
								florescenceTime),
						new SingleFilter(language.getSmell(), smell),
						new SingleFilter(language.getFruits(), fruits),
						new SingleFilter(language.getDiscolouration(),
								discolouration),
						new SingleFilter(language.getForming(), forming),
						new SingleFilter(language.getBouqets(), bouqets),
						new SingleFilter(language.getReproduction(),
								reproduction),
						new SingleFilter(language.getValues(), values));

		getChildren().addAll(simpleFiltersList);

	}

	private void init() {

		classification = new ComboBox<>(Database.getClassification());
		orderPol = new TextField();
		orderLat = new TextField();
		familyPol = new TextField();
		familyLat = new TextField();
		subfamilyPol = new TextField();
		subfamilyLat = new TextField();
		genusPol = new TextField();
		genusLat = new TextField();
		variety = new TextField();
		heightMin = new TextField();
		heightMax = new TextField();
		spacingX = new TextField();
		spacingY = new TextField();
		habit = new ComboBox<>(Database.getHabit());
		hardiness = new ComboBox<>(Database.getDecision());
		frostResistance = new ComboBox<>(Database.getFrostResistance());
		soilType = new ComboBox<>(Database.getSoilType());
		soilReaction = new ComboBox<>(Database.getSoilReaction());
		positionLight = new ComboBox<>(Database.getPositionLight());
		positionWind = new ComboBox<>(Database.getPositionWind());
		humidity = new ComboBox<>(Database.getHumidity());
		leaves = new TextField();
		leavesColour = new TextField();
		flowers = new TextField();
		flowersColour = new TextField();
		florescenceTime = new TextField();
		smell = new ComboBox<>(Database.getDecision());
		fruits = new TextField();
		discolouration = new ComboBox<>(Database.getDecision());
		forming = new ComboBox<>(Database.getDecision());
		bouqets = new ComboBox<>(Database.getDecision());
		reproduction = new ComboBox<>(Database.getReproduction());
		values = new TextField();
	}

	public int changeMode() {

		if (mode == SIMPLE) {
			mode = ADVANCED;
			getChildren().clear();
			getChildren().addAll(advancedFiltersList);

			return mode;
		} else {
			mode = SIMPLE;
			getChildren().clear();
			getChildren().addAll(simpleFiltersList);

			return mode;
		}
	}

	public String getClassification() {
		return classification.getValue();
	}

	public TextField getOrderPol() {
		return orderPol;
	}

	public TextField getOrderLat() {
		return orderLat;
	}

	public TextField getFamilyPol() {
		return familyPol;
	}

	public TextField getFamilyLat() {
		return familyLat;
	}

	public TextField getSubfamilyPol() {
		return subfamilyPol;
	}

	public TextField getSubfamilyLat() {
		return subfamilyLat;
	}

	public TextField getGenusPol() {
		return genusPol;
	}

	public TextField getGenusLat() {
		return genusLat;
	}

	public TextField getVariety() {
		return variety;
	}

	public TextField getHeightMin() {
		return heightMin;
	}

	public TextField getHeightMax() {
		return heightMax;
	}

	public TextField getSpacingX() {
		return spacingX;
	}

	public TextField getSpacingY() {
		return spacingY;
	}

	public String getHabit() {
		return habit.getValue();
	}

	public String getHardiness() {
		return hardiness.getValue();
	}

	public String getFrostResistance() {
		return frostResistance.getValue();
	}

	public String getSoilType() {
		return soilType.getValue();
	}

	public String getSoilReaction() {
		return soilReaction.getValue();
	}

	public String getPositionLight() {
		return positionLight.getValue();
	}

	public String getPositionWind() {
		return positionWind.getValue();
	}

	public String getHumidity() {
		return humidity.getValue();
	}

	public TextField getLeaves() {
		return leaves;
	}

	public TextField getLeavesColour() {
		return leavesColour;
	}

	public TextField getFlowers() {
		return flowers;
	}

	public TextField getFlowersColour() {
		return flowersColour;
	}

	public TextField getFlorescenceTime() {
		return florescenceTime;
	}

	public String getSmell() {
		return smell.getValue();
	}

	public TextField getFruits() {
		return fruits;
	}

	public String getDiscolouration() {
		return discolouration.getValue();
	}

	public String getForming() {
		return forming.getValue();
	}

	public String getBouqets() {
		return bouqets.getValue();
	}

	public String getReproduction() {
		return reproduction.getValue();
	}

	public TextField getValues() {
		return values;
	}



	// testowy filtr
	class SingleFilter extends GridPane {

		Label description;
		Control filter1, filter2;

		public SingleFilter(String description, Control filter) {

			super();

			this.description = new Label(description);
			this.filter1 = filter;

			initSimple();

			// graifika testowa
			setPadding(new Insets(2, 2, 2, 2));

			setMaxWidth(200);

			// setStyle("-fx-border-color: red;");
		}

		public SingleFilter(String description, Control filter1, Control filter2) {

			super();

			this.description = new Label(description);
			this.filter1 = filter1;
			this.filter2 = filter2;

			initComplex();

			// graifika testowa
			setPadding(new Insets(2, 2, 2, 2));

			setMaxWidth(200);

			// setStyle("-fx-border-color: red;");
		}

		private void initSimple() {

			ColumnConstraints col1 = new ColumnConstraints();
			col1.setPercentWidth(40);
			ColumnConstraints col2 = new ColumnConstraints();
			col2.setPercentWidth(60);

			getColumnConstraints().addAll(col1, col2);

			setRowIndex(description, 0);
			setColumnIndex(description, 0);
			setRowIndex(filter1, 0);
			setColumnIndex(filter1, 1);

			getChildren().addAll(description, filter1);

			setMinWidth(300);

			filter1.setPrefWidth(300);
		}

		private void initComplex() {

			ColumnConstraints col1 = new ColumnConstraints();
			col1.setPercentWidth(40);
			ColumnConstraints col2 = new ColumnConstraints();
			col2.setPercentWidth(10);
			ColumnConstraints col3 = new ColumnConstraints();
			col3.setPercentWidth(20);
			ColumnConstraints col4 = new ColumnConstraints();
			col4.setPercentWidth(10);
			ColumnConstraints col5 = new ColumnConstraints();
			col5.setPercentWidth(20);

			getColumnConstraints().addAll(col1, col2, col3, col4, col5);

			Label from = new Label("  Od");
			Label to = new Label("  Do");

			setRowIndex(description, 0);
			setColumnIndex(description, 0);
			setRowIndex(from, 0);
			setColumnIndex(from, 1);
			setRowIndex(filter1, 0);
			setColumnIndex(filter1, 2);
			setRowIndex(to, 0);
			setColumnIndex(to, 3);
			setRowIndex(filter2, 0);
			setColumnIndex(filter2, 4);

			getChildren().addAll(description, from, filter1, to, filter2);

			setMinWidth(300);
		}
	}
}