package unico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UsandoPaneles {

	public static void main(String[] args) {

		
		JFrame ventana = new JFrame ("Usando paneles...");
		ventana.setBounds(200, 100, 600, 400);
		
		ventana.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("BOTON 1");
		JButton btn2 = new JButton("BOTON 2");
		JButton btn3 = new JButton("BOTON 3");
			
		
		JPanel panInf = new JPanel();
		panInf.setLayout(new FlowLayout());
		panInf.add(btn1);
		panInf.add(btn2);
		panInf.add(btn3);

		
		ventana.add(panInf, BorderLayout.SOUTH);
		
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}

}
