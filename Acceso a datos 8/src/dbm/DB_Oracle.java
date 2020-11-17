package dbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Oracle {
	
	private static String DB_HOST = "localhost";
	private static String DB_PORT = "1521";
	private static String DB_SID  = "XE";
	private static String DB_USER = "FERNANDO";
	private static String DB_PASS = "medac";
	
	public static Connection getConnection() {
		
		String DB_URL  = "jdbc:oracle:thin:@" + DB_HOST + ":" + DB_PORT + ":" + DB_SID;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		} catch (SQLException e) {
			System.err.println("No se ha podido establecer la conexión.");
			System.err.println(e.getMessage());
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.err.println("No se ha podido cerrar la conexión.");
			System.err.println(e.getMessage());
		}
	}
	
	public static ResultSet getData(Connection conn, String sql) {
		
		ResultSet resultado = null;
		
		try {
			Statement ordenSQL = conn.createStatement();
			resultado = ordenSQL.executeQuery(sql);
		} catch (SQLException e) {
			System.err.println("No se ha podido ejecutar la orden." + sql);
			System.err.println(e.getMessage());
		}
		
		return resultado;
	}
	
	public static void executeSQL(Connection conn, String sql) {
		Statement ordenSQL;
		try {
			ordenSQL = conn.createStatement();
			int fila = ordenSQL.executeUpdate(sql);
			//System.out.println(fila);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		}

}
