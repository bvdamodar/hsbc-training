package com.practice.exceptions;

public class DuplicateCustException extends Exception {


	public DuplicateCustException() {
	System.out.println("Exception: DuplicateCustException");
	}

	public DuplicateCustException(String s) {
		System.out.println(s);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer Exists.";
	}
}
