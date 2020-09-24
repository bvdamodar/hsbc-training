package com.practice.exceptions;

public class ApparelNotFoundException extends Exception {

	public ApparelNotFoundException() {
		System.out.println("ApparelNotFoundException");
	}

	public ApparelNotFoundException(String msg) {
		System.out.println("ApparelNotFoundException"+msg);
	}
}
