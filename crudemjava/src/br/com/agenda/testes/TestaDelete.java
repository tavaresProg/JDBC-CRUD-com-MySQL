package br.com.agenda.testes;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class TestaDelete {

	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		Contato contato = new Contato();
		contato.setId(2);
		
		contatoDAO.delete(contato);
	
		
	}
}
