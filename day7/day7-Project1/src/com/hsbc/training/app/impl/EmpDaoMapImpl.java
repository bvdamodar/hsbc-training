package com.hsbc.training.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.training.app.exceptions.DuplicateException;
import com.hsbc.training.app.exceptions.EmpNotFoundException;
import com.hsbc.training.app.dao.EmpDao;
import com.hsbc.training.app.entity.Emp;

public class EmpDaoMapImpl  implements EmpDao{

	static Map<Integer, Emp> empDB = new HashMap<>() ;
	
	public EmpDaoMapImpl() {
		empDB.put(100,new Emp(100,"Vijag" ,"Raj", 60000));
		empDB.put(101,new Emp(101,"Chennai" ,"Tony", 50000));
		empDB.put(102,new Emp(102,"Vijag" ,"Dam", 70000));
		empDB.put(103,new Emp(103,"Goa" ,"Sonu", 30000));
	}
	public Emp findById(int id) throws EmpNotFoundException {
		
		if (empDB.containsKey(id)) {
				return empDB.get(id);}
				else {
					throw new EmpNotFoundException();				
		}
	}
	
	@Override
	public List<Emp> listAll() {
			return new ArrayList<Emp>(empDB.values());
	}
	@Override
	public String save(Emp e){
		
		if (empDB.containsKey(e.getEmpId())) {
			return "Emp already exists";
		} else {
			empDB.put(e.getEmpId(), e);
			return "Emp Registered successfully";
		}
	}
}
