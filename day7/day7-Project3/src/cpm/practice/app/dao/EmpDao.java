package cpm.practice.app.dao;

import java.util.List;

import cpm.practice.app.entity.Emp;
import cpm.practice.app.exceptions.DuplicateEmpException;
import cpm.practice.app.exceptions.EmpNotFoundException;

public interface EmpDao {

	public String save(Emp e) throws DuplicateEmpException;
	public Emp search(int id) throws EmpNotFoundException;
	public String remove(int id) throws EmpNotFoundException;
	public List<Emp> listAll();
	public void update(int id, Emp emp) throws EmpNotFoundException;
	public void updateName(int id, String name)throws EmpNotFoundException;

	public void updateCity(int id, String city) throws EmpNotFoundException;

	public void updateSalary(int id, double salary)throws EmpNotFoundException;
}
