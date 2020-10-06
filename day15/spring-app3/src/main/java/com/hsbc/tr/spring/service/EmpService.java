package com.hsbc.tr.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hsbc.tr.spring.dao.EmpDao;
import com.hsbc.tr.spring.entity.Emp;

@Service
public class EmpService {
	
	@Autowired
//	@Qualifier("empDaoMock2Impl") //or @Qualifier("empDaoMockImpl")
//	@Qualifier("mockDao2")
	@Qualifier("mybean")
	private EmpDao dao;
		
	private String daoId;
	
	public void setDaoId(String daoId) {
		System.out.println("Dao is set..");
		this.daoId = daoId;
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	public String registerEmp(int empId, String name, String city, double salary) {
		String resp = dao.save(new Emp(empId,  name,  city,  salary));
		return resp;
	}

}
