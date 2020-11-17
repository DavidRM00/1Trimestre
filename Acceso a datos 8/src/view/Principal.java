package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		
		String DB_HOST = "localhost";
		String DB_PORT = "1521";
		String DB_SID  = "XE";
		String DB_USER = "SYSTEM";
		String DB_PASS = "system";
		
		//SQL
		String DB_URL  = "jdbc:oracle:thin:@" + DB_HOST + ":" + DB_PORT + ":" + DB_SID;
		
		//MySQL
		//String DB_URL_MySQL = "jdbc:mysql://" + DB_HOST + "/" + DB_SID;
		
		try {
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			
			Statement ordenSQL = conn.createStatement();
			
			String sql = "SELECT * FROM DEPT";
			
			ResultSet resultado = ordenSQL.executeQuery(sql);
			
			ResultSetMetaData info = resultado.getMetaData();
			
			System.out.println("columnas: " + info.getColumnCount());
			
			for(int col=1; col<=info.getColumnCount(); col++) {
				System.out.println(info.getColumnName(col));
			}
			
			/*while(resultado.next()) {
				
				Integer numero = resultado.getInt("deptno");
				String nombre = resultado.getString("ename");
				String localidad = resultado.getString("loc");
				
				System.out.println("El departamento "+ numero + " se llama "+nombre+" y está en "+ localidad);
				
			}
			
			System.out.println("CONECTADO");*/
		} catch (SQLException e) {
			System.err.println("ERROR "+ e.getMessage());
		}
		

	}

}
