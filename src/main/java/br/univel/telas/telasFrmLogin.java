package br.univel.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.Conecao;
import Dao.LoginDAO;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class telasFrmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JButton btnLogin;
	private JPasswordField txtPassword;
	private JLabel lblDigiteSuaSenha;
	private JLabel lblDigiteSeuNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmLogin frame = new telasFrmLogin();
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
	public telasFrmLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema2016\\icons\\Lock 2-52.png"));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 174);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblDigiteSeuNome = new JLabel("Digite Seu Nome");
		lblDigiteSeuNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteSeuNome.setForeground(new Color(0, 0, 255));
		GridBagConstraints gbc_lblDigiteSeuNome = new GridBagConstraints();
		gbc_lblDigiteSeuNome.insets = new Insets(0, 0, 5, 0);
		gbc_lblDigiteSeuNome.gridx = 0;
		gbc_lblDigiteSeuNome.gridy = 1;
		contentPane.add(lblDigiteSeuNome, gbc_lblDigiteSeuNome);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("");
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsername.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsername.gridx = 0;
		gbc_txtUsername.gridy = 2;
		contentPane.add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);
		
		lblDigiteSuaSenha = new JLabel("Digite Sua Senha");
		lblDigiteSuaSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteSuaSenha.setForeground(Color.BLUE);
		GridBagConstraints gbc_lblDigiteSuaSenha = new GridBagConstraints();
		gbc_lblDigiteSuaSenha.insets = new Insets(0, 0, 5, 0);
		gbc_lblDigiteSuaSenha.gridx = 0;
		gbc_lblDigiteSuaSenha.gridy = 3;
		contentPane.add(lblDigiteSuaSenha, gbc_lblDigiteSuaSenha);
		
		txtPassword = new JPasswordField();
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.insets = new Insets(0, 0, 5, 0);
		gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPassword.gridx = 0;
		gbc_txtPassword.gridy = 4;
		contentPane.add(txtPassword, gbc_txtPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			login();
			
			}
		});
		
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 0);
		gbc_btnLogin.gridx = 0;
		gbc_btnLogin.gridy = 5;
		contentPane.add(btnLogin, gbc_btnLogin);
	}

	private void login() {
		telasFrmPrincipalCliente formPC = new telasFrmPrincipalCliente();
		telasFrmLogin formL = new telasFrmLogin();
		Connection conn = Conecao.abrirConecao();
		String usuario = txtUsername.getText();
		String senhaAcesso = txtPassword.getText();
		LoginDAO query = new LoginDAO();
	try {
			Statement stm = conn.createStatement();
			String SQL =  query.Loga(usuario, senhaAcesso)+txtUsername.getText()+"';";
			ResultSet rs = stm.executeQuery(SQL);
			
			while (rs.next()) {
				String login = rs.getString("usuario");
				String senha = rs.getString("senhaAcesso");
				if(txtUsername.getText().equals(login) && txtPassword.getText().equals(senha)) {
					JOptionPane.showMessageDialog(null, "Seja bem vindo: "+login);
					formPC.show(true);
					dispose();
				}else{
                    JOptionPane.showMessageDialog(null,"Login ou Senha inválidos.");
                    txtPassword.setText("");
                }
			}
	} catch (SQLException e1) {
		JOptionPane.showMessageDialog(rootPane, "Erro na insercao");
		e1.printStackTrace();
	}
	}
}
