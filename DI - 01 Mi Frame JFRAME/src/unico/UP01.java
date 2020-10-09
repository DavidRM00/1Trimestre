package unico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UP01 {

	public static void main(String[] args) {

		
		
		JFrame ventana = new JFrame ("Usando paneles...");
		ventana.setBounds(200, 100, 600, 400);
		
		ventana.setLayout(new BorderLayout());
		ventana.setResizable(false);
		ventana.getContentPane().setBackground(Color.gray);
		
		
		JLabel lbl1 = new JLabel("Usuario :");
		JTextField txt1 = new JTextField(20);
		
		JLabel lbl2 = new JLabel("Contraseña :");
		JTextField txt2 = new JTextField(20);
		
		JButton btn1 = new JButton("ACCEDER"); 
		
		
		JPanel panDatosUsuario = new JPanel();
		panDatosUsuario.setLayout(new GridLayout(2, 2, 5, 5));
		panDatosUsuario.setBorder(new EmptyBorder (0,0,0,10));
		panDatosUsuario.setBackground(Color.green);
		panDatosUsuario.add(lbl1);
		panDatosUsuario.add(txt1);
		panDatosUsuario.add(lbl2);
		panDatosUsuario.add(txt2);
		
		
		/*
		JPanel panSup = new JPanel();
		panSup.setLayout(new FlowLayout());
		panSup.add(panDatosUsuario);
		panSup.add(btn1);
		*/
		
		
		// SUSTITUTO (BOTON ANCHO)
		JPanel panSup = new JPanel();
	    panSup.setLayout(new GridLayout(1,2));
		panSup.add(panDatosUsuario);
		panSup.add(btn1);
		panSup.setBorder(new EmptyBorder (10,10,10,10));
		 		
		
		ventana.add(panSup, BorderLayout.NORTH);
		
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}

}
