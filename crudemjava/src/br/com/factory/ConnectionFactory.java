package br.com.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	// Nome do usuário do MySql
	private static final String USERNAME = "root";

	// Senha do banco
	private static final String PASSWORD = "Umbra*1997";

	// Caminho do banco de dados, porta e o nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost/agenda?useTimezone=true&serverTimezone=UTC";

	/*
	 * Conexão com o banco de dados
	 */
	public static Connection creatConnectionToMySQL() throws SQLException, ClassNotFoundException {
		// Faz com que a classe seja carregada pela JVM
		//Class.forName("com.mysql.jdbc.Driver");

		// Cria a conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Recuperar uma coneão com o banco de dados
		Connection con = creatConnectionToMySQL();

		// Testar se há conexão
		if (con != null) {
			System.out.println("Conexao obtida com sucesso!");
			con.close();
		}
	}

}