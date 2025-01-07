package hibe.io.Learnhib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Laptop")
public class Laptop {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int lid;
		private String lname;
		@ManyToMany
		List<Employee> employee = new ArrayList<Employee>();
		
		public List<Employee> getEmployee() {
			return employee;
		}
		public void setEmployee(List<Employee> employee) {
			this.employee = employee;
		}
		
		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		@Override
		public String toString() {
			return "Laptop [lid=" + lid + ", lname=" + lname + "]";
		}
		
}	
		
