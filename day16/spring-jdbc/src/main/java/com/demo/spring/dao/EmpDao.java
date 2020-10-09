package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.entity.Emp;

public interface EmpDao {

	public String save(Emp e);
	public Emp findById(int id);
	public List<Emp> listAll();	
	public String update(Emp e);
	public Emp delete(int id);
	
}
