
public class Factorial {

	/**
	 * @author bvdam
	 */
	public static void main(String[] args) {

		int n=1;
		//For Loop
		for(int i=1;i<=6;i++) {
			n*=i;
		}
		System.out.println("Factorial of 6 is "+n);
		
		//While Loop
		int m=1,i=2;
		while(i<=7) {
			m*=i;
			i+=1;			
		}
		System.out.println("Factorial of 7 is "+m);

	}

}
