package com.hsbc.training.app.main;

import com.hsbc.training.app.dao.EmpDao;
import com.hsbc.training.app.exceptions.EmpNotFoundException;
import com.hsbc.training.app.entity.Emp;
import com.hsbc.training.app.impl.EmpDaoMapImpl;

public class Main1 {

	public static void main(String[] args) throws EmpNotFoundException {
		
//		EmpDao dao= new EmpDaoListImpl() ;   //list

		//OR
		
		EmpDao dao= new EmpDaoMapImpl() ;  //map
		
		
		//find emp by id
//		Emp e = dao.findById(102);
		Emp e = dao.findById(105); //not there
		if (e==null) {
			System.out.println("Emp Not Found.");
		}else {
			System.out.println(e.getEmpId()+", "+e.getName()+", "+e.getCity()+", "+e.getSalary());
		}
		
		//find all employees
		for (Emp e1 :dao.listAll()) {
			System.out.println(e1.getEmpId()+", "+e1.getName()+", "+e1.getCity()+", "+e1.getSalary());
		}
		
	}

}
