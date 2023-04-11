package clases;

import com.mysql.jdbc.Connection;

import driver.Conexion;

public class LoadData {
	
	// Properties
	private static int idUser;
	
	// Setters and getters
	public static int getIdUser() {
		return idUser;
	}

	public static void setIdUser(int idUser) {
		LoadData.idUser = idUser;
	}

	/**
	 * Load needed data in class Values for the user
	 */
	public static void load() {
		Connection cn = Conexion.getConnection();
		
		
	}
}




















