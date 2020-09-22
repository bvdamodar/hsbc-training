package com.practice.threads.q5;
/**
 * 
 * @author bvdam
 *
 */
public class DemoJoin3 extends Thread {

	public void run()
	{//printing 11-15
		System.out.println("\nDemoJoin3");
		for(int i=11;i<=15;i++) 		{		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			System.out.println("DJ3: "+i);
		}
	}
}