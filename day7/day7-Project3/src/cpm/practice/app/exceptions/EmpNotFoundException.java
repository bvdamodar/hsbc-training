package cpm.practice.app.exceptions;

public class EmpNotFoundException extends Exception {

	public EmpNotFoundException() {
		System.out.println("Exception: Employee Not Found.");
	}
}
