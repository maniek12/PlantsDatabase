package gui;

import config.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class ButtonsPane extends FlowPane {

	private static final int hgap = 4;
	private static final int vgap = 4;
	
	private final int BUTTON_WIDTH = 150;
	private final int BUTTON_HEIGHT = 30;

	private FiltersPane managedPane;

	private Button filtersModeButton, clearFiltersButton, filterButton;

	public ButtonsPane(FiltersPane managedPane) {

		super(Orientation.HORIZONTAL, hgap, vgap);

		this.managedPane = managedPane;

		init();
	}

	private void init() {

		setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		setVgap(8);
		setHgap(4);

		filtersModeButton = new Button(LanguageConfig.getInstance()
				.getFiltersModeAdvancedButton());
		filtersModeButton.setOnAction(event -> {
			filtersModeButtonAction();
		});

		filtersModeButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

		// -------------clearFiltersButton
		clearFiltersButton = new Button(LanguageConfig.getInstance()
				.getClearFiltersButton());

		clearFiltersButton.setOnAction(event -> {
		});

		clearFiltersButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

		// ------------filterButton
		filterButton = new Button(LanguageConfig.getInstance()
				.getFilterButton());

		filterButton.setOnAction(event -> {
		});

		filterButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		// ------------------------
		ObservableList<Button> buttonsList = FXCollections
				.observableArrayList();

		buttonsList.addAll(filterButton, clearFiltersButton, filtersModeButton);

		getChildren().addAll(buttonsList);
	}
	
	private void filtersModeButtonAction() {
		
		int mode = managedPane.changeMode();

		if (mode == FiltersPane.SIMPLE)
			filtersModeButton.setText(LanguageConfig.getInstance()
					.getFiltersModeAdvancedButton());
		else if (mode == FiltersPane.ADVANCED)
			filtersModeButton.setText(LanguageConfig.getInstance()
					.getFiltersModeSimpleButton());
	}
}