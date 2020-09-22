package com.demo.threads;

public class ThreadMain1 {

	public static void main(String[] args)  throws InterruptedException{
		
		System.out.println("Main Thread Starts..");
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		System.out.println(t1);
		System.out.println(Thread.currentThread());
		
		t2.join();
		t1.join(); // waits for thread to die
		System.out.println("Main Thread Ends..");

	}

}
