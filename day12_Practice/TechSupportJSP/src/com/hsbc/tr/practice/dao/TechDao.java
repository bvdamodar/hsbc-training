package com.hsbc.tr.practice.dao;

import java.util.List;

public interface TechDao {

	public int checkUser(String email);
	public String saveUser(String email,String  fname, String lname, String phone);
	public String saveRequest(String email, String os, String sw, String prob);
	public List<String> listAllReq(); 
}
