package com.hsbc.tr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml"); // this is like a container in JVM
		Mail mail = (Mail) ctx.getBean("myMail");
		System.out.println(mail.getMessage().getBody());
		
		Mail mail1 = (Mail) ctx.getBean("myMail");
		System.out.println(mail== mail1); // false if scope="prototype" is there for myMail in context.xml
		
	}
}