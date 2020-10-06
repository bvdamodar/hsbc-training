package com.hsbc.tr.spring;

public class NoSpringMain {

	public static void main(String[] args) {
		
		Message msg = new Message();
		msg.setHeader("Lunch Break");
		msg.setBody("No Launch Today...");
		
		Mail mail = new Mail();
		mail.setFromAddress("sender@gmail.com");
		mail.setToAddress("receiver@gmail.com");
		mail.setMessage(msg); // mail and message are connected
		
		//dependency injection
		System.out.println(mail.getMessage().getBody());		
		
	}

}
