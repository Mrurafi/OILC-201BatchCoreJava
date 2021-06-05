package basicpro;

import java.util.Scanner;

public class Demo2 {


	    int sno;
	      String sname;
	      public Demo2(int nextInt, String next) {
			// TODO Auto-generated constructor stub
		}
		void Studentdata (int sno,String sname) {
	    	  this.sno =sno;
	    	  this.sname= sname;
	    	  System.out.println("Two parameterised cons");
	      }
	      void dispStudentdata () {
	    	  System.out.println(" no :" + sno);
	    	  System.out.println("Name : "+ sname);
	      }
		public static void main(String[] args) {
			Demo2 studs [] = new Demo2[5];
			Scanner sc = new Scanner(System.in);
			for(int i=0;i< studs.length;i++)
			{
				System.out.println("Enter" +(i+1) + " studentn no,name ?");studs[i]= new Demo2(sc.nextInt(),sc.next());
			}
			System.out.println("student info as follows");
			for(int i=0;i< studs.length;i++) {
				studs[i].dispStudentdata();
			}
		}

}
