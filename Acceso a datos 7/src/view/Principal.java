package view;

import java.util.List;

import controller.GestFchAD;
import model.Entrenador;
import model.Jugador;

public class Principal {
	
	final static String FILE_NAME = "archivos\\Datos.xml";

	public static void main(String[] args) {
		
		
		GestFchAD fch = new GestFchAD(FILE_NAME);
		
		List <Jugador> jugadores = fch.getJugadores();
		
		for(Jugador j : jugadores) {
			System.out.println(j);
		}
		
		GestFchAD.addNodeJugador(new Jugador("Miguel", "Perez dias", "elProfe", 1200));
		
		List <Entrenador> entrenadores = fch.getEntrenadores();
		
		for(Entrenador e : entrenadores) {
			System.out.println(e);
		}

	}

}
