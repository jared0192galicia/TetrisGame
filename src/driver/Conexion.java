package driver;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexion {

	// Method that return one object Connection
	public Connection getConnection() {
		Connection connection = null;
		// Sets connection with MySql
		try {
			connection = (Connection) DriverManager.getConnection("url", "user", "pass");
		} catch (SQLException e) {
			System.err.println("Error in conecction to MySql: " + e.getMessage() + " Code: " + e.getErrorCode());
			new Exception("Sin conexion");
		}
		
		return connection;
	}
}
