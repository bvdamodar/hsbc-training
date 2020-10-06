package com.hsbc.tr.spring.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.hsbc.tr.spring.dao.EmpDao;
import com.hsbc.tr.spring.entity.Emp;

//@Repository
//@Primary // if service has no quality 
public class EmpDaoMock2Impl  implements EmpDao  {

	@Override
	public String save(Emp e) {
		return "Mock2: Emp Saved with "+e.getName();
	} 
	

}
