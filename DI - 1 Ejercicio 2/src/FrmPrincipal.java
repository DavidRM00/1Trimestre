import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmConexion = new JMenuItem("Conexion...");
		mnArchivo.add(mntmConexion);
		
		JMenu mnConsulta = new JMenu("Consulta >>");
		mnArchivo.add(mnConsulta);
		
		JMenuItem mntmCargar = new JMenuItem("Cargar...");
		mnConsulta.add(mntmCargar);
		
		JMenuItem mntmLimpiar = new JMenuItem("Limpiar");
		mnConsulta.add(mntmLimpiar);
		
		JMenu mnResultados = new JMenu("Resultados >>");
		mnArchivo.add(mnResultados);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar...");
		mnResultados.add(mntmGuardar);
		
		JMenuItem mntmLimpiar_1 = new JMenuItem("Limpiar");
		mnResultados.add(mntmLimpiar_1);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
