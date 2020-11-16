import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(20, 22, 48, 14);
		contentPane.add(lblCdigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 47, 48, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(78, 19, 202, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(78, 44, 202, 20);
		contentPane.add(textField_1);
		
		JLabel lblStockActual = new JLabel("Stock Actual:");
		lblStockActual.setBounds(307, 22, 90, 14);
		contentPane.add(lblStockActual);
		
		JLabel lblStockMnimo = new JLabel("Stock M\u00EDnimo:");
		lblStockMnimo.setBounds(307, 47, 90, 14);
		contentPane.add(lblStockMnimo);
		
		JLabel lblStockMximo = new JLabel("Stock M\u00E1ximo:");
		lblStockMximo.setBounds(307, 72, 90, 14);
		contentPane.add(lblStockMximo);
		
		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(20, 84, 48, 14);
		contentPane.add(lblGrupo);
		
		JRadioButton rdbtnPack = new JRadioButton("Pack");
		rdbtnPack.setBounds(78, 83, 109, 23);
		contentPane.add(rdbtnPack);
		
		JRadioButton rdbtnUnidad = new JRadioButton("Unidad");
		rdbtnUnidad.setBounds(78, 109, 109, 23);
		contentPane.add(rdbtnUnidad);
		
		JRadioButton rdbtnCombinado = new JRadioButton("Combinado");
		rdbtnCombinado.setBounds(78, 135, 109, 23);
		contentPane.add(rdbtnCombinado);
		
		textField_2 = new JTextField();
		textField_2.setBounds(401, 19, 83, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(401, 44, 83, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(401, 69, 83, 20);
		contentPane.add(textField_4);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(20, 204, 83, 14);
		contentPane.add(lblComentarios);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(113, 199, 240, 100);
		contentPane.add(textArea);
		
		JLabel lblOtros = new JLabel("Otros:");
		lblOtros.setBounds(20, 330, 48, 14);
		contentPane.add(lblOtros);
		
		JCheckBox chckbxEsFrgil = new JCheckBox("Es fr\u00E1gil");
		chckbxEsFrgil.setBounds(113, 326, 97, 23);
		contentPane.add(chckbxEsFrgil);
		
		JCheckBox chckbxObsoleto = new JCheckBox("Obsoleto");
		chckbxObsoleto.setBounds(212, 326, 97, 23);
		contentPane.add(chckbxObsoleto);
		
		JLabel lblPvp = new JLabel("PVP:");
		lblPvp.setBounds(347, 330, 40, 14);
		contentPane.add(lblPvp);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(395, 327, 83, 20);
		contentPane.add(textField_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 367, 490, 2);
		contentPane.add(separator);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(324, 395, 83, 23);
		contentPane.add(btnBorrar);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(231, 395, 83, 23);
		contentPane.add(btnGuardar);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(417, 395, 83, 23);
		contentPane.add(btnNuevo);
		
		JButton button = new JButton("|<");
		button.setBounds(10, 380, 48, 38);
		contentPane.add(button);
		
		JButton button_1 = new JButton("<<");
		button_1.setBounds(57, 380, 48, 38);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton(">>");
		button_2.setBounds(104, 380, 48, 38);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton(">|");
		button_3.setBounds(151, 380, 48, 38);
		contentPane.add(button_3);
	}
}
