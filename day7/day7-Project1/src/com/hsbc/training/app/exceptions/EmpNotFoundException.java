package com.hsbc.training.app.exceptions;

public class EmpNotFoundException extends Exception{

	public EmpNotFoundException() {
		System.out.println("EmpNotFoundException");
	}

	public EmpNotFoundException(String msg) {
	}
}
