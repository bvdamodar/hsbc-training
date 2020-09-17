package com.demo.inheritance.demo3;

public class Rectangle extends Figure {

	
	public Rectangle(int dim2, int dim1) {
		super(dim2, dim1);
	}

	@Override
	public double area() {
		
		double a = dim1* dim2;
		return a;
	}
	
	

}
