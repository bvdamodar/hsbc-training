package com.demo.exceptions;

public class NestedTryCatchDemo {

	public static void main(String[] args) {

		try {
			
			int a=10,b=0;
//			double d = a/b;
			try {
				double d=a/b;
			} catch (NullPointerException e) {
				System.out.println("Inner Catch - Null" +e);
			}
			
		}catch (ArithmeticException e) {
				System.out.println("Outer Catch - Arit. "+e);
			
		} finally {
			System.out.println("Finally...");
			
		}System.out.println("App resmumes normal execution.");
	

	}
}
