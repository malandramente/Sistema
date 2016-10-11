package br.univel.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.univel.classes.Control;
import java.awt.Toolkit;

public class TelasFrmPagam_Cliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelasFrmPagam_Cliente frame = new TelasFrmPagam_Cliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Control c = new Control();
	private JTextField txtNome;
	private JTextField txtNumero;
	/**
	 * Create the frame.
	 */
	public TelasFrmPagam_Cliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Gg-48.png"));
		setTitle("Banco TADS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(10, 4, 49, 52);
		lblNewLabel_1.setIcon(c.iconMain());
		panel.add(lblNewLabel_1);
		
		JLabel lblTitle = new JLabel(c.getTitleTADS());
		lblTitle.setBounds(85, 11, 113, 17);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setForeground(Color.BLACK);
		panel.add(lblTitle);
		
		JLabel lblSubTitle = new JLabel(c.getSubTitle());
		lblSubTitle.setBounds(85, 35, 180, 20);
		lblSubTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblSubTitle);
		
		JLabel lblDate = new JLabel();
		lblDate.setBounds(295, 2, 113, 14);
		lblDate.setText(c.getDate()+" - "+c.getHour());
		panel.add(lblDate);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 68, 424, 183);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo de barras");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(35, 41, 146, 22);
		panel_1.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("Valor a ser pago");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNmero.setBounds(35, 89, 181, 22);
		panel_1.add(lblNmero);
		
		txtNome = new JTextField();
		txtNome.setBounds(35, 68, 238, 20);
		panel_1.add(txtNome);
		txtNome.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(35, 111, 238, 20);
		panel_1.add(txtNumero);
		
		JButton btnConfirme = new JButton("Confirme");
		btnConfirme.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConfirme.setForeground(Color.BLACK);
		btnConfirme.setBounds(282, 110, 132, 23);
		panel_1.add(btnConfirme);
		
		JLabel lbltipoConta = new JLabel("$Tipo Conta : 00000-00");
		lbltipoConta.setBounds(295, 27, 127, 14);
		panel.add(lbltipoConta);
		
		JLabel lblAgencia = new JLabel("AG: 0000-00");
		lblAgencia.setBounds(295, 14, 102, 14);
		panel.add(lblAgencia);
		
		JLabel lblsaldo = new JLabel("Saldo: R$ 0,00");
		lblsaldo.setBounds(295, 42, 113, 14);
		panel.add(lblsaldo);

	}
}
