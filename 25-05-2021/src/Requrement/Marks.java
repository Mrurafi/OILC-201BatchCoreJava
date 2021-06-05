package Requrement;

public class Marks extends Student {
	private int m1,m2,m3;
	public Marks (int sno,String sname,int m1,int m2, int m3) {
  super (sno,sname);
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	
}
public Marks(int nextInt, String next, int nextInt2, String next2) {
		// TODO Auto-generated constructor stub
	}
public void dispStudent () {
	System.out.println("No : +sno");
	System.out.println("Name : " +sname);
	System.out.println("sun marks :" + m1 + " " + m2 + " " + m3);
	System.out.println("total marks =" + totalMarks());
}
public int totalMarks() {
	

return m1 + m2 + m3;
}
}