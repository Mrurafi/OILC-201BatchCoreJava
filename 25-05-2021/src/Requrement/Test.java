package Requrement;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no,name,3 sub marks?");
		Marks obj = new Marks (sc.nextInt(),sc.next(),sc.nextInt(),sc.next())
				obj.dispStudent();

	}

}
