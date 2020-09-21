package com.student;
/**
 * 
 * @author bvdam
 *
 */

public class Student {
		private int id, age;
		private String location, name,gender;
		
		public Student(int id,String name,int age, String gender,String location) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.location = location;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Student() {}
		public Student(int id, String name, String location) {
			this.id = id;
			this.name = name;
			this.location = location;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}