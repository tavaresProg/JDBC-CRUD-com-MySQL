package br.com.agenda.testes;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class TestaUpdate {

	public static void main(String[] args) {

		ContatoDAO contatoDAO = new ContatoDAO();
		Contato contato = new Contato();

		contato.setNome("Arthur Leonel");
		contato.setIdade(25);
		contato.setDataCadastro(new Date());
		contato.setId(2); // Id já cadastrado no banco de dados.

		contatoDAO.update(contato);

	}
}
