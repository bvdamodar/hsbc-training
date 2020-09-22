package com.practice.threads.q2;
/**
 * 
 * @author bvdam
 *
 */
public class MyThread extends Thread {
	
	@Override
	public void run() {
				for (int i = 0; i < 10; i++)  // 10 times
					System.out.println(Thread.currentThread().getName()+" - Message no: "+(i+1));
		
	}
}
