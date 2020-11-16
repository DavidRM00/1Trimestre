import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;

public class Cursor1 extends JFrame {


	public static Cursor1 frame;
	private JPanel contentPane;
	private JTextField txtEntrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConversor frame = new FrmConversor();
					frame = new FrmConversor();
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
	public Cursor1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("" + e.getX() + "" + e.getY());
			}
		});
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtEntrada = new JTextField();
		txtEntrada.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(("Pulsando: " + e.getKeyChar() + e.getKeyCode()));


				if (e.getKeyChar()=='r') {
					contentPane.setBackground(Color.RED);
				}
				else if (e.getKeyChar()=='g') {
					contentPane.setBackground(Color.GREEN);
				}
				else if (e.getKeyChar()=='b') {
					contentPane.setBackground(Color.BLUE);
				}
					
			}
			
			
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println(("Soltando: " + e.getKeyChar() + e.getKeyCode()));
				if (e.getKeyCode()==87) {
					txtEntrada.setText(txtEntrada.getText().replace(e.getKeyChar(), (char)(13)));
				}
			}
			
			
			@Override
			public void keyTyped(KeyEvent e) {
				//System.out.println(("Escribiendo: " + e.getKeyChar() + e.getKeyCode()));
				
				
			}
			
			
		});
		txtEntrada.setBounds(70, 11, 96, 20);
		panel.add(txtEntrada);
		txtEntrada.setColumns(10);
		
		JButton btnConvertir = new JButton("CONVERTIR");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog ventanita = new JDialog();
				ventanita.setTitle ("Esto es una ventanita");
				ventanita.setModal (true);
				ventanita.setBounds (100,300,400,600);
				ventanita.setVisible (true);
			}
		});

		btnConvertir.setBounds(51, 109, 140, 23);
		panel.add(btnConvertir);
		
		
			
		
		
		JLabel lblBytes = new JLabel("Bytes");
		lblBytes.setHorizontalAlignment(SwingConstants.CENTER);
		lblBytes.setBounds(70, 58, 96, 14);
		panel.add(lblBytes);
		
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileDialog FchGuardar = new FileDialog (frame, "Guardar documento...", FileDialog.SAVE);
				
				System.out.println("Antes de mostrar...");
				FchGuardar.setVisible(true);
				System.out.println("Despues de mostrar...");
				String directorio= FchGuardar.getDirectory();
				String fichero = FchGuardar.getFile();
				System.out.println(directorio);
				System.out.println(fichero);
				
			}
		});
		btnAbrir.setBounds(77, 143, 89, 23);
		panel.add(btnAbrir);
	}
}
