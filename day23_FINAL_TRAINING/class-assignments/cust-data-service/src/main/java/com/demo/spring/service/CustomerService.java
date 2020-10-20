package com.demo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.entity.Customer;
import com.demo.spring.impl.CustomerDaoImpl;
import com.demo.spring.impl.CustomerDaoJdbcImpl;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;
	
	public CustomerService() {
	}
	
	public CustomerService(CustomerDaoJdbcImpl dao) {
		this.dao = dao;
	}

//	public CustomerService(CustomerDaoImpl dao) {
//		this.dao = dao;
//	}

	public Customer getCustomerDetails(int custId) {		
		return dao.findById(custId);
	}
	
	public List<Customer> listAllCustomers() {
		return dao.listAll();
	}
	
	public String saveCustomer(Customer c) {
		return dao.save(c);
	}
	
	public String saveCustomer(int id, String name, String mob) {
		return dao.saveCustomer( id,  name,  mob);
	}

}
