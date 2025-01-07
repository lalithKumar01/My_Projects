package cacheing;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
 @Id
 private int rollno;
 private String sname;
 private int deptno;
 private int std;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public int getStd() {
	return std;
}
public void setStd(int std) {
	this.std = std;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", sname=" + sname + ", deptno=" + deptno + ", std=" + std + "]";
}
 
}
