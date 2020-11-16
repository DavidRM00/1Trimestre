package Convertir;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio01 extends JFrame {

	private JPanel contentPane;
	public static JTextField txtMB;
	public static JLabel lblBytes;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMB = new JTextField();
		txtMB.setBounds(118, 45, 171, 20);
		contentPane.add(txtMB);
		txtMB.setColumns(10);
		
		lblBytes.setHorizontalAlignment(SwingConstants.CENTER);
		lblBytes.setBounds(118, 105, 171, 20);
		contentPane.add(lblBytes);
		
		JButton btnConvertir = new JButton("Conversi\u00F3n");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CrlConversor.press_btnConvertir();
				
			}
		});
		btnConvertir.setBounds(118, 159, 171, 23);
		contentPane.add(btnConvertir);
	}
}
