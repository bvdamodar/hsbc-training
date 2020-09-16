
public class q3_Static {

	/**
	 * @author bvdam
	 */
	
	static {
		System.out.println("Static Runs Initially!!");
	}

	int y=0;
	static int x = 0;
	
	public q3_Static() {
		// TODO Auto-generated constructor stub
		x+=1;
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "x:  "+ ++x+" "+ x +" " + --x); //  Works since x is a static variable
//		System.out.println( "y: "+y+" "+ y++ +" " + --y);       Error since y is not a static variable
		OutSide s1 = new OutSide();
		s1.showData();
		OutSide s2 = new OutSide();
		s2.showData();
		OutSide s3 = new OutSide();
		s3.showData();
	}

}

 class OutSide{
//	System.out.println(x+" ");  This is an Error since x is not in this class.
	int a; 
	static int b; 

	OutSide(){
			b++;
	  }

	   public void showData(){
	      System.out.println("Value of a = "+a);
	      System.out.println("Value of b = "+b);
	   }
	
}