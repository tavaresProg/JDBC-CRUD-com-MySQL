package br.com.agenda.testes;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class TestaGetContatos {

	public static void main(String[] args) {

		ContatoDAO contatoDAO = new ContatoDAO();

		for (Contato c : contatoDAO.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
	}
}
