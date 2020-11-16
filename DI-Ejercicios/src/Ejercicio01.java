import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextField;

import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;

public class Ejercicio01 extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio01 frame = new Ejercicio01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio01() {
		
		String[] Ciudades = {"Sevilla", "Huelva", "Cádiz", "Córdoba", "Málaga", "Granada", "Jaen"};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setTitle("Info covid-19");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Fotos/covi.png"));
		
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.WEST);
		
		JList list = new JList(Ciudades);
		list.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(list);
		
		
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDatosIncidencia = new JLabel("DATOS INCIDENCIA 2020");
		lblDatosIncidencia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDatosIncidencia.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblDatosIncidencia, BorderLayout.NORTH);
		//panel_1.add(JLabel);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel2 = new JLabel("Población");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblNewLabel2);
		JLabel lblNewLabel3 = new JLabel("Hombres");
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblNewLabel3);
		JLabel lblNewLabel4 = new JLabel("Mujeres");
		lblNewLabel4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(lblNewLabel4);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Info");
		panel_4.add(btnNewButton, BorderLayout.EAST);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new GridLayout(2, 1, 0, 0));
		
		JRadioButton rdbtnMayorDeEdad = new JRadioButton("Mayor de edad");
		panel_6.add(rdbtnMayorDeEdad);
		
		JRadioButton rdbtnMenorDeEdad = new JRadioButton("Menor de edad");
		panel_6.add(rdbtnMenorDeEdad);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		
		
		JLabel lblSeleccioneMes = new JLabel("Seleccione Mes");
		panel_7.add(lblSeleccioneMes, BorderLayout.CENTER);
		
		String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "Noviembre", "DICIEMBRE"};
		JComboBox comboBox = new JComboBox(meses);
		panel_7.add(comboBox, BorderLayout.EAST);
		
		
		/*
		JLabel lblNewLabel = new JLabel("Selecciones Mes: ");
		panel_5.add(lblNewLabel, BorderLayout.CENTER);
		String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "Noviembre", "DICIEMBRE"};
		JComboBox comboBox = new JComboBox(meses);
		panel_5.add(comboBox);
		
		*/
		/*
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Selecciones Mes: ");
		panel_6.add(lblNewLabel, BorderLayout.WEST);
		*/
		
		/*
		String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "Noviembre", "DICIEMBRE"};
		JComboBox comboBox = new JComboBox(meses);
		panel_6.add(comboBox, BorderLayout.CENTER);
		
		*/
		/*
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(2, 1));
		*/
		
		/*
		JRadioButton rdbtnNewRadioButton1 = new JRadioButton("Mayor de edad");
		rdbtnNewRadioButton1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(rdbtnNewRadioButton1, BorderLayout.WEST);
		JRadioButton rdbtnNewRadioButton2 = new JRadioButton("Menor de edad");
		rdbtnNewRadioButton2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_4.add(rdbtnNewRadioButton2, BorderLayout.WEST);
		*/


	}

}
