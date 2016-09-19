package br.univel.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.univel.classes.Control;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class telasFrmTransferenciaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmTransferenciaCliente frame = new telasFrmTransferenciaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Control c = new Control();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Create the frame.
	 */
	public telasFrmTransferenciaCliente() {
		setTitle("Banco TADS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Gg-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(c.iconMain());
		lblNewLabel_1.setBounds(10, 4, 49, 52);
		panel.add(lblNewLabel_1);
		
		JLabel lblTitle = new JLabel(c.getTitleTADS());
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(85, 11, 113, 17);
		panel.add(lblTitle);
		
		JLabel lblSubTitle = new JLabel(c.getSubTitle());
		lblSubTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSubTitle.setBounds(85, 35, 180, 20);
		panel.add(lblSubTitle);
		
		JLabel lblDate = new JLabel();
		lblDate.setText(c.getDate()+" - "+c.getHour());
		lblDate.setBounds(295, 2, 113, 14);
		panel.add(lblDate);
		
		JLabel lblAG = new JLabel("AG: 0000-00");
		lblAG.setBounds(295, 16, 113, 14);
		panel.add(lblAG);
		
		JLabel lblTypeAcc = new JLabel("$TipoConta: 00000-00");
		lblTypeAcc.setBounds(295, 30, 129, 14);
		panel.add(lblTypeAcc);
		
		JLabel lblSaldo = new JLabel("Saldo: R$ 0,00");
		lblSaldo.setBounds(295, 43, 113, 14);
		panel.add(lblSaldo);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setBounds(10, 220, 59, 15);
		contentPane.add(lblNewLabel);
		
		txtValue = new JTextField();
		txtValue.setBounds(10, 239, 248, 23);
		contentPane.add(txtValue);
		txtValue.setColumns(10);
		
		JButton btnConfirme = new JButton("Confirme");
		btnConfirme.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConfirme.setBounds(271, 239, 128, 23);
		contentPane.add(btnConfirme);
		
		JLabel lblAg = new JLabel("AG:");
		lblAg.setBounds(10, 103, 46, 14);
		contentPane.add(lblAg);
		
		textField = new JTextField();
		textField.setBounds(10, 115, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 115, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblConta = new JLabel("Conta:");
		lblConta.setBounds(106, 103, 46, 14);
		contentPane.add(lblConta);
		
		JLabel lblTipoConta = new JLabel(" Tipo Conta");
		lblTipoConta.setBounds(10, 139, 70, 14);
		contentPane.add(lblTipoConta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 156, 212, 22);
		contentPane.add(comboBox);
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setBounds(10, 176, 46, 14);
		contentPane.add(lblTitular);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 189, 212, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblContaDeDestino = new JLabel("Conta De Destino/Cr\u00E9dito");
		lblContaDeDestino.setForeground(Color.BLUE);
		lblContaDeDestino.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContaDeDestino.setBounds(10, 71, 242, 21);
		contentPane.add(lblContaDeDestino);
	}
}
