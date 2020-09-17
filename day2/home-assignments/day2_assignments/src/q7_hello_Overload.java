
public class q7_hello_Overload {

	/**
	 * @author bvdam
	 */
	public void hello(int i) {
		System.out.println("int "+i);
	}
	
	public void hello(byte i) {
		System.out.println("byte "+i);
	}
	
	public void hello(short i) {
		System.out.println("short "+i);
	}

	public void hello(long i) {
		System.out.println("long "+i);
	}
	
	public void hello(double i) {
		System.out.println("double "+i);
	}
	
	
	
	public static void main(String[] args) {
		
		q7_hello_Overload q = new q7_hello_Overload();
		q.hello(5);

	}

}
