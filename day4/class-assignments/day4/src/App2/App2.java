package App2;

public class App2 {
	

		public static double divide(int a ,int b) {
			double r=0.0;
			try {
				r= a/b;
//				System.out.println(d);
			}catch(RuntimeException e) {
//				System.out.println("App2: Divide 0 Error");
				System.out.println(e);
				throw new RuntimeException("App2: Something went Wrong.");
//				return 0;
			}
			return r;
		}
}
