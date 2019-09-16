package Entidades;

import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	
	private int numero_da_conta;
	private double saldo;
	private int qtd_depositos;
	private int qtd_saques;

	public Conta() {
		
	}

}
