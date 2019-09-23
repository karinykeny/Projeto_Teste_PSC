package Teste;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import Conexao.dao.BancoDAO;
import Conexao.dao.EstadoDAO;
import Entidades.Banco;
import Entidades.Estado;

public class EstadoBancoTeste {
	
	@Test
	public void salvarEstadoBanco() {
		
		Estado e = new Estado();
		Banco b1 = new Banco();
		Banco b2 = new Banco();

		
		e.setSigla("PE");
		
		EstadoDAO E = new EstadoDAO();
		BancoDAO B = new BancoDAO();
		
		b1.setNome("Olinda");
		b1.setEstado(e);
		b2.setNome("Camaragibe");
		b2.setEstado(e);

		Set<Banco> banco1 = new HashSet<Banco>();
		banco1.add(b1);
		banco1.add(b2);

		e.setListaBancos(banco1);
		
		E.saveOrUpdate(e);

		
	}

}
