package logic;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.text.StyledDocument;
import javax.swing.text.rtf.RTFEditorKit;

public class LogFichero {
	
	public void actionPerformed(ActionEvent e) {
		JDialog mntmAbrir = new JDialog();
		
		FileDialog FchAbrir = new FileDialog (mntmAbrir, "Guardar documento...", FileDialog.SAVE);
		
		System.out.println("Antes de mostrar...");
		FchAbrir.setVisible(true);
		System.out.println("Despues de mostrar...");
		String directorio= FchAbrir.getDirectory();
		String fichero = FchAbrir.getFile();
		System.out.println(directorio);
		System.out.println(fichero);

		}
	
	private void abrir() {
		JFileChooser file = new JFileChooser();
		TextFilter filter = new TextFilter();
		file.setFileFilter(filter);
		String fileName = "";
		// show open file dialog
			if (file.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				fileName = file.getSelectedFile().getAbsolutePath();
			} else {
		return;
		}
		// using richtext format
		RTFEditorKit rtf = new RTFEditorKit();
			try {
				// load file into jTextPane
				FileInputStream fi = new FileInputStream(fileName);
				rtf.read(fi, jTextPane1.getDocument(), 0);
				fi.close();
			} catch (Exception e) {
				System.out.println("err:" + e.toString());
			}
			}
	
	private void save() {
		JFileChooser file = new JFileChooser();
		TextFilter filter = new TextFilter();
		file.setFileFilter(filter);
		String fileName = "";
		// show save file dialog
		if (file.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			// get full path of selected file
			fileName = file.getSelectedFile().getAbsolutePath();
			// get meta of text
			StyledDocument doc = (StyledDocument) jTextPane1.getDocument();
			// convert to richtext format
			RTFEditorKit kit = new RTFEditorKit();
			BufferedOutputStream out;
		try {
			out = new BufferedOutputStream(new FileOutputStream(fileName));
			// save content to file
			kit.write(out, doc, doc.getStartPosition().getOffset(), doc.getLength());
			out.flush();
			out.close();
		} catch (Exception e) {
			System.out.println("Err:" + e.toString());
		}
		 
		} else {
		return;
		}
		}
}
