package unico;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {
		
		String FILE_NAME = "archivos\\datos.dat";
		
		// Crear un bojeto
		
		Persona p = new Persona ("Pepe", 37);
		
		// Escribir el objeto
		
		try {
			ObjectOutputStream fch = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			fch.writeObject(p);
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.err.println("Error leyendo el archivo.");
		}
		
		// Leer el objeto
		
		Persona nueva = null;
		
		try {
			ObjectInputStream sal = new ObjectInputStream(new FileInputStream(FILE_NAME));
			try {
				Object obj = sal.readObject();
				if (obj instanceof Persona) {
					nueva = (Persona) obj;
				}
				sal.close();
			} catch (ClassNotFoundException e) {
				System.err.println("Error al encontrar la clase.");
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.err.println("Error al leer el archivo.");
		}
		
		// Mostrar el objeto
		
		System.out.println(nueva);
	
	}

}
