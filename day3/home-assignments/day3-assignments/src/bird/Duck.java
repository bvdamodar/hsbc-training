package bird;
/**
 * 
 * @author bvdam
 *
 */

public class Duck extends Bird {

	public Duck() {

	}

	@Override
	public void fly() {
	      System.out.println("Duck cannot fly.");
	}

	@Override
	public void swim() {
		System.out.println("Duck can swim!!!");
	}


}
