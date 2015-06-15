package gui;

import config.LanguageConfig;
import database.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class PreviewPane extends VBox {

	Plant plant;

	public PreviewPane() {
		super();
//		setStyle("-fx-background: #F0A456;");
	}

	public PreviewPane(Plant plant) {

		super();
		this.plant = plant;

		SplitPane topPane = new SplitPane();
		topPane.getItems().addAll(new PhotosPane(), new ParametersPane());

		getChildren().addAll(topPane, new DescribePane());
	}

	class PhotosPane extends AnchorPane {

		public PhotosPane() {
			super();
	//		setStyle("-fx-background: #FFFFFF;");
		}
	}

	class ParametersPane extends FlowPane {

		public ParametersPane() {

			super();
			init();
		}

		private void init() {

			setOrientation(Orientation.VERTICAL);
		}
	}

	class DescribePane extends FlowPane {

		private static final int hgap = 4;
		private static final int vgap = 4;
		Label valuesLabel;
		Label valuesText;
		Label commentsLabel;
		Label commentsText;

		public DescribePane() {

			super(Orientation.VERTICAL, hgap, vgap);
			init();
		}

		private void init() {

//			setStyle("-fx-background: #FFFFFF;");
			
			
		//	fillWidthProperty();
			// TODO rozciaganie komponentów w poziomie
			
			setOrientation(Orientation.VERTICAL);
			
			valuesLabel = new Label(LanguageConfig.getInstance().getValues());
			valuesLabel.setPrefWidth(getPrefWidth());
			
			valuesText = new Label(plant.getWalory());
			
			Separator separator = new Separator();
			
			commentsLabel = new Label(LanguageConfig.getInstance()
					.getComments());
			commentsText = new Label(plant.getUwagi());

			getChildren().addAll(valuesLabel, valuesText, separator,
					commentsLabel, commentsText);
		}
	}
}