package com.hsbc.training.app.main;

import com.hsbc.training.app.dao.CustDao;

public class Main4 {
	public static void main(String[] args) throws Exception{
		
		CustDao dao= (CustDao) Class.forName("com.hsbc.training.app.impl.CustDaoMapImpl").newInstance();
		System.out.println(dao.searchId(103).getName());
	
	}

}
