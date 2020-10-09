package com.demo.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository
public class EmpDaoJdbcImpl implements EmpDao{

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public String save(Emp e) {
		 
		return null;
	}

	@Override
	public Emp findById(int id) {
		 
		return null;
	}

	@Override
	public List<Emp> listAll() {
		 
		return null;
	}

	@Override
	public String update(Emp e) {
		 
		return null;
	}

	@Override
	public Emp delete(int id) {
		 
		return null;
	}

}
