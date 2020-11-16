package unico;

import logic.LogDept;

public class CrlPrincipal {

		
	public static void pintaDepartamentos() {
		for (Dept d: LogDept.getDepts())
			System.out.println(d);
	}
	
	public static void pintaEmpleados() {
	for (Emp d: LogEmp.getEmps())
		System.out.println(e);
	}
}
