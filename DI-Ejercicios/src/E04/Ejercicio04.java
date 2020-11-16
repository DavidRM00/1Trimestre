package E04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Ejercicio04 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio04 frame = new Ejercicio04();
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
	public Ejercicio04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
			JPanel panel_3 = new JPanel();
			panel.add(panel_3);
			panel_3.setLayout(null);
			
				JLabel lblNum1 = new JLabel("N\u00FAmero 1:");
				lblNum1.setBounds(10, 11, 78, 19);
				panel_3.add(lblNum1);
				
				txtNum1 = new JTextField();
				txtNum1.setBounds(98, 10, 149, 20);
				panel_3.add(txtNum1);
				txtNum1.setColumns(10);
			
			JPanel panel_4 = new JPanel();
			panel.add(panel_4);
			panel_4.setLayout(null);
			
				JLabel lblNum2 = new JLabel("N\u00FAmero 2:");
				lblNum2.setBounds(10, 8, 78, 20);
				panel_4.add(lblNum2);
				
				txtNum2 = new JTextField();
				txtNum2.setBounds(98, 8, 151, 22);
				panel_4.add(txtNum2);
				txtNum2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
			JButton btnSuma = new JButton("");
			btnSuma.setIcon(new ImageIcon("C:\\Users\\Medac\\git\\repositoryDIE\\DI-Ejercicios\\FOTOS\\suma.jpg"));
			btnSuma.setBounds(10, 15, 50, 51);
			panel_1.add(btnSuma);
			suma();
			
			JButton btnResta = new JButton("");
			btnResta.setIcon(new ImageIcon("C:\\Users\\Medac\\git\\repositoryDIE\\DI-Ejercicios\\FOTOS\\resta.jpg"));
			btnResta.setBounds(80, 15, 50, 51);
			panel_1.add(btnResta);
			
			JButton btnMulti = new JButton("");
			btnMulti.setIcon(new ImageIcon("C:\\Users\\Medac\\git\\repositoryDIE\\DI-Ejercicios\\FOTOS\\multi.png"));
			btnMulti.setBounds(150, 15, 50, 51);
			panel_1.add(btnMulti);
			
			JButton btnDivi = new JButton("");
			btnDivi.setIcon(new ImageIcon("C:\\Users\\Medac\\git\\repositoryDIE\\DI-Ejercicios\\FOTOS\\divi.png"));
			btnDivi.setBounds(214, 15, 50, 51);
			panel_1.add(btnDivi);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
			JLabel lblResult = new JLabel("");
			lblResult.setBounds(10, 11, 254, 61);
			panel_2.add(lblResult);
	}
	
	private void suma() {
		double resultado = getetNum1() + getetNum2();
		
	}
		
	    double getetNum1() {
	        String resultado = txtNum1.getText().toString();
	        return (resultado.length()==0) ? 0.0 : Double.parseDouble(txtNum1.getText().toString());
	    }
		
		
	     double getetNum2() {
	        String resultado = txtNum2.getText().toString();
	        return (resultado.length()==0) ? 0.0 : Double.parseDouble(txtNum2.getText().toString());
	     }
		
	


}
