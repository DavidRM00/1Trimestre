package unico;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class UP02 {

	public static void main(String[] args) {


		JFrame ventana = new JFrame ("Usando paneles...");
		ventana.setBounds(200, 100, 600, 400);
		
		ventana.setLayout(new BorderLayout());
		ventana.setResizable(false);
		ventana.setIconImage(Toolkit.getDefaultToolkit().getImage("Fotos/icon.jpg"));
		
		//Swing
		String[] misColores = {"ROJO", "VERDE", "AZUL"};
		JComboBox<String> miLista = new JComboBox<String>(misColores);
		
		//Choice miLista2 = new Choice
		
		//String[] misCiudades = {"Sevilla", "Cordoba", "Malaga"};
		//JList<String> miLista2 = new JList<String>(misCiudades);
		
		
		CheckboxGroup chkTipoEnvio = new CheckboxGroup();
		Checkbox chkEnviar1 = new Checkbox("Desea envío pagado", false, chkTipoEnvio);
		Checkbox chkEnviar2 = new Checkbox("Desea envío contrareenbolso", true, chkTipoEnvio);
		
		JPanel panInf = new JPanel();
		panInf.setLayout(new FlowLayout());
		panInf.add(chkEnviar1);
		panInf.add(chkEnviar2);
		
		ventana.add(miLista, BorderLayout.NORTH);
		//ventana.add(miLista2, BorderLayout.SOUTH);
		//ventana.add(chkEnviar1, BorderLayout.SOUTH);
		ventana.add(panInf, BorderLayout.SOUTH);
		
		
		
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		
	}

}
