package com.practice.threads.q5;
/**
 * 
 * @author bvdam
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Thread t1 = new DemoJoin1(); // 1-5
		Thread t2 = new DemoJoin2();  // 6-10
		Thread t3 = new DemoJoin3(); // 11-15
	
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		try {
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		try {
			t3.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("Completed..");
		
	}
}