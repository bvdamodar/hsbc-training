package bird;
/**
 * 
 * @author bvdam
 *
 */

public class Eagle extends Bird {

	public Eagle() {

	}

	@Override
	public void fly() {
	      System.out.println("Eagle can fly!!!!");
	}

	@Override
	public void swim() {
		System.out.println("Eagle cannot swim.");
	}


}
