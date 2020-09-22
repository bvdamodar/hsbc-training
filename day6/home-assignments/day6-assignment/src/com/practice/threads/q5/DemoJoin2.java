package com.practice.threads.q5;
/**
 * 
 * @author bvdam
 *
 */
public class DemoJoin2 extends Thread {
	
	public void run()
	{//printing 6-10
		System.out.println("\nDemoJoin2");
		for(int i=6;i<=10;i++) 	{				
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("DJ2: "+i);
		}
	}
}
	