package com.practice.service;

import com.practice.dao.CustDao;
import com.practice.entity.Cust;
import com.practice.exceptions.CustNotFoundException;
import com.practice.exceptions.DuplicateCustException;

public class CustService {

	private CustDao dao;
	
	public CustService() {
	}

	public CustService(CustDao dao) {
		this.dao = dao;
	}
	
	public String registerCust(int empId, String name, String city, double salary) throws DuplicateCustException {
		return empId+": "+dao.save(new Cust( empId,  name,  city,  salary));
	}
	
	public String searchCust(int id) throws CustNotFoundException{
		return dao.search(id);
	}
	
	public String removeCust(int id) throws CustNotFoundException{
		return id+": "+dao.remove(id);
	}
	
	public void printCust() {
		System.out.println("\n");
		for(Cust c: dao.listAll()) {
				System.out.println("Id: "+c.getEmpId()+", "+"Name: "+c.getName()+", "+"City: "+c.getCity()+", "+"Salary: "+c.getSalary());
		}
	}

}
