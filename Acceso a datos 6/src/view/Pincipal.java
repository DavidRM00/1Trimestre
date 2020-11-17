package view;

import controller.GestFchAD;

public class Pincipal {

	final static String FILE_NAME = "ARCHIVOS\\Datos.xml";
	
	public static void main(String[] args) {
		
		GestFchAD.mostrarFchXML(FILE_NAME);

	}

}
