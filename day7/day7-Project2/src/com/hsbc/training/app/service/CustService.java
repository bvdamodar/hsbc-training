package com.hsbc.training.app.service;

import com.hsbc.training.app.exceptions.DuplicateException;
import com.hsbc.training.app.dao.CustDao;
import com.hsbc.training.app.exceptions.CustNotFoundException;
import com.hsbc.training.app.entity.Customer;

public class CustService {

	private CustDao dao;

	public CustService(CustDao dao) {
		this.dao = dao;
	}
	
	public String search(int id) throws CustNotFoundException {
		try {
			Customer c = dao.searchId(id);
			if (c==null) {
				return ("Customer Not Found.");
			}else {
				return ("\nFound: "+c.getCustId()+", "+c.getName()+", "+c.getAddress()+", "+c.getAmount());
			}
			
		}catch (RuntimeException ew) {
				throw new RuntimeException("getEmpDetails: Emp Not Found.");
		}
	}
	public String registerCust(int custId, String address, String name, double Amount) throws DuplicateException {
		return dao.save(new Customer(custId, address, name, Amount));
	}
	
	public String getEmpDetails(int id) throws CustNotFoundException {
		try {
					Customer c = dao.searchId(id);
					return ("Found: "+c.getCustId()+", "+c.getName()+", "+c.getAddress()+", "+c.getAmount());
				
		}catch (RuntimeException ew) {
				throw new RuntimeException("getEmpDetails: Emp Not Found.");
		}
	}
	
	public void printEmpList() {
		System.out.println("\n");
		for(Customer c: dao.listAll()) {
			System.out.println(c.getCustId()+", "+c.getName()+", "+c.getAddress()+", "+c.getAmount());
			
		}
	}
	
	public String removeCust(int id) throws CustNotFoundException {
		try {
//			Customer c = dao.searchId(id);
			return dao.remove(id);
		}catch (RuntimeException ew) {
				throw new RuntimeException("getEmpDetails: Emp Not Found.");
		}
	}
	
	
}
