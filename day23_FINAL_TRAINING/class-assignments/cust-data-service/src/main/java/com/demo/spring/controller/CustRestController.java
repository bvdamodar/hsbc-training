package com.demo.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Customer;
import com.demo.spring.impl.CustomerDaoImpl;
import com.demo.spring.impl.CustomerDaoJdbcImpl;
import com.demo.spring.service.CustomerService;

@RestController
@CrossOrigin
public class CustRestController {

	@Autowired
	CustomerService service;	

	// add Customer
	@PostMapping(path = "/cust/save", produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveCust(@RequestBody Customer c) {
		return ResponseEntity.ok(service.saveCustomer(c));
	}
	
	// find all Customers
	@GetMapping(path = "/cust/find/{custId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity getCustDetails(@PathVariable("custId") int custId, HttpServletRequest req) {

		System.out.println("Request served by " + req.getLocalAddr() + " :- " + req.getLocalPort());
		return ResponseEntity.ok(service.getCustomerDetails(custId));	
	}
	
	// list All Customers
	@GetMapping(path = "/cust", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> listAll() {
		return ResponseEntity.ok(service.listAllCustomers());
	}

}
