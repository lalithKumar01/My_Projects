package hibe.io.Learnhib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployeeDetials {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee employee = em.find(Employee.class, 2);
		et.begin();
		em.remove(employee);
		et.commit();

	}

}
