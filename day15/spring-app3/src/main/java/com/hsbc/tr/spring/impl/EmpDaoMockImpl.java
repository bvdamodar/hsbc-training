package com.hsbc.tr.spring.impl;

import org.springframework.stereotype.Repository;

import com.hsbc.tr.spring.dao.EmpDao;
import com.hsbc.tr.spring.entity.Emp;

@Repository
public class EmpDaoMockImpl  implements EmpDao  {

	@Override
	public String save(Emp e) {
		return "Mock: Emp Saved with "+e.getEmpId();
	} 
	

}
