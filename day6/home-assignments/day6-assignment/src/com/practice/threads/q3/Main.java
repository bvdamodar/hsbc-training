package com.practice.threads.q3;
/**
 * 
 * @author bvdam
 *
 */
public class Main {

	public static void start(MyRunnable obj) {
		obj.run();
	}
	
	public static void main(String[] args) {
		
			MyRunnable r = new MyRunnable();
			start(r);
//			r.run();
	}

}