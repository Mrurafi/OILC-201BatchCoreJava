package basicpro;

import java.util.Scanner;

public class student {

	
		int sno;
		String sname;
		int marks[]= new int[5];
		void accept(int snp,String sname,int marks[]) {
			this.sno =sno;
			this.sname =sname;
			this.marks =marks;
		}
		int totalMarks() {
			int summ =0;
			int sum;
			for(int i=0;i< marks.length;i++) {
				sum += marks[i];
			} 
			return sum;
		}
		void dispStudent()
		{
			System.out.println("sno ="+ sno);
			System.out.println("name="+ sname);
			System.out.println(findGrade ());
		}
		boolean isPass() {
			boolean b =false;
			int count =0;
			for(int i=0;i< marks.length;i++) {
				if (marks[i]>=35) {
					count++;
				}
				
			}
			if(count == marks.length) {
				b=true;
			}
			return b;
			}
				String findGrade() {
					String rees = " ";
					int avg;
					String res;
					if(isPass()) {
						res +=  "you passed \n";
						int tot = totalMarks ();
						res += "Total Marks =" + tot + "\n";
						int avg = tot /marks.length;
						res += "Averge Marks = " + avg + "\n";
					}
					else if (avg >=60) {
						res +=" you get first class \n";
					}
					else if (avg >=50) {
						res +="You got second class \n";
					}
					else {
						res +=" you got third class \n";
					}
				}
				else {
					String res = "Try Again";
				}
				return res;
                }

   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your no,same,5sub marks?");
	student obj = new student();
	int sno =sc.nextInt();
	String name = sc.next();
	int marks[] = new int [5];
	for(int i=0;i<marks.length;i++) {
		marks[i] =sc.nextInt();
	}
	obj.accept(sno, name, marks);
	obj.dispStudent();
	}
}

