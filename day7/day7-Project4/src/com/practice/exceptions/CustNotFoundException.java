package com.practice.exceptions;

public class CustNotFoundException extends Exception {

	public CustNotFoundException() {
	System.out.println("Exception: CustNotFoundException. ");
	}

	public CustNotFoundException(String s) {
		System.out.println(s);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer Not Found.";
	}
}
