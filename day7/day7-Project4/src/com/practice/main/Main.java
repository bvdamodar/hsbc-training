package com.practice.main;

import com.practice.dao.CustDao;
import com.practice.impl.CustMapImpl;
import com.practice.service.CustService;

public class Main {

	public static void main(String[] args) {

		CustDao dao = new CustMapImpl();
		CustService s= new CustService(dao);

		try {
			System.out.println(s.registerCust(101, "Damodar","Vizag", 50000));
			System.out.println(s.registerCust(102, "Raj","Mumbai", 25000));
			System.out.println(s.registerCust(103, "Sony","Delhi", 45000));
			s.printCust();
			System.out.println(s.searchCust(103));
			System.out.println(s.searchCust(104));
			s.printCust();
			System.out.println(s.removeCust(103));
			System.out.println(s.removeCust(104));
			s.printCust();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
