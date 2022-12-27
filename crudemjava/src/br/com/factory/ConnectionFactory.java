package br.com.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String DATABASE_URL = "jdbc:mysql://localhost/agenda?useTimezone=true&serverTimezone=UTC";

	/*
	 * Conexão com o banco de dados
	 */
	public static Connection creatConnectionToMySQL() throws SQLException, ClassNotFoundException {

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = creatConnectionToMySQL();

		if (con != null) {
			System.out.println("Conexao obtida com sucesso!");
			con.close();
		}
	}

}
