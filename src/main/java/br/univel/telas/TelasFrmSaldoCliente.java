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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class TelasFrmSaldoCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelasFrmSaldoCliente frame = new TelasFrmSaldoCliente();
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
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton button;
	private JButton button_1;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_SaldoPeriodo;
	/**
	 * Create the frame.
	 */
	public TelasFrmSaldoCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Gg-48.png"));
		setTitle("Banco TADS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 352);
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
		lblDate.setBounds(492, 0, 113, 14);
		lblDate.setText(c.getDate()+" - "+c.getHour());
		panel.add(lblDate);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 68, 595, 190);
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Opercao");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNumero = new JLabel("Data");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNumero = new GridBagConstraints();
		gbc_lblNumero.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero.gridx = 5;
		gbc_lblNumero.gridy = 1;
		panel_1.add(lblNumero, gbc_lblNumero);
		
		JLabel lblCidade = new JLabel("Valor");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 9;
		gbc_lblCidade.gridy = 1;
		panel_1.add(lblCidade, gbc_lblCidade);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 2;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 5;
		gbc_textField_3.gridy = 2;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.gridwidth = 3;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 9;
		gbc_textField_6.gridy = 2;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 4;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 2;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 5;
		gbc_textField_4.gridy = 4;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("");
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.gridwidth = 3;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 9;
		gbc_textField_7.gridy = 4;
		panel_1.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 6;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 2;
		gbc_textField_5.insets = new Insets(0, 0, 0, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 5;
		gbc_textField_5.gridy = 6;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setText("");
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 0, 5);
		gbc_textField_8.gridwidth = 3;
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 9;
		gbc_textField_8.gridy = 6;
		panel_1.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		btnNewButton = new JButton("|<");
		btnNewButton.setBounds(0, 281, 49, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("<<");
		btnNewButton_1.setBounds(48, 281, 59, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("<");
		btnNewButton_2.setBounds(103, 281, 49, 23);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Im");
		btnNewButton_3.setBounds(475, 281, 49, 23);
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton(">|");
		btnNewButton_4.setBounds(427, 281, 49, 23);
		panel.add(btnNewButton_4);
		
		button = new JButton(">>");
		button.setBounds(377, 281, 53, 23);
		panel.add(button);
		
		button_1 = new JButton(">");
		button_1.setBounds(330, 281, 49, 23);
		panel.add(button_1);
		
		textField_9 = new JTextField();
		textField_9.setText("01/09/2016");
		textField_9.setForeground(new Color(0, 0, 0));
		textField_9.setBounds(150, 282, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setText("19/09/16");
		textField_10.setBounds(246, 282, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblAg = new JLabel("AG: 0000-00");
		lblAg.setBounds(492, 14, 95, 14);
		panel.add(lblAg);
		
		JLabel lbltipoconta = new JLabel("$TipoConta: 00000-00");
		lbltipoconta.setBounds(492, 25, 113, 14);
		panel.add(lbltipoconta);
		
		JLabel lblSaldor = new JLabel("Saldo: R$ 0,00");
		lblSaldor.setBounds(492, 39, 101, 14);
		panel.add(lblSaldor);
		
		textField_SaldoPeriodo = new JTextField();
		textField_SaldoPeriodo.setBounds(519, 282, 86, 20);
		panel.add(textField_SaldoPeriodo);
		textField_SaldoPeriodo.setColumns(10);

	}
}
