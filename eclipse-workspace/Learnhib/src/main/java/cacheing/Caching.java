package cacheing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Caching {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et =  em.getTransaction();
    	Student student = em.find(Student.class, 101);
    	System.out.println(student);
    	

	}

}
