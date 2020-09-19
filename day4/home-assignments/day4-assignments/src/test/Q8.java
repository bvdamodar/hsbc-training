package test;
/**
 * 
 * @author bvdam
 * NullPointerException is referring exception.MyNullPointerException class
 */
import exception.MyNullPointerException;

public class Q8 {
	
		private int stdId;
		private String stdName;

		Q8(int stdId, String stdName) {
			this.stdId = stdId;
			this.stdName = stdName;
		}

		@Override
		public String toString() {
			return "stdId: " + stdId + " stdName: " + stdName;
		}

		
		public static void main(String[] args) throws MyNullPointerException {
			Q8 q = null;
			
			try {
				q.toString();	
			} 
			catch (NullPointerException e) {
				throw new MyNullPointerException();
			}
			finally {
				System.out.println("Final Here.");
			}
			System.out.println("Done.");
		
		

	}

}
