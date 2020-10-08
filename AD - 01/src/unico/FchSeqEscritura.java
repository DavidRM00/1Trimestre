package unico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FchSeqEscritura {

	public static void main(String[] args) {
		final String FILE_NAME = "ficheros\\ciudades2.txt";
				
				List<String> ciudades = new ArrayList<String>();
				ciudades.add("Sevilla");
				ciudades.add("Huelva");
				ciudades.add("Cádiz");
				ciudades.add("Granada");
				
				
				escribirFichero(FILE_NAME,ciudades);
				
				
			
		}
	
		private static void escribirFichero(String FILE_NAME, List<String> contenido) {
			try {
				//APERTURA DEL FICHERO Y DEL CANAL DE COMUNICACIONES TIPO BUFER
				FileWriter fch = new FileWriter(FILE_NAME);
				BufferedWriter escritura = new BufferedWriter(fch);
					
				
				//TRATAMIENTO DE LOS DATOS (ESCRITURA DEL PARAMETRO: CONTENIDO)
				
				//CON LINEA AL FINAL (4 FRASES 5 LINEAS)
				/*for(String linea : contenido) {
					escritura.write(linea);
					escritura.newLine();
				}*/
				
				
				//SIN LINEA AL FINAL (4 FRASES 4 LINEAS)
				/*for(int i=0; i<contenido.size(); i++) {
					escritura.write(contenido.get(i));
					if (i<contenido.size()-1) {
						escritura.newLine();
					}
				}*/
				
				
				//SIN LINEA AL FINAL (4 FRASES 4 LINEAS) -- OPTIMIZADO --
				for(int i=0; i<contenido.size()-1; i++) {
					escritura.write(contenido.get(i));
					escritura.newLine();	
				}
				escritura.write(contenido.get(contenido.size()-1));
				
				
				//CIERRE DEL FICHERO Y DEL CANAL DE COMUNICACIONES BUFER
				escritura.close();
				fch.close();
			} catch (IOException e) {
				System.out.println("Error accediendo al fichero: " + FILE_NAME);
			}
			
	
	}

}
