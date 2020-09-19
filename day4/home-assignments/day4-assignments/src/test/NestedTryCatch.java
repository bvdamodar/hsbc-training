package test;
/**
 * 
 * @author bvdam
 * This is nested try-catch with different exceptions.
 */
public class NestedTryCatch {

	public static void main(String[] args) {

		try {
			try {
				System.out.println("try-00-inside try");
				int nums[] = { 1, 2, 3, 4, 5 };
				System.out.println("nums[5]- "+nums[5]);
			} 
			catch (ArrayIndexOutOfBoundsException e0) {
				System.out.println("e0- "+e0);
			}
			int d = 2 / 0;
			System.out.println("d- "+d);
		} 
		catch (ArithmeticException e1) {
			
			System.out.println("e1- "+e1);
			
			try {
				System.out.println("try-10- inside catch");
				String s = null;
				s.charAt(0);
			} 
			catch (NullPointerException e2) {
				System.out.println("e2- "+e2);
			}
		}

	}
}
