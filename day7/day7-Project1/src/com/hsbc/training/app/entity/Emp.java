package com.hsbc.training.app.entity;

public class Emp {

	private int empId;
	private String city,name;
	private double salary;
	
	public Emp() {

	}
	

	public Emp(int empId, String city, String name, double salary) {
		this.empId = empId;
		this.city = city;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return this.getEmpId();
	}
	@Override
	public boolean equals(Object obj) {
		Emp e = (Emp) obj;
		if (e.getEmpId() == this.getEmpId() ) {
			return true;
		}
		return false;
	}
	
	
}
