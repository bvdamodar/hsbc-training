package com.demo.exceptions;

public class Apps {

	public static void main(String[] args) {
		App1 a1 = new App1();
		
		try {
//			 System.out.println(a1.calculate(1,0));
			a1.calculate(1,0);
		} catch (ArithmeticException e) {
			System.out.println("Apps: Divide 0 Error");
		}
		 System.out.println("Success!!");
	}
}


