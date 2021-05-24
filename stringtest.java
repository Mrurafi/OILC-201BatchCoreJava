package string;

import java.util.Scanner;

public class stringtest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	String str =scan.nextLine();
	char [] ch =str.toCharArray();
	int flag =0;
	for (int i=0;i< ch.length/2; i++)
	{
		if( ch[i]!=ch[ch.length-1-i])
		{
			flag =1;
			break;
			
		}
	}
	if(flag == 0)
		System.out.println(str+" is plandrome");
	else
		System.out.println(str+"is not palindrome");
	

	}

}
