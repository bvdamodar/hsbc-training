package com.demo.exceptions;

public class App1 {
	public void calculate(int a ,int b) {
		
		App2 p =new App2();
		
		try {
			p.divide(a, b);
		} catch (Exception e) {
			System.out.println("App1: Divide 0 Error");
			throw(e);
		}
//		 App2.divide(a,b);
	}	
}
