package basicpro;

import java.util.Random;
import java.util.Scanner;

class Dice {
	
	int facevalue;
	public void roll() {
		Random r =new Random();
		facevalue = r.nextInt(6)+1;
	}}
class player {
	String pname;
	int pvalue;
	void accept(String pname) {
		this.pname =pname;
	}
	void throwDice (Dice d1, Dice d2 ) {
		d1.roll ();
		d2.roll();
		pvalue =d1.facevalue + d2.facevalue;
		System.out.println(pvalue+"="+d1.facevalue+"+"+d2.facevalue);
	}
}
public class DiceGame {
	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 =new Dice ();
		player p1 = new player();
		player p2 = new player();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first player name");
		p1.accept (sc.next());
		
		System.out.println("Enter second player name");
		p2.accept (sc.next());
		
		p1.throwDice(d1,d2);
		p2.throwDice(d1,d2);
		
		String res = " ";
	}
	
	}

