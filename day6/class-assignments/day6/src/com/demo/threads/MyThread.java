package com.demo.threads;

public class MyThread extends Thread {

	@Override
	public void run() {

		try {
				for (int i = 0; i < 10; i++) {
//					System.out.println("IterationNo: "+i);
					System.out.println(Thread.currentThread().getName()+" : "+i);
					Thread.sleep(2000); // 2000 milli secs = 2 seconds
				}		
			
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
	}
}
