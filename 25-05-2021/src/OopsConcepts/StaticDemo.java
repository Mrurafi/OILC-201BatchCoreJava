package OopsConcepts;

public class StaticDemo {

	
	static int num;
	int num1;

	public static void main(String[] args) {
	System.out.println(num);  //without object
	System.out.println(StaticDemo.num); //without class
	StaticDemo obj = new StaticDemo();
	System.out.println(obj.num);
	System.out.println(obj.num1); //with an object
	}

}
