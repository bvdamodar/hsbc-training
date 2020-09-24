package com.hsbc.training.app.main;
/**
 * @author bvdam
 * 
 */
import com.hsbc.training.app.exceptions.DuplicateException;
import com.hsbc.training.app.dao.CustDao;
import com.hsbc.training.app.exceptions.CustNotFoundException;
import com.hsbc.training.app.impl.CustDaoMapImpl;
import com.hsbc.training.app.service.CustService;

public class Main2 {

	public static void main(String[] args) throws DuplicateException, CustNotFoundException {
		
		CustDao dao= new CustDaoMapImpl() ;  //map
		
		CustService cs = new CustService(dao);
		
		try {
			System.out.println(cs.getEmpDetails(103));
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		cs.printEmpList();
		System.out.println("------------------------------\n");
		String rcsp = cs.registerCust(103,  "Goa", "Sam",55000);
		String rcsp2 = cs.registerCust(104,  "Goa", "Sam",55000);
		System.out.println(rcsp);
		System.out.println(rcsp2);
		
		cs.printEmpList();
		System.out.println("------------------------------\n");
		
		System.out.println(cs.removeCust(104));
		
		cs.printEmpList();
		System.out.println("\nFinished.");
	}

}
