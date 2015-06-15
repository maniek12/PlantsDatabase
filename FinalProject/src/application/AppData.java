package application;

import java.sql.Connection;

public class AppData {

	private Connection connection;
	
	

	// --Singleton--------------------
	private static AppData data;

	private AppData() {

	}

	public static AppData getInstance() {

		if (data == null)
			data = new AppData();
		return data;
	}

	// --------------------------------
	public Connection getConnection() {

		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
