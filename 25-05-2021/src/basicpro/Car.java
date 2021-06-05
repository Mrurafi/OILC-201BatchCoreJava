package basicpro;

public class Car {
	String cname;
	Car() {
		cname = "BMW";
		System.out.println("Default Constructor");
		Car();
	}
	void Car() {
		System.out.println("Welcome"+ cname);
	}
}
	public class Example {

	public static void main(String[] args) {
		Car obj = new Car ();
		obj.Car();
	}

}