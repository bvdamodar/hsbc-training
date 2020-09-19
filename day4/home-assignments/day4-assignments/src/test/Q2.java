package test;
/**
 * 
 * @author bvdam
 * It cannot be there since catch block should precede by try block. 
 */
public class Q2 {

	public static void main(String[] args) {
		
		int[] x = {9,24,66,12};
		
		try {
			System.out.println(x[50]);
			
		}catch (NullPointerException e) {
			System.out.println("Null Error - "+e);
		}finally {
			System.out.println("Final Now");
		}
		System.out.println("Successful.");
		
		

	}

}
