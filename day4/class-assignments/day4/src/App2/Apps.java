package App2;

public class Apps {

	public static void main(String[] args) {
		App2 a2 = new App2();
		App1 a1 = new App1(a2);
			
		double x = a1.calculate(2,0);

		System.out.println("result "+x);
		 System.out.println("Success!!");
	}
}


