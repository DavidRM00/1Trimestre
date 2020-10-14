package unico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FchBinario {

	public static void main(String[] args) {
		//ORIGEN
		final String FILE_NAME_SOURCE = "fotos\\sevilla.jpg";
		//Destino
		final String FILE_NAME_TARGET = "fotos\\ciudad.jpg";
		
		copyFile(FILE_NAME_SOURCE, FILE_NAME_TARGET);
		
		
	}

	private static void copyFile(String FILE_NAME_SOURCE, String FILE_NAME_TARGET) {
		try {
			
			//Abre canal de comunicaciones hacia una imagen para copiarlo y renombrarlo en un fichero nuevo
			
			FileInputStream fchSource = new FileInputStream(FILE_NAME_SOURCE);
			DataInputStream dataSource = new DataInputStream(fchSource);
			
			FileOutputStream fchTarget = new FileOutputStream(FILE_NAME_TARGET);
			DataOutputStream dataTarget = new DataOutputStream(fchTarget);
			
			
			int byteRead;
			byteRead = dataSource.read();
			
			while (byteRead != -1) {
				dataTarget.write(byteRead);
				byteRead = dataSource.read();
			}
			
			dataTarget.close();
			fchTarget.close();
			dataSource.close();
			fchSource.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch(IOException e) {
			System.out.println("Error accediendo al fichero");				
		}
		
	}
	
	
	

}
