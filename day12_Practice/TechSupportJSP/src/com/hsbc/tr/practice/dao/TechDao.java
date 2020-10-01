package com.hsbc.tr.practice.dao;

import java.util.List;

public interface TechDao {

	public int checkUser(String email);
	public String saveRequest(String email, String os, String software, String problem);
	public String saveUser(String email, String fname, String lname, String phone);
	public List<String> listAllRequests();
}
