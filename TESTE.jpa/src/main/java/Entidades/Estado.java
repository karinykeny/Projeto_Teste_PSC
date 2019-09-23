package Entidades;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import Interfaces.InterfaceGenericoDAO;

@Entity
@Table(name = "Estados")
public class Estado implements InterfaceGenericoDAO{
	
	@Id
	@Column(name = "IdEstado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "SIGLA")
	private String sigla;

	@OneToMany(mappedBy="estado", cascade= CascadeType.ALL)  
	private Set<Banco> listaBancos;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setListaBancos(Set<Banco> listaBancos) {
		this.listaBancos = listaBancos;
	}

	public Set<Banco> getListaBancos() {
		return listaBancos;
	}

	public Object getChavePrimaria() {
		return this.id;
	}

}
