package com.hsbc.tr.spring.impl;

import com.hsbc.tr.spring.dao.EmpDao;
import com.hsbc.tr.spring.entity.Emp;

public class EmpDaoMock2Impl  implements EmpDao  {

	@Override
	public String save(Emp e) {
		return "Mock2: Emp Saved with "+e.getName();
	} 
	

}
