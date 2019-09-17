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
		Conta c = new Conta();
		PessoaDAO DAO = new PessoaDAO();

		p.setNome("Emma Bunton");
		p.setCpf("00011122255");
		p.setEnd("casa casa");
		c.setNumero_da_conta(999999999);
		c.setQtd_depositos(100);
		c.setQtd_saques(3);
		c.setSaldo(1200.00);
		p.setConta(c);

		DAO.saveOrUpdate(p); 
		
		System.out.println(p.getId());

	}


}
