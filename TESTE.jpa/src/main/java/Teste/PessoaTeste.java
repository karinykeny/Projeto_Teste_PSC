package Teste;

import org.junit.Test;

import Conexao.dao.ContaDAO;
import Conexao.dao.GenericoDAO;
import Conexao.dao.PessoaDAO;
import Entidades.Conta;
import Entidades.Pessoa;
import Interfaces.InterfaceGenericoDAO;

public class PessoaTeste {

	
	@Test
	public void salvarPessoa() {
		
		Pessoa p = new Pessoa();
		PessoaDAO DAO = new PessoaDAO();

		p.setNome("Emma Bunton");
		p.setCpf("00011122255");
		p.setEnd("casa casa");
		p.setConta1(999999999);
		p.setconta2(12000.00);
		p.setconta3(100);
		p.setconta4(100);

		DAO.saveOrUpdate(p); 
		
		System.out.println(p.getId());

	}

	/*
	 * public void deletarPessoa() {
	 * 
	 * DAO.remove(p, 1);
	 * 
	 * }
	 */

}
