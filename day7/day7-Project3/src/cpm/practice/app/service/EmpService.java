package cpm.practice.app.service;

import cpm.practice.app.dao.EmpDao;
import cpm.practice.app.entity.Emp;
import cpm.practice.app.exceptions.DuplicateEmpException;
import cpm.practice.app.exceptions.EmpNotFoundException;

public class EmpService {

	private EmpDao dao ;
	
	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int empId, String name, String city, double salary) throws DuplicateEmpException {
			return dao.save(new Emp(empId, name,city, salary));
	}
	
	public String search(int id) throws EmpNotFoundException {
		try {
				Emp e = dao.search(id);
				System.out.println("\n");
				if (e==null) {
					return "Employee not exists.";
				} else {
					return "\nFound: "+e.getEmpId()+" ,"+e.getName()+" ,"+e.getCity()+" ,"+e.getSalary();
				}			
		} catch (RuntimeException e) {
			throw new RuntimeException("RuntimeException: Employee not Found");
		}
		
	}

	public void removeEmp(int id) throws EmpNotFoundException{
			Emp e = dao.search(id);
			System.out.println("\n");
			if (e==null) {
				System.out.println("Employee not exists.");
			} else {
					dao.remove(id);
					System.out.println("Employee "+id+" removed Successfully.");
			}		
		
	}
	
	public void updateEmployee(int id, Emp emp) {
		try {
			dao.update(id, emp);
			System.out.println("Employee " + id + " updated...");
		} catch (Exception e) {
			System.out.println("Employee " + id + " doesn't exist");
		}
	}
	
	public void updateEmployeeAttr(int id, String attr, Object val) {
		try {
			if (attr == "name") {
				String newValue = (String) val;
				dao.updateName(id, newValue);
				System.out.println("Employee " + id + " updated...");
			} else if (attr == "city") {
				String newValue = (String) val;
				dao.updateCity(id, newValue);
				System.out.println("Employee " + id + " updated...");
			} else if (attr == "salary") {
				Double newValue = Double.parseDouble(val.toString());
				dao.updateSalary(id, newValue);
				System.out.println("Employee " + id + " updated...");
			} else
				throw new EmpNotFoundException();
		} catch (Exception e) {
			System.out.println("Employee " + id + " doesn't exist");
		}
	}
	
	public void printAll() {
		System.out.println("\nEmployee List");
		for(Emp e: dao.listAll()) {
			System.out.println(e.getEmpId()+","+e.getName()+","+e.getCity()+","+e.getSalary());
		}
		
	}
	
	
}
