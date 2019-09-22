package Teste;

import org.junit.Test;

import Conexao.dao.EnderecoDAO;
import Conexao.dao.FuncionarioDAO;
import Entidades.Endereco;
import Entidades.Funcionario;

public class FuncionarioTeste {
	
	@Test
	public void salverFuncionario() {
				
		FuncionarioDAO fd = new FuncionarioDAO();
		EnderecoDAO ed = new EnderecoDAO();
		Funcionario f = new Funcionario();
		Endereco e = new Endereco();
		
		e.setCidade("Garanhuns");
		e.setRua("Rua do trabalho");
		e.setFuncionario(f);
		ed.saveOrUpdate(e);
		
		f.setNome("Carlos Jose");
		f.setEndereco(e);		
		fd.saveOrUpdate(f);
		
		
	}

}
