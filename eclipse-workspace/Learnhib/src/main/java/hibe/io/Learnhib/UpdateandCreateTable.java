package hibe.io.Learnhib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

public class UpdateandCreateTable {
    public static void main(String[] args) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et =  em.getTransaction();
    	
    	Laptop laptop = new Laptop();
    	//laptop
    	laptop.setLid(108);
    	laptop.setLname("accer");
    	//employee
    	Employee basic = new Employee();
    	basic.setEdes("Planner");
    	basic.setEid(109);
    	basic.setEname("Arun");
    	basic.getLaptop().add(laptop);
    	
    	laptop.getEmployee().add(basic);
    	et.begin();
        em.persist(basic);
        em.persist(laptop);
        et.commit();
    			
    
    }
}