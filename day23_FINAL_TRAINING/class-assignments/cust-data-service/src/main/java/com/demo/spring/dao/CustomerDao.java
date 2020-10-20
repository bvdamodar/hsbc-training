package com.demo.spring.dao;


import java.util.List;

import com.demo.spring.entity.Customer;

public interface CustomerDao {

	Customer findById(int id);
	
	List<Customer> listAll();
	
	String save(Customer c) ;
	
	String saveCustomer(int id, String name, String mob);
}
