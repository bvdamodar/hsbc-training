package cpm.practice.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cpm.practice.app.dao.EmpDao;
import cpm.practice.app.entity.Emp;
import cpm.practice.app.exceptions.DuplicateEmpException;
import cpm.practice.app.exceptions.EmpNotFoundException;

public class EmpMapImpl implements EmpDao{

		
		static Map<Integer,Emp> empDB= new HashMap<>(); 
//		static List<Emp> empDB = new LinkedList<Emp>(); 
		
	

	@Override
	public String save(Emp e) throws DuplicateEmpException {
		if (empDB.containsKey(e.getEmpId())) {
					return "Emp already exists.";
		} else {
			empDB.put(e.getEmpId(), e);
			return "Emp Successfully registered.";
		}
	}

	@Override
	public Emp search(int id) throws EmpNotFoundException {
		if (empDB.containsKey(id)) {
					return empDB.get(id);
		} else {
				throw new EmpNotFoundException();//"Search: Emp not found.");
		}
	}

	@Override
	public String remove(int id) throws EmpNotFoundException {
		if (empDB.containsKey(id)) {
					empDB.remove(id);
					return "Emp removed Successfully.";
		} else {
			return "Remove: Emp not Found.";
}
	}

	@Override
	public List<Emp> listAll() {
		return new ArrayList<Emp>(empDB.values());
	}

	@Override
	public void update(int id, Emp emp) throws EmpNotFoundException {
		try {
			if (empDB.containsKey(id)) {
				empDB.put(id, emp);
			} else
				throw new EmpNotFoundException();
		} catch (EmpNotFoundException e) {
			throw e;
		}		
	}
	
	@Override
	public void updateName(int id, String name) throws EmpNotFoundException {
		try {
			if (empDB.containsKey(id)) {
				Emp emp = empDB.get(id);
				emp.setName(name);
				empDB.put(id, emp);
			} else
				throw new EmpNotFoundException();
		} catch (EmpNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void updateCity(int id, String city) throws EmpNotFoundException {
		try {
			if (empDB.containsKey(id)) {
				Emp emp = empDB.get(id);
				emp.setCity(city);
				empDB.put(id, emp);
			} else
				throw new EmpNotFoundException();
		} catch (EmpNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void updateSalary(int id, double salary) throws EmpNotFoundException {
		try {
			if (empDB.containsKey(id)) {
				Emp emp = empDB.get(id);
				emp.setSalary(salary);
				empDB.put(id, emp);
			} else
				throw new EmpNotFoundException();
		} catch (EmpNotFoundException e) {
			throw e;
		}
	}

}
