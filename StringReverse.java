package string;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Welcome tO java";
		String arr[]=str.split(" ");
		for(int i=0; i< arr.length; i++)
			
		{
			for( int j=arr[i].length()-1;j>=0;j--)
			{
			System.out.print(arr[i].charAt(j));
		}
			System.out.print(" ");
		}
				
	}

}
