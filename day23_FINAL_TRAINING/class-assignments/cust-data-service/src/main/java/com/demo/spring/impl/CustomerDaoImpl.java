package com.demo.spring.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.data.CustDB;
import com.demo.spring.entity.Customer;


public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private CustDB dbStore;
	
	@Override
	public Customer findById(int custId) {		
		if (dbStore.getDb().containsKey(custId)) {
			return dbStore.getDb().get(custId);
		} else {
			throw new RuntimeException("Customer Not Found..");
		}
	}

	@Override
	public List<Customer> listAll() {
		ArrayList<Customer> custList = new ArrayList<>(dbStore.getDb().values());
		return custList;
	}

	@Override
	public String save(Customer c) {
		if (CustDB.getDb().containsKey(c.getCustId())) {
			return "Customer already Registered....";
		} else {
			CustDB.getDb().put(c.getCustId(), c);
			return "Customer Saved SUCCESSFULLY....";
		}
	}

	@Override
	public String saveCustomer(int id, String name, String mob) {
		Customer c = new Customer(id,name,mob);
		if (CustDB.getDb().containsKey(c.getCustId())) {
			return "Customer already Registered....";
		} else {
			CustDB.getDb().put(c.getCustId(), c);
			return "Customer Saved SUCCESSFULLY....";
		}
	}

}
