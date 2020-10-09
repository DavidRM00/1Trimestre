package unico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UP01 {

	
	static Color clrTexto = new Color(255, 0, 0);
	static Color clrFondo = new Color(0, 255, 0);
	static Color clrFondo2 = new Color(100, 50, 105);
	static Font fntTexto = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
	

	public static void main(String[] args) {

		
		
		JFrame ventana = new JFrame ("Usando paneles...");
		ventana.setBounds(200, 100, 600, 400);
		ventana.setLayout(new BorderLayout());
		ventana.setResizable(false);
		ventana.getContentPane().setBackground(Color.gray);
		ventana.setIconImage(Toolkit.getDefaultToolkit().getImage("Fotos/icon.jpg"));
		
		
		JLabel lbl1 = new JLabel("Usuario :");
		lbl1.setForeground(clrTexto);
		lbl1.setBackground(clrFondo);
		lbl1.setOpaque(true); //PARA QUE SE VEA EL BACKGROUND
		lbl1.setFont(fntTexto);
		JTextField txt1 = new JTextField(20);
		
		JLabel lbl2 = new JLabel("Contraseña :");
		lbl2.setForeground(clrTexto);
		lbl2.setBackground(clrFondo);
		lbl2.setOpaque(true); //PARA QUE SE VEA EL BACKGROUND
		lbl2.setFont(fntTexto);
		JTextField txt2 = new JTextField(20);
		
		JTextArea txtComentarios = new JTextArea();
		JScrollPane panelScroll = new JScrollPane(txtComentarios, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		ventana.add(panelScroll);
		
		JButton btn1 = new JButton("ACCEDER"); 
		btn1.setForeground(clrTexto);
		btn1.setBackground(clrFondo2);
		btn1.setOpaque(true); //PARA QUE SE VEA EL BACKGROUND
		btn1.setFont(fntTexto);
		
		
		JPanel panDatosUsuario = new JPanel();
		panDatosUsuario.setLayout(new GridLayout(2, 2, 5, 5));
		panDatosUsuario.setBorder(new EmptyBorder (0,0,0,10));
		panDatosUsuario.setBackground(Color.BLUE);
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
