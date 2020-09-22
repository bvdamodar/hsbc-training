package com.demo.threads;

public class ThreadMain2_Worker {

	public static void main(String[] args)  throws Exception{
		
		MsgPrinter p = new MsgPrinter();
		
		System.out.println("Main Thread Starts..\n");
		
		Thread t1 = new Thread(new Worker(p,"Hello"));
		
		Thread t2 = new Thread(new Worker(p,"Dear"));
		
		Thread t3 = new Thread(new Worker(p,"Friend"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t3.join();
		t2.join();
		t1.join();
		
//		StringBuffer;
		System.out.println("\nMain Thread Ends..");

	}

}
