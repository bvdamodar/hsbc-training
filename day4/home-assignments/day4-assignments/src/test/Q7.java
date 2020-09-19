package test;

/**
 * 
 * @author bvdam
 *The Q7 constructor throwed NullPointerException error.
 */
public class Q7 {

	public Q7() {
		throw new NullPointerException();
	} 
	
	public static void main(String[] args) {

		try {
			Q7 q = new Q7();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

}
