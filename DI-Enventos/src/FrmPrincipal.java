import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setBounds(0, 0, 640, 480);
		ventana.setLayout(null);
		
		JLabel lblMensaje = new JLabel("Hola");
		lblMensaje.setBounds(100, 50, 120, 40);
		ventana.add(lblMensaje);
		

		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(100, 100, 120, 40);
		
		ventana.add(btnAceptar);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				
				press_btnAceptar(lblMensaje);
			}

			private void press_btnAceptar(JLabel lblMensaje) {
				lblMensaje.setText("ADIOS");
				System.out.println("Has pulsado el botón ACEPTAR");
			}
		});
		
		
		
		
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("Cerrando la aplicación.");
				 System.exit(0);
			}
			
			public void windowIconified(WindowEvent e) {
				System.out.println("Ventana miniminazada.");
			}
			
			
			public void windowOpened(WindowEvent e) {
				System.out.println("Ventana abierta.");
			}
			
			
			public void windowActivated(WindowEvent e) {
				System.out.println("Ventana activada.");
			}
			
			public void windowDeactivated(WindowEvent e) {
				System.out.println("Ventana desactivada.");
			}
			
		});
		
		
		
		
		
		
		ventana.setVisible(true);

	}

}
