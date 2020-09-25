package cpm.practice.app.exceptions;

public class DuplicateEmpException extends Exception {

	public DuplicateEmpException() {
		System.out.println("Exception: Employee exists.");
	}
}
