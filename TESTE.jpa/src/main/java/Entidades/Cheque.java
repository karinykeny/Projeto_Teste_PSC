package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import Interfaces.InterfaceGenericoDAO;

@Entity
@Table(name = "Cheque")
public class Cheque implements InterfaceGenericoDAO{
	
	@Id
    @Column(name="Cheque_Id")
    @GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign",parameters=@Parameter(name="property", value="deposito"))
    private int id;
	@Column (name = "Banco")
	private String banco;
	@Column (name = "Num_Cheque")
	private int numero;
	
	@OneToOne
    @PrimaryKeyJoinColumn
    private Deposito deposito;
	
	public Cheque() {
		
	}
	
	public Cheque(String banco, int numero) {
		this.banco = banco;
		this.numero = numero;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Deposito getDeposito() {
		return deposito;
	}

	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}

	@Override
    public String toString() {
        return "Cheque [id=" + id + ", banco=" + banco + ", numero=" + numero + "]";
    }
	public Object getChavePrimaria() {
		return this.id;
	}

}
