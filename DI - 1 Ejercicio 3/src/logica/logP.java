
package logica;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


import modelo.Producto;
import view.FrmPrincipal;

public class logP {

	public static void writeDataObject(String FILE_NAME, List<Producto> listado) {
		try {
			
			ObjectOutputStream fch = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			
			for(Producto c : listado) {
				fch.writeObject(c);
			}
			
			fch.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<Producto> readDataObject(String FILE_NAME) {
		
		
		List<Producto> listado = new ArrayList<Producto>();
		
		try {
			
			ObjectInputStream fch = new ObjectInputStream(new FileInputStream(FILE_NAME));
			
			Object obj = fch.readObject();
			
			while(obj!=null) {
				if(obj instanceof Producto) {
					listado.add((Producto) obj);
				}
				obj = fch.readObject();
			}
			
			
			
			fch.close();
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			
		}
		
		return listado;
	}

	public static int opcion() {
		
		int resultado=0;
		
		if(FrmPrincipal.rdbtnNewRadioButton.isSelected()) {
			
			resultado=1;
		}
		else if(FrmPrincipal.rdbtnNewRadioButton_1.isSelected()) {
			resultado=2;
		}
		
		else if(FrmPrincipal.rdbtnNewRadioButton_2.isSelected()) {
			resultado=3;
		}
		
		
		return resultado;
	}

	public static boolean caracteres(KeyEvent e) {
		if(e.getKeyChar()!="0".charAt(0) && e.getKeyChar()!="1".charAt(0) && e.getKeyChar()!="2".charAt(0) && e.getKeyChar()!="3".charAt(0) && e.getKeyChar()!="4".charAt(0) 
				&& e.getKeyChar()!="5".charAt(0) && e.getKeyChar()!="6".charAt(0) && e.getKeyChar()!="7".charAt(0) && e.getKeyChar()!="8".charAt(0) &&
				e.getKeyChar()!="9".charAt(0)) {
			return true;
			
		}
		else {
			return false;
		}
	}

	public static int opcionSelecionada() {
		
		if(FrmPrincipal.productos.get(FrmPrincipal.position).getOpcion()==1) {
			return 1;
		}
		
		else if(FrmPrincipal.productos.get(FrmPrincipal.position).getOpcion()==2) {
			return 2;
		}
		else if(FrmPrincipal.productos.get(FrmPrincipal.position).getOpcion()==3) {
			return 3;
		}
		else {
			return 0;
		}
		
		
	}

	public static boolean comprobacionPosicion(int i) {
		
		if((FrmPrincipal.position==0 && i==-1) || (FrmPrincipal.position==FrmPrincipal.productos.size()-1 && i==1)
				|| (FrmPrincipal.position==FrmPrincipal.productos.size() && i==1)) {
			return false;
		}
		else {
			return true;
		}
		
	}

	public static boolean comprobacionStocks() {
		
		
		try {
		int stockActual = Integer.parseInt(FrmPrincipal.textField_2.getText());
		int stockMinimo = Integer.parseInt(FrmPrincipal.textField_3.getText());
		int stockMaximo = Integer.parseInt(FrmPrincipal.textField_4.getText());
		float pvp = Float.parseFloat(FrmPrincipal.textField_5.getText());
		
		if(stockActual>=stockMinimo && stockActual<=stockMaximo && stockMinimo>=0 && stockMaximo>stockMinimo
				&& pvp>=0) {
			return true;
		}
		else {
		return false;
		}
		}catch(NumberFormatException e) {
			return false;
		}
		
	}
}
