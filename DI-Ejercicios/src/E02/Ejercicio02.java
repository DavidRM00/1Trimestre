package E02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;

public class Ejercicio02 extends JFrame {

	private JPanel contentPane;
	private JTextField txtColorDeFuente;
	private JTextField txtEstiloDeSubrayado;
	private JTextField txtColorDeSubrayado;
	private JPanel panel_4;
	private JCheckBox chckbxTachado;
	private JCheckBox chckbxDobleTachado;
	private JCheckBox chckbxSuperIndice;
	private JCheckBox chckbxSubndice;
	private JCheckBox chckbxVersalitas;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxOculto;
	private JPanel panel_5;
	private JTextField txtVistaPrevia;
	private JTextField txtcuerpo;
	private JTextField txtFuente;
	private JTextField txtEstiloDeFuente;
	private JTextField txtTamao;
	private JTextField txtEstaEsLa;
	private JPanel panel_12;
	private JPanel panel_6;
	private JPanel panel_3;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JPanel panel_9;
	private JPanel panel_13;
	private JPanel panel_14;
	private JList list;
	private JList list_1;
	private JList list_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio02 frame = new Ejercicio02();
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
	public Ejercicio02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JPanel panel = new JPanel();
		panel.setBounds(5, 6, 574, 183);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 574, 10);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		panel_9 = new JPanel();
		panel_9.setBounds(0, 10, 574, 163);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		panel_13 = new JPanel();
		panel_13.setBounds(0, 0, 574, 20);
		panel_9.add(panel_13);
		panel_13.setLayout(null);
		
		txtFuente = new JTextField();
		txtFuente.setBounds(20, 0, 179, 20);
		panel_13.add(txtFuente);
		txtFuente.setText("Fuente:");
		txtFuente.setColumns(10);
		
		txtEstiloDeFuente = new JTextField();
		txtEstiloDeFuente.setBounds(242, 0, 151, 20);
		panel_13.add(txtEstiloDeFuente);
		txtEstiloDeFuente.setText("Estilo de fuente:");
		txtEstiloDeFuente.setColumns(10);
		
		txtTamao = new JTextField();
		txtTamao.setBounds(416, 0, 133, 20);
		panel_13.add(txtTamao);
		txtTamao.setText("Tama\u00F1o:");
		txtTamao.setColumns(10);
		
		panel_14 = new JPanel();
		panel_14.setBounds(0, 20, 574, 143);
		panel_9.add(panel_14);
		
		
		
		
		String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "Noviembre", "DICIEMBRE"};
		panel_14.setLayout(null);
		
		list = new JList(meses);
		list.setBounds(1, 1, 172, 192);
		panel_14.add(list);
		JScrollPane panelScroll1 = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelScroll1.setBounds(21, 0, 178, 143);
		panel_14.add(panelScroll1);
		
		list_1 = new JList(meses);
		list_1.setBounds(1, 1, 133, 142);
		panel_14.add(list_1);
		JScrollPane panelScroll2 = new JScrollPane(list_1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelScroll2.setBounds(242, -1, 152, 143);
		panel_14.add(panelScroll2);
		
		list_2 = new JList(meses);
		list_2.setBounds(1, 1, 172, 192);
		panel_14.add(list_2);
		JScrollPane panelScroll3 = new JScrollPane(list_2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelScroll3.setBounds(417, -1, 133, 143);
		panel_14.add(panelScroll3);
		
		
		
		

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 173, 574, 10);
		panel.add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 189, 574, 183);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 574, 40);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtColorDeFuente = new JTextField();
		txtColorDeFuente.setBounds(0, 0, 191, 20);
		txtColorDeFuente.setText("Color de fuente:");
		panel_2.add(txtColorDeFuente);
		txtColorDeFuente.setColumns(10);
		
		txtEstiloDeSubrayado = new JTextField();
		txtEstiloDeSubrayado.setBounds(191, 0, 191, 20);
		txtEstiloDeSubrayado.setText("Estilo de subrayado:");
		panel_2.add(txtEstiloDeSubrayado);
		txtEstiloDeSubrayado.setColumns(10);
		
		txtColorDeSubrayado = new JTextField();
		txtColorDeSubrayado.setBounds(382, 0, 191, 20);
		txtColorDeSubrayado.setText("Color de subrayado:");
		panel_2.add(txtColorDeSubrayado);
		txtColorDeSubrayado.setColumns(10);
		
		comboBox = new JComboBox(meses);
		comboBox.setBounds(0, 20, 191, 20);
		panel_2.add(comboBox);
		
		comboBox_1 = new JComboBox(meses);
		comboBox_1.setBounds(191, 20, 191, 20);
		panel_2.add(comboBox_1);
		
		comboBox_2 = new JComboBox(meses);
		comboBox_2.setBounds(382, 20, 191, 20);
		panel_2.add(comboBox_2);
		
		panel_4 = new JPanel();
		panel_4.setBounds(0, 40, 574, 143);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 2, 0, 0));
		
		chckbxTachado = new JCheckBox("Tachado");
		panel_4.add(chckbxTachado);
		
		chckbxVersalitas = new JCheckBox("Versalitas");
		panel_4.add(chckbxVersalitas);
		
		chckbxDobleTachado = new JCheckBox("Doble tachado");
		panel_4.add(chckbxDobleTachado);
		
		chckbxNewCheckBox = new JCheckBox("May\u00FAsculas");
		panel_4.add(chckbxNewCheckBox);
		
		chckbxSuperIndice = new JCheckBox("Super indice");
		panel_4.add(chckbxSuperIndice);
		
		chckbxOculto = new JCheckBox("Oculto");
		panel_4.add(chckbxOculto);
		
		chckbxSubndice = new JCheckBox("Sub\u00EDndice");
		panel_4.add(chckbxSubndice);
		
		panel_6 = new JPanel();
		panel_6.setBounds(5, 372, 574, 183);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 574, 140);
		panel_6.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		txtVistaPrevia = new JTextField();
		panel_5.add(txtVistaPrevia, BorderLayout.NORTH);
		txtVistaPrevia.setHorizontalAlignment(SwingConstants.LEFT);
		txtVistaPrevia.setText("Vista Previa");
		txtVistaPrevia.setColumns(10);
		
		txtcuerpo = new JTextField();
		panel_5.add(txtcuerpo, BorderLayout.CENTER);
		txtcuerpo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtcuerpo.setHorizontalAlignment(SwingConstants.CENTER);
		txtcuerpo.setText("____________________      +Cuerpo     ________________________");
		txtcuerpo.setColumns(40);
		
		txtEstaEsLa = new JTextField();
		panel_5.add(txtEstaEsLa, BorderLayout.SOUTH);
		txtEstaEsLa.setText("Esta es la fuente del tema del cuerpo. El tema del documento actual define qu\u00E9 fuente se utilizar\u00E1.");
		txtEstaEsLa.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 140, 574, 43);
		panel_6.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_7.add(panel_11, BorderLayout.NORTH);
		
		panel_12 = new JPanel();
		panel_7.add(panel_12, BorderLayout.SOUTH);
		
		JButton btnEstablecerComoPreterminado = new JButton("Establecer como preterminado");
		panel_12.add(btnEstablecerComoPreterminado);
		btnEstablecerComoPreterminado.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnNewButton = new JButton("Efectos de texto:");
		panel_12.add(btnNewButton);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnAceptar = new JButton("Aceptar");
		panel_12.add(btnAceptar);
		btnAceptar.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton btnCancelar = new JButton("Cancelar");
		panel_12.add(btnCancelar);
		btnCancelar.setHorizontalAlignment(SwingConstants.RIGHT);
		
	}
}
