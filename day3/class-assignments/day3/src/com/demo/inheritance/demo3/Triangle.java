package com.demo.inheritance.demo3;

public class Triangle extends Figure {

//	private int b=0;
//	private int h=0;
	
//	public Triangle(int b,int h){
//		super(b,h);		
////		area();
//	}
	
	public Triangle(int dim2, int dim1) {
		super(dim2, dim1);
	}

	@Override
	public double area() {
		
		double a = 0.5 * dim1* dim2;
		return a;
	}
	
	

}
