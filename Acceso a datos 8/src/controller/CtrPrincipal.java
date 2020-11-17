package controller;

import java.sql.SQLException;

import logic.LogDept;
import model.Dept;

public class CtrPrincipal {
	
	public static void pintaDepartamentos(){
		try {
			for (Dept d: LogDept.getDepts())
				System.out.println(d);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
