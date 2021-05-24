package string;

public class Intern {

	public static void main(String[] args) {
	String str = new String(" hello");
	/* it return a canonical  represention for the referes to the object*/
	String s= str.intern();
	System.out.println(s == str);
	System.out.println(s.equals( str));
	String x = "Hello";
	System.out.println(x == s);

	}

}
