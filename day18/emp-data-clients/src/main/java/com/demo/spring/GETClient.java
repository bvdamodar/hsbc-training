package com.demo.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hsbc.tr.spring.entity.Emp;
public class GETClient {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		
		// Emp Entity in port 8183 should be running in back-end to get output
		String url = "http://localhost:8183/emp/find/";

		ResponseEntity<String> resp = rt.getForEntity(url + 104, String.class);

		// To get the Employee's details
		System.out.println(resp.getBody());

		//Getting here Emp Entity 
		ResponseEntity<Emp> resp1 = rt.getForEntity(url + 104, Emp.class);

		// To get the Employee's Name
		System.out.println(resp1.getBody().getName());
		
		// To get the Employee's City
		System.out.println(resp1.getBody().getCity());

		//HTTP Header
		HttpHeaders headers = new HttpHeaders() ;
//		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE );
		
//		headers.set("Accept", MediaType.APPLICATION_XML_VALUE );
		
		headers.set("Accept", MediaType.TEXT_PLAIN_VALUE );
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE );
		
		Emp e = new Emp(108,"Raj","Goa",63000);
		
		//HTTP Body
//		HttpEntity httpRequest = new HttpEntity<>(headers);
//		ResponseEntity<Emp> resp2 = rt.exchange( url + 104, 
//				HttpMethod.GET , httpRequest, Emp.class);
//		System.out.println("resp2: "+resp2.getBody().getName());

		HttpEntity httpRequest2 = new HttpEntity<>(e,headers);
		ResponseEntity<String> resp3 = rt.exchange("http://localhost:8183/emp/save", 
				HttpMethod.POST , httpRequest2, String.class);
		System.out.println("resp3: "+resp3.getBody());
			
	}
}
