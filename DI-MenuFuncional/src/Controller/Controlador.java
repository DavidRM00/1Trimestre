package Controller;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;

import javax.swing.JDialog;

public class Controlador {


	
	public void actionPerformed(ActionEvent e) {
		JDialog fAbrir = new JDialog();
		FileDialog FchAbrir = new FileDialog (fAbrir, "Abrir documento...", FileDialog.LOAD);
		abrir();
	}

	private void abrir() {
		// TODO Auto-generated method stub
		
	}
}
