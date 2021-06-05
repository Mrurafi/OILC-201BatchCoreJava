package string;

public class Reversestring {

	public static void main(String[] args) {
		String str="welcome to java";
		 input = input.toLowercase();
		String str[] = input.spilt(" ");
		String res ="";
		for(String x: str) {
			StringBuffer sb = new StringBuffer(x);
			String obj = sb.reverse().toString();
			res += obj.substring(0,1).toUpperCase() + obj.substring(1) +" ";
			
		}
		System.out.println(res);
	}

}
