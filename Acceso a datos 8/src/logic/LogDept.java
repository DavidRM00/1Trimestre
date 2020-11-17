package logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.DB_Oracle;
import model.Dept;

public class LogDept {
	
	public static List<Dept> getDepts() throws SQLException{
		
		List<Dept> lista = new ArrayList<Dept>();
		Connection c = DB_Oracle.getConnection();
		ResultSet r = DB_Oracle.getData(c, "SELECT * FROM DEPT ORDER BY 1");
		
		while(r.next()) {
	
			try {
				String ola = r.getString("OLA");
				String adios = r.getString("ADIOS");
				lista.add(new Dept(ola, adios));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		DB_Oracle.closeConnection(c);
		
		return lista;
	}
	
	public static void delDept(Dept d) {
		Connection c = DB_Oracle.getConnection();
		DB_Oracle.executeSQL(c, "DELETE DEPT WHERE OLA = " + d.getOLA());
		DB_Oracle.closeConnection(c);
	}

}
