package DatastructureandAlgorithems;

public class bubblesort {
	public static void main(String[] args) {
		int []a= {36,25,45,19,2,5,1,99,100,0};
		{
			int temp;
			
			for (int i=0; i<a.length;i++) {
				for(int j=0;j<a.length-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp =a[j];
						a[j]=a[j+1];
						a[j+1]= temp;
					}
				}
			}
			for (int i=0; i<a.length;i++)
			{
				 System.out.print(a[i]+" ");
			}
		}
	}

}
