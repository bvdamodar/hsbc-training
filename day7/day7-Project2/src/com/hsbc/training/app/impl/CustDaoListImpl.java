package com.hsbc.training.app.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.hsbc.training.app.dao.CustDao;
import com.hsbc.training.app.entity.Customer;
import com.hsbc.training.app.exceptions.CustNotFoundException;
import com.hsbc.training.app.exceptions.DuplicateException;

public class CustDaoListImpl  implements CustDao{

	static List<Customer> custDB = new LinkedList<Customer>() ;
	
	public CustDaoListImpl() {
		custDB.add(new Customer(100,"MVP Colony,Vijag" ,"Damodar", 60000));
		custDB.add(new Customer(101,"Anna Nagar,Chennai" ,"Senthil", 50000));
		custDB.add(new Customer(102,"Benz Circle, Vijayavada" ,"Durga", 70000));
		custDB.add(new Customer(103,"Moli Beach, Goa" ,"Sony", 30000));
	}
	@Override
	public List<Customer> listAll() {
			return custDB;
	}
	@Override
	public String save(Customer e) throws DuplicateException{
			if (custDB.contains(e)) {
				return "Customer already exists.";
			} else {
				custDB.add(e);
				return "Customer added successfully.";
			}
	}
	@Override
	public Customer searchId(int id) throws CustNotFoundException {
		for (Customer cust : custDB) {
			if (cust.getCustId() == id) {
				return cust;
			}
		}
		return null;
	}
	@Override
	public String remove(int c) throws CustNotFoundException {
		if (!custDB.contains(c)) {
			return "Customer not present.";
		} else {
			custDB.remove(c);
			return "Customer Removed Successfully.";
		}
	}
}
