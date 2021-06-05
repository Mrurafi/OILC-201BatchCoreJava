package OopsConcepts;

public class Employee {
 private int empNo;
 private String ename;
 private double salary;
 public void setempNo(int empNo) {
	 this.empNo=empNo;
	 
 }
	
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public void setEname(String ename) {
	this.ename = ename;
}
	
	public int getEmpNo() {
	return empNo;
}

public String getEname() {
	return ename;
}

	
public static void main(String[] args) {

	Employee emp = new Employee ();
	emp.setEmpNo(254);
	emp.setEname("rafi");
	emp.setSalary(10000);
	
	System.out.println("EMP details");
	System.out.println("emp id = " + emp.getEmpNo());
	System.out.println("emp NAME= " + emp.getEname());
	System.out.println("emp SALARY = " + emp.getSalary());
	
	
	
}
}

