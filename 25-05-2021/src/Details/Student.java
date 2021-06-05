package Details;

public class Student {
	private int sno;
	private String sname;
	private Address address;
	
	public Student(int sno,String sname,Address address) {
		this.sno=sno;
		this.sname=sname;
		this.address=address;

}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", address=" + address + "]";
	}
}

