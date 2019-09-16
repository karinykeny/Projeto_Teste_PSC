package Conexao.dao;

import javax.persistence.EntityManager;
import Interfaces.InterfaceGenericoDAO;
import Util.UtilJPA;
import org.hibernate.Session;

import Entidades.Conta;
import Entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericoDAO <T extends InterfaceGenericoDAO>{
	
	private static EntityManager Em = UtilJPA.getEntityManager();
	

	public T findById(Class<T> classe, int id) {
		return Em.find(classe, id);
	}

	public void saveOrUpdate(Pessoa p) {
		try {
			Em.getTransaction().begin();
			if (p.getChavePrimaria() == null) {
				Em.persist(p);
			} else {
				Em.merge(p);
			}
			Em.getTransaction().commit();
		} catch (Exception e) {
			Em.getTransaction().rollback();
		}
	}
	
}
