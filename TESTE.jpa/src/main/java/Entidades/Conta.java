package Entidades;

import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	
	private int numero_da_conta;
	private double saldo;
	private int qtd_depositos;
	private int qtd_saques;
	
	

	public int getNumero_da_conta() {
		return numero_da_conta;
	}



	public void setNumero_da_conta(int numero_da_conta) {
		this.numero_da_conta = numero_da_conta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public int getQtd_depositos() {
		return qtd_depositos;
	}



	public void setQtd_depositos(int qtd_depositos) {
		this.qtd_depositos = qtd_depositos;
	}



	public int getQtd_saques() {
		return qtd_saques;
	}



	public void setQtd_saques(int qtd_saques) {
		this.qtd_saques = qtd_saques;
	}



	public Conta() {
		
	}

}
