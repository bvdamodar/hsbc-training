package com.demo.threads;

public class MsgPrinter extends Thread {

	public /* synchronized */  void print(String msg) {
		System.out.print("["+msg);
		try {
				Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("]");
//			System.out.println(Thread.currentThread().getName()+" "+msg);
	}
}
