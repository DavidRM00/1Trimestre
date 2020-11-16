import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDiseño extends JFrame {

	private JPanel ventana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDiseño frame = new FrmDiseño();
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
	public FrmDiseño() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ventana = new JPanel();
		ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ventana);
		ventana.setLayout(null);
		
		JLabel lblMensaje = new JLabel("HOLA");
		lblMensaje.setBounds(82, 63, 48, 14);
		ventana.add(lblMensaje);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("ADIOS");
				System.out.println("Press ACEPTAR");
			}
		});
		btnAceptar.setBounds(82, 90, 89, 23);
		ventana.add(btnAceptar);
	}
}
