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
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;

public class telasFrmPoupupConta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmPoupupConta frame = new telasFrmPoupupConta();
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
	public telasFrmPoupupConta() {
		setTitle("Banco TADS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Gg-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 284, 34);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(c.iconMain());
		lblNewLabel_1.setBounds(10, 4, 49, 52);
		panel.add(lblNewLabel_1);
		
		JLabel lblTitle = new JLabel("$Icon - Banco TADS");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(33, 11, 180, 17);
		panel.add(lblTitle);
		
		JLabel lblNewLabel = new JLabel("Conta");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(106, 38, 60, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnConfirme = new JButton("Confirme");
		btnConfirme.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConfirme.setBounds(162, 175, 122, 23);
		contentPane.add(btnConfirme);
		
		JLabel lblOperao = new JLabel("AG:");
		lblOperao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOperao.setBounds(10, 38, 42, 14);
		contentPane.add(lblOperao);
		
		JLabel lblValor = new JLabel("Tipo Conta");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValor.setBounds(10, 84, 86, 14);
		contentPane.add(lblValor);
		
		textField = new JTextField();
		textField.setBounds(10, 53, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 53, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 101, 177, 22);
		contentPane.add(comboBox);
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitular.setBounds(10, 134, 46, 14);
		contentPane.add(lblTitular);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 151, 171, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
