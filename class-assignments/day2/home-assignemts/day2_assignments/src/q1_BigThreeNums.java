
public class q1_BigThreeNums {

	/**
	 * @author bvdam
	 */
	public static void main(String[] args) {

		int a=10, b=20, c=30,x=0;
		if(a>=b) {
			if(a>=c) {
				x=a;
			}
			else {
				x=c;
			}
		}else {
			if(b>=c) {
				x=b;
			}
			else {
				x=c;
			}
		}
		
		System.out.println("Biggest Number among the three is "+x);

	}

}
