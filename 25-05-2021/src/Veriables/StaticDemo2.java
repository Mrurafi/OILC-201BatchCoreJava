package Veriables;

import java.sql.Date;

public class StaticDemo2 {

	public static void main(String[] args) {
	 Date d = new Date (0);
	 System.out.println(d);
	  long time = System.currentTimeMillis();
	  java.sql.Date d1 = new java.sql.Date(time);
	  System.out.println(d1);

	}

}
