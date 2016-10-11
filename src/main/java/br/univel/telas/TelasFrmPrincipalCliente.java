package br.univel.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.univel.classes.Control;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class TelasFrmPrincipalCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelasFrmPrincipalCliente frame = new TelasFrmPrincipalCliente();
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
	public TelasFrmPrincipalCliente() {
		setTitle("Banco TADS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Gg-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 60);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{49, 180, 30, 113, 0};
		gbl_panel.rowHeights = new int[]{14, 14, 21, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(c.iconMain());
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridheight = 3;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblTitle = new JLabel(c.getTitleTADS());
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridheight = 2;
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 0;
		panel.add(lblTitle, gbc_lblTitle);
		
		JLabel lblDate = new JLabel();
		lblDate.setText(c.getDate()+" - "+c.getHour());
		GridBagConstraints gbc_lblDate = new GridBagConstraints();
		gbc_lblDate.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDate.insets = new Insets(0, 0, 5, 0);
		gbc_lblDate.gridx = 3;
		gbc_lblDate.gridy = 0;
		panel.add(lblDate, gbc_lblDate);
		
		JLabel lblAG = new JLabel("AG: 0000-00");
		GridBagConstraints gbc_lblAG = new GridBagConstraints();
		gbc_lblAG.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblAG.insets = new Insets(0, 0, 5, 0);
		gbc_lblAG.gridx = 3;
		gbc_lblAG.gridy = 1;
		panel.add(lblAG, gbc_lblAG);
		
		JLabel lblSubTitle = new JLabel(c.getSubTitle());
		lblSubTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblSubTitle = new GridBagConstraints();
		gbc_lblSubTitle.fill = GridBagConstraints.BOTH;
		gbc_lblSubTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblSubTitle.gridx = 1;
		gbc_lblSubTitle.gridy = 2;
		panel.add(lblSubTitle, gbc_lblSubTitle);
		
		JLabel lblTipConta = new JLabel("$TipoConta : 00000-00");
		GridBagConstraints gbc_lblTipConta = new GridBagConstraints();
		gbc_lblTipConta.insets = new Insets(0, 0, 5, 0);
		gbc_lblTipConta.anchor = GridBagConstraints.WEST;
		gbc_lblTipConta.gridx = 3;
		gbc_lblTipConta.gridy = 2;
		panel.add(lblTipConta, gbc_lblTipConta);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		panel.add(scrollPane, gbc_scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Saques");
		btnNewButton.setBounds(20, 16, 161, 47);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tranfer\u00EAncias");
		btnNewButton_1.setBounds(246, 16, 161, 47);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Saldo");
		btnNewButton_4.setBounds(20, 79, 161, 47);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("Pagamentos");
		btnNewButton_2.setBounds(245, 79, 161, 47);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("Dep\u00F3sitos");
		btnNewButton_5.setBounds(21, 146, 161, 47);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("Finalizar");
		btnNewButton_3.setBounds(246, 146, 161, 47);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(btnNewButton_3);
	}
}
