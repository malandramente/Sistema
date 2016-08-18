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

public class telasFrmBalance extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmBalance frame = new telasFrmBalance();
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
	public telasFrmBalance() {
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
		
		JLabel lblAG = new JLabel("AG: 0000-00");
		lblAG.setBounds(295, 16, 113, 14);
		panel.add(lblAG);
	}
}
