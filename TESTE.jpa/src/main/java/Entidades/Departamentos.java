package Entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Departamentos implements Serializable{
	private static final long serialVersionUID = -637018809489152388L;
	
	private int codigo;
	private String nome;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	 @Override
	  public String toString() {
	    return "("+ getCodigo() + ") " + getNome();
	  }

}
