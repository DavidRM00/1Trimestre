import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmBD extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBD frame = new FrmBD();
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
	public FrmBD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnOracle = new JRadioButton("Oracle");
		rdbtnOracle.setBounds(45, 17, 81, 23);
		contentPane.add(rdbtnOracle);
		
		JRadioButton rdbtnMysql = new JRadioButton("MySQL");
		rdbtnMysql.setBounds(151, 17, 81, 23);
		contentPane.add(rdbtnMysql);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 47, 244, 2);
		contentPane.add(separator);
		
		JLabel lblHost = new JLabel("Host:");
		lblHost.setBounds(20, 60, 48, 23);
		contentPane.add(lblHost);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setBounds(20, 94, 48, 23);
		contentPane.add(lblPort);
		
		JLabel lblSid = new JLabel("SID:");
		lblSid.setBounds(20, 128, 48, 23);
		contentPane.add(lblSid);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 176, 244, 2);
		contentPane.add(separator_1);
		
		textField = new JTextField();
		textField.setBounds(78, 60, 154, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(78, 94, 154, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(78, 128, 154, 23);
		contentPane.add(textField_2);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setBounds(20, 189, 48, 23);
		contentPane.add(lblUser);
		
		JLabel lblPass = new JLabel("Pass:");
		lblPass.setBounds(20, 223, 48, 23);
		contentPane.add(lblPass);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(78, 190, 154, 23);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(78, 224, 154, 23);
		contentPane.add(textField_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 264, 244, 2);
		contentPane.add(separator_2);
		
		JButton btnConectar = new JButton("CONECTAR");
		btnConectar.setBounds(75, 281, 120, 23);
		contentPane.add(btnConectar);
	}
}
