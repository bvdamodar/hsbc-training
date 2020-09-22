package com.practice.threads.q3;
/**
 * 
 * @author bvdam
 *
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) { // 20 times
				System.out.println(i);
		}

	}

}