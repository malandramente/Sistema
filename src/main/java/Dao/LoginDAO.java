package Dao;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginDAO {

	private Connection connection;
	String usuario, senhaAcesso;
	
	public LoginDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public String Loga(String usuario, String senhaAcesso) throws SQLException {
	String user = usuario;
	String senha = senhaAcesso;
	String SQL = "SELECT user, senha FROM cadastroCliente WHERE usuario =";
	return SQL;
	}
}
