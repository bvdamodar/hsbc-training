package com.demo.inheritance.demo3;

public class MainApp {

	public static void main(String[] args) {

		Figure f ;
		
		Triangle t = new Triangle(2, 5);
		System.out.println("Triangle Area: "+t.area());
		
		Rectangle r = new Rectangle(2, 5);
		System.out.println("Rectangle Area: "+r.area());
	
		Circle c = new Circle(7);
		System.out.println("Circle Area: "+c.area());
	
		//Polymorphism
		f=t;
		f.area();

		f=c;
		f.area();
		
		f=r;
		f.area();
	}

}
