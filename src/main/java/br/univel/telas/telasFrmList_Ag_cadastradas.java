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

public class telasFrmList_Ag_cadastradas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmList_Ag_cadastradas frame = new telasFrmList_Ag_cadastradas();
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
	/**
	 * Create the frame.
	 */
	public telasFrmList_Ag_cadastradas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Gg-48.png"));
		setTitle("Banco TADS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 300);
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
		panel_1.setBounds(0, 68, 441, 183);
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNumero = new GridBagConstraints();
		gbc_lblNumero.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero.gridx = 5;
		gbc_lblNumero.gridy = 1;
		panel_1.add(lblNumero, gbc_lblNumero);
		
		JLabel lblCidade = new JLabel("Cidade");
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
		gbc_textField_6.gridwidth = 2;
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
		gbc_textField_7.gridwidth = 2;
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
		gbc_textField_8.gridwidth = 2;
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 9;
		gbc_textField_8.gridy = 6;
		panel_1.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);

	}
}
