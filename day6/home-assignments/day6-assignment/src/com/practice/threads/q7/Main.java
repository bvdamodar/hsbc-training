package com.practice.threads.q7;
/**
 * 
 * @author bvdam
 *
 */
public class Main {

	public static void main(String[] args) {
		
		PrintMessage p =new PrintMessage();
		
		Student s1 = new Student(p,"DPS");
		Student s2 = new Student(p,"Ookridge");
		Student s3 = new Student(p,"Kinder Garden");
		
		s1.run();
		s2.run();
		s3.run();
	}

}