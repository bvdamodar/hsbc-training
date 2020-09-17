package bird;
/**
 * 
 * @author bvdam
 *
 */

public class Ostrich extends Bird {

	public Ostrich() {

	}

	@Override
	public void fly() {
	      System.out.println("Ostrich cannot fly.");
	}

	@Override
	public void swim() {
		System.out.println("Ostrich can swim!!!");
	}


}
