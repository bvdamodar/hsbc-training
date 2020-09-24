package com.hsbc.training.app.dao;

import java.util.List;

import com.hsbc.training.app.entity.Emp;
import com.hsbc.training.app.exceptions.DuplicateException;
import com.hsbc.training.app.exceptions.EmpNotFoundException;

public interface EmpDao {

	public Emp findById(int id) throws EmpNotFoundException;
	
	public List<Emp> listAll();
	
	public String save(Emp e) throws DuplicateException;
	
}
