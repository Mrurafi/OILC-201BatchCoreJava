package DatastructureandAlgorithems;

public class BinearySearch {

	public static void main(String[] args) {
	int [] a = { 2,5,7,9,8,11,14,15,17,20,25,24};
	int srch =15;
	int li=0;
	int hi=a.length-1;
	int mi=(li+hi)/2;
	
	while (li <= hi)
	{
		if ( a [mi] == srch) 
		{
			System.out.println("Element is at"+"Index position");
			break;
		}
		else if ( a[mi]< srch) 
		{
			li=mi+1;
		}
		else {
			hi=mi-1;
		}
		mi=(li+hi)/2;
		
	}
	if(li>hi) {
		System.out.println("Element Not Found");
	}
	}

}
