package chocky;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Emp implements Serializable {
private String empno;
private Name name;
public Emp() {
	this ("111","keerthi","Mahesh");}
public Emp(String e,String f,String l) {
	empno=e;
	name = new Name(f,l);
	}
public void setEmpno(String empno) {
	this.empno=empno;
	
}
public void setName(Name n) {
	this.name=n;
}
public String getEmpno() {
	return empno;
}
public Name getName() {
	return name;
}



}
