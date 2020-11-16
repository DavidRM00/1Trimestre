import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class Conexion extends JFrame {

	private JPanel contentPane;
	private final JPanel panel_1 = new JPanel();
	private JTextField txtIP;
	private JTextField txtPuerto;
	private JTextField txtBD;
	private JTextField txtUsuario;
	private JTextField txtContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conexion frame = new Conexion();
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
	public Conexion() {
		setTitle("Coneexi\u00F3n a BD_ORACLE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHost = new JLabel("Host:");
		lblHost.setBounds(22, 17, 82, 27);
		panel.add(lblHost);
		
		JLabel lblPuerto = new JLabel("Puerto:");
		lblPuerto.setBounds(22, 47, 82, 27);
		panel.add(lblPuerto);
		
		JLabel lblBD = new JLabel("BaseDatos:");
		lblBD.setBounds(22, 78, 82, 27);
		panel.add(lblBD);
		
		txtIP = new JTextField();
		txtIP.setText("XXX.XXX.XXX.XXX");
		txtIP.setBounds(121, 17, 161, 27);
		panel.add(txtIP);
		txtIP.setColumns(10);
		
		txtPuerto = new JTextField();
		txtPuerto.setText("Puerto");
		txtPuerto.setColumns(10);
		txtPuerto.setBounds(121, 47, 82, 27);
		panel.add(txtPuerto);
		
		txtBD = new JTextField();
		txtBD.setText("Base de datos");
		txtBD.setColumns(10);
		txtBD.setBounds(121, 78, 210, 27);
		panel.add(txtBD);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(42, 35, 80, 24);
		panel_1.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(42, 70, 80, 24);
		panel_1.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(140, 35, 165, 24);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(140, 70, 165, 24);
		panel_1.add(txtContrasea);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCE = new JLabel("CORRECTO");
		lblCE.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCE.setHorizontalAlignment(SwingConstants.CENTER);
		lblCE.setBounds(46, 40, 140, 46);
		panel_2.add(lblCE);
		
		JButton btnTest = new JButton("TEST");
		btnTest.setBackground(Color.RED);
		btnTest.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTest.setForeground(Color.BLACK);
		btnTest.setBounds(222, 40, 89, 46);
		panel_2.add(btnTest);
	}
}
