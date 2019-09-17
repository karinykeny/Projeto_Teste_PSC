package Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import Interfaces.InterfaceGenericoDAO;

@Entity
public class Agencia implements InterfaceGenericoDAO, Serializable{
	private static final long serialVersionUID = 5999236902534007386L;
	
	@EmbeddedId
	private Departamentos id;
	@Column (name = "EndAg")
	private String endereco;
	@Column (name = "NomeAg")
	private String nome;
	

	public Departamentos getId() {
		return id;
	}

	public void setId(Departamentos id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Object getChavePrimaria() {

		return this.id;
	}

}
