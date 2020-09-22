package com.practice.threads.q5;
/**
 * 
 * @author bvdam
 *
 */
public class DemoJoin1 extends Thread {
	
		public void run()
			{
			System.out.println("\nDemoJoin1");
				//printing 1-5 numbers
				for(int i=1;i<= 5;i++) 		
					System.out.println("DJ1: "+i);
			}
}
			
