package unico;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutPrueba {

	public static void main(String[] args) {
		
		
		//CODIGO REDUCIDO
		//CREAR OBJETO
		JFrame ventana = new JFrame();
		
		ventana.setLayout(new GridLayout(2, 4, 20, 30));
		ventana.setBounds(600, 300, 700, 250);
		ventana.setTitle("Aprendiendo SWING");
		
		//BOTON ACEPTAR
		JButton btnAceptar = new JButton("ACEPTAR");

		//BOTON CANCELAR
		JButton btnCancelar = new JButton("CANCELAR");

		//BOTON INFO
		JButton btnInfo = new JButton("INFO");
		
		
		
		JButton btn22 = new JButton("22");
		JButton btn33 = new JButton("33");
		

		
		ventana.add(btnAceptar);
		ventana.add(btnCancelar);
		ventana.add(btnInfo);
		ventana.add(btn22);
		ventana.add(btn33);
		
		
		//EVITAR QUE QUEDE ABIRTO EN SEGUNDO PLANO
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//CERRAR
		ventana.setVisible(true);

	}

}
