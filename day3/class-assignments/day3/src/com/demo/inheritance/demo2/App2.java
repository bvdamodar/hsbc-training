package com.demo.inheritance.demo2;

public class App2 {

	public static void printDetails(Person p) {
		System.out.println(p.getDetails());
	}

	public static void main(String[] args) {
		
		Person p = new Person(100,"Raj");
		System.out.println("p : "+p.getDetails());
		
		Employee e = new  Employee(102,"Karthik",45000);
		System.out.println("e : "+e.getDetails());
		
		Person p2 = new Employee(103,"Karthik Raj",25000);
		System.out.println("p2: "+p2.getDetails());
//		p2.fun();
		
		
		TraineeEmp t = new TraineeEmp(104,"Sundar",40000,"Average");

		printDetails(t);
//		printDetails(e);
//		printDetails(p2);
		
		Object o =e;
		System.out.println(o);
		System.out.println(o.getClass().getName());
		System.out.println(e.getClass().getName());
		
		
		Person p1 = e;
		Object b = p;
		System.out.println(p1.getClass().getName());
//		System.out.println(o.getClass().getName());
		
		
		System.out.println(e);
//		System.out.println(e.toString());
		
	}

}
