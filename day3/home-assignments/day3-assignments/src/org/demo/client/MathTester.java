package org.demo.client;
/**
 * 
 * @author bvdam
 *
 */
import org.demo.tools.Calculator;

public class MathTester {

	public static void main(String[] args) {

		Calculator mc = new Calculator();
		System.out.println("1.0 + 2 = "+mc.Calculator(1.0, 2));
		System.out.println("4 - 3 = "+mc.Calculator(4, 3));
		System.out.println("5 x 6.0 = "+mc.Calculator(5, 6.0));
		System.out.println("10.0 / 5.0 = "+mc.Calculator(10.0, 5.0));

	}

}
