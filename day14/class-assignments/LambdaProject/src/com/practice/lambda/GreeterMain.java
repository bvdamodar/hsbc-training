package com.practice.lambda;

import java.util.Arrays;
import java.util.List;

public class GreeterMain {

	public void greet(GreetMessage msg) {
		System.out.println( msg.greetMessage());
	}
	
	
	
	public static void main(String[] args) {
		
		String fn,ln;
		GreeterMain g = new GreeterMain();
		
		// with declaring GoodMorning class
		GreetMessage gm = new GoodMorning();
		g.greet(gm);
		
		// without  declaring GoodEvening class
		g.greet(new GoodEvening());
		
		//anonymous class implementation without any class creation
		g.greet(new GreetMessage() {
			
			@Override
			public String greetMessage() {
				// TODO Auto-generated method stub
				return "Good Afternoon";
			}

//			@Override
//			public String greetMessage(String fn, String ln) {
//				// TODO Auto-generated method stub
//				return null;
//			}
		});
		
		//by lambda expression  : method signature without name-> implementation
		g.greet(()-> "Good Day!!");
		
//		GreetMessage gm2 = (fn,ln) -> "Good Day, "+fn+" "+ln;
//		g.greet((fn,ln)-> "Good Day"+fn+" "+ln);
		
		
		
	}
}

class GoodMorning  implements GreetMessage{
	@Override
	public String greetMessage() {
			return "Good Morning";
	}

//	@Override
//	public String greetMessage(String fn, String ln) {
//		return null;
//	}
}

class GoodEvening  implements GreetMessage{
	@Override
	public String greetMessage() {
			return "Good Evening";
	}
//	@Override
//	public String greetMessage(String fn, String ln) {
//		return null;
//	}
}

