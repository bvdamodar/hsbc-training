package com.demo.threads;

public class Worker implements Runnable {

	private MsgPrinter p;
	private String msg;
	
	public Worker(MsgPrinter p, String msg) {
		this.msg = msg;
		this.p = p;
	
	}
	
	@Override
	public void run() {

		try {
				p.print(msg);
//		synchronized (p) {
//			p.print(msg);
//		}
		
		} catch (Exception e) {
				e.printStackTrace();
		}
		
	}
}
