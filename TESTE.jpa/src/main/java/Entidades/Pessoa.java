package Entidades;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import Interfaces.InterfaceGenericoDAO;


@Entity
public class Pessoa implements InterfaceGenericoDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (name = "nome", length = 50)
	private String nome;
	@Column (name = "CPF", length = 11, unique = true)
	private String cpf;
	@Column (name = "End", length = 100)
	private String end;
	@Embedded
	private Conta conta; 
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(Object object) {
		this.cpf = (String) object;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}


	public Conta getConta() {
		return conta;
	}

	public void setConta(Object object) {
		this.conta = (Conta) object;
	}

	public Object getChavePrimaria() {
		return this.id;
	}
	

}
