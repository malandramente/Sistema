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

public class telasFrmSenhaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmSenhaCliente frame = new telasFrmSenhaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Control c = new Control();
	/**
	 * Create the frame.
	 */
	public telasFrmSenhaCliente() {
		setTitle("Banco TADS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Gg-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 330, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(c.iconMain());
		lblNewLabel_1.setBounds(10, 4, 49, 52);
		panel.add(lblNewLabel_1);
		
		JLabel lblTitle = new JLabel(c.getTitleTADS());
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(79, 4, 113, 17);
		panel.add(lblTitle);
		
		JLabel lblSubTitle = new JLabel(c.getSubTitle());
		lblSubTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSubTitle.setBounds(78, 29, 180, 20);
		panel.add(lblSubTitle);
		
		JLabel lblNewLabel = new JLabel("Digite sua senha utilizando o teclado virtual");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 71, 246, 15);
		contentPane.add(lblNewLabel);
		
		txtValue = new JTextField();
		txtValue.setBounds(10, 88, 223, 23);
		contentPane.add(txtValue);
		txtValue.setColumns(10);
		
		JButton btnConfirme = new JButton("Confirme");
		btnConfirme.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConfirme.setBounds(10, 120, 122, 23);
		contentPane.add(btnConfirme);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(266, 73, 227, 91);
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton button = new JButton("0");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel_1.add(button, gbc_button);
		
		JButton btnNewButton_3 = new JButton("1");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 0;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("2");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 0;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("3");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 0;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton button_1 = new JButton("5");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 1;
		panel_1.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("6");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 1;
		panel_1.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("7");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 1;
		panel_1.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("8");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 3;
		gbc_button_4.gridy = 1;
		panel_1.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("9");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 0);
		gbc_button_5.gridx = 4;
		gbc_button_5.gridy = 1;
		panel_1.add(button_5, gbc_button_5);
	}
}
