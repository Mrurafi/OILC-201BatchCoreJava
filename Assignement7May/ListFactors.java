package Assignement7May;

import java.util.Scanner;

public class ListFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		for(int i = 1;i < num;i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
