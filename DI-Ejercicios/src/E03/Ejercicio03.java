package E03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Ejercicio03 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio03 frame = new Ejercicio03();
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
	public Ejercicio03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCambieElModo = new JLabel("Cambie el modo en el que Excel corrige y aplica el formato a su texto.");
		lblCambieElModo.setBounds(66, 11, 429, 33);
		panel.add(lblCambieElModo);
		
		JTextPane txtpnOpcionesDeAutocorreccin = new JTextPane();
		txtpnOpcionesDeAutocorreccin.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnOpcionesDeAutocorreccin.setBackground(Color.LIGHT_GRAY);
		txtpnOpcionesDeAutocorreccin.setText("Opciones de Autocorrecci\u00F3n");
		txtpnOpcionesDeAutocorreccin.setBounds(0, 56, 564, 20);
		panel.add(txtpnOpcionesDeAutocorreccin);
		
		JLabel lblCambieLaForma = new JLabel("Cambie la forma en que Excel corrige y da formato al texto");
		lblCambieLaForma.setBounds(10, 85, 348, 14);
		panel.add(lblCambieLaForma);
		
		JLabel lblMientrasEscribe = new JLabel("mientras escribe:");
		lblMientrasEscribe.setBounds(10, 101, 117, 14);
		panel.add(lblMientrasEscribe);
		
		JButton btnOpcionesDeAutocorreccin = new JButton("Opciones de Autocorrecci\u00F3n...");
		btnOpcionesDeAutocorreccin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnOpcionesDeAutocorreccin.setBackground(Color.WHITE);
		btnOpcionesDeAutocorreccin.setBounds(367, 93, 197, 23);
		panel.add(btnOpcionesDeAutocorreccin);
		
		JTextPane txtpnAlCorregirLa = new JTextPane();
		txtpnAlCorregirLa.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnAlCorregirLa.setBackground(Color.LIGHT_GRAY);
		txtpnAlCorregirLa.setText("Al corregir la ortograf\u00EDa en los programas de Microsoft Office");
		txtpnAlCorregirLa.setBounds(0, 130, 564, 20);
		panel.add(txtpnAlCorregirLa);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Medac\\Desktop\\Ingl\u00E9s\\icon.PNG"));
		lblNewLabel.setBounds(7, 8, 52, 43);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 1, 0, 0));
		
		JCheckBox chckbxOmitirPalabrasQue = new JCheckBox("Omitir palabras que contengan n\u00FAmeros");
		panel_1.add(chckbxOmitirPalabrasQue);
		
		JCheckBox chckbxOmitirPalabrasEn = new JCheckBox("Omitir palabras en MAY\u00DASCULAS");
		panel_1.add(chckbxOmitirPalabrasEn);
		
		JCheckBox chckbxOmitirArchivosY = new JCheckBox("Omitir archivos y direcciones de Internet");
		panel_1.add(chckbxOmitirArchivosY);
		
		JCheckBox chckbxMarcarPalabrasRepetidas = new JCheckBox("Marcar palabras repetidas");
		panel_1.add(chckbxMarcarPalabrasRepetidas);
		
		JCheckBox chckbxSugerirSoloDel = new JCheckBox("Sugerir solo del diccionario principal");
		panel_1.add(chckbxSugerirSoloDel);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton = new JButton("Diccionarios personalizados...");
		panel_4.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblModos = new JLabel("Modos del espa\u00F1ol:");
		lblModos.setBounds(10, 11, 197, 28);
		panel_2.add(lblModos);
		
		JLabel lblModosDelPortugus = new JLabel("Modos del portugu\u00E9s brasile\u00F1o:");
		lblModosDelPortugus.setBounds(10, 38, 197, 28);
		panel_2.add(lblModosDelPortugus);
		
		JLabel lblIdiomaDelDiccionario = new JLabel("Idioma del diccionario:");
		lblIdiomaDelDiccionario.setBounds(10, 68, 197, 28);
		panel_2.add(lblIdiomaDelDiccionario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(217, 11, 231, 28);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(217, 41, 183, 28);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(217, 71, 287, 28);
		panel_2.add(comboBox_2);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
	}
}
