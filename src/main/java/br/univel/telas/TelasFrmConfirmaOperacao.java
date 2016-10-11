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

public class TelasFrmConfirmaOperacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelasFrmConfirmaOperacao frame = new TelasFrmConfirmaOperacao();
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
	public TelasFrmConfirmaOperacao() {
		setTitle("Banco TADS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Gg-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 462, 60);
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
		
		JLabel lblNewLabel = new JLabel("Realizado com sucesso!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(96, 71, 246, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnConfirme = new JButton("Retornar");
		btnConfirme.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConfirme.setBounds(10, 120, 122, 23);
		contentPane.add(btnConfirme);
		
		JLabel lblOperao = new JLabel("Opera\u00E7\u00E3o");
		lblOperao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOperao.setBounds(29, 71, 60, 14);
		contentPane.add(lblOperao);
		
		JLabel lblValorR = new JLabel("Valor: R$");
		lblValorR.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorR.setBounds(29, 96, 68, 14);
		contentPane.add(lblValorR);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValor.setBounds(106, 97, 60, 14);
		contentPane.add(lblValor);
	}
}
