
public class Box {

	/**
	 * @author bvdam
	 */
	public Box() {
		// TODO Auto-generated constructor stub
	}

	private int l,b,h,s;
	private String c="No Color";
	private double w=0.0;
	
	public Box(int l, int b, int h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	public Box(int l, int b, int h,String c) { // With Color
//		this.l = l;
//		this.b = b;
//		this.h = h;
		this(l,b,h);
		this.c = c;
	}
	
	public Box(int l, int b, int h,String c,double w) {
		this(l,b,h,c);
		this.w = w;
	}
	
	public Box(int s, String c, double w) {
		this.c = c;
		this.w=w;
		this.s= s;
		
	}

	public double getVolume() {
//		System.out.println("Volume of the Box is "+(l*b*h));
		return (l*b*h);
	}
	
	public double getCubeVolume() {
		return (s*s*s);
	}
	
	public String getColor() {
		return c;
	}
	
	public void getWeight() {
		
		System.out.println("Weight of the Box is "+w);
		
	}
	
	
	
}
