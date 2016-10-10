package Dao;

public class SQL {
	
	String login;
	
	public String Login(){
		login = "SELECT usuario, senhaAcesso FROM cadastroCliente WHERE usuario =";
		return login;
	}
	
}
