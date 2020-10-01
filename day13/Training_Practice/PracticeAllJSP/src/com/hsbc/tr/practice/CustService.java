package com.hsbc.tr.practice;

import java.util.List;

public class CustService {

	CustDao dao;
	String s ="success";
	
	public CustService() {
	}
	
	public CustService(CustDao dao) {
		this.dao = dao;
	}
	
	public boolean validateUser(String email) {
		return  (dao.checkCust(email)==1);		
	}
	
	public boolean regUser(String email, String name,String mob,String pwd) {
		String u = dao.saveUser(email,  name, mob,pwd);
		return u.equals(s);		
	}
	
	public boolean regRequest(String email, String tool,String os,String problem){
		String u = dao.saveRequest( email,  tool, os, problem);
		return u.equals(s);		
	}
	
	public String loginUser(String email,String pwd) {
		String u = dao.login(email,  pwd);
		return u;		
	}
	
	public List<String> list(){
		return dao.listAll();
	}
}
