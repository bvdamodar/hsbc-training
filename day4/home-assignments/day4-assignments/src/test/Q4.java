package test;
/**
 * 
 * @author bvdam
 * Yes, there can exit try-final block without catch block as showed in this example
 */
public class Q4 {

	public static void main(String[] args) {
		
		int[] z = {100,200,300,400};
		
		try {
			System.out.println(z[3]);
			
		} /*
			 * catch (ArrayIndexOutOfBoundsException e) { System.out.println("Error"+e); }
			 */
		finally {
			System.out.println("Final Now");
		}
		System.out.println("Success!!");
		
		

	}

}
