package hibe.io.Learnhib;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetEmployeeDetialsByName {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select emp from Employee emp where emp.eid=?1");
		query.setParameter(1, 103);
		List<Employee>emp = query.getResultList();
		for(Employee employe : emp) {
			System.out.println( "Employee Id :"+employe.getEid());
			System.out.println("Employee Name :"+employe.getEname());
			System.out.println("Employee Designation:"+employe.getEdes());
			System.out.println("*******************");
		}

	}

}
