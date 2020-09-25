package com.practice.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.practice.dao.CustDao;
import com.practice.entity.Cust;
import com.practice.exceptions.CustNotFoundException;
import com.practice.exceptions.DuplicateCustException;

public class CustMapImpl implements CustDao {

	public CustMapImpl() {
	}
	
	static Map<Integer, Cust> custDB = new HashMap<>();

	@Override
	public String save(Cust c) throws DuplicateCustException {
		if (custDB.containsKey(c.getEmpId())) {
				return "Employee Exists";
		} else {
		custDB.put(c.getEmpId(), c);
		return "Cutomer added Successfully";
		}
	}

	@Override
	public String search(int id) throws CustNotFoundException {
		if (!custDB.containsKey(id)) {
			return id+" Customer Not Exists.";
		} else {			
			Cust c = custDB.get(id);
				return id+"-Found: Name- "+c.getName()+", CIty: "+c.getCity()+", Salary- "+c.getSalary();
		}
	}

	@Override
	public String remove(int id) throws CustNotFoundException {
		if (!custDB.containsKey(id)) {
			return id+" Customer Not Exists.";
		} else {
			custDB.remove(id);
		return id+" Cutomer removed Successfully.";
		}
	}

	@Override
	public List<Cust> listAll() {		 
		return new ArrayList<Cust>(custDB.values());
	}
	
	

}
