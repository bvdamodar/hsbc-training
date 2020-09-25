package cpm.practice.app.entity;

public class Emp {

	private int EmpId;
	private String name,city;
	private double salary;
	public int getEmpId() {
		return EmpId;
	}
	
	
	
	public Emp(int empId, String name, String city, double salary) {
		this.EmpId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
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
	
	@Override
	public boolean equals(Object obj) {
		Emp e = (Emp) obj;
		return (e.getEmpId()==this.getEmpId());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getEmpId();
	}
}
