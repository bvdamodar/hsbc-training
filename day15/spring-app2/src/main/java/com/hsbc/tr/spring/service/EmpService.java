package com.hsbc.tr.spring.service;

import com.hsbc.tr.spring.dao.EmpDao;
import com.hsbc.tr.spring.entity.Emp;

public class EmpService {
	
	private EmpDao dao;
	
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	public String registerEmp(int empId, String name, String city, double salary) {
		String resp = dao.save(new Emp(empId,  name,  city,  salary));
		return resp;
	}

}
