package com.hsbc.training.app.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.hsbc.training.app.dao.EmpDao;
import com.hsbc.training.app.entity.Emp;
import com.hsbc.training.app.exceptions.DuplicateException;

public class EmpDaoListImpl  implements EmpDao{

	static List<Emp> empDB = new LinkedList<Emp>() ;
	
	public EmpDaoListImpl() {
		empDB.add(new Emp(100,"Vijag" ,"Raj", 60000));
		empDB.add(new Emp(101,"Chennai" ,"Tony", 50000));
		empDB.add(new Emp(102,"Vijag" ,"Dam", 70000));
		empDB.add(new Emp(103,"Goa" ,"Sonu", 30000));
	}
	public Emp findById(int id) {
		
		for (Emp emp : empDB) {
			if (emp.getEmpId() == id) {
				return emp;
			}
		}
		return null;
		
	}
	@Override
	public List<Emp> listAll() {
			return empDB;
	}
	@Override
	public String save(Emp e) throws DuplicateException{
		if (empDB.contains(e)) {
			return "Emp already exists.";
		} else {
			empDB.add(e);
			return "Emp added successfully.";
		}
	}
}
