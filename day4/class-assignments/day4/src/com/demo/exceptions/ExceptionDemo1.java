package com.demo.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		

		System.out.println("Start of Program\n");
		
		try {
			int a=10,b=0;
			double d=a/b;
			System.out.println("No Exception in try block.");
//		    System.in.read();
	
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("\nEnd of Program");

	}

}
