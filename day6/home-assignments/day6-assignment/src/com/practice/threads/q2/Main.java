package com.practice.threads.q2;
/**
 * 
 * @author bvdam
 *
 */
public class Main {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.run();
		t2.run();
		t3.run();

	}

}