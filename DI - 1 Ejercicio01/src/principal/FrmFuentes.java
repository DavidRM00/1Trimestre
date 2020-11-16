package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class FrmFuentes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFuentes frame = new FrmFuentes();
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
	public FrmFuentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblFuente = new JLabel("Fuente");
		lblFuente.setBounds(33, 40, 48, 14);
		panel.add(lblFuente);
		
		JLabel lblEstilo = new JLabel("Estilo");
		lblEstilo.setBounds(136, 40, 48, 14);
		panel.add(lblEstilo);
		
		JLabel lblTamao = new JLabel("Tama\u00F1o");
		lblTamao.setBounds(270, 40, 48, 14);
		panel.add(lblTamao);
		
		JLabel lblResultado = new JLabel("EJEMPLO");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setBounds(10, 198, 170, 42);
		panel.add(lblResultado);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(213, 198, 89, 36);
		panel.add(btnOk);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(325, 198, 89, 36);
		panel.add(btnCancelar);
		
		JCheckBox chckbxNormal = new JCheckBox("Normal");
		chckbxNormal.setBounds(136, 61, 97, 23);
		panel.add(chckbxNormal);
		
		JCheckBox chckbxNegrita = new JCheckBox("Negrita");
		chckbxNegrita.setBounds(136, 87, 97, 23);
		panel.add(chckbxNegrita);
		
		JCheckBox chckbxCursiva = new JCheckBox("Cursiva");
		chckbxCursiva.setBounds(136, 113, 97, 23);
		panel.add(chckbxCursiva);
		
		JCheckBox chckbxSubrayado = new JCheckBox("Subrayado");
		chckbxSubrayado.setBounds(136, 139, 97, 23);
		panel.add(chckbxSubrayado);
		
		JList list = new JList();
		list.setBounds(33, 87, 0, 4);
		panel.add(list);
	}
}
