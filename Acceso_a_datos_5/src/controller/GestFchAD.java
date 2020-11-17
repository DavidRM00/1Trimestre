package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

import model.Persona;

public class GestFchAD {
	
	/*40 nombre (String:20 = 40 UniCode)
	   4 edad (int)
	   8 altura (double)
	   --
	   52 <-- regSize
	 */
	private int regSize = 52;
	
	private RandomAccessFile fch;

	public GestFchAD(String file_name) {
		try {
			fch = new RandomAccessFile(file_name, "rw");
		} catch (FileNotFoundException e) {
			System.err.println("Fichero de datos no encontrado.");
		}
	}

	public void closeFch() {
		try {
			fch.close();
		} catch (IOException e) {
			System.err.println("Error cerrando el fichero de datos.");
		}
	}
	
	private int getPos(int numReg) {
		return (numReg-1) * regSize;
	}

	public void writeReg(int numReg, Persona reg) {
		try {
			int pos = getPos(numReg);
			fch.seek(pos);
			
			for(int i=0;i<20;i++) {
				if (i<reg.getNombre().length()) {
					fch.writeChar(reg.getNombre().charAt(i));
				} else {
					fch.writeChar(' ');
				}
			}
			
			fch.writeInt(reg.getEdad());
			fch.writeDouble(reg.getAltura());
			
		} catch (IOException e) {
			System.err.println("Error escribiendo al fichero.");
		}
	}

	public Persona readReg(int numReg) {
		
		String nombre="";
		int edad=0;
		double altura= 0.0;
		
		try {
			int pos = getPos(numReg);
			fch.seek(pos);
			
			for(int i=0;i<20;i++) {
				nombre += fch.readChar();			
			}
			
			edad = fch.readInt();
			altura = fch.readDouble();
			
		} catch (IOException e) {
			System.err.println("Error leyendo el fichero.");
		}
		
		return new Persona(nombre, edad, altura);
	}
	
	public long totReg() {
		long tot = 0;
		try {
			tot= fch.length()/regSize;
		} catch (IOException e) {
			System.err.println("Error leyendo el fichero");
		}
		return tot;
	}

	public List<Persona> getContent() {
		
		
		
		return null;
	}
	
}
