package Teste;

import org.junit.Test;

import Conexao.dao.GenericoDAO;
import Conexao.dao.PessoaDAO;
import Entidades.Pessoa;

public class PessoaTeste {
	
	Pessoa p = new Pessoa();
	GenericoDAO DAO = new PessoaDAO();
	
	@Test
	public void salvarPessoa() {
		
		p.setNome("Bruna Lucia");
		p.setCpf("00011122233");
		p.setEnd("Minha casa");
		
		DAO.saveOrUpdate(p);
		
		System.out.println(p.getId());
		
		p.setNome("Lucas Jose");
		p.setCpf("33311122200");
		p.setEnd("Tua casa");
		
		DAO.saveOrUpdate(p);
	}
	
	/*public void deletarPessoa() {
		
		DAO.remove(p, 1);
		
	}*/

}
