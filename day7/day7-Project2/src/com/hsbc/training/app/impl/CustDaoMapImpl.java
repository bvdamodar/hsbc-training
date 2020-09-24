package com.hsbc.training.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.training.app.exceptions.DuplicateException;
import com.hsbc.training.app.exceptions.CustNotFoundException;
import com.hsbc.training.app.dao.CustDao;
import com.hsbc.training.app.entity.Customer;

public class CustDaoMapImpl  implements CustDao{

	static Map<Integer, Customer> custDB = new HashMap<>() ;
	
	public CustDaoMapImpl() {
		custDB.put(100,new Customer(100,"MVP Colony,Vijag" ,"Damodar", 60000));
		custDB.put(101,new Customer(101,"Anna Nagar,Chennai" ,"Senthil", 50000));
		custDB.put(102,new Customer(102,"Benz Circle, Vijayavada" ,"Durga", 70000));
		custDB.put(103,new Customer(103,"Moli Beach, Goa" ,"Sony", 30000));
	}
	
	@Override
	public List<Customer> listAll() {
			return new ArrayList<Customer>(custDB.values());
	}
	@Override
	public String save(Customer e){
		
		if (custDB.containsKey(e.getCustId())) {
			return "Cust already exists";
		} else {
			custDB.put(e.getCustId(), e);
			return "Cust Registered successfully";
		}
	}
	
	@Override
	public Customer searchId(int id) throws CustNotFoundException {
		if (custDB.containsKey(id)) {
		return custDB.get(id);}
		else {
			throw new CustNotFoundException();				
		}

	}
	
	@Override
	public String remove(int c) throws CustNotFoundException {
		if (!custDB.containsKey(c)) {
			return "Cust not exists";
		} else {
			custDB.remove(c);
			return "Removed Successfully.";
		}
		
	}
	
	public String updateName(int id,String name) {
//		if (custDB.containsKey(id)) {
//			Customer c1 = custDB.get(id);
//			c1.getName()
//		}
		return "";
	}
}
