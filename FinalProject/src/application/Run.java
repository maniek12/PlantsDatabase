package application;

import java.sql.*;

import gui.*;
import config.*;
import database.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;

public class Run extends Application {

	public static final String DRIVER = "org.sqlite.JDBC";
	public static final String DB_URL = "jdbc:sqlite:plants.db";
	
	TableView<SimplePlant> table;

	public static void main(String[] args) {
		initAppData();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			AppRoot root = new AppRoot();

			Scene scene = new Scene(root, AppConfig.getInstance()
					.getSceneWidth(), AppConfig.getInstance().getSceneHeight());

			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());

			primaryStage.setTitle("Plants Database");
			primaryStage.setScene(scene);

			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void initAppData() {

		// TODO connect itd
		connect();
	}
	
	private static void connect() {

		try {
			Class.forName(Run.DRIVER);
		} catch (ClassNotFoundException e) {
			System.err.println("Brak sterownika JDBC");
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection(DB_URL);
			AppData.getInstance().setConnection(connection);

		} catch (SQLException e) {
			System.err.println("Problem z otwarciem polaczenia");
			e.printStackTrace();
		}
	}
}
