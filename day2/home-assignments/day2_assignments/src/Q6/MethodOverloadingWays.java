
public class MethodOverloadingWays {

	/**
	 * @author bvdam
	 */
	   public int add(int a, int b) {
	      return a + b;
	   }
	   
	   public int add(int a, int b, int c) {
	      return a + b + c;
	   }
	   public float add(float a, int b, int c) {
	      return a + b + c;
	   }
	   public double add(int a, double b, float c) {
		   return a + b + c;
	   }

	public static void main(String[] args) {

		MethodOverloadingWays adders = new MethodOverloadingWays();
		System.out.println("int+int = "+adders.add(1, 2));
        System.out.println("int+int+int = "+adders.add(3, 4, 5));
	    System.out.println("float+int+int = "+adders.add(1.0f, 7,8));
	    System.out.println("int+double+float = "+adders.add(9, 10.0,11.0f));

	}

}
