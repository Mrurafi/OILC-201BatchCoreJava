package Veriables;

public class StaticDemo {
int nums;
static int firstNum;
{
	System.out.println("Non static Block");
	nums = 20;
	firstNum = 50;
}
	StaticDemo () { 
		System.out.println("Defult constructur");
	}

	public static void main(String[] args) {
System.out.println("Welcome");
StaticDemo obj = new StaticDemo ();
System.out.println(obj.nums + " "+ firstNum);
	}

}
