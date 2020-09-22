package com.practice.threads.q7;
/**
 * 
 * @author bvdam
 *
 */
public class Student  implements Runnable {

	private PrintMessage p; 
	private String school;
	
	public Student(PrintMessage p, String school) {
		this.p = p;
		this.school = school;
	}

	@Override
	public void run() {
		
		p.printSchool(school);
		
	}
}
