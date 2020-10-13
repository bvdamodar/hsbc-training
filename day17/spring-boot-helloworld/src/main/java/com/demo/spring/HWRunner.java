package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HWRunner implements CommandLineRunner{

	@Autowired
	private HelloWorldMessage msg;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(msg.getMessage());
		
	}

}
