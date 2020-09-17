package bird;
/**
 * 
 * @author bvdam
 *
 */

public class Parrot extends Bird {

	public Parrot() {

	}

	@Override
	public void fly() {
	      System.out.println("Parrot can fly!!!!");
	}

	@Override
	public void swim() {
		System.out.println("Parrot cannot swim.");
	}


}
