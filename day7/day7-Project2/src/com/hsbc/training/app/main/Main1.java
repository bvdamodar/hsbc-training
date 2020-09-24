package com.hsbc.training.app.main;

import com.hsbc.training.app.dao.CustDao;
import com.hsbc.training.app.exceptions.CustNotFoundException;
import com.hsbc.training.app.entity.Customer;
import com.hsbc.training.app.impl.CustDaoMapImpl;

public class Main1 {

	public static void main(String[] args) throws CustNotFoundException {
		
//		CustDao dao= new CustDaoListImpl() ;   //list

		//OR
		
		CustDao dao= new CustDaoMapImpl() ;  //map
		
		
		//find cust by id
		Customer c = dao.searchId(101); //not there
		if (c==null) {
			System.out.println("Customer Not Found.");
		}else {
			System.out.println(c.getCustId()+", "+c.getName()+", "+c.getAddress()+", "+c.getAmount());
		}
		
		//find all customers
		for (Customer e1 :dao.listAll()) {
			System.out.println(e1.getCustId()+", "+e1.getName()+", "+e1.getAddress()+", "+e1.getAmount());
		}
		
	}

}
