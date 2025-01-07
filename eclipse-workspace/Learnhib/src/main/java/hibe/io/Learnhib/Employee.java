package hibe.io.Learnhib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private String edes;
	@ManyToMany(mappedBy = "employee")
	List<Laptop> laptop = new ArrayList<Laptop>();
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdes() {
		return edes;
	}
	public void setEdes(String edes) {
		this.edes = edes;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edes=" + edes + ", laptop=" + laptop + "]";
	}
	
	

}
