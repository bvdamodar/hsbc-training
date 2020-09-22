package com.practice.threads.q1;
/**
 * 
 * @author bvdam
 *
 */
public class MyThread extends Thread {
	
	@Override
	public void run() {

		try {
				for (int i = 0; i < 10; i++) { // 10 times
					System.out.println(Thread.currentThread().getName()+" - Message no: "+(i+1));
					Thread.sleep(1000);	// 1second
				}		
			
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
	}
}
