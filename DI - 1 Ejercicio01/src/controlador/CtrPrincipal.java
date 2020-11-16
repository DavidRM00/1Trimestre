package controlador;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class CtrPrincipal {
	
	

		public void actionPerformed(ActionEvent e) {
			
			FileDialog FchGuardar = new FileDialog (frame, "Guardar documento...", FileDialog.SAVE);
			System.out.println("Antes de mostrar...");
			FchGuardar.setVisible(true);
			System.out.println("Despues de mostrar...");
			String directorio= FchGuardar.getDirectory();
			String fichero = FchGuardar.getFile();
			System.out.println(directorio);
			System.out.println(fichero);
			
		
};
		
	

}
