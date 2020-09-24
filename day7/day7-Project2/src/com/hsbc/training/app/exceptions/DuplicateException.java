package com.hsbc.training.app.exceptions;

public class DuplicateException extends Exception {
	public DuplicateException() {
			System.out.println("The Data is already present in the database.");
	}

}
