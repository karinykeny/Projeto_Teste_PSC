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

	public void saveOrUpdate(T obj) {
		try {
			Em.getTransaction().begin();
			if (obj.getChavePrimaria() == null) {
				Em.persist(obj);
			} else {
				Em.merge(obj);
			}
			Em.getTransaction().commit();
		} catch (Exception e) {
			Em.getTransaction().rollback();
		}
	}
	
}
