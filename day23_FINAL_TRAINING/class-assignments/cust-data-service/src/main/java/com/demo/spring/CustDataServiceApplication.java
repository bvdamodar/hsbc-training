package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustDataServiceApplication.class, args);
	}

}
