package exception;

public class MyNullPointerException extends Exception {
	
	
	@Override
	public String toString() {
		System.out.println("This is MyNullPointerException.");
		return "MyNullPointerException";
	}
}
