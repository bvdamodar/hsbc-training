package test;
/**
 * 
 * @author bvdam
 * It cannot be there since in this example. 
 * I have tried NullPointerException for the error  java.lang.ArrayIndexOutOfBounds Exception
 * But it showed error in red.
 */
public class Q1 {

	public static void main(String[] args) {
		
		int[] a10 = {10,20,30,40};
		
		try {
			System.out.println(a10[5]);
			
		}catch (NullPointerException e) {
			System.out.println("Null Error"+e);
		}finally {
			System.out.println("Final Now");
		}
		System.out.println("Success");
		
		

	}

}
