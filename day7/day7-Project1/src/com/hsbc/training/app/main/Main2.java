package com.hsbc.training.app.main;

import com.hsbc.training.app.exceptions.DuplicateException;
import com.hsbc.training.app.dao.EmpDao;
import com.hsbc.training.app.exceptions.EmpNotFoundException;
import com.hsbc.training.app.impl.EmpDaoListImpl;
import com.hsbc.training.app.impl.EmpDaoMapImpl;
import com.hsbc.training.app.service.EmpService;

public class Main2 {

	public static void main(String[] args) throws DuplicateException, EmpNotFoundException {
		
//		EmpDao dao= new EmpDaoMapImpl() ;  //map
		EmpDao dao= new EmpDaoListImpl() ;  //list
		
		EmpService es = new EmpService(dao);
		
		try {
			System.out.println(es.getEmpDetails(103));
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		es.printEmpList();
		System.out.println("------------------------------\n");
		String resp = es.registerEmp(103, "Sam", "Goa", 55000);
		String resp2 = es.registerEmp(104, "Sam", "Goa", 55000);
		System.out.println(resp);
		System.out.println(resp2);
		
		es.printEmpList();
	}

}
