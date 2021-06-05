package Requrement;

public class Student {
public int sno;
public String sname;
public Student () {
	System.out.println(" defult constructor");
}
public Student(int sno,String sname) {
	this ();
	this.sno =sno;
	this.sname =sname;
}
public void dispStudent () {
	System.out.println("No : "+sno);
	System.out.println("name : " +sname);
}
}
