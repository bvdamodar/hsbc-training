package com.hsbc.training.app.service;

import com.hsbc.training.app.exceptions.DuplicateException;
import com.hsbc.training.app.dao.EmpDao;
import com.hsbc.training.app.exceptions.EmpNotFoundException;
import com.hsbc.training.app.entity.Emp;

public class EmpService {

	private EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}
	
	public String registerEmp(int id,String name, String city,double salary) throws DuplicateException {
		return dao.save(new Emp(id, city, name, salary));
	}
	
	public String getEmpDetails(int id) throws EmpNotFoundException {
		try {
					Emp e = dao.findById(id);
					return ("Found: "+e.getEmpId()+", "+e.getName()+", "+e.getCity()+", "+e.getSalary());
				
		}catch (RuntimeException ew) {
				throw new RuntimeException("getEmpDetails: Emp Not Found.");
		}
	}
	
	public void printEmpList() {
		System.out.println("\n");
		for(Emp e: dao.listAll()) {
			System.out.println(e.getEmpId()+", "+e.getName()+", "+e.getCity()+", "+e.getSalary());
			
		}
	}
	
	
}
