package basicpro;

public class Studentdata {
      int sno;
      String sname;
      Studentdata (int sno,String sname) {
    	  this.sno =sno;
    	  this.sname= sname;
    	  System.out.println("Two parameterised cons");
      }
      void dispStudentdata () {
    	  System.out.println(" no :" + sno);
    	  System.out.println("Name : "+ sname);
      }
	public static void main(String[] args) {
 Studentdata s = new Studentdata (10,"rafi");
 s.dispStudentdata();
 Studentdata s1 = new Studentdata (20,"king");
 s1.dispStudentdata();


	}

}
