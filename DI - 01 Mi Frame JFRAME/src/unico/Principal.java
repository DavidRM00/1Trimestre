package unico;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		
		//CREAR OBJETO
		JFrame ventana = new JFrame();
		
		
		ventana.setLayout(null);
		
		//TAMAÑO Y LOCALIZACION
		/*
		ventana.setSize(400, 250);	
		ventana.setLocation(200, 200);
		*/	
		//SUSTITUYE A LOS ANTERIORES
		ventana.setBounds(600, 300, 700, 250);
		
		//TITULO VENTANA (SUSTITUIR PONIENDO EL TEXTO DENTO DEL CONSTRUCTOR)
		ventana.setTitle("Aprendiendo SWING");
		//Ejemplo
		/*
		JFrame ventana = new JFrame("Aprendiendo SWING");
		ventana.setBounds(600, 300, 400, 250);
		*/
		
		
		//BOTON ACEPTAR
		JButton btnAceptar = new JButton();
		btnAceptar.setText("ACEPTAR");
		btnAceptar.setBounds (100, 100, 130, 40);
		
		ventana.add(btnAceptar);
		
		//BOTON CANCELAR
		JButton btnCancelar = new JButton();
		btnCancelar.setText("CANCELAR");
		btnCancelar.setBounds (250, 100, 130, 40);
		
		ventana.add(btnCancelar);
		
		//BOTON INFO
		JButton btnInfo = new JButton();
		btnInfo.setText("INFO");
		btnInfo.setBounds (400, 100, 130, 40);
		
		ventana.add(btnInfo);
		
		
		
		//EVITAR QUE QUEDE ABIRTO EN SEGUNDO PLANO
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//CERRAR
		ventana.setVisible(true);
		
		
	}

}
