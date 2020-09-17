package com.demo.inheritance.demo3;

public class Circle extends Figure {

	public Circle( int dim1) {
		super(dim1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return ((22/7) * dim1 * dim1);
	}

}
