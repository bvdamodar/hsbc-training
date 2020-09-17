package com.demo.inheritance.demo2;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Person p = new Person(100,"Raj");
		Employee e = new  Employee(102,"Karthik",45000);
		System.out.println(p.getDetails());
		System.out.println(e.getDetails());

		
		TraineeEmp t = new TraineeEmp(103,"Kumar",25000,"Good");
		System.out.println(t.getDetails());
	}

}
