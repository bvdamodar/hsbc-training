package com.demo.exceptions;

public class App2 {
	
	int a,b;
	
	public App2() {
		this.a=a;
		this.b=b;
	}
		public static void divide(int a ,int b) {
			
			try {
				int d= a/b;
				System.out.println(d);
			}catch(Exception e) {
				System.out.println("App2: Divide 0 Error");
				throw(e);
//				return 0;
			}
		}
}
