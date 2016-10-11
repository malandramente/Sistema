package Dao;

import java.sql.Connection;// conex�o SQL para Java 
import java.sql.DriverManager; // driver de conex�o SQL para Java 
import java.sql.SQLException; // classe para tratamento de exce��es 

public class ConnectionFactory {     
	public Connection getConnection() {         
		try {             
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/BANCO","root","4221");         
			}         
		catch(SQLException excecao) {            
			throw new RuntimeException(excecao);         
			}     
		} 
}


/*

https://www.oficinadanet.com.br/artigo/java/criando-um-cadastro-de-usuario-em-java

*/