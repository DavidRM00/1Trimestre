package View;

import java.util.ArrayList;
import java.util.List;

import controller.GestFchXML;
import model.Jugador;

public class Principal {

	
	final static String FILE_NAME = "src\\archivos\\Ficheros.xml";
	
	public static void main(String[] args) {
		
		GestFchXML fch = new GestFchXML(FILE_NAME);
		
		List<Jugador> jugadores = fch.getJugadores());
		for(Jugador j : jugadores) {
			System.out.println(j);
		}
		fch.addNodeJugador( new Jugador(123, "David", "Rodriguez Marban", "alumno", 200) );
		
		
		
		List<Entrenador> Entrenadores = fch.getEntrenadores();
		
		for(Jugador j : jugadores) {
			System.out.println(j);
		}
		
		
		
		

	}

}
