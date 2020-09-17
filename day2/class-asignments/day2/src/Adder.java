
public class Adder {

	public static void main(String[] args) {

		int s=0,x = args.length;
		if (x<2) {
			System.out.println("Please Enter Minimum two numbers");
		}
		else {
			for(int i=0;i<x;i++) {
				s+= Integer.parseInt(args[i]);
			}
			System.out.println("Sum of Given Numbers: "+s);
		}
		
	}

}
