package hibe.io.Learnhib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GetDetials {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		Employee employe =em.find(Employee.class,1 );
		System.out.println( "Employee Id :"+employe.getEid());
		System.out.println("Employee Name :"+employe.getEname());
		System.out.println("Employee Designation:"+employe.getEdes());
	    
		Employee employe1 =em.find(Employee.class,2 );
		System.out.println( "Employee Id :"+employe1.getEid());
		System.out.println("Employee Name :"+employe1.getEname());
		System.out.println("Employee Designation:"+employe1.getEdes());

	}

}
