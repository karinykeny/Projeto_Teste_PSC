package Entidades;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import Interfaces.InterfaceGenericoDAO;

@Entity
@Table(name = "Deposito")
public class Deposito implements InterfaceGenericoDAO {

	@Id
	@GeneratedValue
	@Column(name = "Deposito_Id")
	private int id;
	@Column(name = "Valor_Depositado")
	private double valor;
	@Column(name = "Data_Deposito")
	private String data;

	@OneToOne(mappedBy = "deposito", cascade = CascadeType.ALL)
	private Cheque cheque;

	public Deposito() {

	}

	public Deposito(double valor, String data) {
		this.valor = valor;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}

	@Override
	public String toString() {
		return "Deposito [id=" + id + ", valor=" + valor + ", data=" + data + ", cheque=" + cheque + "]";
	}

	public Object getChavePrimaria() {
		return this.id;
	}

}
