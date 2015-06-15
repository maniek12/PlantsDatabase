package gui;

import database.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class AppRoot extends VBox {

	SplitPane splitPane;
	
	TableView<SimplePlant> table;
	PreviewPane plantView;

	public AppRoot() {

		super();

		init();

		AppMenuBar menuBar = new AppMenuBar();
		FiltersPane filtersPane = new FiltersPane();
		ButtonsPane buttonsPane = new ButtonsPane(filtersPane);

		// -----------------------------------

		splitPane = new SplitPane();
		splitPane.setOrientation(Orientation.HORIZONTAL);

		plantView = new PreviewPane();

		splitPane.getItems().addAll(table, plantView);
	//	splitPane.getItems().addAll(plantView, table);

		table.setMinWidth(300);
		table.setMaxWidth(300);

		// -------------------------------------
		getChildren().addAll(menuBar, filtersPane, new Separator(),
				buttonsPane, splitPane);
		setVgrow(splitPane, Priority.ALWAYS);

		// setStyle("-fx-background-color: green;");
	}

	private void init() {

		table = new TableView<SimplePlant>();
		table.getColumns().addAll(SimplePlant.getColumn(table));
		table.setItems(Database.getPlantsList());

		table.setRowFactory(tv -> {
			TableRow<SimplePlant> row = new TableRow<>();
			row.setOnMouseClicked(event -> {
				if (event.getClickCount() == 2 && (!row.isEmpty())) {

					SimplePlant rowData = row.getItem();
		            System.out.println("id roœliny: " + rowData.getId());
		            
					Plant plant = Database.getPlant(rowData.getId());
					System.out.println(plant.toString());
					
					
//					plantView = new PreviewPane(newPlant);
					splitPane.getItems().clear();
					splitPane.getItems().addAll(table,  new PreviewPane(plant));
					
					
				}
			});
			return row;
		});
	}

}