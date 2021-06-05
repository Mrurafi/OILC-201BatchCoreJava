package DatastructureandAlgorithems;

public class linearsearchstring {

	public static void main(String[] args) 
	{
		
		String [] arr= {"king","queen","boy","girl","prince"};
		String iteam="prince";
		int temp=0;
		for(int i=0;i< arr.length;i++)
		{
			if(arr[i].equals(iteam))
			{
			System.out.println("iteam present in index position");
			
temp=temp+1;

			}

		}
		if(temp==0)
		{
			System.out.println("iteam is not present");
		}
	}

}
