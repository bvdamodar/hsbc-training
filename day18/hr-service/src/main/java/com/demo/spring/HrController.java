package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HrController {

	@Autowired
	private RestTemplate rt;

	@GetMapping(path = "/hr/emp/details", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getEmpInfo(@RequestParam("id") int empId) {

		// HTTP Header
		HttpHeaders headers = new HttpHeaders();

		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		// HTTP Body
		HttpEntity httpRequest = new HttpEntity<>(headers);
//		ResponseEntity<String> resp = rt.exchange("http://localhost:8183/emp/find/"+empId, 
		ResponseEntity<String> resp = rt.exchange("http://emp-service/emp/find/" + empId, HttpMethod.GET, // if eureka is added and running
				httpRequest, String.class);
		System.out.println("resp: " + resp.getBody());

		return resp;
	}
}
