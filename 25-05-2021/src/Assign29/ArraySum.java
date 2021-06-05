package Assign29;

public class ArraySum {

    static int arr[] = {12,3,4,15};
      
    // method for sum of elements in an array 
    static int getSum()
    {
        int sum = 0; // initialize sum
        int i;
       
        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
           sum +=  arr[i];
       
        return sum;
    }
      
    // Driver method
    public static void main(String[] args) 
    {
        System.out.println("Sum of given array is " + getSum());
       }

}


import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		 try {
	            int n;
	            Scanner s=new Scanner(System.in);
	            System.out.println("Enter a number:");
	            n=s.nextInt();
	            if(n>0)
	            {
	                System.out.println(getSequence(n));
	            }
	            else {
	                System.out.println(10/0);
	            }
	        }
	        catch(Exception e) {
	            System.out.println("Error");
	        }
	    }
	
	public static String getSequence(int n) {
		String str="";
        str=str+""+n;
        int count=0;
        while(n>1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else 
            {
                n=(3*n)+1;
            }
            count++;
            str=str+" "+ n;
        }
        if(count<100) {  // example ==>only 27 will get 100 + times
        return str;
    }
        else {
            return "Doesnot Conerge";
        }
        }

 
	}
