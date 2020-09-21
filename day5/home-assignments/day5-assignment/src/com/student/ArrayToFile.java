package com.student;
/**
 * 
 * @author bvdam
 *
 */

import com.files.copy.user.UserFilesCopy;

public class ArrayToFile {

	public static void main(String[] args) {
		
		Student s1 = new Student(161, "Shyam", 20,"M","Chennai");
		Student s2 = new Student(162, "Dam", 20,"M","Vizag");
		Student s3 = new Student(163, "Sheela", 19,"F","Mumbai");
		
		AddStudent s = new AddStudent();
		s.save(s1);
		s.save(s2);
		s.save(s3);
		
	}

}
