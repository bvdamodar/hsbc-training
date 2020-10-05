package com.demo.features;

public interface IDemo {

		public void fun();
		
		// default methods must have a body - { }
		default public void show() { } ; 
		
		
}
