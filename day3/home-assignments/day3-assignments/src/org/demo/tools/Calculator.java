package org.demo.tools;
/**
 * 
 * @author bvdam
 *
 */
public class Calculator {

	public double add(double x,int y){
		return (x+y);
	}

	public int Calculator(int x,int y){
		if(x>=y) {
			return (x-y);
		}
		return (y-x);
	}

	public double Calculator(int x,double y){
		return (x*y);
	}

	public double Calculator(double x,double y){
		return (x/y);
	}
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

}
