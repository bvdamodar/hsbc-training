package com.hsbc.tr.practice;

import java.util.List;

public interface CustDao {
	
	public int checkCust(String email);
	public String saveUser(String email, String name,String mob,String pwd);
	public String saveRequest(String email, String tool,String os,String problem);
	public String login(String email, String pwd);
	public List<String> listAll();

}
