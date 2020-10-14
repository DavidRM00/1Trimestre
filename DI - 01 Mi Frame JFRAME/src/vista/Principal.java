package vista;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;


public class Principal extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 8, 450, 300);
		getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(139, 40, 116, 23);
		getContentPane().add(textPane);
		
		
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(139, 75, 116, 23);
		getContentPane().add(textPane_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(57, 84, 48, 14);
		getContentPane().add(lblNewLabel);
		
	}
}
