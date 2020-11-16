package unico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FchSeqLectura {

	public static void main(String[] args) {
		final String FILE_NAME = "ficheros\\ciudades2.txt";
		
		// mostrarContenidoFichero(FILE_NAME);
		
		
		List<String> contenido = leerFichero (FILE_NAME);
		
		for(String cadena : contenido) {
			System.out.println(",, " + cadena);
		}
	}
	
	
	
	//  LECTURA
		/*
		private static void mostrarContenidoFichero(String FILE_NAME) {
			try {
				
			//APERTURA DEL FICHERO Y DEL CANAL DE COMUNICACIONES DE LECTURA
				FileReader fch = new FileReader(FILE_NAME);
				BufferedReader lectura = new BufferedReader(fch);
				
				
			//TRATAMIENTO DEL CONTENIDO DEL FICHERO
				String lineaLeida;
					
				lineaLeida = lectura.readLine();
				while (lineaLeida  != null) {
					System.out.println(lineaLeida);
					lineaLeida = lectura.readLine();
				}
				
				
			//CIERRRE DEL FICHERO Y DEL CANAL DE COMUNICACIONES DE LECTURA
				lectura.close();
				fch.close();
			}catch (FileNotFoundException e) {
				System.err.println("No se encuentra el fichero: " + FILE_NAME);
			}catch (IOException e) {
				System.out.println("Error accediendo al fichero " + FILE_NAME);
			}
			*/	
				
	
	
	
			
	//  ESCRIBIR Y LEER
			private static List<String> leerFichero(String FILE_NAME) {
				List<String> contenido = new ArrayList<String>();
				
				try {
					
				//APERTURA DEL FICHERO Y DEL CANAL DE COMUNICACIONES DE LECTURA
					FileReader fch = new FileReader(FILE_NAME);
					BufferedReader lectura = new BufferedReader(fch);
					
					
				//TRATAMIENTO DEL CONTENIDO DEL FICHERO
					String lineaLeida;
						
					lineaLeida = lectura.readLine();
					while (lineaLeida  != null) {
						contenido.add(lineaLeida);
						lineaLeida = lectura.readLine();
					}
					
					
				//CIERRRE DEL FICHERO Y DEL CANAL DE COMUNICACIONES DE LECTURA
					lectura.close();
					fch.close();
				}catch (FileNotFoundException e) {
					System.err.println("No se encuentra el fichero: " + FILE_NAME);
				}catch (IOException e) {
					System.out.println("Error accediendo al fichero " + FILE_NAME);
				}
				
				
				return contenido;
						
				
			

	}

}
