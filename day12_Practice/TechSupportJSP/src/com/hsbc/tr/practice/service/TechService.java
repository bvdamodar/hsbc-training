package com.hsbc.tr.practice.service;

import java.util.List;

import com.hsbc.tr.practice.dao.TechDao;

public class TechService {

	private TechDao dao;
	
	public TechService() {

	}
	
	public TechService(TechDao dao) {
		this.dao = dao;
	}

	public boolean registerUser(String email,String fname,String lname,String phone) {
		String resp = dao.saveUser(email, fname, lname, phone);
		return resp.equals("success");
	}
	public boolean validateUser(String email) {
		int r = dao.checkUser(email);
		return r == 1;
	}

	public boolean registerReq(String email, String os, String sw, String prob) {
		String resp = dao.saveRequest(email, os, sw, prob);
		return resp.equals("success");
	}

	public List<String> listAll() {		
		return dao.listAllReq();
	}
	
}
