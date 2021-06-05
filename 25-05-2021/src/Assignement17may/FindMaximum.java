package Assignement17may;

public class FindMaximum {

	public static void main(String[] args) {
		int [] a= {5,6,8,7,2,3,9};
		int max=a[0];
	for(int i=0;i< a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println("max array " + max );
	}

	

}
