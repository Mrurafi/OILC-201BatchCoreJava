package Details;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	System.out.println("Enter your no,name.hno" + "colname,cityname ?");
	int sno = sc.nextInt();
	String hno = sc.next();
	String sname = sc.next();
	String colNmae = sc.next();
	String city = sc.next();
	

	Address address = new Address(hno,colNmae,city);
	Student s = new Student(sno,sname,address);
	System.out.println(s);
	}

}
