package stackoperation;
import java.util.Scanner;

public class stackoperation {

	
		static int stack[]=new int[5];
		static int top = -1;
		static void menu() {
      String m = "stack operation \n";  
			 m += "1 push \n";
			 m += "2 pop \n";
			 m += "3 Display \n";
			 m += "4 quit \n";
			 m = "select any operation\n";
			 System.out.println(m);
		}
		static void push(int ele) {
			if( isfull()) {
				System.out.println("stack is overflow");
				
			}
			else {
				stack[++top] =ele;
				System.out.println("Element is added");
			}
		}
		static void pop() {
			if( isEmpty()) {
				System.out.println("stack is empty");
			}
			else {
				System.out.println("Deleted Elements is" + stack[top]);
				top--;
			}
			
		}
		static  boolean isEmpty() {
			boolean b= false;
			if(top== -1) {
				b= true;
			}
			return b;
		}
		static  boolean isfull() {
			boolean b= false;
			if(top == stack.length-1)
			{
				b= true;
			}
			return b;
		
			}
		static void display() {
			if(isEmpty()) {
				System.out.println("stack is empty");
			}
			else {
				System.out.println("stack elements as follows.....");
				for(int i=top;i>=0;i--) {
					System.out.println(stack[i]);
				}
			}
		}
		static void accept() {
			System.out.println("enter element to push");
		}
		
		
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			for(;;) {
				menu();
				int choice =sc.nextInt();
				switch(choice) 
				{
				case 1:
					accept();
				push(sc.nextInt());
					break;
				case 2:
					pop();
					break;
				case 3:
					display();
					
				}
			}
	}
	

}
