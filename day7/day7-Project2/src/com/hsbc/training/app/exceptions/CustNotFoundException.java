package com.hsbc.training.app.exceptions;

public class CustNotFoundException extends Exception{

	public CustNotFoundException() {
		System.out.println("Customer not found.");
	}

	public CustNotFoundException(String msg) {
	}
}
