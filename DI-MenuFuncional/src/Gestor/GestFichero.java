package Gestor;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class GestFichero {

	


	
	public static void abrir() {
		System.out.println("Antes de mostrar...");
		FchAbrir.setVisible(true);
		System.out.println("Despues de mostrar...");
		String directorio= FchAbrir.getDirectory();
		String fichero = FchAbrir.getFile();
		System.out.println(directorio);
		System.out.println(fichero);
		
	}

	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		JDialog fGuardar = new JDialog();
		
		FileDialog FchGuardar = new FileDialog (fGuardar, "Guardar documento...", FileDialog.SAVE);
		
		System.out.println("Antes de mostrar...");
		FchGuardar.setVisible(true);
		System.out.println("Despues de mostrar...");
		String directorio= FchGuardar.getDirectory();
		String fichero = FchGuardar.getFile();
		System.out.println(directorio);
		System.out.println(fichero);
		
		
		
	}
	
}
