package dbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Oracle {
	
	private static String DB_HOST = "localhost";
	private static String DB_PORT = "1521";
	private static String DB_SID = "XE";
	
	private static String DB_USER = "system";
	private static String DB_PASS = "system";
	
	
	
	public static Connection getConnection() {
		
	String DB_URL = "jdbc:oracle:tihin@" + DB_HOST + ":" + DB_PORT + ":" + DB_SID;
	
	Connection conn = null;
	try {
		conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
	} catch (SQLException e) {
		System.err.println("NO SE HA PODIDIO ESTABLECER LA CONEXIÓN !");
		System.err.println(e.getMessage());
	}
	
	return conn;
	
	
	}
	
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.err.println("No se ha podido cerrar la conexion");
			System.err.println(e.getMessage());
		}
	}
	
	
	
	public static ResultSet getData(Connection conn, String sql) {
		ResultSet resultado = null;
		try {
			Statement ordenSQL = conn.createStatement();		
			resultado = ordenSQL.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("No se ha podido ejecutar la orden: " + sql);
			System.out.println(e.getMessage());
		}
		return resultado;
	}
	
	
	public static void executeSQL(Connection conn, String sql) {
		try {
			Statement ordenSQL = conn.createStatement();
			ordenSQL.executeUpdate(sql);
			
		} catch (Exception e) {
			System.out.println("No se ha podido ejecutar la accion");
		}
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
