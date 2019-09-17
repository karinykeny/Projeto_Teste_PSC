package Teste;

import org.junit.Test;

import Conexao.dao.AgenciaDAO;
import Entidades.Agencia;
import Entidades.Departamentos;

public class AgenciaTeste {
	
	@Test
	public void SalvarAgencia() {
		
		Departamentos d = new Departamentos();
		d.setCodigo(33);
		d.setNome("Financeiro");		
		
		Agencia a = new Agencia();
		a.setId(d);
		a.setEndereco("Endereço da agência");
		a.setNome("Minha agência");
		
		
		AgenciaDAO ag = new AgenciaDAO();
		ag.saveOrUpdate(a);
		
	}

}
