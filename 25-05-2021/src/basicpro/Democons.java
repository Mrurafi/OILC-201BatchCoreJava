package basicpro;

public class Democons {

	Democons(){
		System.out.println("defoult constructor");
	}
	Democons(int num){
		this();
		System.out.println("one parameter construtor");
	}
	Democons(int num1,int num2){
		this(num1);
		System.out.println("two parameter construre");
	}
	Democons(int num1,int num2,int num3){
		this(num1,num2);
		System.out.println("three parametrise cons");
	}
	

	public static void main(String[] args) {
 Democons obj = new Democons (10,20,30);		

	}

}
