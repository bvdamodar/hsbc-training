package com.practice.threads.q8;
/**
 * 
 * @author bvdam
 *
 */
public class MyThread extends Thread {

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
				System.out.println(i+ " has waited for 2 seconds.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}