package Teste;

import java.sql.Date;

import org.junit.Test;

import Conexao.dao.ChequeDAO;
import Conexao.dao.DepositoDAO;
import Entidades.Cheque;
import Entidades.Deposito;

public class DepositoChequeTeste {
	
	@Test
	public void salvarDepositoCheque() {
		
		Deposito dep = new Deposito();
		Cheque c = new Cheque();
		
		dep.setData("22/09/2019");
		dep.setValor(166.45);
		dep.setCheque(c);
		
		c.setBanco("Santander");
		c.setDeposito(dep);
		c.setNumero(12345);
		
		
		DepositoDAO D = new DepositoDAO();
		ChequeDAO C = new ChequeDAO();
		
		D.saveOrUpdate(dep);
		C.saveOrUpdate(c);
		
		
	}

}
