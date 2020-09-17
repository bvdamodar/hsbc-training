
public class BoxDemo {

	/**
	 * @author bvdam
	 * 
	 */
	
	public BoxDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Box b1 = new Box(10,20,30);
		System.out.println(b1.getVolume());
		System.out.println(b1.getColor());
		b1.getWeight();

		Box b2 = new Box(10,20,30,"Blue");
//		b2.getVolume();
		System.out.println(b2.getColor());
		b2.getWeight();
		
		Box b3 = new Box(10,20,30,"Red",9.6);
		System.out.println(b3.getVolume());
		System.out.println(b3.getColor());
		b3.getWeight();
		
		Box b4 = new Box(10,"Yellow",7.8);
		System.out.println(b4.getCubeVolume());
		System.out.println(b4.getColor());
		b4.getWeight();
		
		
	}

}
