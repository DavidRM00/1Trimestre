package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import model.Coche;

public class GestFchAD {
	public String FILE_NAME;

	
	 public static void writeDataObject(String FILE_NAME, List<Coche> lista) {
		 try {
			 ObjectOutputStream fch = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			 
			 for (Coche c: lista) {
				 fch.writeObject(c);
			 }
			 
			 fch.close();
		 } catch (FileNotFoundException e) {
			 System.out.println("Error leyendo el archivo");
		 } catch (IOException e){
			 System.err.println("Error accediendo al archivo." + e);
		 }
	 }
}
