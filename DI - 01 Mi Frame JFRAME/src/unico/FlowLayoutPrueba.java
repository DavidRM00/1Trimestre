package unico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//CREAR OBJETO
		JFrame ventana = new JFrame();
		
		
		ventana.setLayout(new FlowLayout());
		ventana.setBounds(600, 300, 700, 250);
		ventana.setTitle("Aprendiendo SWING");
		
		//BOTON ACEPTAR
		JButton btnAceptar = new JButton();
		btnAceptar.setText("ACEPTAR");
		//NO NECESARIO
		//btnAceptar.setSize(130, 40);
		
		ventana.add(btnAceptar);
		
		//BOTON CANCELAR
		JButton btnCancelar = new JButton();
		btnCancelar.setText("CANCELAR");
		//NO NECESARIO
		//btnCancelar.setSize (130, 40);
		
		ventana.add(btnCancelar);
		
		//BOTON INFO
		JButton btnInfo = new JButton();
		btnInfo.setText("INFO");
		//NO NECESARIO
		//btnInfo.setSize (130, 40);
		
		ventana.add(btnInfo);
		
		//EVITAR QUE QUEDE ABIRTO EN SEGUNDO PLANO
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//CERRAR
		ventana.setVisible(true);
		*/
		
		
		
		
		//CODIGO REDUCIDO
		//CREAR OBJETO
		JFrame ventana = new JFrame();
		
		ventana.setLayout(new FlowLayout());
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
