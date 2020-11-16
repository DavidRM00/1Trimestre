package principal;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class FrmColores extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmColores frame = new FrmColores();
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
	public FrmColores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFuente = new JLabel("Fuente");
		lblFuente.setBounds(241, 27, 48, 14);
		contentPane.add(lblFuente);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setBounds(21, 27, 48, 14);
		contentPane.add(lblFondo);
		
		JLabel lblBlack = new JLabel("");
		lblBlack.setBackground(Color.BLACK);
		lblBlack.setOpaque(true);
		lblBlack.setBounds(21, 64, 35, 35);
		contentPane.add(lblBlack);
		
		JLabel lblRed = new JLabel("");
		lblRed.setOpaque(true);
		lblRed.setBackground(Color.RED);
		lblRed.setBounds(66, 64, 35, 35);
		contentPane.add(lblRed);
		
		JLabel lblGreen = new JLabel("");
		lblGreen.setOpaque(true);
		lblGreen.setBackground(Color.GREEN);
		lblGreen.setBounds(111, 64, 35, 35);
		contentPane.add(lblGreen);
		
		JLabel lblBlue = new JLabel("");
		lblBlue.setOpaque(true);
		lblBlue.setBackground(Color.BLUE);
		lblBlue.setBounds(156, 64, 35, 35);
		contentPane.add(lblBlue);
		
		JLabel lblWhite = new JLabel("");
		lblWhite.setOpaque(true);
		lblWhite.setBackground(Color.WHITE);
		lblWhite.setBounds(21, 110, 35, 35);
		contentPane.add(lblWhite);
		
		JLabel lblOrange = new JLabel("");
		lblOrange.setOpaque(true);
		lblOrange.setBackground(Color.ORANGE);
		lblOrange.setBounds(66, 110, 35, 35);
		contentPane.add(lblOrange);
		
		JLabel lblYellow = new JLabel("");
		lblYellow.setOpaque(true);
		lblYellow.setBackground(Color.YELLOW);
		lblYellow.setBounds(111, 110, 35, 35);
		contentPane.add(lblYellow);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.CYAN);
		label.setBounds(156, 110, 35, 35);
		contentPane.add(label);
		
		JLabel lblWhiteF = new JLabel("");
		lblWhiteF.setOpaque(true);
		lblWhiteF.setBackground(Color.WHITE);
		lblWhiteF.setBounds(241, 110, 35, 35);
		contentPane.add(lblWhiteF);
		
		JLabel lblBlackF = new JLabel("");
		lblBlackF.setOpaque(true);
		lblBlackF.setBackground(Color.BLACK);
		lblBlackF.setBounds(241, 64, 35, 35);
		contentPane.add(lblBlackF);
		
		JLabel lblRedF = new JLabel("");
		lblRedF.setOpaque(true);
		lblRedF.setBackground(Color.RED);
		lblRedF.setBounds(286, 64, 35, 35);
		contentPane.add(lblRedF);
		
		JLabel lblGreenF = new JLabel("");
		lblGreenF.setOpaque(true);
		lblGreenF.setBackground(Color.GREEN);
		lblGreenF.setBounds(331, 64, 35, 35);
		contentPane.add(lblGreenF);
		
		JLabel lblBlueF = new JLabel("");
		lblBlueF.setOpaque(true);
		lblBlueF.setBackground(Color.BLUE);
		lblBlueF.setBounds(376, 64, 35, 35);
		contentPane.add(lblBlueF);
		
		JLabel blbCyanF = new JLabel("");
		blbCyanF.setOpaque(true);
		blbCyanF.setBackground(Color.CYAN);
		blbCyanF.setBounds(376, 110, 35, 35);
		contentPane.add(blbCyanF);
		
		JLabel lblYellowF = new JLabel("");
		lblYellowF.setOpaque(true);
		lblYellowF.setBackground(Color.YELLOW);
		lblYellowF.setBounds(331, 110, 35, 35);
		contentPane.add(lblYellowF);
		
		JLabel lblOrangeF = new JLabel("");
		lblOrangeF.setOpaque(true);
		lblOrangeF.setBackground(Color.ORANGE);
		lblOrangeF.setBounds(286, 110, 35, 35);
		contentPane.add(lblOrangeF);
		
		JLabel lblResultado = new JLabel("EJEMPLO");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setBounds(21, 168, 158, 37);
		contentPane.add(lblResultado);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(223, 169, 89, 40);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(322, 168, 89, 41);
		contentPane.add(btnCancelar);
	}

}
