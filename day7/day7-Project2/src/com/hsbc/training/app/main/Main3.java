package com.hsbc.training.app.main;

import com.hsbc.training.app.dao.CustDao;
import com.hsbc.training.app.exceptions.CustNotFoundException;
import com.hsbc.training.app.exceptions.DuplicateException;
import com.hsbc.training.app.impl.CustDaoMapImpl;
import com.hsbc.training.app.service.CustService;

public class Main3 {

	public static void main(String[] args) throws DuplicateException, CustNotFoundException {
		
		
		CustDao dao= new CustDaoMapImpl() ;  //map
		
		CustService cs = new CustService(dao);
		
		try {
			
			cs.registerCust(104, "Daravi,Mumbai", "Raju Bhai", 56000);
			cs.registerCust(105, "Daravi,Mumbai", "Ajju Bhai", 25000);
			cs.registerCust(106, "Machli MArket, Kolkata", "Sundar Banerjee", 60000);
			
			cs.printEmpList();
			
			String g =cs.search(102);
			System.out.println(g);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
