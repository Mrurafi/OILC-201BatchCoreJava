package Assignement17may;

import java.util.Scanner;

public class ListPrimes {
	
	
/*
public static void main(String[] args) {
		
		for(int no=1;no<=100;no++)
		{
			int temp=0;
			
			for(int i=2;i<no-1;i++)     prime no pro 
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.print(no+",");
			}
		}

	}

}
*/
	static String getPrimeNumbers(int start, int end) {
		String res = "";
		boolean b;
		if(start < 0 || end < 0) {
			res += -1;
		}
		else if(start >= end) {
			res += -2;
		}
		else {
			for(int i = start;i <= end;i++) {
				b = true;
				
				for(int j = 2;j < i;j++) {
					
					if(i % j == 0) {
						b = false;
						break;
					}
					
				}
				
				if(b) {
					res += i + " ";
				}
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		System.out.println("Prime Numbers are:\n" + (getPrimeNumbers(sc.nextInt(),sc.nextInt())));
	}}

