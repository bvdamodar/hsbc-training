package App2;

public class App1 {
	double t=0.0;
	
	App2 x;
	public App1( App2  x) {
		this.x = x;
		
	}
	
	public double calculate(int a ,int b) {
		
//		App2 p =new App2();
//		
		try {
			t=x.divide(a, b);
		} catch (RuntimeException e) {
//			System.out.println("App1: Divide 0 Error");
			System.out.println(e);
			throw(e);
		}
//		 App2.divide(a,b);
		return t;
	}	
}
