package com.hsbc.training.app.entity;

public class Customer {

	private int custId;
	private String address,name;
	private double amount;
	
	public Customer() {

	}
	
	public Customer(int custId, String address, String name, double amount) {
		this.custId = custId;
		this.address = address;
		this.name = name;
		this.amount = amount;
	}
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double Amount) {
		this.amount = amount;
	}
	
	@Override
	public int hashCode() {
		return this.getCustId();
	}
	@Override
	public boolean equals(Object obj) {
		Customer e = (Customer) obj;
		if (e.getCustId() == this.getCustId() ) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
