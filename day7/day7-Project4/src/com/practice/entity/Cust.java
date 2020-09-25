package com.practice.entity;

public class Cust {

	private int EmpId;
	private String name,city;
	private double salary;
	
	public Cust() {
		// TODO Auto-generated constructor stub
	}
	
	public Cust(int empId, String name, String city, double salary) {
		super();
		EmpId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return this.getEmpId();
	}

	@Override
	public boolean equals(Object obj) {
		Cust c= (Cust)obj;
		return (c.getEmpId() == this.getEmpId());
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
