package unico;



import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutPrueba {
				
	public static void main(String[] args) {
		
		
		//CODIGO REDUCIDO
		//CREAR OBJETO
		JFrame ventana = new JFrame();
		
		ventana.setLayout(new BorderLayout());
		ventana.setBounds(600, 300, 700, 250);
		ventana.setTitle("Aprendiendo SWING");
		
		//BOTON ACEPTAR
		JButton btnAceptar = new JButton("ACEPTAR");

		//BOTON CANCELAR
		JButton btnCancelar = new JButton("CANCELAR");

		//BOTON INFO
		JButton btnInfo = new JButton("INFO");

		
		ventana.add(btnAceptar , BorderLayout.NORTH);
		ventana.add(btnCancelar, BorderLayout.SOUTH);
		ventana.add(btnInfo, BorderLayout.CENTER);
		
		
		//EVITAR QUE QUEDE ABIRTO EN SEGUNDO PLANO
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//CERRAR
		ventana.setVisible(true);
	}
}
