package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import Interfaces.InterfaceGenericoDAO;

@Entity
public class Conta implements InterfaceGenericoDAO{
	
	@Id
	private int id;
	@Column (name = "numeroDaConta")
	private int numero_da_conta;
	@Column (name = "saldo")
	private double saldo;
	@Column (name = "QtdDepositos")
	private int qtd_depositos;
	@Column (name = "QtdSaques")
	private int qtd_saques;
	
	private Pessoa pessoa;

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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Object getChavePrimaria() {
		return this.id;
	}

}
