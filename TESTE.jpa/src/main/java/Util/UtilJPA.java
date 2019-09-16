package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJPA {
	
	private static EntityManagerFactory emf;
	
	public static void createEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("projeto_teste");
		}
	}
	
	public static EntityManager getEntityManager() {
		if (emf == null) {
			createEntityManagerFactory();
		}
		return emf.createEntityManager();
	}

	public static void closeEntityManagerFactory() {
		emf.close();
	} 

}
