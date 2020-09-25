package com.practice.dao;

import java.util.List;

import com.practice.entity.Cust;
import com.practice.exceptions.CustNotFoundException;
import com.practice.exceptions.DuplicateCustException;

public interface CustDao {

	public String save(Cust c) throws DuplicateCustException;
	public String search(int id) throws CustNotFoundException;
	public String remove(int id) throws CustNotFoundException;
	public List<Cust> listAll();
	
}
