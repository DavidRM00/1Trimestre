package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Coche;

public class GestFchSer {

	public static void writeDataObject(String FILE_NAME, List<Coche> listado) {
		
		try {
			ObjectOutputStream fch = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			
			fch.writeObject(listado);
			
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("ERROR");
		} catch (IOException e) {
			System.err.println("ERROR");
		}

	}


	@SuppressWarnings("unchecked")
	public static List<Coche> readDataList(String FILE_NAME) {
		List<Coche> listado = new ArrayList<Coche>();
		try {
			ObjectInputStream fch = new ObjectInputStream(new FileInputStream(FILE_NAME));
			
			listado = (ArrayList<Coche>)fch.readObject();
		
			fch.close();
			
		} catch (IOException | ClassNotFoundException e) {}
		
		return listado;
	}
}