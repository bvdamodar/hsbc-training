package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SingerRunner implements CommandLineRunner {

	@Autowired
	Performer singer;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(singer.getClass().getName());
		singer.perform();
	}

}
