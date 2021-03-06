package com.hsbc.tr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.tr.spring.service.EmpService;

public class SpringMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService serv = (EmpService) ctx.getBean("empService");
		
		System.out.println(serv.registerEmp(105, "James", "Bangalore", 52000));
		
	}
}
