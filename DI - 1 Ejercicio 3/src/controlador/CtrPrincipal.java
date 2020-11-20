package controlador;

import java.awt.event.KeyEvent;
import java.security.Principal;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import logica.logP;
import modelo.Producto;
import view.FrmError;
import view.FrmPrincipal;

public class CtrPrincipal {
	

		
		private static String codigo;
		private static String nombre;
		private static int stockActual;
		private static int stockMinimo;
		private static int stockMaximo;
		private static int opcion;
		private static String comentario;
		private static int proveedor;
		private static boolean fragil;
		private static boolean obsoleto;
		private static float pvp;
		
		public static void borrar() {
			
			if (JOptionPane.showConfirmDialog(null, "Confirmar el borrado del producto" +FrmPrincipal.textField.getText(), "Confirmar Borrado", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
				
				//limpiar();
				
				FrmPrincipal.productos.remove(FrmPrincipal.position);
				
				logP.writeDataObject(FrmPrincipal.RUTA, FrmPrincipal.productos);
				
			}
		}

		public static void abrir() {
			FrmPrincipal.position=0;
			FrmPrincipal.productos = logP.readDataObject(FrmPrincipal.RUTA);
			if(FrmPrincipal.productos.size()!=0) {
				mostrar();
			}
			
			
		}

		public static void guardar() {
			
			if(logP.comprobacionStocks()) {
				
			codigo = FrmPrincipal.textField.getText();
			nombre = FrmPrincipal.textField_1.getText();
			stockActual = Integer.parseInt(FrmPrincipal.textField_2.getText());
			stockMinimo = Integer.parseInt(FrmPrincipal.textField_3.getText());
			stockMaximo = Integer.parseInt(FrmPrincipal.textField_4.getText());
			opcion = logP.opcion();
			comentario = FrmPrincipal.textArea.getText();
			proveedor = FrmPrincipal.comboBox.getSelectedIndex();
			fragil = FrmPrincipal.chckbxNewCheckBox.isSelected();
			obsoleto = FrmPrincipal.chckbxNewCheckBox_1.isSelected();
			pvp = Float.parseFloat(FrmPrincipal.textField_5.getText());
			
			if(FrmPrincipal.position<FrmPrincipal.productos.size()) {
				FrmPrincipal.productos.get(FrmPrincipal.position).setCodigo(codigo);
				FrmPrincipal.productos.get(FrmPrincipal.position).setNombre(nombre);
				FrmPrincipal.productos.get(FrmPrincipal.position).setStockActual(stockActual);
				FrmPrincipal.productos.get(FrmPrincipal.position).setStockMinimo(stockMinimo);
				FrmPrincipal.productos.get(FrmPrincipal.position).setStockMaximo(stockMaximo);
				FrmPrincipal.productos.get(FrmPrincipal.position).setOpcion(opcion);
				FrmPrincipal.productos.get(FrmPrincipal.position).setComentario(comentario);
				FrmPrincipal.productos.get(FrmPrincipal.position).setProveedor(proveedor);
				FrmPrincipal.productos.get(FrmPrincipal.position).setFragil(fragil);
				FrmPrincipal.productos.get(FrmPrincipal.position).setObsoleto(obsoleto);
				FrmPrincipal.productos.get(FrmPrincipal.position).setPvp(pvp);
				logP.writeDataObject(FrmPrincipal.RUTA, FrmPrincipal.productos);
			}
			else {
				FrmPrincipal.productos.add(new Producto(codigo,nombre,stockActual,stockMinimo,stockMaximo,opcion,comentario,proveedor,fragil,obsoleto,pvp));
				logP.writeDataObject(FrmPrincipal.RUTA, FrmPrincipal.productos);
			}
			
			}
			else {
				JDialog error = new FrmError();
				
				error.setVisible(true);
			}
			
			
			
		}

		public static void caracteres(KeyEvent e) {
			
			boolean letra = logP.caracteres(e);
			
			if(letra) {
				e.setKeyChar((char) e.VK_DELETE);
			}
			
		}

		public static void nuevo() {
			
			limpiar();
			if(FrmPrincipal.position<FrmPrincipal.productos.size()) {
				FrmPrincipal.position=FrmPrincipal.productos.size();
			}
			
			
			
		}
		
		public static void limpiar() {
			
			FrmPrincipal.textField.setText("");
			FrmPrincipal.textField_1.setText("");
			FrmPrincipal.textField_2.setText("");
			FrmPrincipal.textField_3.setText("");
			FrmPrincipal.textField_4.setText("");
			FrmPrincipal.buttonGroup.clearSelection();
			FrmPrincipal.textArea.setText("");
			FrmPrincipal.comboBox.setSelectedIndex(-1);
			FrmPrincipal.chckbxNewCheckBox.setSelected(false);
			FrmPrincipal.chckbxNewCheckBox_1.setSelected(false);
			FrmPrincipal.textField_5.setText("");
			
		}
		
		public static void mostrar() {
			FrmPrincipal.textField.setText(FrmPrincipal.productos.get(FrmPrincipal.position).getCodigo());
			FrmPrincipal.textField_1.setText(FrmPrincipal.productos.get(FrmPrincipal.position).getNombre());
			FrmPrincipal.textField_2.setText(""+FrmPrincipal.productos.get(FrmPrincipal.position).getStockActual());
			FrmPrincipal.textField_3.setText(""+FrmPrincipal.productos.get(FrmPrincipal.position).getStockMinimo());
			FrmPrincipal.textField_4.setText(""+FrmPrincipal.productos.get(FrmPrincipal.position).getStockMaximo());
			if(logP.opcionSelecionada()==1) {
				FrmPrincipal.rdbtnNewRadioButton.setSelected(true);
			}
			else if(logP.opcionSelecionada()==2) {
				FrmPrincipal.rdbtnNewRadioButton_1.setSelected(true);
			}
			else if(logP.opcionSelecionada()==3){
				FrmPrincipal.rdbtnNewRadioButton_2.setSelected(true);
			}
			FrmPrincipal.textArea.setText(FrmPrincipal.productos.get(FrmPrincipal.position).getComentario());
			FrmPrincipal.comboBox.setSelectedIndex(FrmPrincipal.productos.get(FrmPrincipal.position).getProveedor());
			FrmPrincipal.chckbxNewCheckBox.setSelected(FrmPrincipal.productos.get(FrmPrincipal.position).isFragil());
			FrmPrincipal.chckbxNewCheckBox_1.setSelected(FrmPrincipal.productos.get(FrmPrincipal.position).isObsoleto());
			FrmPrincipal.textField_5.setText(""+FrmPrincipal.productos.get(FrmPrincipal.position).getPvp());
		}

		public static void cambio(int i) {
			
			if(logP.comprobacionPosicion(i) && FrmPrincipal.productos.size()!=0 && FrmPrincipal.position<=FrmPrincipal.productos.size()) {
				FrmPrincipal.position+=i;
			mostrar();
			}
			
				
		}
		
		public static void inicioProducto(int i) {
			
			if(logP.comprobacionPosicion(i) && FrmPrincipal.productos.size()!=0) {
				FrmPrincipal.position=0;
				mostrar();
			}
			
		}
		
		public static void finalProducto(int i) {
			if(logP.comprobacionPosicion(i) && FrmPrincipal.productos.size()!=0) {
				FrmPrincipal.position=FrmPrincipal.productos.size()-1;
				mostrar();
			}
			
		}
		

}
