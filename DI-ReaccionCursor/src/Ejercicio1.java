import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 242);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		
			JMenuItem mntmAbrir = new JMenuItem("Abrir");
				actionPerformed();
				
			
			mnArchivo.add(mntmAbrir);
		
		
		
		
		
			JMenuItem mntmGuardar = new JMenuItem("Guardar");
			mntmGuardar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}

			});
			mnArchivo.add(mntmGuardar);
			
	
			
			JSeparator separator = new JSeparator();
			mnArchivo.add(separator);
			
			
			JMenuItem mntmSalir = new JMenuItem("Salir");
			mntmSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			mnArchivo.add(mntmSalir);
			
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
	}

	private void actionPerformed() {
		// TODO Auto-generated method stub
		
	}



}
